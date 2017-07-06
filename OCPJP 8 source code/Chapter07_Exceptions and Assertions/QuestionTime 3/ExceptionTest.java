/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class ExceptionTest {
    public static void foo() {
        try {
	       throw new ArrayIndexOutOfBoundsException(); 
	    } catch(ArrayIndexOutOfBoundsException oob) {	    
                throw new Exception(oob); 
	    }
	}

	public static void main(String []args) {
	    try {
	        foo();
	    } catch(Exception re) {
	        System.out.println(re.getCause()); 
	    }
	}
}
