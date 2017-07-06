/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the importance of overriding equals() and hashCode() methods
import java.util.*;

class Circle {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r) {
		xPos = x; 
		yPos = y;
		radius = r; 
	}
	
	public boolean equals(Object arg) {
		if(arg == null) return false; 
		if(this == arg) return true;
		if(arg instanceof Circle) {
			Circle that = (Circle) arg; 
			if( (this.xPos == that.xPos) && (this.yPos == that.yPos) 
&& (this.radius == that.radius )) {
				return true;
			}
		}
		return false;
	}
}

class TestCircle { 
	public static void main(String []args) {
		Set<Circle> circleList = new HashSet<Circle>();
		circleList.add(new Circle(10, 20, 5)); 
		System.out.println(circleList.contains(new Circle(10, 20, 5)));
	}
}
