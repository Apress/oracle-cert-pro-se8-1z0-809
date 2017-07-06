/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.File;
import java.util.Scanner;

class ThrowsClause1 {
    public static void main(String []args) {
	System.out.println("Reading an integer from the file 'integer.txt': ");
	Scanner consoleScanner = new Scanner(new File("integer.txt")); 
        System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
    }
}
