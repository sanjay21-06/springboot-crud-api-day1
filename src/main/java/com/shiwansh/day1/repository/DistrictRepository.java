package com.shiwansh.day1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shiwansh.day1.entity.District;

public interface DistrictRepository extends JpaRepository<District, Integer> {

}