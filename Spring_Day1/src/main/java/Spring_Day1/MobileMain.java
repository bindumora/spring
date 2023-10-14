package Spring_Day1;

import javax.management.MBeanFeatureInfo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {
	public static void main(String[] args) {
		
//		conventional way
//		Mobile mobile=new Mobile();
//		mobile.use();
		
		
		
	BeanFactory beanFactory=new ClassPathXmlApplicationContext("mobile.xml");
	Mobile mobile=(Mobile) beanFactory.getBean("mobile");
	mobile.use();
	}

}
