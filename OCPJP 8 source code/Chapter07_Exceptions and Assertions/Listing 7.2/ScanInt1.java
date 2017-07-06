/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// A simple progam to accept an integer from user 

import java.util.Scanner;

class ScanInt1 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
	Scanner consoleScanner = new Scanner(System.in); 
        System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
    }
}
