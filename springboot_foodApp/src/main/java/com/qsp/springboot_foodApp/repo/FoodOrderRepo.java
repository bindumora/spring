package com.qsp.springboot_foodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_foodApp.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer> {

}
