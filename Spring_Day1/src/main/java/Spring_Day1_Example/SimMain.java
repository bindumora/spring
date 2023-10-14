package Spring_Day1_Example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimMain {
	public static void main(String[] args) {
		
	
	
	BeanFactory beanFactory=new ClassPathXmlApplicationContext("moblie.xml");
	 SimUse simUse=(SimUse) beanFactory.getBean("simUse");
	 simUse.simuse();
	}

}
