/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.LongStream;

class PrimeNumbers {
    private static boolean isPrime(long val) {
        for(long i = 2; i <= val/2; i++) {
            if((val % i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args) {
        long numOfPrimes = LongStream.rangeClosed(2, 100_000)
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    }
}
