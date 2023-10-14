package Spring_Day3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
	
BeanFactory beanFactory=new ClassPathXmlApplicationContext("menu.xml");
		Menu menu=(Menu) beanFactory.getBean("menu");
		System.out.println(menu.getMenuId());
		System.out.println(menu.getCatagory());
		System.out.println(menu.getName());
		System.out.println(menu.getItem().getItemName());
	}

}
