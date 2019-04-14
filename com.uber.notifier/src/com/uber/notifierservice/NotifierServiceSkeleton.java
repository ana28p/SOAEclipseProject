
/**
 * NotifierServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package com.uber.notifierservice;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.databaseservice.PersonNotFoundMessage;
import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBQuery;
import com.uber.elements.GetCustomerRequest;
import com.uber.elements.GetCustomerResponse;
import com.uber.elements.GetDriversRequest;
import com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub;
import com.uber.utils.Validation;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Random;

/**
     *  NotifierServiceSkeleton java skeleton for the axisService
     */
    public class NotifierServiceSkeleton implements NotifierServiceSkeletonInterface{


    private DatabaseServiceStub databaseServiceStub;
    private NotifierCallbackOrderServiceStub notifierCallbackOrderServiceStub;

    public NotifierServiceSkeleton() throws AxisFault {
        this(NotifierServiceSkeleton.getDatabaseServiceStub(), NotifierServiceSkeleton.getNotifierCallbackOrderServiceStub());
    }

    public NotifierServiceSkeleton(DatabaseServiceStub databaseServiceStub, NotifierCallbackOrderServiceStub notifierCallbackOrderServiceStub) {
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

    public com.uber.datatypes.SuccessMessage findDriver
    (
            com.uber.elements.FindDriverRequest findDriverRequest0
    )
            throws InvalidPriceMessage, InvalidCustomerMessage, InvalidLocationMessage {
        Validation.validateLocation(findDriverRequest0.getStartLocation(), new InvalidLocationMessage());
        Validation.validateLocation(findDriverRequest0.getEndLocation(), new InvalidLocationMessage());
        Validation.validatePrice(findDriverRequest0.getPrice(), new InvalidPriceMessage());

        Customer customer = this.getCustomer(findDriverRequest0.getCustomerId());



        List<Driver> drivers = DBQuery.selectAllDrivers();
        Random rand = new Random();
        Driver randomDriver = drivers.get(rand.nextInt(drivers.size()));

        NotifierCallbackOrderServiceStub.DriverFoundRequest callbackResponse = new NotifierCallbackOrderServiceStub.DriverFoundRequest();
        callbackResponse.setCustomer(toCallbackCustomer(customer));
        callbackResponse.setDriver(toCallbackDriver(randomDriver));

        try {
            this.notifierCallbackOrderServiceStub.receiveCallBack(callbackResponse);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        SuccessMessage response = new SuccessMessage();
        response.setSuccessMessage("Please wait for a driver to accept...");

        return response;
    }

    private com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Customer toCallbackCustomer(Customer customer) {
        com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Customer cbCustomer = new com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Customer();
        cbCustomer.setId(customer.getId());
        cbCustomer.setAge(customer.getAge());
        cbCustomer.setName(customer.getName());
        cbCustomer.setCardNumber(customer.getCardNumber());
        cbCustomer.setRating(customer.getRating());

        return cbCustomer;
    }

    private com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Driver toCallbackDriver(Driver driver) {
        com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Driver cbDriver = new com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.Driver();
        cbDriver.setId(driver.getId());
        cbDriver.setAge(driver.getAge());
        cbDriver.setName(driver.getName());
        cbDriver.setCarNumber(driver.getCarNumber());
        cbDriver.setRating(driver.getRating());

        return cbDriver;
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

        GetDriversRequest driversRequest = new GetDriversRequest();

        return driver;
    }

    static private DatabaseServiceStub getDatabaseServiceStub() throws AxisFault {
        String url = System.getenv("DATABASE_SERVICE_URL");
        if(url == null){
            return new DatabaseServiceStub();
        }

        return new DatabaseServiceStub(url);
    }

    static private NotifierCallbackOrderServiceStub getNotifierCallbackOrderServiceStub() throws AxisFault {
        String url = System.getenv("NOTIFIER_CALLBACK_URL");
        if(url == null){
            return new NotifierCallbackOrderServiceStub();
        }

        return new NotifierCallbackOrderServiceStub(url);
    }
     
    }
    