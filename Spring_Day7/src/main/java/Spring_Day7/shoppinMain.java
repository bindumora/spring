package Spring_Day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class shoppinMain {

	public static void main(String[] args) {
ApplicationContext  applicationContext=new AnnotationConfigApplicationContext(FlipcartConfig.class);
Zudio zudio=(Zudio) applicationContext.getBean("zudio");
zudio.offer();

	}

}
