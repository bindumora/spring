package controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDao;
import dto.Pancard;
import dto.Person;

public class PersonMain {

	public static void main(String[] args) {
BeanFactory beanFactory=new ClassPathXmlApplicationContext("person.xml");
Person person=(Person) beanFactory.getBean("person");
Pancard pancard=(Pancard) beanFactory.getBean("pan");
PersonDao personDao=(PersonDao) beanFactory.getBean("Dao");
personDao.saveBoth(person);
	}

}
