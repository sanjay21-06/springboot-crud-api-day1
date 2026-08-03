package com.shiwansh.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwansh.day1.entity.Country;
import com.shiwansh.day1.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAll() {
        return repository.findAll();
    }

    public Country getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Country save(Country country) {
        return repository.save(country);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}