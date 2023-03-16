package E2_W1_U1;

import java.util.Random;

public class Product {
	int productID;
	int upperBound = 19999;
	Random rand = new Random();
	String description;
	double price;
	int availability;
	
	private Product() {
		System.out.println("Product added to the stock!");
		productID = rand.nextInt(upperBound);
	}
	
	public Product(String desc, double p, int available) {
		this();
		description = desc;
		price = p;
		availability = available;	
	}
	
	public int getProductID() {
		return productID;
	}
	
	public double getProductPrice() {
		return price;
	}
	
	public static void printProductInfo(Product p) {
		System.out.println("Product data: ");
		System.out.print("ID -> " + p.productID + ", ");
		System.out.print("Description -> " + p.description + ", ");
		System.out.print("Price -> " + p.price + "€, ");
		System.out.println("Availability -> " + p.availability);
		
	}
}
