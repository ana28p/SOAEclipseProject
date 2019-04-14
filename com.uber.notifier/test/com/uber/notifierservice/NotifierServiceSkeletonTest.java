package com.uber.notifierservice;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.*;
import com.uber.db.DBCreator;
import com.uber.elements.*;
import com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub;
import com.uber.utils.CleaningDB;
import org.apache.axis2.AxisFault;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NotifierServiceSkeletonTest {

    private FindDriverRequest request;
    private NotifierServiceSkeleton skeleton;
    private Customer customer;
    private Location startPoint;
    private Location endPoint;
    private DatabaseServiceStub databaseServiceStub;
    private NotifierCallbackOrderServiceStub notifierCallbackOrderServiceStub;

    @BeforeAll
    static void beforeAll(){
        CleaningDB.deleteDB();
        DBCreator.initializeDB();
    }

    @BeforeEach
    void beforeEach() throws RemoteException, PersonNotFoundMessage {

        this.customer = new Customer();
        this.customer.setCardNumber("ABCD");
        this.customer.setAge(25);
        this.customer.setName("Uber");
        this.customer.setRating(5d);
        this.customer.setId(2);

        this.startPoint = new Location();
        this.startPoint.setLatitude(0);
        this.startPoint.setLongitude(0);

        this.endPoint = new Location();
        this.endPoint.setLatitude(3);
        this.endPoint.setLongitude(4);

        this.request = new FindDriverRequest();
        this.request.setCustomerId(1);
        this.request.setStartLocation(this.startPoint);
        this.request.setEndLocation(this.endPoint);
        this.request.setPrice(100d);

        Driver driver = new Driver();
        driver.setId(2);
        driver.setAge(1);
        driver.setCarNumber("1");
        driver.setName("Joe");
        driver.setRating(5.0);

        Driver[] drivers = new Driver[1];
        drivers[0] = driver;

        Customer customer = new Customer();
        customer.setId(1);
        customer.setAge(1);
        customer.setName("Joe");
        customer.setRating(5.0);

        GetDriversResponse driversResponse = new GetDriversResponse();
        driversResponse.setDriverElement(drivers);
        GetCustomerResponse customerResponse = new GetCustomerResponse();
        customerResponse.setCustomer(customer);

        this.databaseServiceStub = mock(DatabaseServiceStub.class);

        when(this.databaseServiceStub.getDrivers(any(GetDriversRequest.class))).thenReturn(driversResponse);
        when(this.databaseServiceStub.getCustomer(any(GetCustomerRequest.class))).thenReturn(customerResponse);

        this.notifierCallbackOrderServiceStub = mock(NotifierCallbackOrderServiceStub.class);


        this.skeleton = new NotifierServiceSkeleton(this.databaseServiceStub, this.notifierCallbackOrderServiceStub);
    }

    @Test
    void testFindDriver() throws InvalidCustomerMessage, InvalidPriceMessage, InvalidLocationMessage {
        SuccessMessage response = this.skeleton.findDriver(this.request);

        assertNotNull(response);
    }

    @Test
    void testFindDriverInvalidStartLocation() {
        this.request.getStartLocation().setLatitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void testFindDriverInvalidEndLocation() {
        this.request.getEndLocation().setLatitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void testFindDriverInvalidPrice() {
        this.request.setPrice(Double.NaN);

        assertThrows(InvalidPriceMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void testFindDriverInvalidCustomerNotFound() throws PersonNotFoundMessage, RemoteException {
        when(this.databaseServiceStub.getCustomer(any(GetCustomerRequest.class))).thenThrow(PersonNotFoundMessage.class);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }
}