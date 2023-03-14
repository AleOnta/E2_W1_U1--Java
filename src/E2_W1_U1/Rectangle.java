package E2_W1_U1;

public class Rectangle {
	private double base;
	private double height;
	
	public Rectangle(double b, double h ) {
		base = b;
		height = h;
	}
	
	public double getArea() {
		double area = base * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (base + height) * 2;
		return perimeter;
	}
}
