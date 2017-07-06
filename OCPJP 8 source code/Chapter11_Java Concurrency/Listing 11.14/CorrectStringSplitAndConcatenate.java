/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.Optional;

class CorrectStringSplitAndConcatenate {
    public static void main(String []args) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
    Optional<String> originalString = 
(Arrays.stream(words).parallel().reduce((a, b) -> a + " " + b));
    System.out.println(originalString.get());
}
}

