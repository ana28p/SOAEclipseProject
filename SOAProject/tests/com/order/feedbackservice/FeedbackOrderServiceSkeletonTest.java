package com.order.feedbackservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.order.datatypes.Customer;
import com.order.datatypes.Driver;
import com.order.db.DBCreator;
import com.order.db.DBQuery;
import com.order.elements.RatePersonRequest;
import com.order.utils.CleaningDB;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackOrderServiceSkeletonTest {

	private RatePersonRequest request;
	private FeedbackOrderServiceSkeleton skeleton = new FeedbackOrderServiceSkeleton();

	@BeforeEach
	public void beforeEach() {
		CleaningDB.deleteDB();
		DBCreator.initializeDB();
	}

	@Test
	void testGetRatingRateCustomer() {
		// id: 4, name: Signe Foye, age: 27, cardNo: NL261981, rating: 5.00
		Customer customer = DBQuery.selectCustomer(4);

		assertEquals(5, customer.getRating());

		request = new RatePersonRequest();
		request.setPerson(customer);
		request.setRating(3);

		skeleton.ratePerson(request);

		customer = DBQuery.selectCustomer(4);

		assertEquals(4.5, customer.getRating());
	}

	@Test
	void testGetRatingRateDriver() {
		// id: 5, name: Jasper Lowe, age: 21, carNo: JL4944, rating: 4.50
		Driver driver = DBQuery.selectDriver(5);

		assertEquals(4.5, driver.getRating());

		request = new RatePersonRequest();
		request.setPerson(driver);
		request.setRating(4);

		skeleton.ratePerson(request);

		driver = DBQuery.selectDriver(5);

		assertEquals(4.4, driver.getRating());
	}

}
