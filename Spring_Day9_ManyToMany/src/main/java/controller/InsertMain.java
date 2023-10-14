package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.Fooddao;
import Dto.Customer;
import Dto.Food;
import Dto.config;

public class InsertMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(config.class);
		Food food1=(Food) applicationContext.getBean("food");
		food1.setFoodName("biryani");
		food1.setFoodCost(350);
		food1.setFoodQuantity("full");
		food1.setFoodOffer("50%");
		
		Food food2=(Food) applicationContext.getBean("food");
		food2.setFoodName("Manchuria");
		food2.setFoodCost(320);
		food2.setFoodQuantity("full");
		food2.setFoodOffer("20%");
		
		
		Customer customer1=(Customer) applicationContext.getBean("customer");
		customer1.setCustomerName("bindu");
		customer1.setCustomerAddress("hyd");
		customer1.setCustomerPhn(98734567789l);
		customer1.setCustomerOrderId(3);
		
		
		Customer customer2=(Customer) applicationContext.getBean("customer");
		customer2.setCustomerName("pavani");
		customer2.setCustomerAddress("hyd");
		customer2.setCustomerPhn(98734567789l);
		customer2.setCustomerOrderId(3);
		
		List<Customer> list1=new ArrayList<Customer>();
		list1.add(customer1);
		list1.add(customer2);
		

		List<Customer> list2=new ArrayList<Customer>();
		list2.add(customer1);
	
		
		List<Food> flist=new ArrayList<Food>();
		flist.add(food2);
		
		List<Food> list=new ArrayList<Food>();
		list.add(food1);
		
		food1.setCustomer(list1);
		food2.setCustomer(list2);
		
		Fooddao fooddao=(Fooddao) applicationContext.getBean("fooddao");
		fooddao.insert(food1);
		fooddao.insert(food2);
		
	}

}
