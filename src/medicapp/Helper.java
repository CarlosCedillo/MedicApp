
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
    
    public static String createCode(){
        String securityKey;
        
        // Estos son los caracteres que se puden usar
        char[] chars = "1234567890".toCharArray();
        
        StringBuilder createdString = new StringBuilder(5);
        Random random = new Random();
        
        // Aqui se genera la palabra de 10 caracteres
        for( int i = 0 ; i < 6 ; i++ ){
            
            char c = chars[random.nextInt(chars.length)];
            createdString.append(c);
            
        }
        
        securityKey = createdString.toString();
        
        return securityKey;
    }
    
    public static String encrypt(String text) {
        
        String textEncrypted = null;
        
        try {
            
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            
            byte[] llavePassword = md5.digest(Helper.getCode().getBytes("utf-8"));
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
    
    public static String uncrypt(String text){
        
        String textUnencrypted = null;
        
        try {
            byte[] message = Base64.decodeBase64(text.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(Helper.getCode().getBytes("utf-8"));
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
                        + "Este correo es para notificarle que se ha dado de alta en la aplicación MedicApp, para \n"
                        + "finalizar el proceso ingrese el siguiente código cuando se le solicite:"
                        + "\n\n"+activationCode;
            break;
            
            case 2:
                subject = "Cambio de correo";
                content = "Hola "+userName+"\n\n"
                        + "Este correo es para notificarle que recientemente a solicitado un cambio de correo, para \n"
                        + "terminar la acción, ingrese el siguiente código y el nuevo correo en la ventana de la aplicación:"
                        + "\n\n"+activationCode;
            break;
            
            case 3:
                subject = "Nuevo código";
                content = "Hola "+userName+"\n\n"
                        + "Este correo es para proporcionarle un nuevo código de confirmación a su cuenta \n"
                        + " MedicApp, por favor ingrésela cuando se le solicite:"
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
    
    private static String getCode(){
        
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
    
    public static void userMessage(String code){
        
        String userMessage = null;
        Integer type = null;
    
        switch( code ){
            
            // Form incomplete
            
            case "frmNo":
                userMessage = "Formulario incompleto";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Paswwords not match
            
            case "pssNm":
                userMessage = "Las contraseñas con coinciden";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // User not found
            
            case "usrNtf":
                userMessage = "El usuario no existe";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Login fail
            
            case "usrLogNo":
                userMessage = "Contraseña incorrecta";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Code not equal
            
            case "cdeNte":
                userMessage = "Código incorrecto";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            // Confirm email
            
            case "cnfEmlOk":
                userMessage = "Correo confirmado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            case "cnfEmlNo":
                userMessage = "El correo no se pudo confirmar";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            // Same email (Update email)
            
            case "smeEml":
                userMessage = "Ese correo ya lo estas usando";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            // Update email
            
            case "updEmlNo":
                userMessage = "No se actualizo el correo";
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            // Default
            
            default: 
                userMessage = "Código no asignado";
                type = JOptionPane.WARNING_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+userMessage+"</h2></HTML>", "Mensaje", type);
    
    }
    
    public static void userMessage(String code, String string){
        
        String userMessage = null;
        Integer type = null;
    
        switch( code ){
            
            // User not created
            
            case "usrCrtNo": 
                userMessage = "No se pudo registrar al usuario "+string;
                type = JOptionPane.ERROR_MESSAGE;
            break;
            
            // User exist in DB
            
            case "usrSchOk": 
                userMessage = "El usuario "+string+" ya esta registrado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Email exist in DB
            
            case "emlSchOk": 
                userMessage = "El correo "+string+" ya esta registrado";
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Default
            
            default: 
                userMessage = "Código no asignado";
                type = JOptionPane.WARNING_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+userMessage+"</h2></HTML>", "Mensaje", type);
    
    }
    
    public static void userMessage(String code, String username, String email){
        
        String userMessage = null;
        Integer type = null;
    
        switch( code ){
            
            // Send code to email
            
            case "sndCde":
                userMessage = "Código de confirmación de "+username+" mandado a <br>"+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Singup
            
            case "usrCrtOk":
                userMessage = "Usuario "+username+" registrado con éxito <br>Código mandado a "+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Update email
            
            case "updEmlOk":
                userMessage = "Correo de "+username+" actualizado correctamente <br>Código mandado a "+email;
                type = JOptionPane.INFORMATION_MESSAGE;
            break;
            
            // Default
            
            default: 
                userMessage = "Código no asignado";
                type = JOptionPane.WARNING_MESSAGE;
            break;
            
        }
        
        JOptionPane.showMessageDialog(null, "<HTML><h2>"+userMessage+"</h2></HTML>", "Mensaje", type);
    
    }
    
    public static void consoleMessage(String code){
    
        String consoleMessage = null;
        
        switch( code ){
            
            // Forom incomplete
            
            case "mssFld":
                consoleMessage = "Message: Form incomplete";
            break;
            
            // Password not match
            
            case "pssNtm":
                consoleMessage = "Message: Passwords not match";
            break;
            
            // Code not equal
            
            case "cdeNte":
                consoleMessage = "Message: Wrong code";
            break;
            
            // Same email (change email)
            
            case "smeEml":
                consoleMessage = "Message: Both emails are the same";
            break;
            
            // Default
            
            default:
                consoleMessage = "Message not setted";
            break;
            
        }
        
        System.out.println(consoleMessage);
    
    }
    
    public static void consoleMessage(String code, String string){
    
        String consoleMessage = null;
        
        switch( code ){
            
            // Common to all views
            
            case "opnView":
                consoleMessage = "---- Opening "+string+" ----";
            break;
            
            case "clsView":
                consoleMessage = "---- Cloing "+string+" ----";
            break;
            
            // Refresh view
            
            case "rfshView":
                consoleMessage = "Refreshing "+string;
            break;
            
            // Sub views
            
            case "opnSvw":
                consoleMessage = "Opening: "+string;
            break;
            
            case "clsSvw":
                consoleMessage = "Closing: "+string;
            break;
            
            // Login
            
            case "lgnChk":
                consoleMessage = "Checking login: "+string;
            break;
            
            case "lgnChkOk":
                consoleMessage = "User "+string+": Login successfully";
            break;
            
            case "lgnChkNo":
                consoleMessage = "User "+string+": Login failed";
            break;
            
            // Confirmed email
            
            case "cnfChk":
                consoleMessage = "Checkink confirmed email: "+string;
            break;
            
            case "cnfMsg":
                consoleMessage = "User "+string+": Confirming email";
            break;
            
            case "cnfChkOk":
                consoleMessage = "User "+string+": Email confirmed";
            break;
            
            case "cnfChkNo":
                consoleMessage = "User "+string+": Email not confirmed";
            break;
            
            // Search user in DB
            
            case "usrSch":
                consoleMessage = "Searching user: "+string;
            break;
            
            case "usrSchOk":
                consoleMessage = "User "+string+": Found it";
            break;
            
            case "usrSchNo":
                consoleMessage = "User "+string+": Not found";
            break;
            
            // Search email in DB
            
            case "emlSch":
                consoleMessage = "Searching email: "+string;
            break;
            
            case "emlSchOk":
                consoleMessage = "Email "+string+": Found it";
            break;
            
            case "emlSchNo":
                consoleMessage = "Email "+string+": Not found";
            break;
            
            // Get email
            
            case "getEml":
                consoleMessage = "User "+string+": Getting email";
            break;
            
            // Create user
            
            case "usrCrt":
                consoleMessage = "Creating user: "+string;
            break;
            
            case "usrCrtOk":
                consoleMessage = "User "+string+": Created successfully";
            break;
            
            case "usrCrtNo":
                consoleMessage = "User "+string+": Not created";
            break;
            
            // Update email
            
            case "updEmlOk":
                consoleMessage = "User "+string+": Email updated successfully";
            break;
            
            case "updEmlNo":
                consoleMessage = "User "+string+": Email not updated";
            break;
            
            // Default
            
            default:
                consoleMessage = "Message not setted";
            break;
            
        }
        
        System.out.println(consoleMessage);
    
    }
    
    public static void consoleMessage(String code, String username, String email){
    
        String consoleMessage = null;
        
        switch( code ){
            
            case "usrCrtOk":
                consoleMessage = "User "+username+": Confirmation code send to "+email;
            break;
            
            case "sndCde":
                consoleMessage = "User "+username+": Sendig new code to "+email;
            break;
            
            // Update email
            
            case "updEml":
                consoleMessage = "User "+username+": Updating email to "+email;
            break;
            
            // Default
            
            default:
                consoleMessage = "Message not setted";
            break;
            
        }
        
        System.out.println(consoleMessage);
        
    }
    
}