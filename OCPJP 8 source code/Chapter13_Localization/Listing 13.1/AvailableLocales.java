/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Locale;
import java.util.Arrays ; 

class AvailableLocales {
	public static void main(String []args) {
		System.out.println("The default locale is: " + Locale.getDefault());
		Locale [] locales = Locale.getAvailableLocales();
		System.out.printf("No. of other available locales is: %d, and they are: %n",
		locales.length);
		Arrays.stream(locales).forEach(
			locale -> System.out.printf("Locale code: %s and it stands for %s %n",
			 locale, locale.getDisplayName()));		
	}
}
