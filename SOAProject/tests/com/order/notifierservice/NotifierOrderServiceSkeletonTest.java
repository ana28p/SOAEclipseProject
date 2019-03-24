package com.order.notifierservice;

import com.order.datatypes.Customer;
import com.order.datatypes.Location;
import com.order.datatypes.SuccessMessage;
import com.order.elements.FindDriverRequest;
import com.order.elements.FindDriverResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierOrderServiceSkeletonTest {

    private FindDriverRequest request;
    private NotifierOrderServiceSkeleton skeleton;
    private Customer customer;
    private Location startPoint;
    private Location endPoint;


    @BeforeEach
    void beforeEach(){

        this.customer = new Customer();
        this.customer.setCardNumer("ABCD");
        this.customer.setAge(25);
        this.customer.setName("Uber");
        this.customer.setRating(5d);

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
    void findDriverInvalidCustomer() {
        this.request.setCustomer(null);

        assertThrows(InvalidCustomerMessage.class, ()->this.skeleton.findDriver(this.request));
    }
}