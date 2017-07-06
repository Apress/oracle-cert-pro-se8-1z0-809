/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows the usage of Comparable interface

import java.util.Arrays;

class Student implements Comparable<Student> {
    String id;
    String name;
    Double cgpa; 
    
    public Student(String studentId, String studentName, double studentCGPA) {
        id = studentId;
        name = studentName;
        cgpa = studentCGPA; 
    }
    
    public String toString() {
        return " \n " + id + "  \t  " + name + "  \t  " + cgpa;
    }    

    public int compareTo(Student that) {
        return this.id.compareTo(that.id);     
    }
}
 
class ComparatorTest1 {
    public static void main(String []args) {
    	Student []students = {  new Student("cs011", "Lennon  ", 3.1), 
new Student("cs021", "McCartney", 3.4),  
new Student("cs012", "Harrison ", 2.7),    
new Student("cs022", "Starr ", 3.7) };

        System.out.println("Before sorting by student ID");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(students));
        
        Arrays.sort(students);
        
        System.out.println("After sorting by student ID");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(students));
    }    
}
