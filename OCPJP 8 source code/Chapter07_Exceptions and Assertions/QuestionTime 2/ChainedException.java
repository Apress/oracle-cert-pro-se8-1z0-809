/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class ChainedException {
    public static void foo() {
        try {
            throw new ArrayIndexOutOfBoundsException(); 
	    } catch(ArrayIndexOutOfBoundsException oob) {	    	
                RuntimeException re = new RuntimeException(oob); 
		re.initCause(oob); 	 
		throw re; 
	    }
	}

	public static void main(String []args) {
	    try {
	        foo();
	    } catch(Exception re) {
	        System.out.println(re.getClass()); 
	    }
	}
}
