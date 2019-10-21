package com.example.customerapi.entities;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CustomerTest {

    private Customer customer;

    @Before
    public void setup(){
        customer = new Customer();
    }

    @Test
    public void doesExists(){
        Assert.notNull(new Customer());
    }

    @Test
    public void getCustomerId(){
        customer.setId(1L);
        assertEquals(1, customer.getId());
    }

    @Test
    public void getCustomerAddress(){
        customer.setAddress("55 F Street");
        assertEquals("55 F Street", customer.getAddress());
    }

    @Test
    public void getCustomerCity(){
        customer.setCity("Washington");
        assertEquals("Washington", customer.getCity());
    }

    @Test
    public void getCustomerJoinDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formatter.parse("05/05/2015");
        customer.setJoinDate(date);
        assertEquals("05/05/2015", formatter.format(customer.getJoinDate()));
    }

    @Test
    public void getCustomerFirstName(){
        customer.setFirstName("John");
        assertEquals("John", customer.getFirstName());
    }

    @Test
    public void getCustomerLastName(){
        customer.setLastName("Smith");
        assertEquals("Smith", customer.getLastName());
    }

    @Test
    public void getCustomerPhoneNumber(){
        customer.setPhoneNumber("240-111-2222");
        assertEquals("240-111-2222", customer.getPhoneNumber());
    }

    @Test
    public void getCustomerState(){
        customer.setState("DC");
        assertEquals("DC", customer.getState());
    }

    @Test
    public void getCustomerZipCode(){
        customer.setZip("20005");
        assertEquals("20005", customer.getZip());
    }
}
