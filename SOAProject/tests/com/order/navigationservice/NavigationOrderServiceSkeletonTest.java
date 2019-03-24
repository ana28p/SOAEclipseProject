package com.order.navigationservice;

import com.order.datatypes.Location;
import com.order.elements.GetDistanceRequest;
import com.order.elements.GetDistanceResponse;
import com.order.pricingservice.InvalidLocationMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavigationOrderServiceSkeletonTest {

    private Location startPoint;
    private Location endPoint;
    private GetDistanceRequest request;
    private NavigationOrderServiceSkeleton skeleton;

    @BeforeEach
    void beforeEach(){
        this.startPoint = new Location();
        this.startPoint.setLattitude(0);
        this.startPoint.setLongitude(0);

        this.endPoint = new Location();
        this.endPoint.setLattitude(3);
        this.endPoint.setLongitude(4);

        this.request = new GetDistanceRequest();
        this.request.setCurrentLocation(this.startPoint);
        this.request.setEndLocation(this.endPoint);

        this.skeleton = new NavigationOrderServiceSkeleton();
    }

    @Test
    void getDistance() throws InvalidLocationMessage {
        GetDistanceResponse response = this.skeleton.getDistance(this.request);
        assertNotNull(response);
        assertEquals(555.0, response.getDistance(), 1);
    }

    @Test
    void getDistanceInvalidStartPoint() {
        this.request.getCurrentLocation().setLattitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getDistance(this.request));
    }

    @Test
    void getDistanceInvalidEndPoint() {
        this.request.getEndLocation().setLattitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getDistance(this.request));
    }
}