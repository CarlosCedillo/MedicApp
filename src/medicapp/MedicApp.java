
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

    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException, MessagingException, IOException {

        System.out.println("----- Starting MedicApp, created by Carlos Gerardo Cedillo Alcántar -----");
        
        DataBase dataBase = new DataBase();
        dataBase.createDB();
        
        Login login = new Login("opn");
        login.setVisible(true);

/*    
        ConfirmEmail confirmEmail = new ConfirmEmail("usario","correo","123456");
        confirmEmail.setVisible(true);
*/
/*
        ResetPassword resetPassword = new ResetPassword("opn","Cageceal","cgca_0223@hotmail.com","123456");
        resetPassword.setVisible(true);
*/
    }

}