/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Locale;
import java.util.Arrays; 

class AvailableLocalesEnglish {
    public static void main(String []args) {
        Arrays.stream(Locale.getAvailableLocales()) 
		.filter(locale -> locale.getLanguage().equals("en")) 
		.forEach(locale -> 
			System.out.printf("Locale code: %s and it stands for %s %n", 
					locale, locale.getDisplayName()));
    }
}
