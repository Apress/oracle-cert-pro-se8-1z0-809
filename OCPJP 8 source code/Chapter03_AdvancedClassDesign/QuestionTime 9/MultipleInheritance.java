/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface BaseInterface {
    default void foo() { System.out.println("BaseInterface's foo"); } 
}

interface DerivedInterface extends BaseInterface {
    default void foo() { System.out.println("DerivedInterface’s foo"); }
}

interface AnotherInterface {
    public static void foo() { System.out.println("AnotherInterface's foo"); } 
}

public class MultipleInheritance implements DerivedInterface, AnotherInterface {
    public static void main(String []args) {
        new MultipleInheritance().foo();
    }
}
