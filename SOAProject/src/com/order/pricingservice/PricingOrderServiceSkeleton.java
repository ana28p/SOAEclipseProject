
/**
 * PricingOrderServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.pricingservice;

import com.order.datatypes.Location;

/**
 *  PricingOrderServiceSkeleton java skeleton for the axisService
 */
public class PricingOrderServiceSkeleton implements PricingOrderServiceSkeletonInterface {


    /**
     * Auto generated method signature
     *
     * @param getPriceRequest0
     * @return getPriceResponse1
     * @throws PriceNotFoundMessage
     * @throws InvalidTimeMessage
     * @throws InvalidLocationMessage
     */

    public com.order.elements.GetPriceResponse getPrice
    (
            com.order.elements.GetPriceRequest getPriceRequest0
    )
            throws PriceNotFoundMessage, InvalidTimeMessage, InvalidLocationMessage {

        this.validateLocation(getPriceRequest0.getLocation());

        return null;
    }

    private void validateLocation(Location location) throws InvalidLocationMessage {
        if(location.getLattitude() < 90.0 || location.getLattitude() > 90.0){
            throw new InvalidLocationMessage();
        }

        if(location.getLongitude() < 180.0 || location.getLongitude() > 180.0){
            throw new InvalidLocationMessage();
        }
    }



}
    