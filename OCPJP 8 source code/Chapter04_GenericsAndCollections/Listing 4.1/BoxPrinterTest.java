/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// This program shows container implementation using generics
class BoxPrinter<T> {
    private T val; 
    public BoxPrinter(T arg) {
        val = arg; 
    }  
    public String toString() {
        return "[" + val + "]"; 
    } 
} 
 
class BoxPrinterTest {
    public static void main(String []args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10)); 
        System.out.println(value1);
 
	BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world"); 
	System.out.println(value2);
     }
}
