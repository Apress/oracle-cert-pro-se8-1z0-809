/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Locale; 

class Test {	
public static void main(String []args) { 
	    Locale locale1 = new Locale("en");  //#1
	    Locale locale2 = new Locale("en", "in");  //#2
	    Locale locale3 = new Locale("th", "TH", "TH"); //#3
	    Locale locale4 = new Locale(locale3); //#4
         System.out.println(locale1 + " " + locale2 + " " + locale3 + " " + locale4);
	}
}
