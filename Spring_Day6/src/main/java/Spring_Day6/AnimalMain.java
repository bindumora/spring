package Spring_Day6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("animal.xml");
//	Cat cat=(Cat) applicationContext.getBean("cat");
//	cat.sound();
//	Lion lion=(Lion) applicationContext.getBean("lion");
//	lion.sound();
	Forest forest=(Forest) applicationContext.getBean("forest");
	forest.noise();
	
}
}
