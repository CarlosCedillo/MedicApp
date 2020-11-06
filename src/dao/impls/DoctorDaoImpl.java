
/* 
TABLE doctors
    doctorUserName varchar(50)      1
    password varchar(50)            2
    doctorEmail varchar(80)         3
    confirmedEmail boolean          4
    doctorName varchar(50)          5
    doctorLastName1 varchar(50)     6
    doctorLastName2 varchar(50)     7
    doctorSex varchar(1)            8
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
public class DoctorDaoImpl extends DataBase implements DoctorDao {

    @Override
    public boolean create(Doctors doctor) {

        boolean created = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO doctors (doctorUserName, password, "
                    + "doctorEmail, confirmedEmail, doctorName, doctorLastName1, doctorLastName2, doctorSex) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, doctor.getUserName());
            preparedStatement.setString(2, doctor.getPassword());
            preparedStatement.setString(3, doctor.getEmail());
            preparedStatement.setBoolean(4, doctor.isConfirmedEmail());
            preparedStatement.setString(5, doctor.getName());
            preparedStatement.setString(6, doctor.getLastName1());
            preparedStatement.setString(7, doctor.getLastName2());
            preparedStatement.setString(8, doctor.getSex());
            Integer confirmation = preparedStatement.executeUpdate();

            if (confirmation == 1) {
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

            if (check == 1) {
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
    public boolean resetPassword(String doctorUserName, String newPassword ) {
        
        boolean updated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE doctors SET password = ? WHERE doctorUserName = ?");
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, doctorUserName);
            Integer check = preparedStatement.executeUpdate();

            if (check == 1) {
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

            while (resultSet.next()) {
                count++;
            }

            if (count == 1) {
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

            while (resultSet.next()) {
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

            while (resultSet.next()) {
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
    public boolean getconfirmedEmail(String doctorUserName) {

        boolean activated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareCall("SELECT confirmedEmail FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, doctorUserName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Doctors doctors = new Doctors();
                doctors.setConfirmedEmail(resultSet.getBoolean("confirmedEmail"));
                activated = doctors.isConfirmedEmail();
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
    public boolean setconfirmedEmail(String doctorUserName) {

        boolean activated = false;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE doctors SET confirmedEmail = ? WHERE doctorUserName = ?");
            preparedStatement.setBoolean(1, true);
            preparedStatement.setString(2, doctorUserName);
            Integer check = preparedStatement.executeUpdate();

            if (check == 1) {
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
    public String getEmail(String doctorUserName) {

        String email = null;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareCall("SELECT doctorEmail FROM doctors WHERE doctorUserName = ?");
            preparedStatement.setString(1, doctorUserName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
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

    @Override
    public String getUsername(String doctorEmail) {

        String username = null;
        DataBase dataBase = new DataBase();
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {

            Connection connection = dataBase.getConnection();
            preparedStatement = connection.prepareCall("SELECT doctorUserName FROM doctors WHERE doctorEmail = ?");
            preparedStatement.setString(1, doctorEmail);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Doctors doctors = new Doctors();
                doctors.setUserName(resultSet.getString("doctorUserName"));
                username = doctors.getUserName();
            }

            connection = dataBase.closeConnectio();
            preparedStatement.close();
            resultSet.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return username;

    }

}
