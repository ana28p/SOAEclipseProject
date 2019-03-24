
/**
 * FeedbackOrderServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.feedbackservice;

import com.order.datatypes.Person;
import com.order.db.DBQuery;

/**
 *  FeedbackOrderServiceSkeleton java skeleton for the axisService
 */
public class FeedbackOrderServiceSkeleton implements FeedbackOrderServiceSkeletonInterface{


	/**
	 * Auto generated method signature
	 * 
	 * @param ratePersonRequest0 
	 * @return
	 */

	public void ratePerson
	(
			com.order.elements.RatePersonRequest ratePersonRequest0
			)
	{
		Person person = ratePersonRequest0.getPerson();
		double rating = ratePersonRequest0.getRating();

		DBQuery.updateFeedback(person.getId(), rating);

	}

}
