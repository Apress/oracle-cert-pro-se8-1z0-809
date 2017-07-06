/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/
import java.nio.file.*;

class SubPath {
        public static void main(String []args) {
                Path aPath = Paths.get("D:\\OCPJP\\programs\\..\\NIO2\\src\\.\\SubPath.java"); 
                aPath = aPath.normalize(); 
                System.out.println(aPath.subpath(2, 3)); 
        }
}


