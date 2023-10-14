package com.jsp.springboot_day2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.springboot_day2.dto.Student;
import com.jsp.springboot_day2.repo.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent( Student student) {
		return studentRepo.save(student);

	}

	public Student fetchStudent(int id) {
		return studentRepo.findById(id).get();
		
	}
	public Student deleteStudent(int id) {
		Student student=studentRepo.findById(id).get();
		studentRepo.deleteById(id);
		return student;
	}
	public Student updateStudent(int id,Student student) {
		 Student dbstudent=studentRepo.findById(id).get();
		 if(dbstudent!=null)
		 {
			 student.setStudentId(id);
			 return studentRepo.save(student);
		 }
		 else {
			
			 return null;
		 }
	}
		public List<Student> fetchAllStudents(Student student)
		{
			return studentRepo.findAll();
		}
	}

