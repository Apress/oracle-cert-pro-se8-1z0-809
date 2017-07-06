/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

public class Counter {
	private static int count; 
	static {
		// code in this static block will be executed when 
		// the JVM loads the class into memory 
		count = 1; 
	}
	public Counter() { 
		count++;
	}
	public static void printCount() { 
		System.out.println("Number of instances created so far is: " + count);
	}
	public static void main(String []args) {
		Counter anInstance = new Counter();
		Counter.printCount(); 
		Counter anotherInstance = new Counter();
		Counter.printCount();
	}
}
