/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// this toString method overrides the default toString method implementation 
	// provided in the Object base class 
	public String toString() {
		return "x = " + xPos + ", y = " + yPos; 
	} 

	public static void main(String []args) {
		System.out.println(new Point(10, 20)); 
	}	
}
