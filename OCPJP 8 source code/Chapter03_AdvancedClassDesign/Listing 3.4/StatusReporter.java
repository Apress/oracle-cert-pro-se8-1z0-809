/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class StatusReporter {
    // important to note that the argument “color” is declared final 
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
        // local class DescriptiveColor that extends Shape.Color class 
        class DescriptiveColor extends Shape.Color {
    public String toString() {
	        return "You selected a color with RGB values" + color; 
	    }
        }
        return new DescriptiveColor();  
    }

    public static void main(String []args) {
	Shape.Color descriptiveColor = 
			StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
	System.out.println(descriptiveColor);  	
    }
}
