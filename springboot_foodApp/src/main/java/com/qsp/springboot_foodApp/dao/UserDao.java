package com.qsp.springboot_foodApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_foodApp.dto.User;
import com.qsp.springboot_foodApp.exception.UserIdNotFound;
import com.qsp.springboot_foodApp.repo.UserRepo;

@Repository
public class UserDao {

	@Autowired
	private UserRepo userRepo;

	public User saveUser(User user) {
		return userRepo.save(user);

	}

	public User fetchUser(int id) {
		Optional<User> user=userRepo.findById(id);
		if(user.isPresent()) {
		return userRepo.findById(id).get();
		

	}else {
		return null;
	}
	}
	
	public User deleteUser(int id) {
		User user=userRepo.findById(id).get();
		userRepo.deleteById(id);
		return user;
		
	}
	
	public User updateUser(int id, User user) {
		User dbuser=userRepo.findById(id).get();
		if(dbuser!=null) {
			user.setUserId(id);
			return userRepo.save(user);
		}
		else {
			
		}
		return user;
	}
	public List<User> fetchAll(User user){
		return userRepo.findAll();
		
	}
}


