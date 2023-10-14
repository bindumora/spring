package com.qsp.springboot_foodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_foodApp.dto.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer> {

}
