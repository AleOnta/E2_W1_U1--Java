package E2_W1_U1;

public class E_commerce {
	Product[] stock = new Product[1];
	Client currentUser;
	Cart currentCart;
	
	public E_commerce() {
		currentUser = new Client();
		currentCart = new Cart(currentUser);
		stock[0] = new Product("placeholder", 0.0, 0);
	}
	
	public void addNewProduct(String d, double p, int q) {
		Product newProd = new Product(d, p, q);
		Product[] newStock = new Product[stock.length + 1];
		for (int i = 0; i < stock.length; i++) {
			if (i == 0) {
				newStock[i] = newProd;
			} else {
				newStock[i] = stock[i - 1];
			}
		}
		
		System.out.println("loop done");
		stock = newStock;
	}
	
	public void printAllProduct() {
		for (int i = 0; i < stock.length; i++) {
			Product.printProductInfo(stock[i]);
		}
	}

}
