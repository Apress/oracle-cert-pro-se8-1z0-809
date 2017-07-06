/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/
import java.nio.file.*;
import java.io.IOException; 

class PathExists {
        public static void main(String []args) throws IOException {
                Path aFilePath = Paths.get("D:\\directory\\file.txt");        
                System.out.println(aFilePath.isAbsolute()); 
        }
}



