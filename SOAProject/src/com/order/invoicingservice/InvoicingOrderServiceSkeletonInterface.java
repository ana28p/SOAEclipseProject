
/**
 * InvoicingOrderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.order.invoicingservice;
    /**
     *  InvoicingOrderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface InvoicingOrderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param payForRideRequest
             * @throws InvalidDriverMessage : 
             * @throws PriceNotFoundMessage : 
             * @throws PaymentFailedMessage : 
             * @throws InvalidLocationMessage : 
         */

        
                public com.order.datatypes.SuccessMessage payForRide
                (
                  com.order.elements.PayForRideRequest payForRideRequest
                 )
            throws InvalidDriverMessage,PriceNotFoundMessage,PaymentFailedMessage,InvalidLocationMessage;
        
         }
    