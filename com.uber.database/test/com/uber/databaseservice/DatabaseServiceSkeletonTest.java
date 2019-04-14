package com.uber.databaseservice;

import com.uber.db.DBCreator;
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
    }

    @Test
    void testGetDrivers(){
        GetDriversResponse response = this.skeleton.getDrivers(this.getDriversRequest);
        assertEquals(3, response.getDriverElement().length);
    }

    @Test
    void testGetDriver() throws PersonNotFoundMessage {
        this.getDriverRequest.setId(1);
        GetDriverResponse response = this.skeleton.getDriver(this.getDriverRequest);
        assertEquals(1, response.getDriver().getId());
    }

    @Test
    void testGetDriverNotFound() {
        this.getDriverRequest.setId(-1);
        assertThrows(PersonNotFoundMessage.class, () -> this.skeleton.getDriver(this.getDriverRequest));
    }

    @Test
    void testGetCustomers(){
        GetCustomersResponse response = this.skeleton.getCustomers(this.getCustomersRequest);
        assertEquals(3, response.getCustomerElement().length);
    }

    @Test
    void testGetCustomer() throws PersonNotFoundMessage {
        this.getCustomerRequest.setId(2);
        GetCustomerResponse response = this.skeleton.getCustomer(this.getCustomerRequest);
        assertEquals(2, response.getDriver().getId());
    }

    @Test
    void testGetCustomerNotFound() {
        this.getCustomerRequest.setId(-1);
        assertThrows(PersonNotFoundMessage.class, () -> this.skeleton.getCustomer(this.getCustomerRequest));
    }
}
