
/**
 * NavigationOrderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.order.navigationservice;

import com.order.pricingservice.InvalidLocationMessage;

/**
     *  NavigationOrderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface NavigationOrderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDistanceRequest
             * @throws InvalidLocationMessage :
         */

        
                public com.order.elements.GetDistanceResponse getDistance
                (
                  com.order.elements.GetDistanceRequest getDistanceRequest
                 )
            throws InvalidLocationMessage;
        
         }
    