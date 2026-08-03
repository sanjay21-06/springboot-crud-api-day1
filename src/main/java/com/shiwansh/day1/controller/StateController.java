package com.shiwansh.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiwansh.day1.entity.State;
import com.shiwansh.day1.service.StateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/states")
@Tag(name = "State API", description = "State CRUD Operations")
public class StateController {

    @Autowired
    private StateService service;


    @Operation(summary = "Get all customers")
    @GetMapping
    public List<State> getAllStates() {
        return service.getAll();
    }

    @Operation(summary = "Get customer by ID")
    @GetMapping("/{id}")
    public State getStateById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @Operation(summary = "Add a new customer")
    @PostMapping
    public State addState(@RequestBody State state) {
        return service.save(state);
    }

    @Operation(summary = "Update an existing customer")
    @PutMapping
    public State updateState(@RequestBody State state) {
        return service.save(state);
    }

    @Operation(summary = "Delete customer by ID")
    @DeleteMapping("/{id}")
    public String deleteState(@PathVariable Integer id) {
        service.delete(id);
        return "State deleted successfully!";
    }
}