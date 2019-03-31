
/**
 * PricingServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.pricingservice;
    /**
     *  PricingServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface PricingServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPriceRequest
             * @throws PriceNotFoundMessage : 
             * @throws InvalidTimeMessage : 
             * @throws InvalidLocationMessage : 
         */

        
                public com.uber.elements.GetPriceResponse getPrice
                (
                  com.uber.elements.GetPriceRequest getPriceRequest
                 )
            throws PriceNotFoundMessage,InvalidTimeMessage,InvalidLocationMessage;
        
         }
    