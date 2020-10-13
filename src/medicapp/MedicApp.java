
// This is the class who start the app

package medicapp;

import com.sun.xml.internal.stream.Entity;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Scanner;
import views.Index;

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
        
        //System.out.println("--- Executing MedicApp: created by Carlos Gerardo Cedillo Alcántar ---");
        
//        pruebas();
        
//        Index index = new Index();
//        index.setVisible(true);
        
//        DataBase dataBase = new DataBase();
//        dataBase.createDB();
        
    }

    private static void pruebas() {
        Helper helper = new Helper();
        
        System.out.println("Creando palabra de seguridad...");
        String secureWord = helper.creteSecurityWord();
        System.out.println("\nLa palabra creada es: "+secureWord);
        Integer[] tI = new Integer[3];
        tI = helper.getTime();
        System.out.println("Tiempo de inicio: "+tI[0]+":"+tI[1]+":"+tI[2]);
        
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("\nAhora quiero que ingrese la palbra de arriba: ");
        String toCompare = keyBoard.next();
        
        Integer[] tF = new Integer[3];
        tF = helper.getTime();
        System.out.println("\nTiempo de finalizacion: "+tF[0]+":"+tF[1]+":"+tF[2]);
        
        Integer timeSeconds;
        timeSeconds = Helper.restTime(tI,tF);
        System.out.println("Tiempo trsancurrido = "+timeSeconds+" Segundos");
        
        //limite de 5 segundos
        Boolean validation = Helper.validation(timeSeconds, 5);
        
        if( validation == true ){
            System.out.println("To' bien :)");
        }else{
            System.out.println("To' mal :(");
        }
        
    }

}
