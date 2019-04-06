package com.controllers;

import com.model.Customer;
import com.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/customer")
    public Customer Customer(@RequestParam(value = "firstName", defaultValue = "firstName") String firstName) {
        return repository.findByFirstName(firstName);
    }

}