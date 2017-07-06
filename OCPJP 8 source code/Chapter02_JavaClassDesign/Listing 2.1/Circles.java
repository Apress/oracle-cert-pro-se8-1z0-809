/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

package graphicshape;

class Circles {
	void getArea() {
		Circle circle = new Circle();
		// call to public method area() within package:
		circle.area();	
// calling fillColor() with default access within package:
		circle.fillColor(); 
	}
}
