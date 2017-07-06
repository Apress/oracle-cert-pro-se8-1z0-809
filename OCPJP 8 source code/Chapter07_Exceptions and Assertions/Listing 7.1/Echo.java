/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// A simple program without exception handling code
class Echo {
    public static void main(String []args) {
       if(args.length == 0) { 
       	   // no arguments passed – display an error to the user 
           System.out.println("Error: No input passed to echo command... "); 
	   System.exit(-1); 
       }
       else {
           for(String str : args) {
       // command-line arguments are separated and passed as an array
	       // print them by adding a space between the array elements 
	       System.out.print(str + " "); 
	   }
       }
    }
}
