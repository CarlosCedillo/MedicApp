// This is the class who start the app

package medicapp;

import com.sun.org.apache.xml.internal.security.algorithms.MessageDigestAlgorithm;
import dataBase.DataBase;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import sun.security.krb5.internal.crypto.Aes128;
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
        System.out.println("--- Executing MedicApp: created by Carlos Gerardo Cedillo Alcántar ---");
        
//        createWordLimitedTime();
        
//        Index index = new Index();
//        index.setVisible(true);
        
//        DataBase dataBase = new DataBase();
//        dataBase.createDB();
        
    }

    private static void createWordLimitedTime() throws NoSuchAlgorithmException {
        
        // Esto genera un texto de 5 caracteres random
        System.out.println("Ingrese la siguiente palabra en menos de 1 minuto");
        
        // Estos son los caracteres que se puden usar
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        
        StringBuilder recoberyPassword = new StringBuilder(5);
        Random random = new Random();
        
        // Aqui se genera la palabra de 5 caracteres
        for( int i = 0 ; i < 5 ; i++ ){
            
            char c = chars[random.nextInt(chars.length)];
            recoberyPassword.append(c);
            
        }
        
        // Aqui se miestra en consola
        String backupWord = recoberyPassword.toString();
        System.out.println(backupWord);
        
        String wordEncrypted = encrypt(backupWord);
        //System.out.println("Palabra encrptada: "+wordEncrypted);
        System.out.println("La palabra creada tiene "+wordEncrypted.length()+" caracteres");
        
/*        
        // Esto sirve para obtener un import para el calendario, para obrener los minutos y seguntos
        Calendar start = new GregorianCalendar();
        //Se obtienen los minutos a la hora de ejecutar esto
        int hC = start.get(Calendar.HOUR_OF_DAY);
        int mC = start.get(Calendar.MINUTE);
        int sC = start.get(Calendar.SECOND);
        System.out.println(hC+":"+mC+":"+sC+"\n");
*/
        Scanner keyboard = new Scanner(System.in);
        String userIncome;
        
        System.out.println("\nIngrese la palabra:");
        userIncome = keyboard.next();
        String encryptedIncome = encrypt(userIncome);
        System.out.println("La palabra tecleada tiene "+encryptedIncome.length()+" caracteres");
        
        if( encryptedIncome.equals(wordEncrypted) ){
            System.out.println("Siiii");
        }else{
            System.out.println("Noooo");
        }
        
        
/*        
        Calendar end = new GregorianCalendar();
        int hI = end.get(Calendar.HOUR_OF_DAY);
        int mI = end.get(Calendar.MINUTE);
        int sI = end.get(Calendar.SECOND);
        System.out.println(hI+":"+mI+":"+sI+"\n");
        
        int hT = hI - hC;
        int mT = mI - mC;
        int sT = sI - sC;
        
        //Transforarlo en segundos
        int totalSecs = (60*hT)+(60*mT)+sT;
        
        System.out.println("Tiempo transcurrido en segundos = "+totalSecs+"\n");
        
        if( totalSecs > 60 ){
            System.out.println("El tiempo ya ah caducado :(");
        }else{
*/            
//        }
        
    }

    private static String encrypt(String word) throws NoSuchAlgorithmException {
        String wordEncrypted;
        
        MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        md.update(word.getBytes());
        
        byte[] digets = md.digest();
        
        System.out.println();
        
        // Se escribe codificado base 64.
        byte[] encrypted  = Base64.encodeBase64(digets);
        wordEncrypted = Arrays.toString(encrypted);
        
        return wordEncrypted;
    }

}
