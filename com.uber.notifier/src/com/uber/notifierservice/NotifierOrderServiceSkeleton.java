
/**
 * NotifierOrderServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.notifierservice;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Random;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBQuery;
import com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub;
import com.uber.notifiercallbackservice.NotifierCallbackOrderServiceStub.DriverFoundRequest;
import com.uber.utils.Validation;

/**
 *  NotifierOrderServiceSkeleton java skeleton for the axisService
 */
public class NotifierOrderServiceSkeleton implements NotifierOrderServiceSkeletonInterface{


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
        Validation.validateCustomer(findDriverRequest0.getCustomer(), new InvalidCustomerMessage());

        SuccessMessage response = new SuccessMessage();
        response.setSuccessMessage("Wait for a driver to accept...");
        
        DriverFoundRequest callbackResponse = new DriverFoundRequest();
        Customer dbCustomer = DBQuery.selectCustomer(findDriverRequest0.getCustomer().getId());
        
        List<Driver> drivers = DBQuery.selectAllDrivers();
        Random rand = new Random();
        Driver randomDriver = drivers.get(rand.nextInt(drivers.size()));
        
        callbackResponse.setCustomer(toCallbackCustomer(dbCustomer));
        callbackResponse.setDriver(toCallbackDriver(randomDriver));
        
        try {
			new NotifierCallbackOrderServiceStub().receiveCallBack(callbackResponse);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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

}
