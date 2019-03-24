package com.order.notifierservice;

import com.order.elements.FindDriverRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierOrderServiceSkeletonTest {

    private FindDriverRequest request;
    private NotifierOrderServiceSkeleton skeleton;


    @BeforeEach
    void beforeEach(){
        this.request = new FindDriverRequest();

        this.skeleton = new NotifierOrderServiceSkeleton();
    }

    @Test
    void findDriver() {

    }

    @Test
    void findDriverInvalidLocation() {
    }

    @Test
    void findDriverInvalidPrice() {
    }

    @Test
    void findDriverInvalidCustomer() {
    }
}