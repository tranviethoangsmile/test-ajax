package com.codegym.service;

import com.codegym.entity.Customer;
import com.codegym.repository.TestAjaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    TestAjaxRepository testAjaxRepository;
    @Override
    public Iterable<Customer> findAll() {
        return testAjaxRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
       return testAjaxRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
          return testAjaxRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        testAjaxRepository.deleteById(id);
    }
}
