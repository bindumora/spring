package Spring_Day6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Lion implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Girr Girr");
	}

	
	
}
