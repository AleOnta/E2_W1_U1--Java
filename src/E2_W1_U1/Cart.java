package E2_W1_U1;

import java.util.Random;

public class Cart {
	
	Client user;
	Random rand = new Random();
	int upperBound = 55;
	Product[] productArray = new Product[10];
	
	public Cart() {
		user = new Client();
	}
	
	public Cart(Client c) {
		user = c;
	}
	
	public double getTheTotalAmount() {
		double total = 0;
		for (int i = 0; i < productArray.length; i++) {
			total += productArray[i].getProductPrice();
		}
		return total;
	}
}
