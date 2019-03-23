package com.order.invoicingservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.order.datatypes.Driver;
import com.order.datatypes.Location;
import com.order.datatypes.SuccessMessage;
import com.order.db.DBCreator;
import com.order.db.DBQuery;
import com.order.elements.PayForRideRequest;
import com.order.utils.CleaningDB;

class InvoicingOrderServiceSkeletonTest {

	private InvoicingOrderServiceSkeleton skeleton = new InvoicingOrderServiceSkeleton();
	private PayForRideRequest request = new PayForRideRequest();
	private Location currentLocation = new Location();
	{
		this.currentLocation.setLattitude(52.238507);
		this.currentLocation.setLongitude(6.854814);
	}
	private Location endLocation = new Location();
	{
		this.endLocation.setLattitude(52.238507);
		this.endLocation.setLongitude(6.954814);
	}
	private Driver driver;
	{
		this.driver = DBQuery.selectDriver(5);
	}

	@BeforeClass
	public void beforeClass() {
		CleaningDB.deleteDB();
		DBCreator.initializeDB();
	}

	@BeforeEach
	public void beforeEach() throws ParseException {
		this.request.setCurrentLocation(currentLocation);
		this.request.setEndLocation(endLocation);
		this.request.setDriver(driver);
		this.request.setPrice(12);
	}

	@Test
	void testPayForRide() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {
		SuccessMessage response = this.skeleton.payForRide(this.request);

		assertNotNull(response);
		Assert.assertEquals("Invoicing created.", response.getSuccessMessage());
	}

	@Test
	void testPayForRidePriceNotFound() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {
		this.request.setPrice(0);

		assertThrows(PriceNotFoundMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidDriver() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {
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
	void testPayForRideInvalidCurrentLocation() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {
		Location cLocation = new Location();
		cLocation.setLattitude(91);
		cLocation.setLongitude(-123);

		this.request.setCurrentLocation(cLocation);

		assertThrows(InvalidLocationMessage.class, () -> this.skeleton.payForRide(request));
	}

	@Test
	void testPayForRideInvalidEndLocation() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {
		Location eLocation = new Location();
		eLocation.setLattitude(91);
		eLocation.setLongitude(-123);

		this.request.setEndLocation(eLocation);

		assertThrows(InvalidLocationMessage.class, () -> this.skeleton.payForRide(request));
	}

}
