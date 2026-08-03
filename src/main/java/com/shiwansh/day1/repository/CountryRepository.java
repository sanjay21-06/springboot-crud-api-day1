package com.shiwansh.day1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shiwansh.day1.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}