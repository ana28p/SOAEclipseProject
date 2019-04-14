
/**
 * DatabaseServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.databaseservice;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
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


    /**
     * Auto generated method signature
     *
     * @param getDriverRequest1
     * @return getDriverResponse2
     * @throws PersonNotFoundMessage
     */

    public com.uber.elements.GetDriverResponse getDriver
    (
            com.uber.elements.GetDriverRequest getDriverRequest1
    )
            throws PersonNotFoundMessage {
        Driver driver = DBQuery.selectDriver(getDriverRequest1.getId());
        GetDriverResponse response = new GetDriverResponse();
        response.setDriver(driver);

        if (driver == null) {
            throw new PersonNotFoundMessage();
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
     * @throws PersonNotFoundMessage
     */

    public com.uber.elements.GetCustomerResponse getCustomer
    (
            com.uber.elements.GetCustomerRequest getCustomerRequest5
    )
            throws PersonNotFoundMessage {
        Customer customer = DBQuery.selectCustomer(getCustomerRequest5.getId());
        GetCustomerResponse response = new GetCustomerResponse();
        response.setCustomer(customer);

        if (customer == null) {
            throw new PersonNotFoundMessage();
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
     * @param getCustomerRequest9
     * @return successMessage10
     * @throws PersonNotFoundMessage
     */

    public com.uber.datatypes.SuccessMessage updateFeedback
    (
            com.uber.elements.GetCustomerRequest getCustomerRequest9
    )
            throws PersonNotFoundMessage {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#updateFeedback");
    }

}
    