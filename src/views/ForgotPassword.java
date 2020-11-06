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
public class ForgotPassword extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    
    public ForgotPassword() {/* Not sure what to put here >_< */}
    
    Login helperLogin;

    public ForgotPassword( Login login ) {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);

        this.setLocationRelativeTo(null);

        lblMessage.setForeground(Color.WHITE);
        lblEmail.setForeground(Color.WHITE);

        Helper.consoleMessage("opnSvw", this.getClass().toString());
        helperLogin = login;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        btnChange = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        btnChange.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnChange.setText("Continuar");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage.setText("Cambiar contraseña");

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setText("Correo electrónico:");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

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
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(0, 92, Short.MAX_VALUE)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail))
                        .addGap(40, 40, 40))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblMessage)
                .addGap(30, 30, 30)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnReturn))
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

        // Check form is complete
        if (txtEmail.getText().isEmpty() == false) {

            DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
            String encryptEmail = Helper.encrypt(txtEmail.getText());

            // Check the mail existe in DB
            Helper.consoleMessage("emlSch", txtEmail.getText());
            boolean existEmail = doctorDaoImpl.existEmail(encryptEmail);
            if (existEmail == true) {
                
                Helper.consoleMessage("emlSchOk", txtEmail.getText());

                // Get username from the email
                Helper.consoleMessage("getUsr");
                String username = doctorDaoImpl.getUsername(encryptEmail);

                // Create code
                String code = Helper.createCode();

                try {

                    // Send code to email
                    Helper.sendEmail(4, username, txtEmail.getText(), code);

                    Helper.consoleMessage("rstPss", username, txtEmail.getText());
                    Helper.userMessage("rstPss", username, txtEmail.getText());
                    Helper.consoleMessage("clsSvw", this.getClass().toString());
                    printEmptyLine();
                    
                    this.dispose();
                    helperLogin.dispose();

                    ResetPassword resetPassword = new ResetPassword("opn", username, txtEmail.getText(), code);
                    resetPassword.setVisible(true);

                } catch (MessagingException | IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } else {
                // If email does not exist
                Helper.consoleMessage("emlSchNo", txtEmail.getText());
                Helper.userMessage("emlSchNo", txtEmail.getText());
            }

        } else {
            // Form incomplete
            Helper.consoleMessage("mssFld");
            Helper.userMessage("frmNo");
        }

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed

        Helper.consoleMessage("clsSvw", this.getClass().toString());
        printEmptyLine();
        this.dispose();

    }//GEN-LAST:event_btnReturnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void printEmptyLine() {
        System.out.println("");
    }

}
