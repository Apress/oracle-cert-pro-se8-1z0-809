/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the usage of Iterator

import java.util.ArrayList;
import java.util.Iterator; 

class TestIterator {
    public static void main(String []args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();   
        for(int i = 1; i < 10; i++) 
            nums.add(i); 
        System.out.println("Original list " + nums); 
        Iterator<Integer> numsIter = nums.iterator();
        while(numsIter.hasNext()) {
            numsIter.remove();  
        } 
         
        System.out.println("List after removing all elements" + nums); 
    }
}
