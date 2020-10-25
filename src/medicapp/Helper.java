
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
        char[] chars = "1234567890".toCharArray();
        
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
    
    public static void sendEmail(Integer type, String userName, String doctorEmail, String activationCode) 
    throws MessagingException, IOException{
        
        Properties properties = new Properties();
        
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        
        Session session = Session.getDefaultInstance(properties);
        
        String email = getEmail();
        String password = getPassword();
        String subject = "";
        String content = "";
        
        switch( type ){
            
            case 1:
                subject = "Bienvenido a MedicApp";
                content = "Hola "+userName+"\n\n"
                        + "Este correo es para notificarle su dada de alta a la aplicación MedicApp, como último "
                        + "paso, por favor ingrese el siguiente código cuando se le pida para activar su cuenta: "
                        + "\n\n"+activationCode;
            break;
            
            case 2:
                subject = "Cambio de correo";
                content = "Hola "+userName+"\n\n"
                        + "Recientemente ha cambiado de correo electrónico, ahora este correo va a estar asociado a su "
                        + "cuenta medicApp, por favor ingrese el siguiente código en la aplicación para finalizar el proceso:"
                        + "\n\n"+activationCode;
            break;
            
            case 3:
                subject = "Nuevo código de activacion";
                content = "Hola "+userName+"\n\n"
                        + "Recientemente ha solicitado un nuevo código de activación para su cuenta MedicApp, favor de "
                        + "ingresarla en la aplicación para terminar este proceso:"
                        + "\n\n"+activationCode;
            break;
        
        }
        
        MimeMessage mail = new MimeMessage(session);
        
        try {
            
            mail.setFrom(new InternetAddress (email));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (doctorEmail));
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
      
    //  Here on are the messages to user
    
    public static void messageUser(String code){
        
        String messageUser = null;
        Integer type = null;
    
        switch( code ){
            
            case "FormNo":
                messageUser = "Formulario Incompleto";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "pssNM":
                messageUser = "Las contraseñas no son iguales";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "logNo":
                messageUser = "Usuario o contraseña incorrecto";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            case "acdNo":
                messageUser = "Código de activación incorrecto";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            case "mdfEmailNo":
                messageUser = "No se modifico el correo";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+messageUser+"</h2></HTML>", "Mensaje", type);
    
    }
    
    public static void messageUser(String code, String string){
        
        String messageUser = null;
        Integer type = null;
    
        switch( code ){
            
            case "usrOk":
                messageUser = "El usuario "+string+" ya esta registrado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "emlOk":
                messageUser = "El correo "+string+" ya esta registrado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "usrNo":
                messageUser = "El usuario "+string+" no se guardo";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            case "actOK":
                messageUser = "Cuenta de "+string+" activada correctamente";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "actNo":
                messageUser = "Cuenta de "+string+" no se activo";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+messageUser+"</h2></HTML>", "Mensaje", type);
    
    }
    
    public static void messageUser(String code, String userName, String email){
        
        String messageUser = null;
        Integer type = null;
    
        switch( code ){
            
            case "ctrUsrOk":
                messageUser = "Usuario "+userName+" creado exitosamente, correo enviado a "+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "mdfEml":
                messageUser = "Correo de "+userName+" cambiado a "+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "nvoCdg":
                messageUser = "Código de activacion de "+userName+" enviado a "+email ;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+messageUser+"</h2></HTML>", "Mensaje", type);
    
    }
    
    //  Here on are the messages to consol
    
    public static void messegeConsol(String code){
        
        String message = null;
        
        switch( code ){
            
            case "FormNo":
                message = "Form incomplete";
            break;
            
            case "pssNM":
                message = "Passwords not match";
            break;
            
        }
        
        System.out.println( message );
        
    }
    
    public static void messegeConsol(String code, String string){
        
        String message = null;
        
        switch( code ){
            
            // Views
            
            case "viwOpn":
                message = "---- Now is visible: "+string+" ----";
            break;
            
            case "viwCls":
                message = "---- Now is closing: "+string+" ----";
            break;
            
            // Login
            
            case "logChk":
                message = "Cheking login: "+string;
            break;
            
            case "logOk":
                message = string+" login: Success";
            break;
            
            case "logNo":
                message = string+" login: failed";
            break;
            
            // Singup
            
            case "usrChk":
                message = "Searching user: "+string;
            break;
    
            case "usrOk":
                message = "User "+string+": Founded";
            break;
            
            case "usrNo":
                message = "User "+string+": Not founded";
            break;
            
            case "usrCrt":
                message = "Creating user: "+string;
            break;
            
            case "usrCrtOk":
                message = string+" create: Success";
            break;
            
            case "usrCrtNo":
                message = string+" create: Fail";
            break;
            
            case "emlChk":
                message = "Searching email: "+string;
            break;
            
            case "emlOk":
                message = "Email "+string+": Found";
            break;
            
            case "emlNo":
                message = "Email "+string+": Not found";
            break;
            
            // Activate
            
            case "getEmail":
                message = "User "+string+": Getting email";
            break;
            
            case "acoChk":
                message = "Checking activated account: "+string;
            break;
            
            case "acoOk":
                message = string+" account: Activated";
            break;
            
            case "acoNo":
                message = string+" account: Not activated";
            break;
            
        }
        
        System.out.println( message );
        
    }
    
    public static void messegeConsol(String code, String userName, String email){
        
        String message = null;
        
        switch( code ){
            
            case "sndActCde":
                message = "User "+userName+": sending activation code to "+email+"";
            break;
            
        }
        
        System.out.println( message );
        
    }

}
