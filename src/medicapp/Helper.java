
//Here i creat somo util methods, some i don´t know where to put it XD

package medicapp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/**
 * @author Cageceal
 */
public class Helper {
    
    public static String creteSecurityWord(){
        String securityKey;
        
        // Estos son los caracteres que se puden usar
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        
        StringBuilder createdString = new StringBuilder(5);
        Random random = new Random();
        
        // Aqui se genera la palabra de 10 caracteres
        for( int i = 0 ; i < 10 ; i++ ){
            
            char c = chars[random.nextInt(chars.length)];
            createdString.append(c);
            
        }
        
        securityKey = createdString.toString();
        
        return securityKey;
    }
    
    public static String encrypt(String string) throws NoSuchAlgorithmException{
        
        String stringEncrypted;
        
        MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        md.update(string.getBytes());
        
        byte[] digets = md.digest();
        
        System.out.println();
        
        // Se escribe codificado base 64.
        byte[] encrypted  = Base64.encodeBase64(digets);
        stringEncrypted = Arrays.toString(encrypted);
        
        return stringEncrypted;
        
    }
    
    public static Integer[] getTime(){
        
        Integer[] time = new Integer[3];
        
        Calendar calendar = new GregorianCalendar();
        
        time[0] = calendar.get(Calendar.HOUR_OF_DAY);
        time[1] = calendar.get(Calendar.MINUTE);
        time[2] = calendar.get(Calendar.SECOND);
        
        return time;
    
    }

    static Integer restTime(Integer[] timeStart, Integer[] timeEnd) {
        
        Integer hS, mS, sS;
        hS = timeStart[0];
        mS = timeStart[1];
        sS = timeStart[2];
        
        Integer hE, mE, sE;
        hE = timeEnd[0];
        mE = timeEnd[1];
        sE = timeEnd[2];
        
        Integer hT, mT, sT;
        
        //   hE:mE:sE
        // - hS:mS:sS
        //-------------
        
        if( sS > sE ){
            sE = sE + 60;
            mE = mE -1;
        }
        
        sT = sE - sS;
        
        if( mS > mE ){
            mE = mE + 60;
            hE = hE - 1;
        }
        
        mT = mE - mS;
        
        if( hE == 0 ){
            hE = 24;
        }
        
        if( hS == 0 ){
            hS = 24;
        }
        
        hT = hE - hS;
        
        Integer timeInSeconds = sT + (mT *60 ) + (hT * 3600);
        return timeInSeconds;
        
    }
    
    public static boolean validation (Integer seconds, Integer limit){
        boolean itIs;
        
        //The limit must be in seconds
        
        if( seconds > limit ){
            itIs = false;
        }else{
            itIs = true;
        }
        
        return itIs;
    }
    
    public static void message(String option ){
        
        String message = null;
        Integer type = null;
        
        switch( option ){
            
            case "1a":
                message = "Faltan datos";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "1b":
                message = "Las contraseñas no coinciden";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "1c":
                message = "Contraseña incorrecta";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+message+"</h2></HTML>", "Mensaje", type);
        
    }
    
    public static void message(String option, String string ){
    
        String message = null;
        Integer type = null;
        
        switch( option ){
            
            case "1a":
                message = "El usuario "+string+" ya existe";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "1b":
                message = "No se pudo registrar el usuario "+string;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "1c":
                message = "El usuario "+string+" no existe";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "2a":
                message = "El correo "+string+" ya esta registrado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+message+"</h2></HTML>", "Mensaje", type);
        
    }
    
    public static void message(String option, String username, String email){
        
        String message = null;
        Integer type = null;
        
        switch( option ){
            
            case "1a":
                message = "Usuario "+username+" creado exitosamente informacion mandada a "+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+message+"</h2></HTML>", "Mensaje", type);
        
    }
    
}
