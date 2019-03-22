
/**
 * PricingOrderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.order.pricingservice;
    /**
     *  PricingOrderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface PricingOrderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPriceRequest
             * @throws PriceNotFoundMessage : 
         */

        
                public com.order.elements.GetPriceResponse getPrice
                (
                  com.order.elements.GetPriceRequest getPriceRequest
                 )
            throws PriceNotFoundMessage;
        
         }
    