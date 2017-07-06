/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class LambdaFunctionTest { 
    @FunctionalInterface
    interface LambdaFunction {
        int apply(int j); 
        boolean equals(java.lang.Object arg0);
    }

    public static void main(String []args) {
        LambdaFunction lambdaFunction = i -> i * i; 	// #1 
        System.out.println(lambdaFunction.apply(10));  	
    }
}
