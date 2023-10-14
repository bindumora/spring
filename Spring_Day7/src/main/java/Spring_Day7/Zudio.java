package Spring_Day7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Zudio {
@Autowired
	ShoppingCart shoppingCart;

public void offer() {
	System.out.println("buy one get two");
	shoppingCart.product();
}
}
