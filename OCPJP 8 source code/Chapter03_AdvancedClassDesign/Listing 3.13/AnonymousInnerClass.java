/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface Function {
    void call(); 
}

class AnonymousInnerClass { 
    public static void main(String []args) {
	Function function = new Function() { 
	    public void call() { 
		System.out.println("Hello world"); 
	    }
	}; 		
	function.call();  	
    }
}
