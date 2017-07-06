/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

class PathExists {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
                
        if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            // check whether it is a file or a directory
            if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) { 
                System.out.println(path.getFileName() + " is a directory");
            } 
            else {
                System.out.println(path.getFileName() + " is a file");
            }
        }
        else { 
            System.out.println("The file/directory " + path.getFileName() 
                        + " does not exist");
        }
    }
}
