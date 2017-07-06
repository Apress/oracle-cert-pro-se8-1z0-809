/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.*; 

class LastError<T> {
	private T lastError;
void setError(T t){
	    lastError = t;
         System.out.println("LastError: setError");
	}
}

class StrLastError<S extends CharSequence> extends LastError<String>{
	public StrLastError(S s) {
	}
	void setError(S s){
        System.out.println("StrLastError: setError");
	}
}
		
class Test {
	public static void main(String []args) {
        StrLastError<String> err = new StrLastError<String>("Error");
        err.setError("Last error");
	}
}
