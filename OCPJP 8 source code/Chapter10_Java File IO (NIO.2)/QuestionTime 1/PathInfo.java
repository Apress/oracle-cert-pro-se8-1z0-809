/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/
import java.nio.file.*;

public class PathInfo {
        public static void main(String[] args) {
                Path aFilePath = Paths.get("D:\\directory\\file.txt");        // FILEPATH 
                
                while(aFilePath.iterator().hasNext()) {
                        System.out.println("path element: " + aFilePath.iterator().next());  
                }
        }
}

