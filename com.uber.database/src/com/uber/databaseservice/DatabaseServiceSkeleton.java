
/**
 * DatabaseServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.databaseservice;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBCreator;
import com.uber.db.DBQuery;
import com.uber.elements.GetCustomerResponse;
import com.uber.elements.GetCustomersResponse;
import com.uber.elements.GetDriverResponse;
import com.uber.elements.GetDriversResponse;

import java.util.List;

/**
 *  DatabaseServiceSkeleton java skeleton for the axisService
 */
public class DatabaseServiceSkeleton implements DatabaseServiceSkeletonInterface {

    public DatabaseServiceSkeleton() {

        if(!DBCreator.databaseExists()){
            DBCreator.initializeDB();
        }
    }

    /**
     * Auto generated method signature
     *
     * @param getDriverRequest1
     * @return getDriverResponse2
     * @throws com.uber.datatypes.PersonNotFoundMessage
     */

    public com.uber.elements.GetDriverResponse getDriver
    (
            com.uber.elements.GetDriverRequest getDriverRequest1
    )
            throws com.uber.datatypes.PersonNotFoundMessage {
        Driver driver = DBQuery.selectDriver(getDriverRequest1.getId());
        GetDriverResponse response = new GetDriverResponse();
        response.setDriver(driver);

        if (driver == null) {
            throw new com.uber.datatypes.PersonNotFoundMessage();
        }
        return response;
    }


    /**
     * Auto generated method signature
     *
     * @param getCustomersRequest3
     * @return getCustomersResponse4
     */

    public com.uber.elements.GetCustomersResponse getCustomers
    (
            com.uber.elements.GetCustomersRequest getCustomersRequest3
    ) {
        List<Customer> customers = DBQuery.selectAllCustomers();
        GetCustomersResponse response = new GetCustomersResponse();
        response.setCustomerElement(customers.toArray(new Customer[customers.size()]));
        return response;
    }


    /**
     * Auto generated method signature
     *
     * @param getCustomerRequest5
     * @return getCustomerResponse6
     * @throws com.uber.datatypes.PersonNotFoundMessage
     */

    public com.uber.elements.GetCustomerResponse getCustomer
    (
            com.uber.elements.GetCustomerRequest getCustomerRequest5
    )
            throws com.uber.datatypes.PersonNotFoundMessage {
        Customer customer = DBQuery.selectCustomer(getCustomerRequest5.getId());
        GetCustomerResponse response = new GetCustomerResponse();
        response.setCustomer(customer);

        if (customer == null) {
            throw new com.uber.datatypes.PersonNotFoundMessage();
        }
        return response;
    }


    /**
     * Auto generated method signature
     *
     * @param getDriversRequest7
     * @return getDriversResponse8
     */

    public com.uber.elements.GetDriversResponse getDrivers
    (
            com.uber.elements.GetDriversRequest getDriversRequest7
    ) {
        List<Driver> drivers = DBQuery.selectAllDrivers();
        GetDriversResponse response = new GetDriversResponse();
        response.setDriverElement(drivers.toArray(new Driver[drivers.size()]));
        return response;
    }


    /**
     * Auto generated method signature
     *
     * @param giveFeedBackRequest9
     * @return successMessage10
     * @throws com.uber.datatypes.PersonNotFoundMessage
     */

    public com.uber.datatypes.SuccessMessage giveFeedback
    (
            com.uber.elements.GiveFeedbackRequest giveFeedBackRequest9
    )
            throws com.uber.datatypes.PersonNotFoundMessage {
        try{
            DBQuery.updateFeedback(giveFeedBackRequest9.getId(), giveFeedBackRequest9.getRating());
        } catch (Exception e){
            throw new PersonNotFoundMessage();
        }

        SuccessMessage response = new SuccessMessage();
        response.setSuccessMessage("Feedback added");

        return response;
    }

}
    