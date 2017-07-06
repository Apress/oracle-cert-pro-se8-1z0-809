/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.concurrent.ForkJoinPool;

public class Parallelism {
    public static void main(String []args) {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
}


