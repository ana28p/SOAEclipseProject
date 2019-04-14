
/**
 * NotifierOrderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.notifierservice;
    /**
     *  NotifierOrderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface NotifierOrderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param findDriverRequest
             * @throws InvalidPriceMessage : 
             * @throws InvalidCustomerMessage : 
             * @throws InvalidLocationMessage : 
         */

        
                public com.uber.datatypes.SuccessMessage findDriver
                (
                  com.uber.elements.FindDriverRequest findDriverRequest
                 )
            throws InvalidPriceMessage,InvalidCustomerMessage,InvalidLocationMessage;
        
         }
    