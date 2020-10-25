/* 
TABLE doctors
    doctorUserName varchar(50)
    password varchar(50)
    doctorEmail varchar(80
    doctorName varchar(50)
    doctorLastName1 varchar(50)
    doctorLastName2 varchar(50)
    doctorSex varchar(1)
    activated boolean
*/

package dao.impls;

import dataBase.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.interfaces.DoctorDao;
import dao.entities.Doctors;

/**
 * @author Cageceal
 */
public class DoctorDaoImpl extends DataBase implements DoctorDao{
    
    @Override
    public boolean create( Doctors doctor ) {
        
        boolean created = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO doctors (doctorUserName, password, doctorEmail, "
//                                                                                      1             2           3                    
                    + "doctorName, doctorLastName1, doctorLastName2, doctorSex, activated) VALUES (?,?,?,?,?,?,?,?)");
//                          4             5                 6             7          8     
            preparedStatement.setString (1, doctor.getUserName());
            preparedStatement.setString (2, doctor.getPassword());
            preparedStatement.setString (3, doctor.getEmail());
            preparedStatement.setString (4, doctor.getName());
            preparedStatement.setString (5, doctor.getLastName1());
            preparedStatement.setString (6, doctor.getLastName2());
            preparedStatement.setString (7, doctor.getSex());
            preparedStatement.setBoolean(8, doctor.isActivated());
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
    public boolean updateEmail(String doctorUserName, String doctorEmail) {
        
        boolean updated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE doctors SET doctorEmail = ? WHERE doctorUserName = ?");
            preparedStatement.setString(1, doctorEmail);
            preparedStatement.setString(2, doctorUserName);
            Integer check = preparedStatement.executeUpdate();
            
            if( check == 1 ){
                updated = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return updated;
        
    }

    @Override
    public boolean login(String doctorUserName, String password) {
        
        boolean logined = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorUserName = ? AND password = ?");
            preparedStatement.setString(1, doctorUserName);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            Integer count = 0;
            
            while( resultSet.next() ){
                count++;
            }
            
            if( count == 1 ){
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
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, doctorUserName);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
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
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM doctors WHERE doctorEmail = ?");
            preparedStatement.setString(1, doctorEmail);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
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
    public boolean getActivated(String userName) {
        
        boolean activated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareCall("SELECT activated FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                Doctors doctors = new Doctors();
                doctors.setActivated(resultSet.getBoolean("activated"));
                activated = doctors.isActivated();
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return activated;
        
    }

    @Override
    public boolean activate(String userName) {
        
        boolean activated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE doctors SET activated = ? WHERE doctorUserName = ?");
            preparedStatement.setBoolean(1, true);
            preparedStatement.setString(2, userName);
            Integer check = preparedStatement.executeUpdate();
            
            if( check == 1 ){
                activated = true;
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return activated;
        
    }

    @Override
    public String getEmail(String userName) {
        
        String email = null;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            
            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareCall("SELECT doctorEmail FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();
            
            while( resultSet.next() ){
                Doctors doctors = new Doctors();
                doctors.setEmail(resultSet.getString("doctorEmail"));
                email = doctors.getEmail();
            }
            
            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return email;
        
    }

}