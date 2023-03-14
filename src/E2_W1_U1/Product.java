package E2_W1_U1;

import java.util.Random;

public class Product {
	int productID;
	int upperBound = 19999;
	Random rand = new Random();
	String description;
	String price;
	int availability;
	
	public Product(String desc, double p, int av ) {
		productID = rand.nextInt(upperBound);
		description = desc;
		price = Double.toString(p) + "€";
		availability = av;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public String getProductPrice() {
		return price;
	}
	
	public static void printProductInfo(Product p) {
		System.out.print("Product data: ");
		System.out.print("ID -> " + p.productID + ", ");
		System.out.print("Description -> " + p.description + ", ");
		System.out.print("Price -> " + p.price + ", ");
		System.out.print("Availability -> " + p.availability);
		
	}
}
