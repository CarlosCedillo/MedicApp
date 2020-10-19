
// This is the class who start the app

package medicapp;

import dataBase.DataBase;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.mail.MessagingException;
import views.Login;

/**
 * @author Cageceal
 */
public class MedicApp {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.security.NoSuchAlgorithmException
     */
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException, MessagingException, IOException {
        
        System.out.println("----- Starting MedicApp, created by Carlos Gerardo Cedillo Alcántar -----");
        
        DataBase dataBase = new DataBase();
        dataBase.createDB();
        
        Login login = new Login();
        login.setVisible(true);
        
    }

}
