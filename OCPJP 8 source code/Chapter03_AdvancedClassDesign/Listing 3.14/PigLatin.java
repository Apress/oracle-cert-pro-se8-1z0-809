/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface SuffixFunction {
    void call(); 
}

class PigLatin {
    public static void main(String []args) {
        String word = "hello"; 
        SuffixFunction suffixFunc = () -> System.out.println(word + "ay"); 
        suffixFunc.call(); 
    }
}
