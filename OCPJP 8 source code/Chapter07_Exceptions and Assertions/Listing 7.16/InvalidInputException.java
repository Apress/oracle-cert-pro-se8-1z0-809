/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// a custom “unchecked exception” that is meant to be thrown 
// when the input provided by the user is invalid 
class InvalidInputException extends RuntimeException {
    // default constructor 
    public InvalidInputException() {
	super();
    }

    // constructor that takes the String detailed information we pass while 
    // raising an exception 
    public InvalidInputException(String str) {    
        super(str);
    }

    // constructor that remembers the cause of the exception and 
    // throws the new exception  
    public InvalidInputException(Throwable originalException) {
	super(originalException);
    }

    // first argument takes detailed information string created while 
    // raising an exception 
    // and the second argument is to remember the cause of the exception 
    public InvalidInputException(String str, Throwable originalException) {
	super(str, originalException);
    }
}
