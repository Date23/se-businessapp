package com.businessapp;



import com.businessapp.model.IndividualCustomer;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AppTest.class,
        IndividualCustomerTests.class
})
public class TestSuite {

}

