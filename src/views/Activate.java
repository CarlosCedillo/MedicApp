/*
    This view is only created when a doctor ir registarted in the app
    Or when (he or she) try to login and the account is not activated
*/
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
public class Activate extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Index
     */
    public Activate() {
        // Not sure what to put here >_<
    }

    public Activate(String userName, String email, String activationCode) {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/MedicApp_Logo_1.png"));
        Icon showLogo = new ImageIcon(logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(showLogo);
        
        this.setLocationRelativeTo(null);
        
        lblUsername.setForeground(Color.WHITE);
        lblPassword.setForeground(Color.WHITE);
        lblCode.setForeground(Color.WHITE);
        
        lblMessage.setForeground(Color.WHITE);
        lblMessage.setText("Código de activación mandado a: "+email);
        
        txtHelpEmail.setText(email);
        txtHelpUsername.setText(userName);
        txtHelpCode.setText(activationCode);
        
        Helper.messegeConsol("vieOpn", this.getClass().toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHelpCode = new javax.swing.JTextField();
        txtHelpEmail = new javax.swing.JTextField();
        txtHelpUsername = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        brtActivate = new javax.swing.JButton();
        btnNewCode = new javax.swing.JButton();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        brnNewEmail = new javax.swing.JButton();

        txtHelpCode.setText("jTextField1");

        txtHelpEmail.setText("jTextField2");

        txtHelpUsername.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        lblUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUsername.setText("Nombre de usuario");

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword.setText("Contraseña");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        brtActivate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        brtActivate.setText("Activar cuenta");
        brtActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtActivateActionPerformed(evt);
            }
        });

        btnNewCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNewCode.setText("Nuevo código");
        btnNewCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCodeActionPerformed(evt);
            }
        });

        lblCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCode.setText("Código");

        txtCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage.setText("texto dinamico... cambia depende del correo");

        brnNewEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        brnNewEmail.setText("Cambiar correo");
        brnNewEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnNewEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(brnNewEmail)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(btnNewCode)
                                .addGap(15, 15, 15)
                                .addComponent(brtActivate))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblMessage)
                .addGap(18, 18, 18)
                .addComponent(brnNewEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brtActivate)
                    .addComponent(btnNewCode))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void brtActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtActivateActionPerformed
        
        // Chech that the form is filled in
        if( txtUsername.getText().isEmpty() != true && txtPassword.getText().isEmpty() != true 
                && txtCode.getText().isEmpty() != true ){
            
            // Check login
            DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
            String encryptedPassword = Helper.encrypt(Helper.getCode(), txtPassword.getText());
            boolean logined = doctorDaoImpl.login(txtUsername.getText(), encryptedPassword);
            if( logined == true ){
                
                // Check if the code match
                if( txtCode.getText().equals(txtHelpCode.getText()) == true ){
                    
                    
                    //Activate account
                    boolean activated = doctorDaoImpl.activate( txtUsername.getText() );
                    if( activated == true ){
                        
                        this.dispose();
                        Helper.messegeConsol("vieCls", this.getClass().toString());
                        
                        // Show wlcome view (The main view of the app)
                        Welcome welcome = new Welcome();
                        welcome.setVisible(true);
                        
                    }else{
                        // If the activation fails
                    }
                    
                }else{
                    // If the code does not match
                }
                
            }else{
                // If login fail
            }
            
        }else{
            // If the form is missing some field
        }
        
    }//GEN-LAST:event_brtActivateActionPerformed

    private void btnNewCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCodeActionPerformed
        
        try {
            
            String newActivationCode = Helper.createCode(6);
            Helper.sendEmail(3, txtHelpUsername.getText(), txtHelpEmail.getText(), newActivationCode);
            Helper.messageUser("1c", txtHelpUsername.getText(), txtHelpEmail.getText());
            this.dispose();
            
            Activate activate = new Activate(txtHelpUsername.getText(), txtHelpEmail.getText(), newActivationCode);
            activate.setVisible(true);
            
        } catch (MessagingException | IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnNewCodeActionPerformed

    private void brnNewEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnNewEmailActionPerformed
        
        NewEmail newEmail = new NewEmail( txtHelpUsername.getText(), txtHelpEmail.getText(), txtHelpCode.getText() );
        newEmail.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_brnNewEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Activate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnNewEmail;
    private javax.swing.JButton brtActivate;
    private javax.swing.JButton btnNewCode;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtHelpCode;
    private javax.swing.JTextField txtHelpEmail;
    private javax.swing.JTextField txtHelpUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
