
/**
 * NavigationServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.navigationservice;
    /**
     *  NavigationServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface NavigationServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDistanceRequest
             * @throws InvalidLocationMessage : 
         */

        
                public com.uber.elements.GetDistanceResponse getDistance
                (
                  com.uber.elements.GetDistanceRequest getDistanceRequest
                 )
            throws InvalidLocationMessage;
        
         }
    