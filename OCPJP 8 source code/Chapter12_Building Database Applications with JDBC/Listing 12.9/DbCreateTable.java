/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

class DbCreateTable {
    public static void main(String[] args) {
        try (Connection connection = DbConnector.connectToDb();
            Statement statement = connection.createStatement()){ 
                // use CREATE TABLE SQL statement to 
                // create table familyGroup
                statement.executeUpdate("CREATE TABLE familyGroup (id int not null auto_increment, nickName varchar(30) not null, primary key(id));");
                System.out.println("Table created successfully");
        } 
        catch (SQLException sqle) {
            sqle.printStackTrace();
                System.exit(-1); 
        }
    }
}
