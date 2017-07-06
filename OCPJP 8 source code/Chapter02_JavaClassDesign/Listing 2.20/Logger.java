/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

public class Logger {
	private Logger() {
		// private constructor to prevent direct instantiation 
	}
	private static Logger myInstance;
	public static synchronized Logger getInstance() {
		if(myInstance == null)
			myInstance = new Logger();
		return myInstance;
	}
	public void log(String s){
		// log implementation
		System.err.println(s);
	}
}
