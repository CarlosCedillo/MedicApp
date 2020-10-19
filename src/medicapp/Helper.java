
//Here i creat somo util methods, some i don´t know where to put it XD

package medicapp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 * @author Cageceal
 */
public class Helper {
    
    public static String createCode(Integer length){
        String securityKey;
        
        // Estos son los caracteres que se puden usar
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        
        StringBuilder createdString = new StringBuilder(5);
        Random random = new Random();
        
        // Aqui se genera la palabra de 10 caracteres
        for( int i = 0 ; i < length ; i++ ){
            
            char c = chars[random.nextInt(chars.length)];
            createdString.append(c);
            
        }
        
        securityKey = createdString.toString();
        
        return securityKey;
    }
    
    public static String encrypt(String code, String text) {
        
        String textEncrypted = null;
        
        try {
            
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            
            byte[] llavePassword = md5.digest(code.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            
            byte[] plainTextBytes = text.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            
            textEncrypted = new String(base64Bytes);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return textEncrypted;
    }
    
    public static String uncrypt(String code, String text){
        
        String textUnencrypted = null;
        
        try {
            byte[] message = Base64.decodeBase64(text.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(code.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            textUnencrypted = new String(plainText, "UTF-8");

        }   catch (
                
                UnsupportedEncodingException | 
                InvalidKeyException | 
                NoSuchAlgorithmException | 
                BadPaddingException | 
                IllegalBlockSizeException | 
                NoSuchPaddingException ex)
                
            {
                
            System.out.println(ex.getMessage());
        }
        
        return textUnencrypted;
        
    }
    
    // - Here are messeges to the user
    
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
            
            case "1d":
                message = "Código incorrecto";
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
                message = "Usuario "+username+" creado exitosamente, clave de activacion mandada a "+email+"";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+message+"</h2></HTML>", "Mensaje", type);
        
    }
    
    public static void sendActivation(String userEmail, String userName, String activationCode) throws MessagingException, IOException{
        
        Properties properties = new Properties();
        
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        
        Session session = Session.getDefaultInstance(properties);
        
        String email = getEmail();
        String password = getPassword();
        
        String subject = "Bienvenido a MedicApp";
        String content = "Hola "+userName+"\n\n"
                + "Este correo es para notificarle su dada de alta a la aplicacion MedicApp, como ultimo paso, por favor "
                + "ingrese el siguinte codigo para activar su cuenta: \n\n"+activationCode;
        
        MimeMessage mail = new MimeMessage(session);
        
        try {
            
            mail.setFrom(new InternetAddress (email));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (userEmail));
            mail.setSubject(subject);
            mail.setText(content);
            
            Transport transportar = session.getTransport("smtp");
            transportar.connect(email,password);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transportar.close();
            
        } catch (AddressException ex) {
            System.out.println(ex.getMessage());
        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private static String getEmail() {
        
        String content = "", email = null;
        
        try {
            
            File util = new File("src\\medicapp\\util.txt");
            FileReader fileReader = new FileReader(util);
            int c = 0;
            
            while( c != -1 ){
                c = fileReader.read();
                char letter = (char)c;
                content += letter;
            }
        
            Integer str = content.indexOf("email=") + 6;
            Integer end = content.indexOf("pass=");
            email = content.substring(str, end);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return email;
        
    }

    private static String getPassword() {
        
        String content = "", password = null;
        
        try {
            
            File util = new File("src\\medicapp\\util.txt");
            FileReader fileReader = new FileReader(util);
            int c = 0;
            
            while( c != -1 ){
                c = fileReader.read();
                char letter = (char)c;
                content += letter;
            }
            
            Integer str = content.indexOf("pass=") + 5;
            Integer end = content.indexOf("code");
            password = content.substring(str, end);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return password;
        
    }
    
    public static String getCode(){
        
        String content = "", code = null;
        
        try {
            
            File util = new File("src\\medicapp\\util.txt");
            FileReader fileReader = new FileReader(util);
            int c = 0;
            
            while( c != -1 ){
                c = fileReader.read();
                char letter = (char)c;
                content += letter;
            }
            
            Integer str = content.indexOf("code=") + 5;
            Integer end = content.length() - 1;
            code = content.substring(str,end);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return code;
    }

}
