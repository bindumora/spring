package com.qsp.springboot_foodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.springboot_foodApp.dao.UserDao;
import com.qsp.springboot_foodApp.dto.User;
import com.qsp.springboot_foodApp.exception.UserIdNotFound;
import com.qsp.springboot_foodApp.util.ResponseStructure;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("successfully inserted");
		responseStructure.setData(userDao.saveUser(user));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<User>> fetchUser(int id) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();

		User user = userDao.fetchUser(id);
		if (user != null) {
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("successfully fetched");
			responseStructure.setData(userDao.fetchUser(id));
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new UserIdNotFound();

		}

	}

	public ResponseEntity<ResponseStructure<User>> deleteUser(int id) {

		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("successfully deleted");
		responseStructure.setData(userDao.deleteUser(id));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);

	}

	public ResponseEntity<ResponseStructure<User>> updateUser(int id, User user) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("successfully updated");
		responseStructure.setData(userDao.updateUser(id, user));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);

	}

	public List<User> fetchAll(User user) {
		return userDao.fetchAll(user);

	}
}
