package E2_W1_U1;

import java.util.Scanner;

public class myMainEx {

	static Scanner myScan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Task 1 Exercise 1 - creating 2 rectangles and calling their methods to calculate Area & Perimeter
		Rectangle rectangle_A = new Rectangle(4.15, 8.9);
		Rectangle rectangle_B = new Rectangle(2.4, 10.1);
		System.out.print("R_A Area: " + rectangle_A.getArea() + ", ");
		System.out.println("R_A Perimeter: " + rectangle_A.getPerimeter());
		System.out.print("R_B Area: " + rectangle_B.getArea() + ", ");
		System.out.println("R_B Perimeter: " + rectangle_B.getPerimeter());
		
		// Task 2 Exercise 1 - Calling a static function that return Area & Perimeter of rectangle passed as parameter
		Rectangle.printRectangleData(rectangle_A);
		
		// Task 3 Exercise 1 - Calling a static function that return all data of two differents rectangles and sum Area & Perimeter of both
		Rectangle.meltTwoRectangles(rectangle_A, rectangle_B);
		
		// Task 1 Exercise 2 - Creating a constructor to build a SIM
		SIM sim_1 = new SIM("3274568094");
		
		// Task 2 Exercise 2 - Print in console data of a specific SIM passed as parameter
		SIM.getSimInfo(sim_1);
		
		// Task 1 Exercise 3 - Create a Client for a e-commerce with Scanner
		//Client user = new Client();
		//Client.printClientData(user);
		
		// Exercise 3 - Create a Client for a e-commerce with parameter
		Client user1 = new Client("Giorgio", "Rossi", "Giorgione@yahoo.it", "13/03/23");
		// Exercise 3 - Printing all data of parameter USER
		Client.printClientData(user1);
		// Exercise 3 - Creating E-commerce 
		E_commerce eco = new E_commerce();
		// Exercise 3 - Adding products to e-commerce eco stock
		eco.addNewProduct("Pencil", 0.90, 45);
		eco.addNewProduct("Pen", 1.10, 100);
		eco.addNewProduct("Scissors", 3.30, 25);
		eco.addNewProduct("Paper", 2.15, 38);
		
		eco.printAllProduct();
	}

}
