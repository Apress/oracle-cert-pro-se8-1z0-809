/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays; 

class StreamPipelineExample {
    public static void main(String []args) {
        Arrays.stream(Object.class.getMethods())	// source 	
		.map(method -> method.getName())	// intermediate op
		.distinct()				// intermediate op	
		.forEach(System.out::println);		// terminal operation
    }
}
