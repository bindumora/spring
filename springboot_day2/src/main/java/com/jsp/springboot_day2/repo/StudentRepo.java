package com.jsp.springboot_day2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot_day2.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
