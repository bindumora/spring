package Spring_Day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {
	public static void main(String[] args) {
		
//		Chaitanya chaitanya=new Chaitanya();
//		chaitanya.setFee(100000);
//		chaitanya.setAddress("hyd");
//		System.out.println(chaitanya.getAddress());
//		System.out.println(chaitanya.getFee());
//		chaitanya.name();
		
//		Narayana narayana=new Narayana();
//		narayana.name();
//		
//		School school=new Chaitanya();
//		school.name();
//	
//		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("school.xml");
		Chaitanya chaitanya1=(Chaitanya) beanFactory.getBean("chai");
		System.out.println(chaitanya1.getFee());
		System.out.println(chaitanya1.getAddress());
		chaitanya1.name();
		
//		Narayana narayana2=(Narayana) beanFactory.getBean("narayan");
//		narayana2.name();
//		
//		 School school2=(School) beanFactory.getBean("chai");
//		 school2.name();
//		 
//		 School school3=(School) beanFactory.getBean("narayan");
//		 school3.name();
//		
}
	
	

}
