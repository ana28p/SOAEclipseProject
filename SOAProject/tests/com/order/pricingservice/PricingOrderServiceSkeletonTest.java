package com.order.pricingservice;

import static org.junit.jupiter.api.Assertions.*;

import com.order.datatypes.Location;
import com.order.elements.GetPriceRequest;
import com.order.elements.GetPriceResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class PricingOrderServiceSkeletonTest {

    private Location location;
    private Calendar time;
    private GetPriceRequest request;
    private PricingOrderServiceSkeleton skeleton;

    @BeforeEach
    public void beforeEach() throws ParseException {
        this.location = new Location();
        this.location.setLattitude(52.238507);
        this.location.setLongitude(6.854814);

        this.request = new GetPriceRequest();
        this.request.setTime(this.getDateTime("2019-01-01T12:00Z"));
        this.request.setLocation(this.location);

        this.skeleton = new PricingOrderServiceSkeleton();
    }

    @Test
    void testGetPrice() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        GetPriceResponse response = this.skeleton.getPrice(this.request);

        assertNotNull(response);
        assertEquals(1.0, response.getPrice());
    }

    @Test
    void testGetPriceHigherAtNight() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage, ParseException {

        this.request.setTime(this.getDateTime("2019-01-01T0:00Z"));
        GetPriceResponse response = skeleton.getPrice(request);

        assertNotNull(response);
        assertEquals(1.5, response.getPrice());
    }

    @Test
    void testGetPriceLatitudeLowBoundary() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLattitude(-90.0);
        GetPriceResponse response = this.skeleton.getPrice(this.request);

        assertNotNull(response);
    }

    @Test
    void testGetPriceLatitudeHighBoundary() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLattitude(90.0);
        GetPriceResponse response = this.skeleton.getPrice(this.request);

        assertNotNull(response);
    }

    @Test
    void testGetPriceLatitudeToSmall() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLattitude(Math.nextDown(-90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getPrice(request));
    }

    @Test
    void testGetPriceLatitudeToBig() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLattitude(Math.nextUp(90.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getPrice(request));
    }

    @Test
    void testGetPriceLongitudeLowBoundary() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLongitude(-180.0);
        GetPriceResponse response = this.skeleton.getPrice(this.request);

        assertNotNull(response);
    }

    @Test
    void testGetPriceLongitudeHighBoundary() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLongitude(180.0);
        GetPriceResponse response = this.skeleton.getPrice(this.request);

        assertNotNull(response);
    }

    @Test
    void testGetPriceLongitudeToSmall() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLongitude(Math.nextDown(-180.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getPrice(request));
    }

    @Test
    void testGetPriceLongitudeToBig() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.getLocation().setLongitude(Math.nextUp(180.0));

        assertThrows(InvalidLocationMessage.class, ()->this.skeleton.getPrice(request));
    }

    @Test
    void testGetPriceTimeNull() throws InvalidTimeMessage, InvalidLocationMessage, PriceNotFoundMessage {

        this.request.setTime(null);

        assertThrows(InvalidTimeMessage.class, ()->this.skeleton.getPrice(request));
    }

    private Calendar getDateTime(String dateTimeStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        Date date = sdf.parse(dateTimeStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}
