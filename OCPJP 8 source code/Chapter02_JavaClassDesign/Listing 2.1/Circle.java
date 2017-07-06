/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

package graphicshape;

import graphicshape.Shape; 

public class Circle extends Shape {
	private int radius;	// private field
	public void area() {	// public method
		// access to private field radius inside the class:
		System.out.println("area: " + 3.14 * radius * radius); 
	}
	// The fillColor method has default access 
	void fillColor() {
		//access to protected field, in subclass: 
		System.out.println("color: " + color); 
	}
}
