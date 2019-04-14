package com.uber.databaseservice;

import com.uber.datatypes.PersonNotFoundMessage;
import com.uber.datatypes.SuccessMessage;
import com.uber.db.DBCreator;
import com.uber.db.DBQuery;
import com.uber.elements.*;
import com.uber.utils.CleaningDB;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseServiceSkeletonTest {

    private DatabaseServiceSkeleton skeleton;
    private GetDriversRequest getDriversRequest;
    private GetDriverRequest getDriverRequest;
    private GetCustomersRequest getCustomersRequest;
    private GetCustomerRequest getCustomerRequest;
    private GiveFeedbackRequest giveFeedbackRequest;

    @BeforeAll
    static public void beforeClass() {
        CleaningDB.deleteDB();
        DBCreator.initializeDB();
    }

    @BeforeEach
    public void beforeEach() {
        this.skeleton = new DatabaseServiceSkeleton();
        this.getDriversRequest = new GetDriversRequest();
        this.getDriverRequest = new GetDriverRequest();
        this.getCustomersRequest = new GetCustomersRequest();
        this.getCustomerRequest = new GetCustomerRequest();
        this.giveFeedbackRequest = new GiveFeedbackRequest();
    }

    @Test
    void testGetDrivers(){
        GetDriversResponse response = this.skeleton.getDrivers(this.getDriversRequest);
        assertEquals(3, response.getDriverElement().length);
    }

    @Test
    void testGetDriver() throws com.uber.datatypes.PersonNotFoundMessage {
        this.getDriverRequest.setId(1);
        GetDriverResponse response = this.skeleton.getDriver(this.getDriverRequest);
        assertEquals(1, response.getDriver().getId());
    }

    @Test
    void testGetDriverNotFound() {
        this.getDriverRequest.setId(-1);
        assertThrows(com.uber.datatypes.PersonNotFoundMessage.class, () -> this.skeleton.getDriver(this.getDriverRequest));
    }

    @Test
    void testGetCustomers(){
        GetCustomersResponse response = this.skeleton.getCustomers(this.getCustomersRequest);
        assertEquals(3, response.getCustomerElement().length);
    }

    @Test
    void testGetCustomer() throws com.uber.datatypes.PersonNotFoundMessage {
        this.getCustomerRequest.setId(2);
        GetCustomerResponse response = this.skeleton.getCustomer(this.getCustomerRequest);
        assertEquals(2, response.getCustomer().getId());
    }

    @Test
    void testGetCustomerNotFound() {
        this.getCustomerRequest.setId(-1);
        assertThrows(com.uber.datatypes.PersonNotFoundMessage.class, () -> this.skeleton.getCustomer(this.getCustomerRequest));
    }

    @Test
    void testGiveFeedback() throws com.uber.datatypes.PersonNotFoundMessage {
        CleaningDB.deleteDB();
        DBCreator.initializeDB();
        this.giveFeedbackRequest.setId(2);
        this.giveFeedbackRequest.setRating(2.5);
        SuccessMessage response = this.skeleton.giveFeedback(this.giveFeedbackRequest);
        assertNotNull(response);

        double newRating = DBQuery.getRatingOf(2);
        assertEquals(4.0, newRating);
    }

    @Test
    void testGiveFeedbackPersonNotFound(){
        this.giveFeedbackRequest.setId(-1);
        this.giveFeedbackRequest.setRating(2.5);
        assertThrows(PersonNotFoundMessage.class, () -> this.skeleton.giveFeedback(this.giveFeedbackRequest));
    }
}
