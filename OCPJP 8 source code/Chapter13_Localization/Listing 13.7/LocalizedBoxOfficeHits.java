/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.ResourceBundle;
import java.util.Locale;

public class LocalizedBoxOfficeHits {
    public void printMovieDetails(ResourceBundle resBundle) {
	String movieName = resBundle.getString("MovieName"); 
	Long revenue = (Long)(resBundle.getObject("GrossRevenue"));
	Integer year = (Integer) resBundle.getObject("Year"); 

	System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " 
			+ revenue );
    } 

    public static void main(String args[]) {
	LocalizedBoxOfficeHits localizedHits = new LocalizedBoxOfficeHits(); 
	// print the largest box-office hit movie for default (US) locale 
	Locale locale = Locale.getDefault(); 
	localizedHits.printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
	
	// print the largest box-office hit movie for Italian locale 
	locale = new Locale("it", "IT", ""); 
	localizedHits.printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
    }
}


