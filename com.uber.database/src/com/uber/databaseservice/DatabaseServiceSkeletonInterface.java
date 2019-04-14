
/**
 * DatabaseServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.databaseservice;
    /**
     *  DatabaseServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface DatabaseServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDriverRequest
             * @throws PersonNotFoundMessage : 
         */

        
                public com.uber.elements.GetDriverResponse getDriver
                (
                  com.uber.elements.GetDriverRequest getDriverRequest
                 )
            throws PersonNotFoundMessage;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCustomerRequest
             * @throws PersonNotFoundMessage : 
         */

        
                public com.uber.datatypes.SuccessMessage giveFeedback
                (
                  com.uber.elements.GetCustomerRequest getCustomerRequest
                 )
            throws PersonNotFoundMessage;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCustomersRequest
         */

        
                public com.uber.elements.GetCustomersResponse getCustomers
                (
                  com.uber.elements.GetCustomersRequest getCustomersRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCustomerRequest0
             * @throws PersonNotFoundMessage : 
         */

        
                public com.uber.elements.GetCustomerResponse getCustomer
                (
                  com.uber.elements.GetCustomerRequest getCustomerRequest0
                 )
            throws PersonNotFoundMessage;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDriversRequest
         */

        
                public com.uber.elements.GetDriversResponse getDrivers
                (
                  com.uber.elements.GetDriversRequest getDriversRequest
                 )
            ;
        
         }
    