package com.shiwansh.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiwansh.day1.entity.Language;
import com.shiwansh.day1.service.LanguageService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/languages")
@Tag(name = "Language API", description = "Language CRUD Operations")
public class LanguageController {

    @Autowired
    private LanguageService service;

    @Operation(summary = "Get all customers")
    @GetMapping
    public List<Language> getAllLanguages() {
        return service.getAll();
    }

    @Operation(summary = "Get customer by ID")
    @GetMapping("/{id}")
    public Language getLanguageById(@PathVariable Integer id) {
        return service.getById(id);
    }

     @Operation(summary = "Add a new customer")
    @PostMapping
    public Language addLanguage(@RequestBody Language language) {
        return service.save(language);
    }

    @Operation(summary = "Update an existing customer")
    @PutMapping
    public Language updateLanguage(@RequestBody Language language) {
        return service.save(language);
    }

    @Operation(summary = "Delete customer by ID")
    @DeleteMapping("/{id}")
    public String deleteLanguage(@PathVariable Integer id) {
        service.delete(id);
        return "Data deleted successfully!";
    }
}