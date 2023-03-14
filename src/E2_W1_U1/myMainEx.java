package E2_W1_U1;

public class myMainEx {

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
	}

}
