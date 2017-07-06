/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.sql.SQLException; 

class CustomSQLException extends SQLException {}

class BaseClass {
	void foo() throws SQLException {
	    throw new SQLException(); 
	} 
} 

class DeriClass extends BaseClass {
	public void foo() throws CustomSQLException {		// LINE A 
	    throw new CustomSQLException(); 
	} 
}

class EHTest {
	public static void main(String []args) {
	    try {
	        BaseClass base = new DeriClass();
		base.foo(); 
	    } catch(Exception e) {
             System.out.println(e); 
	    }
	}
}
