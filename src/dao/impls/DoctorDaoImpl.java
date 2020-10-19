/* 
TABLE doctors
doctorUserName varchar(30)
password varchar(50
doctorEmail varchar(80)
doctorName varchar(50)
doctorLastName1 varchar(50)
doctorLastName2 varchar(50)
doctorSex varchar(1)
*/

package dao.impls;

import dataBase.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.interfaces.DoctorDao;

/**
 * @author Cageceal
 */
public class DoctorDaoImpl extends DataBase implements DoctorDao{
    
    @Override
    public boolean create(String doctorUserName, String password, String doctorEmail, 
            String doctorName, String doctorLastName1, String doctorLastName2, String doctorSex) {
        
        boolean created = false;
        
        try {
            
            DataBase dataBase = new DataBase();
            Connection connection = dataBase.getConnection();
            PreparedStatement preparedStatement;
            
            preparedStatement = connection.prepareStatement("INSERT INTO doctors (doctorUserName, password, doctorEmail, "
                    + "doctorName, doctorLastName1, doctorLastName2, doctorSex) VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, doctorUserName);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, doctorEmail);
            preparedStatement.setString(4, doctorName);
            preparedStatement.setString(5, doctorLastName1);
            preparedStatement.setString(6, doctorLastName2);
            preparedStatement.setString(7, doctorSex);
            Integer confirmation = preparedStatement.executeUpdate();
            
            if( confirmation == 1 ){
                created = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return created;
        
    }

    @Override
    public boolean login(String doctorUserName, String password) {
        
        boolean logined = false;
        
        try {
            
            DataBase dataBase = new DataBase();
            Connection connection = dataBase.getConnection();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorUserName = ? AND password = ?");
            preparedStatement.setString(1, doctorUserName);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            Integer count = 0;
            
            while( resultSet.next() ){
                count++;
            }
            
            if( count > 0 ){
                logined = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return logined;
        
    }

    @Override
    public boolean existUsername(String doctorUserName) {
        
        boolean exist = false;
        
        try {
            
            DataBase dataBase = new DataBase();
            Connection connection = dataBase.getConnection();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, doctorUserName);
            resultSet = preparedStatement.executeQuery();
            Integer count = 0;
            
            while( resultSet.next() ){
                count++;
            }
            
            if( count > 0 ){
                exist = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return exist;
        
    }

    @Override
    public boolean existEmail(String doctorEmail) {
        
        boolean exist = false;
        
        try {
            
            DataBase dataBase = new DataBase();
            Connection connection = dataBase.getConnection();
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorEmail = ?");
            preparedStatement.setString(1, doctorEmail);
            resultSet = preparedStatement.executeQuery();
            Integer count = 0;
            
            while( resultSet.next() ){
                count++;
            }
            
            if( count > 0 ){
                exist = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return exist;
        
    }

}