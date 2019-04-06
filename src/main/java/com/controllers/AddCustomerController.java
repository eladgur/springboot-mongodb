package com.controllers;

import com.model.Customer;
import com.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCustomerController {
    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/addCustomer")
    public Customer addCustomer(@RequestParam(value = "firstName", defaultValue = "firstName") String firstName,
                                @RequestParam(value = "lastName", defaultValue = "lastName") String lastName) {
        Customer customer = new Customer(firstName, lastName);
        repository.save(customer);

        return customer;
    }
}
