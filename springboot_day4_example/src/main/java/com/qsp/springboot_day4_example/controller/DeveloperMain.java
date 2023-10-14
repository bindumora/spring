package com.qsp.springboot_day4_example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_day4_example.dao.DeveloperDao;
import com.qsp.springboot_day4_example.dto.Developer;
@RestController
public class DeveloperMain {

	@Autowired
	private DeveloperDao developerDao;
	@PostMapping("/save")
	public Developer insert(@RequestBody Developer developer) {
		return developerDao.saveDeveloper(developer);
		
	}
	@GetMapping("/fetch")
	public Developer fetch(@RequestParam int id) {
		return developerDao.fetch(id);
		
	}
	
	@DeleteMapping("/delete")
	public Developer delete(int id) {
		return developerDao.delete(id);
		
	}
	
	@PutMapping("/update")
	public Developer update(int id, @RequestBody Developer developer) {
		return developerDao.update(id, developer);
		
	}
	
	@GetMapping("/fetchAll")
	public List<Developer> fetchAll(Developer developer) {
		return developerDao.fetchAll(developer);
		
	}
}
