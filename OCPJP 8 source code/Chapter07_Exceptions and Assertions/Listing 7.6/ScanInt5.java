/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// A program that illustrates multi-catch blocks 

import java.util.Scanner;
import java.util.NoSuchElementException;

class ScanInt5 {
    public static void main(String [] args) {
        String integerStr = ""; 
        System.out.println("The string to scan integer from it is: " + integerStr);
    Scanner consoleScanner = new Scanner(integerStr); 
    try { 
        System.out.println("The integer value scanned from string is: " +   	consoleScanner.nextInt()); 
    } catch(NoSuchElementException | IllegalStateException multie) { 
        System.out.println("Error: An error occured while attempting to scan the integer"); 
    }
}
}
