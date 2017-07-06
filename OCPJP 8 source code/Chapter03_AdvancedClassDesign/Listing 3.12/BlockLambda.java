/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class BlockLambda { 
    interface LambdaFunction {
        String intKind(int a); 
      }
      public static void main(String []args) {
          LambdaFunction lambdaFunction = 
                  (int i) -> { 
                        if((i % 2)  == 0) return "even";   
                        else return "odd"; 
                  }; 
          System.out.println(lambdaFunction.intKind(10));  	
      }
}
