package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.Studentdao;
import Dto.College;
import Dto.Student;
import Dto.config;

public class InsertMain {

	public static void main(String[] args) {
		
ApplicationContext applicationContext=new AnnotationConfigApplicationContext(config.class);
Student student1=(Student) applicationContext.getBean("student");
student1.setStudentName("bindu");
student1.setStudentAddress("hyd");

Student student2=(Student) applicationContext.getBean("student");
student2.setStudentName("akhila");
student2.setStudentAddress("hyd");

Student student3=(Student) applicationContext.getBean("student");
student3.setStudentName("hima");
student3.setStudentAddress("hyd");

College college=(College) applicationContext.getBean("college");
college.setCollegeName("gurunanak");
college.setCollegeAddress("ibp");


List<Student>list=new ArrayList<Student>();
list.add(student1);
list.add(student2);
list.add(student3);

student1.setCollege(college);
student2.setCollege(college);
student3.setCollege(college);

Studentdao studentdao=(Studentdao) applicationContext.getBean("studentdao");
studentdao.insert(student1);
studentdao.insert(student2);
studentdao.insert(student3);

	}

}
