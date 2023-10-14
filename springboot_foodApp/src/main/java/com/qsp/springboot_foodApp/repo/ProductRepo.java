package com.qsp.springboot_foodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_foodApp.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
