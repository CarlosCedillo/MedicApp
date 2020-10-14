
// This is the class who start the app

package medicapp;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
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
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException {
        // TODO code application logic here
        Login login = new Login();
        login.setVisible(true);
    }

}
