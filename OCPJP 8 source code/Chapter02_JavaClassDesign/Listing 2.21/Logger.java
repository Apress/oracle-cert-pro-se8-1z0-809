/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

public class Logger {
	private Logger() {
		// private constructor
	}
	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}
	public static Logger getInstance() {
		return LoggerHolder.logger;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}
