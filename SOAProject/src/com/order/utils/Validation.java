package com.order.utils;

import com.order.datatypes.Location;
import com.order.pricingservice.InvalidLocationMessage;

public class Validation {
    public static void validateLocation(Location location) throws InvalidLocationMessage {
        if(location.getLattitude() < -90.0 || location.getLattitude() > 90.0){
            throw new InvalidLocationMessage();
        }

        if(location.getLongitude() < -180.0 || location.getLongitude() > 180.0){
            throw new InvalidLocationMessage();
        }
    }
}
