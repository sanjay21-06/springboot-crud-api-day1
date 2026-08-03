package com.shiwansh.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiwansh.day1.entity.Customer;
import com.shiwansh.day1.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/customers")
@Tag(name = "Customer API", description = "Operations related to Customer Management")
public class CustomerController {

    @Autowired
    private CustomerService service;

    
    @Operation(summary = "Get all customers")
    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAll();
    }

    @Operation(summary = "Get customer by ID")
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @Operation(summary = "Add a new customer")
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @Operation(summary = "Update an existing customer")
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Integer id,
                                   @RequestBody Customer customer) {
        customer.setId(id);
        return service.save(customer);
    }

    @Operation(summary = "Delete customer by ID")
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        service.delete(id);
        return "Customer deleted successfully!";
    }
}