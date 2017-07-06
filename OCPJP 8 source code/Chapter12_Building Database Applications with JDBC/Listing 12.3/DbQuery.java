/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Program to illustrate how to query a database 
class DbQuery {
    public static void main(String[] args) {
        // Get connection, execute query, get the result set 
        // and print the entries from the result rest 
        try (Connection connection = DbConnector.connectToDb();
            Statement statement = connection.createStatement(); 
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
                System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt("id") + "\t" 
                                + resultSet.getString("firstName") + "\t" 
                                + resultSet.getString("lastName") + "\t" 
                                + resultSet.getString("email") + "\t" 
                                + resultSet.getString("phoneNo"));
                    }
           } 
           catch (SQLException sqle) {
                sqle.printStackTrace();
                System.exit(-1); 
            }
     }
}
