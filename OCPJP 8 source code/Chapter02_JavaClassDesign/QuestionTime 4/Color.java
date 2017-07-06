/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Color { 
	int red, green, blue;

	Color() { 
		Color(10, 10, 10); 
	}  

	Color(int r, int g, int b) {
		red = r; 
		green = g;
		blue = b; 
	}

	void printColor() { 
		System.out.println("red: " + red + " green: " + green + " blue: " + blue); 
	}

	public static void main(String [] args) {
		Color color = new Color(); 
		color.printColor(); 
	}
}
