package views;

import dao.impls.DoctorDaoImpl;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import medicapp.Helper;

/**
 * @author Cageceal
 */
public class UpdateEmail extends javax.swing.JFrame {
    
    ConfirmEmail help;

    private static final long serialVersionUID = 1L;
    public UpdateEmail() { /* Not sure what to put here >_< */ }
    UpdateEmail(String username, String email, ConfirmEmail confirmEmail) {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);
        
        this.setLocationRelativeTo(null);
        
        lblMessage.setForeground(Color.WHITE);
        lblPassword.setForeground(Color.WHITE);
        lblNewEmail.setForeground(Color.WHITE);
        
        lblMessage.setText("Cambiar correo electrónico de "+username+":");
        
        // Helpers to keep data
        txtUsername.setText(username);
        txtOldEmail.setText(email);
        help = confirmEmail;
        
        Helper.consoleMessage("opnSvw", this.getClass().toString());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtOldEmail = new javax.swing.JTextField();
        pnlLogin = new javax.swing.JPanel();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblMessage = new javax.swing.JLabel();
        lblNewEmail = new javax.swing.JLabel();
        txtNewEmail = new javax.swing.JTextField();

        txtUsername.setText("jTextField1");

        txtOldEmail.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        btnChange.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnChange.setText("Cambiar");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword.setText("Contraseña:");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage.setText("Dinámico...");

        lblNewEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNewEmail.setText("Correo electrónico nuevo:");

        txtNewEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNewEmail)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(0, 114, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword))
                        .addGap(40, 40, 40))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblMessage)
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnCancel))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        
        // check the form is filled in
        if( txtPassword.getText().isEmpty() == false && txtNewEmail.getText().isEmpty() == false ){
            
            // Check emails are not the same
            if( !txtNewEmail.getText().equals(txtOldEmail.getText()) ){
                
                DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
                
                // Check if the new email exist in DB
                Helper.consoleMessage("emlSch", txtNewEmail.getText());
                boolean existEmail = doctorDaoImpl.existEmail( txtNewEmail.getText() );
                if( existEmail == false ){
                    
                    Helper.consoleMessage("emlSchNo", txtNewEmail.getText());
                    String encryptedEmail = Helper.encrypt(txtNewEmail.getText());
                    
                    // Chage OldEmail to NewEmail
                    Helper.consoleMessage("updEml", txtUsername.getText(), txtNewEmail.getText());
                    boolean updated = doctorDaoImpl.updateEmail( txtUsername.getText(), encryptedEmail);
                    if( updated == true ){
                        
                        try {
                            
                            // Send new code
                            String newCode = Helper.createCode();
                            Helper.sendEmail(2, txtUsername.getText(), txtNewEmail.getText(), newCode);
                            
                            Helper.consoleMessage("updEmlOk", txtUsername.getText());
                            Helper.userMessage("updEmlOk", txtUsername.getText(), txtNewEmail.getText());
                            Helper.consoleMessage("clsSvw", this.getClass().toString());
                            printEmptyLine();
                            
                            this.dispose();
                            help.dispose();
                            
                            ConfirmEmail confirmEmail = new 
                                ConfirmEmail("subView", txtUsername.getText(), txtNewEmail.getText(), newCode);
                            confirmEmail.setVisible(true);
                            
                        } catch (MessagingException | IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        
                    }else{
                        // If email not updated
                        Helper.consoleMessage("updEmlNo", txtUsername.getText());
                        printEmptyLine();
                        Helper.userMessage("updEmlNo");
                    }
                    
                }else{
                    // If the emails exist
                    Helper.consoleMessage("emlSchOk", txtNewEmail.getText());
                    printEmptyLine();
                    Helper.userMessage("emlSchOk", txtNewEmail.getText());
                }
                
            }else{
                // If the emails are the same
                Helper.consoleMessage("smeEml");
                printEmptyLine();
                Helper.userMessage("smeEml");
            }
            
        }else{
            // If something miss
            Helper.consoleMessage("mssFld");
            printEmptyLine();
            Helper.userMessage("frmNo");
        }
        
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        Helper.consoleMessage("clsSvw", this.getClass().toString());
        printEmptyLine();
        this.dispose();
        
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | 
                 IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblNewEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtOldEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void printEmptyLine() {
        System.out.println("");
    }
    
}
