/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface DoNothing { 
    default void doNothing() { System.out.println("doNothing"); }  
}

@FunctionalInterface
interface DontDoAnything extends DoNothing {
    @Override 
    abstract void doNothing(); 
}

class LambdaTest {
    public static void main(String []args) {
        DontDoAnything beIdle = () -> System.out.println("be idle");
        beIdle.doNothing(); 
    }
}
