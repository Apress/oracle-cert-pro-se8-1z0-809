/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.IntStream;

public class StreamReuse {
    public static void main(String []args) {
    IntStream chars =  "bookkeep".chars();
        System.out.println(chars.count());
        chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));
    }
}
