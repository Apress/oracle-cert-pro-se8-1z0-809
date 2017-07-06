/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.IntStream;

class EvenNumbers {
    public static void main(String []args) {
        IntStream.rangeClosed(0, 10)
                 .filter(i -> (i % 2) == 0)
                 .forEach(System.out::println);
    }
}
