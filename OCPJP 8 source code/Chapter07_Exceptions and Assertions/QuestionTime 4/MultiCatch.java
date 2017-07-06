/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.FileNotFoundException;
import java.sql.SQLException;

class MultiCatch {
	public static void fooThrower() throws FileNotFoundException {
	    throw new FileNotFoundException(); 
	}
	public static void barThrower() throws SQLException {
	    throw new SQLException(); 
	}
	public static void main(String []args) {
	    try {
	        fooThrower();
	        barThrower(); 
	    } catch(FileNotFoundException || SQLException multie) {
	        System.out.println(multie); 
	    }
	}
}
