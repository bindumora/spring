package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Dao;
import dto.Nation;
import dto.President;

public class MainClass {
public static void main(String[] args) {
	
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("nation.xml");
	Nation nation=(Nation) applicationContext.getBean("nation");
	President president=(President) applicationContext.getBean("president");
	Dao dao=(Dao) applicationContext.getBean("dao");
	dao.saveBoth(nation);
}
}
