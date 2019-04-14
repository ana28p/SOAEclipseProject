package com.uber.invoicingservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.rmi.RemoteException;
import java.text.ParseException;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.*;
import com.uber.elements.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uber.db.DBCreator;
import com.uber.db.DBQuery;
import com.uber.utils.CleaningDB;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InvoicingOrderServiceSkeletonTest {

    private InvoicingOrderServiceSkeleton skeleton;
    private DatabaseServiceStub databaseServiceStub;
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
    }

    @BeforeEach
    public void beforeEach() throws ParseException, PersonNotFoundMessage, RemoteException {
        this.request.setCurrentLocation(this.currentLocation);
        this.request.setEndLocation(this.endLocation);
        this.request.setCustomerId(1);
        this.request.setDriverId(2);
        this.request.setPrice(12);

        this.driver = new Driver();
        driver.setId(2);
        driver.setAge(1);
        driver.setCarNumber("1");
        driver.setName("Joe");
        driver.setRating(5.0);

        this.customer = new Customer();
        customer.setId(1);
        customer.setAge(1);
        customer.setName("Joe");
        customer.setRating(5.0);
        customer.setCardNumber("NL123456");


        GetDriverResponse driverResponse = new GetDriverResponse();
        driverResponse.setDriver(this.driver);
        GetCustomerResponse customerResponse = new GetCustomerResponse();
        customerResponse.setCustomer(this.customer);

        this.databaseServiceStub = mock(DatabaseServiceStub.class);

        when(this.databaseServiceStub.getDriver(any(GetDriverRequest.class))).thenReturn(driverResponse);
        when(this.databaseServiceStub.getCustomer(any(GetCustomerRequest.class))).thenReturn(customerResponse);

        this.skeleton = new InvoicingOrderServiceSkeleton(this.databaseServiceStub);
    }

    @Test
    void testPayForRide() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
        SuccessMessage response = this.skeleton.payForRide(this.request);

        assertNotNull(response);
        assertEquals("Invoicing created. Done!", response.getSuccessMessage());
    }

    @Test
    void testPayForRidePriceNotFound() throws InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage, InvalidCustomerMessage {
        this.request.setPrice(0);

        assertThrows(PriceNotFoundMessage.class, () -> this.skeleton.payForRide(request));
    }

    @Test
    void testPayForRideInvalidCustomer() throws PersonNotFoundMessage, RemoteException {
        when(this.databaseServiceStub.getCustomer(any(GetCustomerRequest.class))).thenThrow(InvalidCustomerMessage.class);

        assertThrows(InvalidCustomerMessage.class, () -> this.skeleton.payForRide(request));
    }

    @Test
    void testPayForRideInvalidDriver() throws PersonNotFoundMessage, RemoteException {
        when(this.databaseServiceStub.getDriver(any(GetDriverRequest.class))).thenThrow(InvalidDriverMessage.class);

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
        this.customer.setCardNumber("NL231223NX");

        assertThrows(PaymentFailedMessage.class, () -> this.skeleton.payForRide(request));
    }

}
