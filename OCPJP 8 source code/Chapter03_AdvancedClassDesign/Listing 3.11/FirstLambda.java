/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

interface LambdaFunction {
    void call(); 
}

class FirstLambda { 
    public static void main(String []args) {
	LambdaFunction lambdaFunction = () -> System.out.println("Hello world"); 
	lambdaFunction.call();  	
    }
}
