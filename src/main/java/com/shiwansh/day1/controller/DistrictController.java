package com.shiwansh.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiwansh.day1.entity.District;
import com.shiwansh.day1.service.DistrictService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/districts")
@Tag(name = "District API", description = "District CRUD Operations")
public class DistrictController {

    @Autowired
    private DistrictService service;

    @Operation(summary = "Get all customers")
    @GetMapping
    public List<District> getAllDistricts() {
        return service.getAll();
    }

    @Operation(summary = "Get customer by ID")
    @GetMapping("/{id}")
    public District getDistrictById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @Operation(summary = "Add a new customer")
    @PostMapping
    public District addDistrict(@RequestBody District district) {
        return service.save(district);
    }

    @Operation(summary = "Update an existing customer")
    @PutMapping("/{id}")
    public District updateDistrict(@PathVariable Integer id,
                                @RequestBody District district) {
        district.setId(id);
        return service.save(district);
    }

    @Operation(summary = "Delete customer by ID")
    @DeleteMapping("/{id}")
    public String deleteDistrict(@PathVariable Integer id) {
        service.delete(id);
        return "District deleted successfully!";
    }
}