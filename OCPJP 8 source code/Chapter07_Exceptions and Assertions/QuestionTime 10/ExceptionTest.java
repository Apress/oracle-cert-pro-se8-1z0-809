/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.io.*;
class ExceptionTest {
	public static void thrower() throws Exception {
	    try {
	        throw new IOException();
	    } finally {
	        throw new FileNotFoundException(); 
	    }
	}

	public static void main(String []args) {
	    try {
	        thrower(); 
	    } catch(Throwable throwable) {
	        System.out.println(throwable); 
	    }
	}
}
