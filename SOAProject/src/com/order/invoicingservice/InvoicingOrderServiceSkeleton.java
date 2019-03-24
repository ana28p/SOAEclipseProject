
/**
 * InvoicingOrderServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.order.invoicingservice;

import com.order.datatypes.SuccessMessage;
import com.order.utils.Validation;

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

	public com.order.datatypes.SuccessMessage payForRide
	(
			com.order.elements.PayForRideRequest payForRideRequest0
			)
					throws InvalidCustomerMessage,InvalidDriverMessage,PriceNotFoundMessage,PaymentFailedMessage,InvalidLocationMessage{
		
		Validation.validateLocation(payForRideRequest0.getCurrentLocation(), new InvalidLocationMessage());
		Validation.validateLocation(payForRideRequest0.getEndLocation(), new InvalidLocationMessage());

		Validation.validateCustomer(payForRideRequest0.getCustomer(), new InvalidCustomerMessage());
		Validation.validateDriver(payForRideRequest0.getDriver(), new InvalidDriverMessage());
		
		Validation.validatePrice(payForRideRequest0.getPrice(), new PriceNotFoundMessage());
		
		Validation.validateCardNumber(payForRideRequest0.getCustomer().getCardNumer(), new PaymentFailedMessage());

		SuccessMessage successMessage = new SuccessMessage();
		successMessage.setSuccessMessage("Invoicing created.");

		return successMessage;
	}

}
