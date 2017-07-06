/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the implementation of Comparator interface

import java.util.Arrays;
import java.util.Comparator;

class CGPAComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.cgpa.compareTo(s2.cgpa));     
    }    
}
 
class ComparatorTest2 {
    public static void main(String []args) {
        Student []students = {  new Student("cs011", "Lennon  ", 3.1), 
			new Student("cs021", "McCartney", 3.4),  
			new Student("cs012", "Harrison ", 2.7),    
			new Student("cs022", "Starr ", 3.7) };

        System.out.println("Before sorting by CGPA ");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(students));
        
        Arrays.sort(students, new CGPAComparator());
        
        System.out.println("After sorting by CGPA");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(students));
    }    
}
