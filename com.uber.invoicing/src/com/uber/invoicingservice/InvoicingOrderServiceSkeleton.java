
/**
 * InvoicingOrderServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.invoicingservice;

import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBQuery;
import com.uber.utils.Validation;

/**
 *  InvoicingOrderServiceSkeleton java skeleton for the axisService
 */
public class InvoicingOrderServiceSkeleton implements InvoicingOrderServiceSkeletonInterface{


	/**
	 * Auto generated method signature
	 * 
	 * @param payForRideRequest0 
	 * @return successMessage1 
	 * @throws InvalidCustomerMessage 
	 * @throws InvalidDriverMessage 
	 * @throws PriceNotFoundMessage 
	 * @throws PaymentFailedMessage 
	 * @throws InvalidLocationMessage 
	 */

	public com.uber.datatypes.SuccessMessage payForRide
	(
			com.uber.elements.PayForRideRequest payForRideRequest0
			)
					throws InvalidCustomerMessage,InvalidDriverMessage,PriceNotFoundMessage,PaymentFailedMessage,InvalidLocationMessage{
		
		Validation.validateLocation(payForRideRequest0.getCurrentLocation(), new InvalidLocationMessage());
		Validation.validateLocation(payForRideRequest0.getEndLocation(), new InvalidLocationMessage());

		Validation.validateCustomer(payForRideRequest0.getCustomer(), new InvalidCustomerMessage());
		Customer customer = DBQuery.selectCustomer(payForRideRequest0.getCustomer().getId());
		payForRideRequest0.setCustomer(customer);

		Validation.validateDriver(payForRideRequest0.getDriver(), new InvalidDriverMessage());
		Driver driver = DBQuery.selectDriver(payForRideRequest0.getDriver().getId());
		payForRideRequest0.setDriver(driver);
		
		Validation.validatePrice(payForRideRequest0.getPrice(), new PriceNotFoundMessage());
		
		Validation.validateCardNumber(payForRideRequest0.getCustomer().getCardNumber(), new PaymentFailedMessage());

		SuccessMessage successMessage = new SuccessMessage();
		successMessage.setSuccessMessage("Invoicing created. Done!");

		return successMessage;
	}


}
