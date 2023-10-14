package Spring_Day7;

import org.springframework.stereotype.Component;

@Component
public class Jeans implements ShoppingCart {

	@Override
	public void product() {
 System.out.println("this is jeans");		
	}

}
