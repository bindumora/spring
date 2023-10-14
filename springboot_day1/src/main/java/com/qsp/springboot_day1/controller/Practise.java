package com.qsp.springboot_day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_day1.dto.Fruit;
import com.qsp.springboot_day1.dto2.Person;

@RestController
public class Practise {

	@GetMapping("/java")
	public String print() {
//		System.out.println("java is programming language");
		return ("java is programming language");
	}
	@GetMapping("/name")
	public String hima()
	{
		return("this is my name");
	}
	
	@PostMapping("/fruits")
	public Fruit insertFruit(@RequestBody Fruit fruit)
	{
		return fruit;
		
	}
	@PostMapping("/person")
	public Person insertPerson(@RequestBody Person person) {
		return person;
		
	}
}
