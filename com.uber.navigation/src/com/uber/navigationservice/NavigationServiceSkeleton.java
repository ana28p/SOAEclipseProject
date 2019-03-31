
/**
 * NavigationServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.navigationservice;

import com.uber.datatypes.Location;
import com.uber.elements.GetDistanceResponse;
import com.uber.utils.Validation;

/**
 *  NavigationServiceSkeleton java skeleton for the axisService
 */
public class NavigationServiceSkeleton implements NavigationServiceSkeletonInterface {


    /**
     * Auto generated method signature
     *
     * @param getDistanceRequest0
     * @return getDistanceResponse1
     * @throws InvalidLocationMessage
     */

    public com.uber.elements.GetDistanceResponse getDistance
    (
            com.uber.elements.GetDistanceRequest getDistanceRequest0
    )
            throws InvalidLocationMessage {
        Validation.validateLocation(getDistanceRequest0.getCurrentLocation(), new InvalidLocationMessage());
        Validation.validateLocation(getDistanceRequest0.getEndLocation(), new InvalidLocationMessage());

        GetDistanceResponse response = new GetDistanceResponse();
        response.setDistance(this.calculateDistance(getDistanceRequest0.getCurrentLocation(), getDistanceRequest0.getEndLocation()));

        return response;
    }

    private double calculateDistance(Location start, Location end) {
        double earthRadius = 6373;
        double deltaLon = Math.toRadians(end.getLongitude()) - Math.toRadians(start.getLongitude());
        double latEnd = Math.toRadians(end.getLatitude());
        double latStart = Math.toRadians(start.getLatitude());
        double deltaLat = latEnd - latStart;
        double a = Math.pow(Math.sin(deltaLat / 2), 2) + (Math.cos(latStart) * Math.cos(latEnd) * Math.pow(Math.sin(deltaLon / 2), 2));
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthRadius * c;
    }

}
    