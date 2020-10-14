/* 
doctorUserName varchar(30)
password varchar(150)
doctorEmail varchar(150)
doctorName varchar(50)
doctorLastName1 varchar(50)
doctorLastName2 varchar(50)
doctorSex varchar(1)
*/

package dao.impls;

import dao.interfaces.doctorDao;
import dataBase.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Cageceal
 */
public class doctorDaoImpl extends DataBase implements doctorDao{

    @Override
    public boolean create(String doctorUserName, String password, String doctorName, 
            String doctorLastName1, String doctorLastName2, String doctorSex, String doctorEmail) {
        
        boolean created = false;
        System.out.println("\nCreating doctor: "+doctorUserName);
        
        try {
            
            DataBase dataBase = new DataBase();
            Connection connection = dataBase.getConnection();
            PreparedStatement preparedStatement;
            
            preparedStatement = connection.prepareStatement("INSERT INTO doctors "
                    + "(doctorUserName, password, doctorName, doctorLastName1, doctorLastName2, doctorSex, doctorEmail) "
//                          1               2           3           4                   5            6          7                    
                    + "VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, doctorUserName);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, doctorName);
            preparedStatement.setString(4, doctorLastName1);
            preparedStatement.setString(5, doctorLastName2);
            preparedStatement.setString(6, doctorSex);
            preparedStatement.setString(7, doctorEmail);
            
            Integer check = preparedStatement.executeUpdate();
            
            if( check == 1 ){
                created = true;
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return created;
        
    }

}