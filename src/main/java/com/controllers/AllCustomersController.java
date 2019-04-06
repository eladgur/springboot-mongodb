package com.controllers;

import com.model.Customer;
import com.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllCustomersController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/allCostumers")
    public List<Customer> allCustomers() {
        return repository.findAll();
    }

}