package Spring_Day6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Forest {
@Autowired
@Qualifier("cat")
	Animal animal;
	public void noise() {
		System.out.println("Animal makes sound");
		animal.sound();
		
	}
	
}
