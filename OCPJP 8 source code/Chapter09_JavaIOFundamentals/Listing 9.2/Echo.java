/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.Console;

// simple implementation of Echo command 
class Echo {
    public static void main(String []args) {
        // get the System console object 
	Console console = System.console();
	if(console == null) {
            System.err.println("Cannot retrieve console object - are you running your application from an IDE? 					Exiting the application ... ");
	    System.exit(-1); // terminate the application 
	}
	// read a line and print it through printf  
	console.printf(console.readLine());
    }
}
