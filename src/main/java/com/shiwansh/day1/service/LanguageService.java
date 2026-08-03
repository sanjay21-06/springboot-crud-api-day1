package com.shiwansh.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwansh.day1.entity.Language;
import com.shiwansh.day1.repository.LanguageRepository;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository repository;

    public List<Language> getAll() {
        return repository.findAll();
    }

    public Language getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Language save(Language language) {
        return repository.save(language);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}