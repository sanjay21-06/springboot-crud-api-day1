package com.shiwansh.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwansh.day1.entity.Customer;
import com.shiwansh.day1.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}