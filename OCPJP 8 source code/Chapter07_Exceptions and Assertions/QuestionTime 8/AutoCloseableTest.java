/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Scanner;

class AutoCloseableTest {
	public static void main(String []args) {
	    try (Scanner consoleScanner = new Scanner(System.in)) { 
	        consoleScanner.close(); // CLOSE 
		consoleScanner.close(); 
	    }
	}
}
