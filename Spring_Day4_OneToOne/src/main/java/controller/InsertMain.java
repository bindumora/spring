package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CarDao;
import dto.Car;
import dto.Engine;

public class InsertMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
		Car car = applicationContext.getBean("car", Car.class);
		Engine engine = applicationContext.getBean("en", Engine.class);
		CarDao carDao = applicationContext.getBean("dao", CarDao.class);
		carDao.saveBoth(car);
	}

}
