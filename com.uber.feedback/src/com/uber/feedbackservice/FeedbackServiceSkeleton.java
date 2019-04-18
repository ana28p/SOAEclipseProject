
/**
 * FeedbackServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.feedbackservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.elements.GiveFeedbackRequest;

/**
 *  FeedbackServiceSkeleton java skeleton for the axisService
 */
public class FeedbackServiceSkeleton implements FeedbackServiceSkeletonInterface{

	private DatabaseServiceStub databaseServiceStub;

	public FeedbackServiceSkeleton() throws AxisFault {
		this(FeedbackServiceSkeleton.getDatabaseServiceStub());
	}

	public FeedbackServiceSkeleton(DatabaseServiceStub databaseServiceStub) {
		this.databaseServiceStub = databaseServiceStub;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param ratePersonRequest0 
	 * @return  
	 * @throws PersonNotFoundMessage 
	 * @throws RemoteException 
	 */

	public void ratePerson
	(
			com.uber.elements.RatePersonRequest ratePersonRequest0
			) throws RemoteException, PersonNotFoundMessage
	{
		GiveFeedbackRequest request = new GiveFeedbackRequest();
		request.setId(ratePersonRequest0.getPersonId());
		request.setRating(ratePersonRequest0.getRating());

		this.databaseServiceStub.giveFeedback(request);
	}

	static private DatabaseServiceStub getDatabaseServiceStub() throws AxisFault {
		String url = System.getenv("DATABASE_SERVICE_URL");
		if (url == null) {
			return new DatabaseServiceStub();
		}

		return new DatabaseServiceStub(url);
	}

}
