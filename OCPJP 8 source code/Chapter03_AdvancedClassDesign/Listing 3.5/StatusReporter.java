/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class StatusReporter {
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
		
        // note the use of anonymous inner classes here 
        // -- specifically, there is no name for the class and we construct 
        // and use the class "on the fly" in the return statement! 
		
        return new Shape.Color() {
	    public String toString() {
		return "You selected a color with RGB values" + color; 
	    }
	}; 
    }
    public static void main(String []args) {
	Shape.Color descriptiveColor = 
			StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
	System.out.println(descriptiveColor);  	
    }
}
