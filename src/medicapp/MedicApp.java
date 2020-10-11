// This is the class who start the app

package medicapp;

import dataBase.DataBase;
import java.sql.SQLException;

/**
 * @author Cageceal
 */
public class MedicApp {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        System.out.println("--- Executing MedicApp: created by Carlos Gerardo Cedillo Alcántar ---");
        
        DataBase dataBase = new DataBase();
        dataBase.createDB();
        dataBase.getConnection();
        dataBase.closeConnectio();
    }
    
}
