package Spring_Day2_Task;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
public static void main(String[] args) {
	
	BeanFactory beanFactory=new ClassPathXmlApplicationContext("car.xml");
	BMW bmw=(BMW) beanFactory.getBean("bcar");
	System.out.println(bmw.getId());
	System.out.println(bmw.getName());
	System.out.println(bmw.getPrice());
	System.out.println(bmw.getModel());
	
	
	BeanFactory beanFactory1=new ClassPathXmlApplicationContext("car.xml");
	Audi audi=(Audi) beanFactory.getBean("acar");
	System.out.println(audi.getId());
	System.out.println(audi.getName());
	System.out.println(audi.getPrice());
	System.out.println(audi.getModel());
	
}
}
