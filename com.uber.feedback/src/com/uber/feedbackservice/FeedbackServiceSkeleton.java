
/**
 * FeedbackServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.feedbackservice;

import com.uber.datatypes.Person;
import com.uber.db.DBQuery;

/**
     *  FeedbackServiceSkeleton java skeleton for the axisService
     */
    public class FeedbackServiceSkeleton implements FeedbackServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param ratePersonRequest0 
             * @return  
         */
        
                 public void ratePerson
                  (
                  com.uber.elements.RatePersonRequest ratePersonRequest0
                  )
            {
                Person person = ratePersonRequest0.getPerson();
                double rating = ratePersonRequest0.getRating();

                DBQuery.updateFeedback(person.getId(), rating);
        }
     
    }
    