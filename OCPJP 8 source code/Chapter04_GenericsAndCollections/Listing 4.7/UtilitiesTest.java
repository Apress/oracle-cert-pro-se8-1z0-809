/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program demonstrates generic methods
import java.util.List;
import java.util.ArrayList; 

class Utilities { 
    public static <T> void fill(List<T> list, T val) {
        for(int i = 0; i < list.size(); i++) 
	    list.set(i, val); 
    }
}

class UtilitiesTest {
    public static void main(String []args) {
        List<Integer> intList = new ArrayList<Integer>(); 
	intList.add(10);
	intList.add(20);
	System.out.println("The original list is: " + intList);
	Utilities.fill(intList, 100); 
	System.out.println("The list after calling Utilities.fill() is: " + intList);
    }
}
