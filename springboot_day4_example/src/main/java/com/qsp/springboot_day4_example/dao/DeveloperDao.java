package com.qsp.springboot_day4_example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_day4_example.dto.Developer;
import com.qsp.springboot_day4_example.repo.DeveloperRepo;

@Repository
public class DeveloperDao {

	@Autowired
	private DeveloperRepo developerRepo;

	public Developer saveDeveloper(Developer developer) {
		return developerRepo.save(developer);

	}

	public Developer fetch(int id) {
		return developerRepo.findById(id).get();

	}

	public Developer delete(int id) {
		Developer developer = developerRepo.findById(id).get();
		developerRepo.deleteById(id);
		return developer;

	}

	public Developer update(int id, Developer developer) {
		Developer dbDeveloper = developerRepo.findById(id).get();
		if (dbDeveloper != null) {
			developer.setDevelopoerId(id);
			return developerRepo.save(developer);
		}
		else {
			
		}
		return null;
	}
	public List<Developer> fetchAll(Developer developer){
		return developerRepo.findAll();
		
	}
}
