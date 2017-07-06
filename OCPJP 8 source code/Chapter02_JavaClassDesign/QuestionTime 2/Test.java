/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class Base {
	public void print() {
		System.out.println("Base:print");
	}
}

abstract class Test extends Base { //#1
	public static void main(String[] args) {
		Base obj = new Base();
		obj.print(); //#2
	}
}
