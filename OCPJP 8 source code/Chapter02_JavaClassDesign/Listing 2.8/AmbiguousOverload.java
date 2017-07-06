/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class AmbiguousOverload {
	public static void aMethod (long val1, int val2) { 
		System.out.println ("long, int");
	}
	
public static void aMethod (int val1, long val2) { 
		System.out.println ("int, long");
	}
	
public static void main(String[] args) {
    		aMethod(9, 10);
	}
}
