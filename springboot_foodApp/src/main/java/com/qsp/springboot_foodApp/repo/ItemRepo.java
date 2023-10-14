package com.qsp.springboot_foodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_foodApp.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
