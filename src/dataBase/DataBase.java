// Here I create the data base and get/close connection to it

package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Cageceal
 */
public class DataBase {
    
    Connection connection = null;
    String db = "MedicApp";
    
    public Connection createDB() throws SQLException{
        
        try {
            
            // Get driver of Mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            // Get connection
            connection = DriverManager.getConnection("jdbc:derby:.\\DB\\"+db+".DB;create=true");
            
            if( connection != null ){
                
                System.out.println("\n"+db+" data base created");
                
                String createDoctors = "CREATE TABLE doctors ("
                        + "doctorId varchar(30), "
                        + "doctorName varchar(50), "
                        + "doctorLastName1 varchar(50), "
                        + "doctorLastName2 varchar(50), "
                        + "doctorSex varchar(1), "
                        + "password varchar(20))";
                
                try {
                    
                    System.out.println("\nCrating table: doctors");
                    PreparedStatement preparedStatement = connection.prepareStatement(createDoctors);
                    preparedStatement.execute();
                    System.out.println("Table doctors created");
                    preparedStatement.close();
                    
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return connection;
    }
    
    public Connection getConnection(){
        
        try {
            
            // Get driver of Mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            // Get connection
            connection = DriverManager.getConnection("jdbc:derby:.\\DB\\"+db+".DB");
            
            if( connection != null ){
                System.out.println("\nConnected to "+db+" data base");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return connection;
    }
    
    public void closeConnectio(){
        
        try {
            
            System.out.println("\nDisconnected to "+db+" data base");
            connection.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
