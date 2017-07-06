/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Scanner; 

class TryWithResources2 {
    public static void main(String [] args) {    
        System.out.println("Type an integer in the console: ");
	try(Scanner consoleScanner = new Scanner(System.in)) { 
            System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
	}
    }
}
