/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface Interface1 {
    default public void foo() { System.out.println("Interface1’s foo"); }
}

interface Interface2 {
    default public void foo() { System.out.println("Interface2’s foo"); }
}

public class Diamond implements Interface1, Interface2 {
    public static void main(String []args) {
        new Diamond().foo();
    }
}
