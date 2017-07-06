/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

// Utility class with method connectToDb() that will be used by other programs in this chapter 
public class DbConnector { 
    public static Connection connectToDb() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String database = "addressBook";
        String userName = "root"; 
        String password = "mysql123";
        return DriverManager.getConnection(url + database, userName, password);  
    }
}
