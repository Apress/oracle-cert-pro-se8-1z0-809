/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// A program that scans an integer from a given string 

import java.util.Scanner;
import java.util.InputMismatchException;

class ScanInt3 {
    public static void main(String [] args) {
        String integerStr = "100"; 
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr); 
	try { 
	    System.out.println("The integer value scanned from string is: " + 
consoleScanner.nextInt()); 
	} catch(InputMismatchException ime) { 
	    // nextInt() throws InputMismatchException in case 
            // anything other than an integeris provided in the string 
	    System.out.println("Error: Cannot scan an integer from the given string");
	}
    }
}
