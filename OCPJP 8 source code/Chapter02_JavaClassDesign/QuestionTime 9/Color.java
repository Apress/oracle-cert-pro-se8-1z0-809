/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Color { 
	int red, green, blue;

	Color() { 
		this(10, 10, 10); 
	}  

	Color(int r, int g, int b) {
		red = r; 
		green = g;
		blue = b; 
	}

	public String toString() { 
		return "The color is: " + red + green + blue; 
	}

	public static void main(String [] args) {
		System.out.println(new Color()); 
	}
}
