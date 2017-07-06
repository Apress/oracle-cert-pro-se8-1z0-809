/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class OverloadingError {
	public static void aMethod (byte val )  { System.out.println ("byte");  }
	public static void aMethod (short val ) { System.out.println ("short"); }

	public static void main(String[] args) {
		aMethod(9);
	}
}  
