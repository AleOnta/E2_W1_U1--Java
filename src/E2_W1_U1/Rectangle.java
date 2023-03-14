package E2_W1_U1;

public class Rectangle {
	private double base;
	private double height;
	
	public Rectangle(double b, double h ) {
		base = b;
		height = h;
	}
	
	public String getArea() {
		double area = base * height;
		return Double.toString(area);
	}
	
	public String getPerimeter() {
		double perimeter = (base + height) * 2;
		return Double.toString(perimeter);
	}
	
	public static void printRectangleData(Rectangle r) {
		System.out.println("Area of R: " + r.getArea());
		System.out.println("Perimeter of R: " + r.getPerimeter());
	}
	
	public static void meltTwoRectangles(Rectangle r_1, Rectangle r_2) {
		// printing in console data of first rectangle
		double R1_area = Double.parseDouble(r_1.getArea());
		double R1_perimeter = Double.parseDouble(r_1.getPerimeter());
		System.out.print("Rectangle 1 Data: ");
		System.out.print("Area: " + R1_area + ", ");
		System.out.println("Perimeter: " + R1_perimeter);
		// printing in console data of second rectangle
		double R2_area = Double.parseDouble(r_2.getArea());
		double R2_perimeter = Double.parseDouble(r_2.getPerimeter());
		System.out.print("Rectangle 2 Data: ");
		System.out.print("Area: " + R2_area + ", ");
		System.out.println("Perimeter: " + R2_perimeter);
		// calculating sum of area and perimeter
		double totalArea = R1_area + R2_area;
		double totalPerimeter = R1_perimeter + R2_perimeter;
		System.out.println("Total area: " + totalArea);
		System.out.println("Total perimeter: " + totalPerimeter);
	}
}
