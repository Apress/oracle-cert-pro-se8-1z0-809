/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.concurrent.*;
import java.util.*; 

class COWArrayListTest {
	    public static void main(String []args) {
		ArrayList<Integer> aList = 
new CopyOnWriteArrayList<Integer>(); // LINE A 
		aList.addAll(Arrays.asList(10, 20, 30, 40));
	System.out.println(aList); 
	    }
}




