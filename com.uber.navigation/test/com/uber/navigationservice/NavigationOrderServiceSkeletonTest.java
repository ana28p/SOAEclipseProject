package com.uber.navigationservice;

import com.uber.datatypes.Location;
import com.uber.elements.GetDistanceRequest;
import com.uber.elements.GetDistanceResponse;

import com.uber.navigationservice.InvalidLocationMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavigationOrderServiceSkeletonTest {

    private Location startPoint;
    private Location endPoint;
    private GetDistanceRequest request;
    private NavigationServiceSkeleton skeleton;

    @BeforeEach
    void beforeEach(){
        this.startPoint = new Location();
        this.startPoint.setLatitude(0);
        this.startPoint.setLongitude(0);

        this.endPoint = new Location();
        this.endPoint.setLatitude(3);
        this.endPoint.setLongitude(4);

        this.request = new GetDistanceRequest();
        this.request.setCurrentLocation(this.startPoint);
        this.request.setEndLocation(this.endPoint);

        this.skeleton = new NavigationServiceSkeleton();
    }

    @Test
    void testGetDistance() throws InvalidLocationMessage {
        GetDistanceResponse response = this.skeleton.getDistance(this.request);
        assertNotNull(response);
        assertEquals(555.0, response.getDistance(), 1);
    }

    @Test
    void testGetDistanceInvalidStartPoint() {
        this.request.getCurrentLocation().setLatitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getDistance(this.request));
    }

    @Test
    void testGetDistanceInvalidEndPoint() {
        this.request.getEndLocation().setLatitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getDistance(this.request));
    }
}