package Spring_Day4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieMain {
	public static void main(String[] args) {

		Movie m = new Movie("baby", 1000000, 2.30, "anand", "viraj", "kiran", "vaishnavi");
		System.out.println(m);

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("movie.xml");
		Movie movie = (Movie) beanFactory.getBean("movie");
		System.out.println(movie);
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("movie.xml");
		Movie movie2=applicationContext.getBean("movie", Movie.class);
		System.out.println(movie2);
	}
}
