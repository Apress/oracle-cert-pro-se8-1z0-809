/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays; 

class DefaultSorter {
    public static void main(String[] args) {
	    String[] brics = {"Brazil", "Russia", "India", "China"};
	    Arrays.sort(brics, null);	// LINE A 
	    for(String country : brics) { 
	        System.out.print(country + " ");
         }
    }
}
