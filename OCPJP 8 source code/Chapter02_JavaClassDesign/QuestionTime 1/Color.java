/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Color { 
     int red, green, blue;
     
     void Color() { 
             red = 10; 
             green = 10; 
             blue = 10; 
     }  
     
     void printColor() { 
           System.out.println("red: " + red + " green: " + green + " blue: " + blue); 
	}
     
     public static void main(String [] args) {
     	Color color = new Color(); 
     	color.printColor(); 
     }
}  
