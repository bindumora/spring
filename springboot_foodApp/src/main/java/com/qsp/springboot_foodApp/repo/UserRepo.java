package com.qsp.springboot_foodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_foodApp.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
