package com.shiwansh.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiwansh.day1.entity.Country;
import com.shiwansh.day1.service.CountryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/countries")
@Tag(name = "Country API", description = "Country CRUD Operations")
public class CountryController {

    @Autowired
    private CountryService service;

    @Operation(summary = "Get all customers")
    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAll();
    }

    @Operation(summary = "Get customer by ID")
    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @Operation(summary = "Add a new customer")
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.save(country);
    }

    @Operation(summary = "Update an existing customer")
    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return service.save(country);
    }

    @Operation(summary = "Delete customer by ID")
    @DeleteMapping("/{id}")
    public String deleteCountry(@PathVariable Integer id) {
        service.delete(id);
        return "Country deleted successfully!";
    }
}