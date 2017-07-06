/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
    public static void main(String args[]) {
	Locale currentLocale = Locale.getDefault(); 
	ResourceBundle resBundle = 
ResourceBundle.getBundle("ResourceBundle", currentLocale);
	System.out.printf(resBundle.getString("Greeting")); 
    }
}

