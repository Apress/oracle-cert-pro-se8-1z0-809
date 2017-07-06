/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class EHBehavior {
	public static void main(String []args) {
	    try {
	        int i = 10/0; // LINE A 
	        System.out.print("after throw -> ");
	    } catch(ArithmeticException ae) {
		System.out.print("in catch -> ");
		return; 
	    } finally {
		System.out.print("in finally -> ");
	    }
         System.out.print("after everything");
	}
}
