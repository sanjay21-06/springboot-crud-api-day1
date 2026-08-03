package com.shiwansh.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwansh.day1.entity.State;
import com.shiwansh.day1.repository.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository repository;

    public List<State> getAll() {
        return repository.findAll();
    }

    public State getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public State save(State state) {
        return repository.save(state);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}