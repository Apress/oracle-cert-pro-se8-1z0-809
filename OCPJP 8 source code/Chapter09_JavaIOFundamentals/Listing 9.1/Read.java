/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.IOException; 

class Read {
    public static void main(String []args) {
        System.out.print("Type a character: ");
	int val = 0; 
	try {
	    // the return type of read is int, but it returns a byte value! 
	    val = System.in.read(); 
	} catch(IOException ioe) {
	    System.err.println("Cannot read input " + ioe);
	    System.exit(-1); 
	}
	System.out.println("You typed: " + val); 
    }
}
