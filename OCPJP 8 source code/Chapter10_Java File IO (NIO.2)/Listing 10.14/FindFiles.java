/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

class FindFiles {
    public static void main(String []args) throws IOException {
        BiPredicate<Path, BasicFileAttributes> predicate = (path, attrs)
                -> attrs.isRegularFile() && path.toString().endsWith("class");
        try(Stream<Path> entries = Files.find(Paths.get("."), 4, predicate)) {
            entries.limit(100).forEach(System.out::println);
        }
    }
}


