/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Shape {
    private boolean isDisplayed;
    protected int canvasID;
    public Shape() {
	    isDisplayed = false;
	    canvasID = 0;
	}
	public class Color {
	    public void display() {
             System.out.println("isDisplayed: "+isDisplayed);
             System.out.println("canvasID: "+canvasID);
	    }	
	}
}

class TestColor {
	public static void main(String []args) {
	    Shape.Color black = new Shape().new Color();
	    black.display();
	}
}
