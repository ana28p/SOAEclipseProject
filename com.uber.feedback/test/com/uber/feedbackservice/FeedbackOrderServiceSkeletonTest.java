package com.uber.feedbackservice;

import static org.mockito.Mockito.mock;

import java.rmi.RemoteException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.elements.RatePersonRequest;

public class FeedbackOrderServiceSkeletonTest {

	private Customer customer;
	private Driver driver;

	private RatePersonRequest request;
	private FeedbackServiceSkeleton skeleton;

	private DatabaseServiceStub databaseServiceStub;

	@BeforeEach
	public void beforeEach() throws RemoteException, PersonNotFoundMessage {
		this.databaseServiceStub = mock(DatabaseServiceStub.class);
		this.skeleton = new FeedbackServiceSkeleton(this.databaseServiceStub);
	}

	@Test
	void testGetRatingRateCustomer() throws RemoteException, PersonNotFoundMessage {
		this.customer = new Customer();
		customer.setId(4);
		customer.setName("Signe Foye");
		customer.setAge(27);
		customer.setCardNumber("NL261981");
		customer.setRating(5.0);

		request = new RatePersonRequest();
		request.setPerson(customer);
		request.setRating(3);

		skeleton.ratePerson(request);
	}

	@Test
	void testGetRatingRateDriver() throws RemoteException, PersonNotFoundMessage {
		this.driver = new Driver();
		driver.setId(5);
		driver.setName("Jasper Lowe");
		driver.setAge(21);
		driver.setCarNumber("JL4944");
		driver.setRating(4.50);

		request = new RatePersonRequest();
		request.setPerson(driver);
		request.setRating(4);

		skeleton.ratePerson(request);
	}

}
