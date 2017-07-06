/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class AssertionFailure {
	public static void main(String []args) {
	    try {
	        assert false; 
	    } catch(RuntimeException re) {
	        System.out.println("RuntimeException");
	    } catch(Exception e) {
	        System.out.println("Exception");
	    } catch(Error e) {	// LINE A 
	        System.out.println("Error" + e);
	    } catch(Throwable t) {
		System.out.println("Throwable");
	    }
	}
}
