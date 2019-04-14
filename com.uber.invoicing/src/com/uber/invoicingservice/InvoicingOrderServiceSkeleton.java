
/**
 * InvoicingOrderServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.invoicingservice;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.Customer;
import com.uber.datatypes.Driver;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.datatypes.SuccessMessage;
import com.uber.elements.*;
import com.uber.utils.Validation;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 *  InvoicingOrderServiceSkeleton java skeleton for the axisService
 */
public class InvoicingOrderServiceSkeleton implements InvoicingOrderServiceSkeletonInterface {

    private DatabaseServiceStub databaseServiceStub;

    public InvoicingOrderServiceSkeleton() throws AxisFault {
        this(InvoicingOrderServiceSkeleton.getDatabaseServiceStub());
    }

    public InvoicingOrderServiceSkeleton(DatabaseServiceStub databaseServiceStub) {
        this.databaseServiceStub = databaseServiceStub;
    }

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
            throws InvalidCustomerMessage, InvalidDriverMessage, PriceNotFoundMessage, PaymentFailedMessage, InvalidLocationMessage {

        Validation.validateLocation(payForRideRequest0.getCurrentLocation(), new InvalidLocationMessage());
        Validation.validateLocation(payForRideRequest0.getEndLocation(), new InvalidLocationMessage());

        Customer customer = this.getCustomer(payForRideRequest0.getCustomerId());
        Driver driver = this.getDriver(payForRideRequest0.getDriverId());

        Validation.validatePrice(payForRideRequest0.getPrice(), new PriceNotFoundMessage());

        Validation.validateCardNumber(customer.getCardNumber(), new PaymentFailedMessage());

        SuccessMessage successMessage = new SuccessMessage();
        successMessage.setSuccessMessage("Invoicing created. Done!");

        return successMessage;
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
        } catch (RemoteException remoteException) {
            remoteException.printStackTrace();
        }

        return customer;
    }

    private Driver getDriver(int id) throws InvalidDriverMessage {
        Driver driver = null;
        try {
            GetDriverRequest driverRequest = new GetDriverRequest();
            driverRequest.setId(id);
            GetDriverResponse response = this.databaseServiceStub.getDriver(driverRequest);
            driver = response.getDriver();
        } catch (PersonNotFoundMessage personNotFoundMessage) {
            throw new InvalidDriverMessage();
        } catch (RemoteException remoteException) {
            remoteException.printStackTrace();
        }

        return driver;
    }

    static private DatabaseServiceStub getDatabaseServiceStub() throws AxisFault {
        String url = System.getenv("DATABASE_SERVICE_URL");
        if (url == null) {
            return new DatabaseServiceStub();
        }

        return new DatabaseServiceStub(url);
    }
}
