
/**
 * FeedbackServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.feedbackservice;

import java.rmi.RemoteException;

import com.uber.datatypes.PersonNotFoundMessage;

/**
     *  FeedbackServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface FeedbackServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param ratePersonRequest
         * @throws PersonNotFoundMessage 
         * @throws RemoteException 
         */

        
                public void ratePerson
                (
                  com.uber.elements.RatePersonRequest ratePersonRequest
                 ) throws RemoteException, PersonNotFoundMessage
            ;
        
         }
    