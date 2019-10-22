package com.example.customerapi.services;

import com.example.customerapi.entities.Customer;
import com.example.customerapi.repo.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerServiceTest {

    @Autowired
    CustomerRepository repo;

    @Autowired
    CustomerService service;

    @Test
    public void getAllCustomers() {
        /*
            Get "all" customers from database
         */
        //Setup
        List<Customer> customers = new ArrayList();

        Customer c = new Customer();

        c.setFirstName("John");
        customers.add(c);

        c.setFirstName("Bill");
        customers.add(c);

        c.setFirstName("Sara");
        customers.add(c);

        //Exercise
        repo.saveAll(customers);
        List<Customer> actual = null;
        actual = service.findAll();

        //Assert
        assertNotNull(actual);
        assertTrue(actual.size() == customers.size());
    }





}
