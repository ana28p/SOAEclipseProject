
/**
 * NavigationOrderServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.navigationservice;

import com.order.datatypes.Location;
import com.order.elements.GetDistanceResponse;
import com.order.pricingservice.InvalidLocationMessage;
import com.order.utils.Validation;

/**
 * NavigationOrderServiceSkeleton java skeleton for the axisService
 */
public class NavigationOrderServiceSkeleton implements NavigationOrderServiceSkeletonInterface {


    /**
     * Auto generated method signature
     *
     * @param getDistanceRequest0
     * @return getDistanceResponse1
     * @throws InvalidLocationMessage
     */

    public com.order.elements.GetDistanceResponse getDistance
    (
            com.order.elements.GetDistanceRequest getDistanceRequest0
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
        double latEnd = Math.toRadians(end.getLattitude());
        double latStart = Math.toRadians(start.getLattitude());
        double deltaLat = latEnd - latStart;
        double a = Math.pow(Math.sin(deltaLat / 2), 2) + (Math.cos(latStart) * Math.cos(latEnd) * Math.pow(Math.sin(deltaLon / 2), 2));
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthRadius * c;
    }

//        dlon = lon2 - lon1
//                dlat = lat2 - lat1
//        a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2
//        c = 2 * atan2( sqrt(a), sqrt(1-a) )
//        d = 6371 * c (where R is the radius of the Earth)

}
    