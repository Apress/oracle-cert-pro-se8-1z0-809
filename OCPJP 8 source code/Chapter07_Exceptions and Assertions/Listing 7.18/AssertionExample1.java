/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class AssertionExample1 {
    public static void main(String []args) {
        int i = -10;
        if(i < 0) {
            // if negative value, convert into positive value 
	    i = -i; 
	}
        System.out.println("the value of i is: " + i); 
	// at this point the assumption is that i cannot be negative; 
	// assert this condition since its an assumption that will always hold 
	assert (i >= 0) : "impossible: i is negative!";
    }
}
