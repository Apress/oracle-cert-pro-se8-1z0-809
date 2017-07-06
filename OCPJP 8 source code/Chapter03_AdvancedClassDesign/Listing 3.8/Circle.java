/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// Shape is the base class for all shape objects; shape objects that are associated with 
// a parent shape object is remembered in the parentShape field 
abstract class Shape {
    abstract double area();
    private Shape parentShape;
    public void setParentShape(Shape shape) {
	parentShape = shape;
    }
    public Shape getParentShape() {
	return parentShape;
    }
}

// Rollable interface can be implemented by circular shapes such as Circle 
interface Rollable {
    void roll(float degree); 
}

abstract class CircularShape extends Shape implements Rollable { }

// Circle is a concrete class that is-a subtype of CircularShape; 
// you can roll it and hence implements Rollable through CircularShape base class 
public class Circle extends CircularShape {
    private int xPos, yPos, radius;
    public Circle(int x, int y, int r) {
	xPos = x;
	yPos = y;
	radius = r;
    }
    public double area() { return Math.PI * radius * radius; }
    @Override
    public void roll(float degree) {
	// implement rolling functionality here...
	// for now, just print the rolling degree to console 
	System.out.printf("rolling circle by %f degrees", degree);  
    }
    public static void main(String[] s) {
	Circle circle = new Circle(10,10,20);
	circle.roll(45);
    }
}
