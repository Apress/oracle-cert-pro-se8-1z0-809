/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// A simple progam to accept an integer from user in normal case, 
// otherwise prints an error message

import java.util.Scanner;
import java.util.InputMismatchException;

class ScanInt2 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in); 
	try { 
    System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
	} catch(InputMismatchException ime) { 
	    // nextInt() throws InputMismatchException in case anything 
   	    // other than an integer is typed in the console; so handle it 
           System.out.println("Error: You typed some text that is not an integer value...");
	}
    }
}
