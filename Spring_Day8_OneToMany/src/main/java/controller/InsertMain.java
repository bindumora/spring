package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.Busdao;
import Dto.Bus;
import Dto.Config;
import Dto.Passengers;

public class InsertMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Bus bus=(Bus) applicationContext.getBean("bus");
		bus.setBusName("volvo");
		bus.setBusSeats(30);
		
		Passengers passengers1=(Passengers) applicationContext.getBean("passengers");
		passengers1.setPassengerName("kranthi");
		passengers1.setPassengerGender("male");
	

		Passengers passengers2=(Passengers) applicationContext.getBean("passengers");
		passengers2.setPassengerName("kiran");
		passengers2.setPassengerGender("male");
	

		Passengers passengers3=(Passengers) applicationContext.getBean("passengers");
		passengers3.setPassengerName("bindu");
		passengers3.setPassengerGender("female");
		
		List<Passengers>list=new ArrayList<Passengers>();
		list.add(passengers1);
		list.add(passengers2);
		list.add(passengers3);
		
		bus.setPassengers(list);
		
		Busdao busdao=(Busdao) applicationContext.getBean("busdao");
		busdao.insert(bus);
	
	}

}
