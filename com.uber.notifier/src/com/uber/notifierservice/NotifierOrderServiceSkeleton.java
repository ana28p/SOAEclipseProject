
/**
 * NotifierOrderServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.notifierservice;

import com.uber.datatypes.SuccessMessage;
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

        return response;
    }

}
