/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Shape {
    public Shape() {
	    System.out.println("Shape constructor");
	}
	public class Color {
    	    public Color() {
    		System.out.println("Color constructor");
    	    }
    	}
}

class TestColor {
	public static void main(String []args) {
        Shape.Color black = new Shape().Color(); // #1 
    	}
}
