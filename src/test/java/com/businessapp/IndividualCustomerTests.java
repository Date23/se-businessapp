package com.businessapp;
import org.junit.Test;
import com.businessapp.model.IndividualCustomer;
import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lx on 26.10.17.
 */
public class IndividualCustomerTests {

    IndividualCustomer testCustomer = new IndividualCustomer();

    @Test
    public void testFirstName(){
        testCustomer.setFirstName("Hans");
        assertEquals("Hans", testCustomer.getFirstName());
    }

    @Test
    public void testFirstNameNull(){
        testCustomer.setFirstName(null);
        assertEquals(null, testCustomer.getFirstName());
    }

    @Test
    public void testFirstNameEmpty(){
        testCustomer.setFirstName("");
        assertEquals("", testCustomer.getFirstName());
    }

    @Test
    public void testName(){
        testCustomer.setName("Meyer");
        assertEquals("Meyer", testCustomer.getName());
    }

    @Test
    public void testNameNull(){
        testCustomer.setName(null);
        assertEquals(null, testCustomer.getName());
    }

    @Test
    public void testNameEmpty(){
        testCustomer.setName("");
        assertEquals("", testCustomer.getName());
    }

    @Test
    public void testId(){
        String s1 = new String("13");
        testCustomer.setId(s1);
        assertThat(s1 == testCustomer.getId(), is(true));
    }

    @Test
    public void testIdNull(){
        String s1 = null;
        testCustomer.setId(s1);
        assertThat(s1 == testCustomer.getId(), is(true));
    }
    @Test
    public void testIdEmpty(){
        String s1 = "";
        testCustomer.setId(s1);
        assertThat(s1 == testCustomer.getId(), is(true));
    }

    @Test
    public void testCreated(){
        testCustomer.setCreated(new Date(2014,12,12));
        assertEquals(new Date(2014,12,12), testCustomer.getCreated());
    }

    @Test
    public void testCreatedNull(){
        testCustomer.setCreated(null);
        assertEquals(null, testCustomer.getCreated());
    }

}
