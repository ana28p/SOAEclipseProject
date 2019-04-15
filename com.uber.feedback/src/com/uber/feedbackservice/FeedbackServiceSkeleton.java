
/**
 * FeedbackServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.uber.feedbackservice;

import com.uber.databaseservice.DatabaseServiceStub;
import com.uber.datatypes.Customer;
import com.uber.datatypes.Person;
import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.db.DBQuery;
import com.uber.elements.GetCustomerRequest;
import com.uber.elements.GetCustomerResponse;
import com.uber.invoicingservice.InvalidCustomerMessage;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * FeedbackServiceSkeleton java skeleton for the axisService
 */
public class FeedbackServiceSkeleton implements FeedbackServiceSkeletonInterface {

    private DatabaseServiceStub databaseServiceStub;

    public FeedbackServiceSkeleton() throws AxisFault {
        this(FeedbackServiceSkeleton.getDatabaseServiceStub());
    }

    public FeedbackServiceSkeleton(DatabaseServiceStub databaseServiceStub) {
        this.databaseServiceStub = databaseServiceStub;
    }

    /**
     * Auto generated method signature
     *
     * @param ratePersonRequest0
     * @return
     */

    public void ratePerson
    (
            com.uber.elements.RatePersonRequest ratePersonRequest0
    ) {
        Person person = ratePersonRequest0.getPerson();
        double rating = ratePersonRequest0.getRating();

        DBQuery.updateFeedback(person.getId(), rating);
    }

    private Customer getCustomer(int id) throws InvalidCustomerMessage {
        Customer customer = null;
        try {
            GetCustomerRequest customerRequest = new GetCustomerRequest();
            customerRequest.setId(id);
            GetCustomerResponse response = this.databaseServiceStub.
            customer = response.getCustomer();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return customer;
    }

    static private DatabaseServiceStub getDatabaseServiceStub() throws AxisFault {
        String url = System.getenv("DATABASE_SERVICE_URL");
        if (url == null) {
            return new DatabaseServiceStub();
        }

        return new DatabaseServiceStub(url);
    }
}
    