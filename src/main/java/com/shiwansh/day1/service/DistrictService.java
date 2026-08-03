package com.shiwansh.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwansh.day1.entity.District;
import com.shiwansh.day1.repository.DistrictRepository;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository repository;

    public List<District> getAll() {
        return repository.findAll();
    }

    public District getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public District save(District district) {
        return repository.save(district);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}