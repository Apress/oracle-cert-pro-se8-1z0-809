/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.ListResourceBundle;

// default US English version
public class ResBundle extends ListResourceBundle {
    public Object[][] getContents() {
    	return contents;
    }
    static final Object[][] contents = {
	{ "MovieName", "Avatar" }, 
	{ "GrossRevenue", (Long) 2782275172L }, // in US dollars 
	{ "Year", (Integer)2009 }   
    };
}

