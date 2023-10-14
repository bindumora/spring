package com.qsp.springboot_day4_example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_day4_example.dto.Developer;

public interface DeveloperRepo  extends JpaRepository<Developer, Integer> {

}
