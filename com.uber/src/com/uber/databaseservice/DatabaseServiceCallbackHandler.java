
/**
 * DatabaseServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package com.uber.databaseservice;

import com.uber.datatypes.SuccessMessage;
import com.uber.elements.GetCustomerResponse;
import com.uber.elements.GetCustomersResponse;
import com.uber.elements.GetDriverResponse;
import com.uber.elements.GetDriversResponse;

/**
     *  DatabaseServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DatabaseServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DatabaseServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DatabaseServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getDriver method
            * override this method for handling normal response from getDriver operation
            */
           public void receiveResultgetDriver(
                    GetDriverResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDriver operation
           */
            public void receiveErrorgetDriver(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for giveFeedback method
            * override this method for handling normal response from giveFeedback operation
            */
           public void receiveResultgiveFeedback(
                    SuccessMessage result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from giveFeedback operation
           */
            public void receiveErrorgiveFeedback(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCustomers method
            * override this method for handling normal response from getCustomers operation
            */
           public void receiveResultgetCustomers(
                    GetCustomersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCustomers operation
           */
            public void receiveErrorgetCustomers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCustomer method
            * override this method for handling normal response from getCustomer operation
            */
           public void receiveResultgetCustomer(
                    GetCustomerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCustomer operation
           */
            public void receiveErrorgetCustomer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDrivers method
            * override this method for handling normal response from getDrivers operation
            */
           public void receiveResultgetDrivers(
                    GetDriversResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDrivers operation
           */
            public void receiveErrorgetDrivers(java.lang.Exception e) {
            }
                


    }
    