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
public class NewEmail extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Index
     */
    public NewEmail() {
        // Not sure what to put here >_<
    }

    NewEmail(String userName, String email, String activationCode) {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);
        
        this.setLocationRelativeTo(null);
        
        lblNewEmail.setForeground(Color.WHITE);
        lblMessage.setForeground(Color.WHITE);
        
        lblMessage2.setForeground(Color.WHITE);
        lblMessage2.setText("Al cambiar de correo se enviara un nuevo código de activación");
        
        lblMessage.setText("Nuevo correo de "+userName);
        
        //Helpers to keep data
        txtUserName.setText(userName);
        txtOldEmail.setText(email);
        txtCode.setText(activationCode);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        txtOldEmail = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        pnlLogin = new javax.swing.JPanel();
        lblNewEmail = new javax.swing.JLabel();
        txtNewEmail = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();

        txtUserName.setText("jTextField1");

        txtOldEmail.setText("jTextField1");

        txtCode.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        lblNewEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNewEmail.setText("Correo electrónico");

        txtNewEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

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

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage.setText("jLabel1");

        lblMessage2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage2.setText("jLabel1");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage2)
                    .addComponent(lblMessage)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addGap(16, 16, 16)
                                .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                            .addComponent(txtNewEmail))))
                .addGap(40, 40, 40))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
         //Check if the emails are different
        if( txtNewEmail.getText().equals(txtOldEmail.getText()) == false ){
        
            // Check if email is on the DB (encrypted)
            DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
            String encryptedNewEmail = Helper.encrypt(Helper.getCode(), txtNewEmail.getText());
            boolean checkNewEmail = doctorDaoImpl.existEmail(encryptedNewEmail);
            if( checkNewEmail == false ){
                
                
                // Update email
                boolean updated = doctorDaoImpl.updateEmail(txtUserName.getText(), encryptedNewEmail);
                if( updated == true ){
                    
                    try {
                        
                        // Create a new activation code
                        String newActivationCode = Helper.createCode(6);
                        
                        // Send email: change email
                        Helper.sendEmail(2, txtUserName.getText(), txtNewEmail.getText(), newActivationCode);
                        this.dispose();
                        
                        //Show the activation View with the new data
                        Activate activate = new Activate(txtUserName.getText(), txtNewEmail.getText(), newActivationCode);
                        activate.setVisible(true);
                        
                    } catch (MessagingException | IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }else{
                    // If the email was not update
                }
                
            }else{
                // If the email exist
            }
            
        }else{
            // If the emails are the same
        }
        
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        Activate activate = new Activate(txtUserName.getText(), txtOldEmail.getText(), txtCode.getText());
        activate.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(NewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblNewEmail;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtOldEmail;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}