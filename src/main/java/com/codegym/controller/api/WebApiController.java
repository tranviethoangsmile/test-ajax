package com.codegym.controller.api;

import com.codegym.entity.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WebApiController {
    @Autowired
    ICustomerService customerService;
    @GetMapping ("/list")
    public Iterable <Customer> getAllCustomerge () {
        return customerService.findAll();
    }

    @PostMapping ("/create")
    public Customer createCustomer (@RequestBody Customer customer) {
        Customer respCustomer = customerService.save(customer);
        return respCustomer;
    }

    @GetMapping("/edit/{id}")
    public Customer create(@PathVariable Long id) {
        Customer customer = customerService.findById(id).get();
        return customer;
    }

    @PostMapping("/update")
    public Customer update (@RequestBody Customer customer) {
        Customer upCustomer = customerService.save(customer);
        return upCustomer;
    }
}
