package com.shiwansh.day1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shiwansh.day1.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}