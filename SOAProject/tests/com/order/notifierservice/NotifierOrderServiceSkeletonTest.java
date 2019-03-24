package com.order.notifierservice;

import com.order.datatypes.Customer;
import com.order.datatypes.Location;
import com.order.datatypes.SuccessMessage;
import com.order.db.DBCreator;
import com.order.elements.FindDriverRequest;
import com.order.elements.FindDriverResponse;
import com.order.utils.CleaningDB;
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
        this.customer.setCardNumer("ABCD");
        this.customer.setAge(25);
        this.customer.setName("Uber");
        this.customer.setRating(5d);
        this.customer.setId(2);

        this.startPoint = new Location();
        this.startPoint.setLattitude(0);
        this.startPoint.setLongitude(0);

        this.endPoint = new Location();
        this.endPoint.setLattitude(3);
        this.endPoint.setLongitude(4);

        this.request = new FindDriverRequest();
        this.request.setCustomer(this.customer);
        this.request.setStartLocation(this.startPoint);
        this.request.setEndLocation(this.endPoint);
        this.request.setPrice(100d);

        this.skeleton = new NotifierOrderServiceSkeleton();
    }

    @Test
    void findDriver() throws InvalidCustomerMessage, InvalidPriceMessage, InvalidLocationMessage {
        SuccessMessage response = this.skeleton.findDriver(this.request);

        assertNotNull(response);
    }

    @Test
    void findDriverInvalidStartLocation() {
        this.request.getStartLocation().setLattitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void findDriverInvalidEndLocation() {
        this.request.getEndLocation().setLattitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void findDriverInvalidPrice() {
        this.request.setPrice(Double.NaN);

        assertThrows(InvalidPriceMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void findDriverInvalidCustomerNull() {
        this.request.setCustomer(null);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }

    @Test
    void findDriverInvalidCustomerNotFound() {
        this.request.getCustomer().setId(-1);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }
}