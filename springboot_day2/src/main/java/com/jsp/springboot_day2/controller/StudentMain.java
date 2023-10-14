package com.jsp.springboot_day2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_day2.dao.StudentDao;
import com.jsp.springboot_day2.dto.Student;
import com.jsp.springboot_day2.repo.StudentRepo;

@RestController
public class StudentMain {
	@Autowired
	private StudentDao studentDao;

	@PostMapping("/save")
	public Student savepoint(@RequestBody Student student) {
		return studentDao.saveStudent(student);

	}
	@GetMapping("/fetch")
	public Student fetch(@RequestParam int id) {
		return studentDao.fetchStudent(id);
		
	}
	@DeleteMapping("/delete")
		
	public Student delete(@RequestParam int id) {
		return studentDao.deleteStudent(id);
		
	}
	
	@PutMapping("/update")
	public Student updateStudent(int id,@RequestBody Student student)
	{
		return studentDao.updateStudent(id, student);
		
	}
	@GetMapping("/fetchAll")
	public List<Student> fetchAll(Student student)
	{
		return studentDao.fetchAllStudents(student);
		
	}
}
