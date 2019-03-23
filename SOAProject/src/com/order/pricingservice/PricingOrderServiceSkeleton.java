
/**
 * PricingOrderServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.pricingservice;

import com.order.datatypes.Location;
import com.order.elements.GetPriceResponse;

import java.util.Calendar;

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

        GetPriceResponse response = new GetPriceResponse();
        response.setPrice(this.calculatePrice(getPriceRequest0.getTime()));
        return response;
    }

    private void validateLocation(Location location) throws InvalidLocationMessage {
        if(location.getLattitude() < -90.0 || location.getLattitude() > 90.0){
            throw new InvalidLocationMessage();
        }

        if(location.getLongitude() < -180.0 || location.getLongitude() > 180.0){
            throw new InvalidLocationMessage();
        }
    }

    private double calculatePrice(Calendar calendar) throws InvalidTimeMessage {
        if(calendar == null){
            throw new InvalidTimeMessage();
        }
        Calendar start = this.getCalendarSameDay(calendar);
        start.set(Calendar.HOUR_OF_DAY, 9);

        Calendar end = this.getCalendarSameDay(calendar);
        end.set(Calendar.HOUR_OF_DAY, 21);

        if(calendar.before(start) || calendar.after(end)){
            return 1.5;
        }

        return 1.0;
    }

    private Calendar getCalendarSameDay(Calendar calendar){
        Calendar sameDay = (Calendar) calendar.clone();
        sameDay.set(Calendar.HOUR_OF_DAY, 0);
        sameDay.set(Calendar.MINUTE, 0);
        sameDay.set(Calendar.SECOND, 0);
        sameDay.set(Calendar.MILLISECOND, 0);

        return sameDay;
    }



}
    