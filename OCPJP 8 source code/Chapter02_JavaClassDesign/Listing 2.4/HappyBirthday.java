/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

class HappyBirthday {
        // overloaded wish method with String as an argument 
        public static void wish(String name) {
                System.out.println("Happy birthday " + name + "!");
        }
        
        // overloaded wish method with no arguments; 
        // this method in turn invokes wish(String) method   
        public static void wish() {
                wish("to you");
        }

        public static void main(String []args) {
                wish();
                wish("dear James Gosling");
        }
}
