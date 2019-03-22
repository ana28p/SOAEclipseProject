package com.order.invoicingservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.order.elements.PayForRideRequest;
import com.order.elements.PayForRideResponse;

class InvoicingOrderServiceSkeletonTest {

	@Test
	void test() {
		PayForRideRequest request = new PayForRideRequest();
//		request.setCurrentLocation(param);
		InvoicingOrderServiceSkeleton order = new InvoicingOrderServiceSkeleton();
		PayForRideResponse response = null;
		try {
			response = order.payForRide(request);
		} catch (PaymentFailedMessage e) {
			e.printStackTrace();
		}
		assertNotNull(response);
//		assertEquals("expected", response.getStatus(), "not equal message report");
	}

}
