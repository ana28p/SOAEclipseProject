
/**
 * PricingOrderServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.pricingservice;

import com.order.datatypes.Location;
import com.order.elements.GetPriceRequest;
import com.order.elements.GetPriceResponse;
import com.order.utils.Validation;

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

        Validation.validateLocation(getPriceRequest0.getLocation(), new InvalidLocationMessage());

        GetPriceResponse response = new GetPriceResponse();
        response.setPrice(this.calculatePrice(getPriceRequest0));
        return response;
    }

    private double calculatePrice(GetPriceRequest request) throws InvalidLocationMessage, InvalidTimeMessage {
        double basePrice = 1.0;

        return basePrice * this.getTimeOfDayMultiplier(request.getTime()) * this.getLocationMultiplier(request.getLocation());
    }

    private double getTimeOfDayMultiplier(Calendar calendar) throws InvalidTimeMessage {
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

    private double getLocationMultiplier(Location location) throws InvalidLocationMessage {
        if(location == null){
            throw new InvalidLocationMessage();
        }

        double lon = location.getLongitude();
        double lat = location.getLattitude();

        if((lon > 0 && lon < 2) && (lat > 0 && lat< 2)){
            return 2.0;
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
    