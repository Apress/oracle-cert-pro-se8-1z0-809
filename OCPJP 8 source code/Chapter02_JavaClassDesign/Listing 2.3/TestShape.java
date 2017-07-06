/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Shape {
	public double area() { return 0; } // default implementation 
	// other members 
}
class Circle extends Shape {
	private int radius; 
	public Circle(int r) { radius = r; } 
	// other constructors 
	public double area() {return Math.PI * radius * radius; } 
	// other declarations
}

class Square extends Shape {
	private int side; 
	public Square(int a) { side = a; } 
	public double area() { return side * side; } 
	// other declarations
}

public class TestShape {
	public static void main(String []args) {
		Shape shape1 = new Circle(10);
		System.out.println(shape1.area()); 
		Shape shape2 = new Square(10);
		System.out.println(shape2.area()); 
	}
}
