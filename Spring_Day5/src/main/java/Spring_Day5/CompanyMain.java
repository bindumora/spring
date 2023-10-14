package Spring_Day5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("company.xml");
	Company company=(Company) applicationContext.getBean("company");
	System.out.println(company.getCompanyId());
	System.out.println(company.getCompanyName());
	System.out.println(company.getCompanyGst());
	System.out.println(company.getCompanyPh());
	
	System.out.println(company.getManager().getManagerName());
}
}