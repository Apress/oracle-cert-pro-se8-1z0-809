/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class BaseClass {
    public void foo() { System.out.println("BaseClass’s foo"); }
}

interface BaseInterface {
    default public void foo() { System.out.println("BaseInterface’s foo"); }
}

public class Diamond extends BaseClass implements BaseInterface {
    public static void main(String []args) {
        new Diamond().foo();
    }
}
