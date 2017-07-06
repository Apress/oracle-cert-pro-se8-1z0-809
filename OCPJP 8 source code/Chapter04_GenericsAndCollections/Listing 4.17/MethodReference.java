/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.List; 

class MethodReference {
    public static void printUpperCaseString(String string) {
        System.out.println(string.toUpperCase()); 
    }

    public static void main(String []args) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
	strings.forEach(MethodReference::printUpperCaseString);
    }
}
