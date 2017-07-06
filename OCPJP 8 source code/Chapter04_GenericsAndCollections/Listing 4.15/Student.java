/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

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
