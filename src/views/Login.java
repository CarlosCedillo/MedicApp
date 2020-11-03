package views;

import dao.impls.DoctorDaoImpl;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import medicapp.Helper;

/**
 * @author Cageceal
 */
public class Login extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    public Login() {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/MedicApp_Logo_1.png"));
        Icon showLogo = new ImageIcon(logo.getImage().getScaledInstance
            (lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(showLogo);
        
        this.setLocationRelativeTo(null);
        
        lblUsername.setForeground(Color.WHITE);
        lblPassword.setForeground(Color.WHITE);
        
        Helper.consoleMessage("opnView", this.getClass().toString());
        printEmptyLine();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSingup = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        lblUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUsername.setText("Nombre de usuario");

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword.setText("Contraseña");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSingup.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSingup.setText("Registrarse");
        btnSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingupActionPerformed(evt);
            }
        });

        btnForgotPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnForgotPassword.setText("Olvide mi contraseña");
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword)
                    .addComponent(txtUsername))
                .addGap(47, 47, 47))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(btnSingup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForgotPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSingup)
                    .addComponent(btnForgotPassword))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed
        
        Helper.consoleMessage("clsView", this.getClass().toString());
        Singup singup = new Singup();
        this.dispose();
        singup.setVisible(true);
        
    }//GEN-LAST:event_btnSingupActionPerformed

    @SuppressWarnings("deprecation")
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        // Check all fields are filled
        if( txtUsername.getText().isEmpty() == false && txtPassword.getText().isEmpty() == false ){
            
            DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
            
            // Check that user exist in Db
            Helper.consoleMessage("usrSch", txtUsername.getText());
            boolean userExist = doctorDaoImpl.existUsername(txtUsername.getText());
            if( userExist == true ){
                
                Helper.consoleMessage("usrSchOk", txtUsername.getText());
            
                // Check login
                String encryptedPassword = Helper.encrypt(txtPassword.getText());
                Helper.consoleMessage("lgnChk", txtUsername.getText());
                boolean loggedin = doctorDaoImpl.login(txtUsername.getText(), encryptedPassword);
                if( loggedin == true ){

                    Helper.consoleMessage("lgnChkOk", txtUsername.getText());

                    // Check confirmed Email
                    Helper.consoleMessage("cnfChk", txtUsername.getText());
                    boolean activated = doctorDaoImpl.getconfirmedEmail(txtUsername.getText());
                    if( activated == true ){

                        Helper.consoleMessage("cnfChkOk", txtUsername.getText());
                        printEmptyLine();
                        Helper.consoleMessage("clsView", this.getClass().toString());
                        this.dispose();

                        Welcome welcome = new Welcome();
                        welcome.setVisible(true);

                    }else{

                        Helper.consoleMessage("cnfChkNo", txtUsername.getText());

                        try {

                            // Get email (encrypted and unencrypt) of username
                            Helper.consoleMessage("getEml", txtUsername.getText());
                            String encryptedEmail = doctorDaoImpl.getEmail(txtUsername.getText());
                            String doctorEmail = Helper.uncrypt(encryptedEmail);

                            // Create a new code
                            String confirmationCode = Helper.createCode();

                            // Send the confirmation code to email
                            Helper.consoleMessage("sndCde", txtUsername.getText(), doctorEmail);
                            Helper.userMessage("sndCde", txtUsername.getText(), doctorEmail);
                            Helper.sendEmail(3, txtUsername.getText(), doctorEmail, confirmationCode);
                            printEmptyLine();
                            Helper.consoleMessage("clsView", this.getClass().toString());
                            this.dispose();

                            // Show activate view
                            ConfirmEmail activate = new ConfirmEmail(txtUsername.getText(), doctorEmail, confirmationCode);
                            activate.setVisible(true);

                        } catch (MessagingException | IOException ex) {
                            System.out.println(ex.getMessage());
                        }

                    }

                }else{
                    // If login fail
                    Helper.consoleMessage("lgnChkNo", txtUsername.getText());
                    printEmptyLine();
                    Helper.userMessage("usrLogNo");
                }
                
            }else{
                // If the user dont exist in DB
                Helper.consoleMessage("usrSchNo", txtUsername.getText());
                printEmptyLine();
                Helper.userMessage("usrNtf");
            }
            
        }else{
            // If some field is missing
            Helper.consoleMessage("mssFld");
            printEmptyLine();
            Helper.userMessage("frmNo");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
        
        Helper.consoleMessage("clsView", this.getClass().toString());
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSingup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void printEmptyLine() {
        System.out.println("");
    }
    
}
