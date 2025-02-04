
/**
 * NotifierServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.notifierservice;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.SuccessMessage;
import com.uber.elements.GetCustomerRequest;
import com.uber.elements.GetCustomerResponse;
import com.uber.elements.GetDriversRequest;
import com.uber.elements.GetDriversResponse;
import com.uber.notifiercallbackservice.NotifierCallbackServiceStub;
import com.uber.utils.Validation;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.Random;

/**
     *  NotifierServiceSkeleton java skeleton for the axisService
     */
    public class NotifierServiceSkeleton implements NotifierServiceSkeletonInterface{


    private DatabaseServiceStub databaseServiceStub;
    private NotifierCallbackServiceStub notifierCallbackOrderServiceStub;

    public NotifierServiceSkeleton() throws AxisFault {
        this(NotifierServiceSkeleton.getDatabaseServiceStub(), NotifierServiceSkeleton.getNotifierCallbackOrderServiceStub());
    }

    public NotifierServiceSkeleton(DatabaseServiceStub databaseServiceStub, NotifierCallbackServiceStub notifierCallbackOrderServiceStub) {
        this.databaseServiceStub = databaseServiceStub;
        this.notifierCallbackOrderServiceStub = notifierCallbackOrderServiceStub;
    }

    /**
     * Auto generated method signature
     *
     * @param findDriverRequest0
     * @return successMessage1
     * @throws InvalidPriceMessage
     * @throws InvalidCustomerMessage
     * @throws InvalidLocationMessage
     */

    public SuccessMessage findDriver
    (
            com.uber.elements.FindDriverRequest findDriverRequest0
    )
            throws InvalidPriceMessage, InvalidCustomerMessage, InvalidLocationMessage {
        Validation.validateLocation(findDriverRequest0.getStartLocation(), new InvalidLocationMessage());
        Validation.validateLocation(findDriverRequest0.getEndLocation(), new InvalidLocationMessage());
        Validation.validatePrice(findDriverRequest0.getPrice(), new InvalidPriceMessage());

        Customer customer = this.getCustomer(findDriverRequest0.getCustomerId());
        Driver driver = this.getRandomDriver();

        NotifierCallbackServiceStub.DriverFoundRequest callbackResponse = new NotifierCallbackServiceStub.DriverFoundRequest();
        callbackResponse.setCustomer(customer);
        callbackResponse.setDriver(driver);

        try {
            this.notifierCallbackOrderServiceStub.receiveCallBack(callbackResponse);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        SuccessMessage response = new SuccessMessage();
        response.setSuccessMessage("Please wait for a driver to accept...");

        return response;
    }

    private Customer getCustomer(int id) throws InvalidCustomerMessage {

        Customer customer = null;
        try {
            GetCustomerRequest customerRequest = new GetCustomerRequest();
            customerRequest.setId(id);
            GetCustomerResponse response = this.databaseServiceStub.getCustomer(customerRequest);
            customer = response.getCustomer();
        } catch (PersonNotFoundMessage personNotFoundMessage) {
            throw new InvalidCustomerMessage();
        } catch (RemoteException remoteException){
            remoteException.printStackTrace();
        }

        return customer;
    }

    private Driver getRandomDriver(){

        Driver driver = null;

        try {
            GetDriversRequest driversRequest = new GetDriversRequest();
            GetDriversResponse response = this.databaseServiceStub.getDrivers(driversRequest);
            Driver[] drivers = response.getDriverElement();
            Random rand = new Random();
            driver = drivers[rand.nextInt(drivers.length)];
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        
        return driver;
    }

    static private DatabaseServiceStub getDatabaseServiceStub() throws AxisFault {
        String url = System.getenv("DATABASE_SERVICE_URL");
        if(url == null){
            return new DatabaseServiceStub();
        }

        return new DatabaseServiceStub(url);
    }

    static private NotifierCallbackServiceStub getNotifierCallbackOrderServiceStub() throws AxisFault {
        String url = System.getenv("NOTIFIER_CALLBACK_URL");
        if(url == null){
            return new NotifierCallbackServiceStub();
        }

        return new NotifierCallbackServiceStub(url);
    }
     
    }
    