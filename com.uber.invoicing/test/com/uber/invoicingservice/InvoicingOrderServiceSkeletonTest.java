package com.uber.invoicingservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.Location;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBCreator;
import com.uber.db.DBQuery;
import com.uber.elements.PayForRideRequest;
import com.uber.utils.CleaningDB;

import static org.junit.jupiter.api.Assertions.*;

class InvoicingOrderServiceSkeletonTest {

	private InvoicingOrderServiceSkeleton skeleton = new InvoicingOrderServiceSkeleton();
	private PayForRideRequest request = new PayForRideRequest();
	private Location currentLocation;
	private Location endLocation;
	private Customer customer;
	private Driver driver;
	
	{
		this.currentLocation = new Location();
		this.currentLocation.setLatitude(52.238507);
		this.currentLocation.setLongitude(6.854814);
		
		this.endLocation = new Location();
		this.endLocation.setLatitude(52.238507);
		this.endLocation.setLongitude(6.954814);
		
		this.customer = DBQuery.selectCustomer(4);
		
		this.driver = DBQuery.selectDriver(5);
	}

	@BeforeAll
	static public void beforeClass() {
		CleaningDB.deleteDB();
		DBCreator.initializeDB();
	}

	@BeforeEach
	public void beforeEach() throws ParseException {
		this.request.setCurrentLocation(currentLocation);
		this.request.setEndLocation(endLocation);
		this.request.setCustomer(customer);
		this.request.setDriver(driver);
		this.request.setPrice(12);
	}

	@Test
	void testPayForRide() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		SuccessMessage response = this.skeleton.payForRide(this.request);

		assertNotNull(response);
		assertEquals("Invoicing created.", response.getSuccessMessage());
	}

	@Test
	void testPayForRidePriceNotFound() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		this.request.setPrice(0);

		assertThrows(PriceNotFoundMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidCustomer() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		Customer unexistingCustomer = new Customer();
		unexistingCustomer.setId(11);
		unexistingCustomer.setName("John");
		unexistingCustomer.setCardNumber("NL231223");
		unexistingCustomer.setAge(34);
		unexistingCustomer.setRating(5);

		this.request.setCustomer(unexistingCustomer);

		assertThrows(InvalidCustomerMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidDriver() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		Driver unexistingDriver = new Driver();
		unexistingDriver.setId(11);
		unexistingDriver.setName("John");
		unexistingDriver.setCarNumber("SD2312");
		unexistingDriver.setAge(34);
		unexistingDriver.setRating(5);

		this.request.setDriver(unexistingDriver);

		assertThrows(InvalidDriverMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidCurrentLocation() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		Location cLocation = new Location();
		cLocation.setLatitude(91);
		cLocation.setLongitude(-123);

		this.request.setCurrentLocation(cLocation);

		assertThrows(InvalidLocationMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidEndLocation() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		Location eLocation = new Location();
		eLocation.setLatitude(91);
		eLocation.setLongitude(-123);

		this.request.setEndLocation(eLocation);

		assertThrows(InvalidLocationMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRidePaymentFailed() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
		Customer invalidCardNoCustomer = this.customer;
		invalidCardNoCustomer.setCardNumber("NL231223NX");

		this.request.setCustomer(invalidCardNoCustomer);

		assertThrows(PaymentFailedMessage.class, () -> this.skeleton.payForRide(request));
	}

}
