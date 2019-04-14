
/**
 * InvoicingOrderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.invoicingservice;
    /**
     *  InvoicingOrderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface InvoicingOrderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param payForRideRequest
             * @throws InvalidCustomerMessage : 
             * @throws InvalidDriverMessage : 
             * @throws PriceNotFoundMessage : 
             * @throws PaymentFailedMessage : 
             * @throws InvalidLocationMessage : 
         */

        
                public com.uber.datatypes.SuccessMessage payForRide
                (
                  com.uber.elements.PayForRideRequest payForRideRequest
                 )
            throws InvalidCustomerMessage,InvalidDriverMessage,PriceNotFoundMessage,PaymentFailedMessage,InvalidLocationMessage;
        
         }
    