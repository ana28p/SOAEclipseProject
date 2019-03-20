package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.order.elements.PayForRideRequest;
import com.order.elements.PayForRideResponse;
import com.order.invoicingservice.InvoicingOrderServiceSkeleton;
import com.order.invoicingservice.PaymentFailedMessage;

class InvoicingOrderServiceSkeletonTest {

	@Test
	void test() {
		fail("Not yet implemented");
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
