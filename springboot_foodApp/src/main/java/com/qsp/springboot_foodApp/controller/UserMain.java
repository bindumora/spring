package com.qsp.springboot_foodApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_foodApp.dto.User;
import com.qsp.springboot_foodApp.service.UserService;
import com.qsp.springboot_foodApp.util.ResponseStructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//@RequestMapping("/saveUser")
public class UserMain {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "saveUser",notes = "api is used for saving")
	@ApiResponses({ @ApiResponse(code = 201, message = "user inserted successfully"),
	@ApiResponse(code = 400, message = "fields can not be null or blank") })
	@PostMapping("/saveUser")
	public ResponseEntity<ResponseStructure<User>> saveUser(@Validated @RequestBody User user) {
		return userService.saveUser(user);

	}
     

	@ApiOperation(value = "api is used for fetching the user values by primary key")
	@ApiResponses({ @ApiResponse(code = 202, message = "user fetched successfully"),
	@ApiResponse(code = 400, message = "fields can not be null or blank") })
	@GetMapping("/fetchUser")
	public ResponseEntity<ResponseStructure<User>> fetchUser(@RequestParam int id) {
		return userService.fetchUser(id);

	}
	

	@ApiOperation(value = "api is usd for delete the user values")
	@ApiResponses({ @ApiResponse(code = 200, message = "user deleted successfully"),
	@ApiResponse(code = 400, message = "fields can not be null or blank") })
	@DeleteMapping("/deleteUser")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@RequestParam int id) {
		return userService.deleteUser(id);

	}


	@ApiOperation(value = "api is used for update or modify  the user values")
	@ApiResponses({ @ApiResponse(code = 200, message = "user updated successfully"),
	@ApiResponse(code = 400, message = "fields can not be null or blank") })
	@PutMapping("/updateUser")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestParam int id, @RequestBody User user) {
		return userService.updateUser(id, user);

	}


	@ApiOperation(value = "api is used for fetch all the user values")
	@ApiResponses({ @ApiResponse(code = 201, message = "user fetched successfully"),
	@ApiResponse(code = 400, message = "fields can not be null or blank") })
	@GetMapping("/fetchAll")
	public List<User> fetchAll(User user) {
		return userService.fetchAll(user);

	}
}
