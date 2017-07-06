/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// Shape.java
public class Shape {
	protected void display() {
		System.out.println("Display-base");
      }
}

// Circle.java
public class Circle extends Shape {
     <access-modifier> void display(){
		System.out.println("Display-derived");
     }
}
