package com.uber.notifierservice;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Location;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBCreator;
import com.uber.elements.FindDriverRequest;
import com.uber.elements.FindDriverResponse;
import com.uber.utils.CleaningDB;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierOrderServiceSkeletonTest {

    private FindDriverRequest request;
    private NotifierOrderServiceSkeleton skeleton;
    private Customer customer;
    private Location startPoint;
    private Location endPoint;

    @BeforeAll
    static void beforeAll(){
        CleaningDB.deleteDB();
        DBCreator.initializeDB();
    }

    @BeforeEach
    void beforeEach(){

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
        this.request.setCustomer(this.customer);
        this.request.setStartLocation(this.startPoint);
        this.request.setEndLocation(this.endPoint);
        this.request.setPrice(100d);

        this.skeleton = new NotifierOrderServiceSkeleton();
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
    void testFindDriverInvalidCustomerNull() {
        this.request.setCustomer(null);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void testFindDriverInvalidCustomerNotFound() {
        this.request.getCustomer().setId(-1);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }
}