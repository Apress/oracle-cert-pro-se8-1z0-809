/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

class ThrowsClause3 {
    // since this method does not handle FileNotFoundException, 
    // the method must declare this exception in the throws clause 
    public int readIntFromFile() throws FileNotFoundException {
	Scanner consoleScanner = new Scanner(new File("integer.txt")); 
	return consoleScanner.nextInt(); 
    }

    // since readIntFromFile() throws FileNotFoundException and main() does not handle 
    // it, the main() method declares this exception in its throws clause 
    public static void main(String []args) throws FileNotFoundException {
	System.out.println("Reading an integer from the file 'integer.txt': ");
        System.out.println("You typed the integer value: " + new ThrowsClause3().readIntFromFile()); 
    }
}
