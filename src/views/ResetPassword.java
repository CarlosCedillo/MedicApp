
/*  
    This subview is just to reset the password, called by the sub view forgott password (Only)

    Call
        opn = Open
        rfh = Refresh
 */

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
public class ResetPassword extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public ResetPassword() {/* Not sure what to put here >_< */ }
    
    Login helpLogin;

    public ResetPassword (String call, String userName, String email, String code) {

        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);

        this.setLocationRelativeTo(null);

        lblMesssge.setText("<HTML>Cambio de contraseña de " + userName + "<br>"
                + "Código enviado a " + email + "</HTML>");

        // Helpers
        helpUsername.setText(userName);
        helpEmail.setText(email);
        helpCode.setText(code);

        switch (call) {

            case "opn":
                Helper.consoleMessage("opnSvw", this.getClass().toString());
            break;

            case "rfh":
                Helper.consoleMessage("rfshView", this.getClass().toString());
            break;

            default:
                System.out.println(call + ": Not supported yet");
            break;

        }        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpUsername = new javax.swing.JTextField();
        helpEmail = new javax.swing.JTextField();
        helpCode = new javax.swing.JTextField();
        pnlLogin = new javax.swing.JPanel();
        lblPassword2 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        btnUpdatePassword = new javax.swing.JButton();
        btnResentCode = new javax.swing.JButton();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        lblMesssge = new javax.swing.JLabel();

        helpUsername.setText("jTextField1");

        helpEmail.setText("jTextField2");

        helpCode.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        lblPassword2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword2.setText("Repetir contraseña:");

        txtPassword2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnUpdatePassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnUpdatePassword.setText("Cambiar contraseña");
        btnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordActionPerformed(evt);
            }
        });

        btnResentCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnResentCode.setText("Reenviar código");
        btnResentCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResentCodeActionPerformed(evt);
            }
        });

        lblCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("Código");

        txtCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblPassword1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword1.setText("Nueva contraseña");

        txtPassword1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMesssge.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMesssge.setForeground(new java.awt.Color(255, 255, 255));
        lblMesssge.setText("Variable...");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMesssge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLoginLayout.createSequentialGroup()
                        .addGap(0, 241, Short.MAX_VALUE)
                        .addComponent(btnResentCode)
                        .addGap(15, 15, 15)
                        .addComponent(btnUpdatePassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPassword2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(lblPassword1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCode)
                            .addComponent(txtPassword1)
                            .addComponent(txtPassword2))))
                .addGap(30, 30, 30))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblMesssge, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePassword)
                    .addComponent(btnResentCode))
                .addGap(30, 30, 30))
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
    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordActionPerformed

        // Check form 
        if (txtPassword1.getText().isEmpty() == false && txtPassword2.getText().isEmpty() == false
                && txtCode.getText().isEmpty() == false) {

            // Check passwords match
            if( txtPassword1.getText().equals(txtPassword2.getText()) ){
                
                // Check code
                if( txtCode.getText().equals(helpCode.getText()) ){
                    
                    DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
                    String encryptedPassword = Helper.encrypt(txtPassword1.getText());
                    
                    // Update password
                    Helper.consoleMessage("rstPss", helpUsername.getText());
                    boolean resetted = doctorDaoImpl.resetPassword(helpUsername.getText(), encryptedPassword);
                    if( resetted == true ){
                        
                        Helper.consoleMessage("rstPssOk", helpUsername.getText());
                        Helper.userMessage("rstPssOk");
                        Helper.consoleMessage("clsSvw", this.getClass().toString());
                        printEmptyLine();
                        
                        this.dispose();
                        
                        Login login = new Login("rfs");
                        login.setVisible(true);
                        
                    }else{
                        // If password not resetted
                        Helper.consoleMessage("rstPssNo", helpUsername.getText());
                        printEmptyLine();
                        Helper.userMessage("rstPssNo");
                    }
                    
                }else{
                    // If code not same
                    Helper.consoleMessage("cdeNte");
                    printEmptyLine();
                    Helper.userMessage("cdeNte");
                }
                
            }else{
                // If passwords not match
                Helper.consoleMessage("pssNtm");
                printEmptyLine();
                Helper.userMessage("pssNm");
            }

        } else {
            // If form incomplete
            Helper.consoleMessage("mssFld");
            printEmptyLine();
            Helper.userMessage("frmNo");
        }

    }//GEN-LAST:event_btnUpdatePasswordActionPerformed

    private void btnResentCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResentCodeActionPerformed

        String username = helpUsername.getText();
        String email = helpEmail.getText();
        
        try {

            // Create new code
            String newCode = Helper.createCode();

            //Seng code
            Helper.sendEmail(4, username, email, newCode);

            Helper.consoleMessage("rstPss", username, email);
            printEmptyLine();
            Helper.userMessage("rstPss", username, email);

            this.dispose();

            ResetPassword resetPassword = new ResetPassword("rfh", username, email, newCode);
            resetPassword.setVisible(true);

        } catch (MessagingException | IOException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnResentCodeActionPerformed

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
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResentCode;
    private javax.swing.JButton btnUpdatePassword;
    private javax.swing.JTextField helpCode;
    private javax.swing.JTextField helpEmail;
    private javax.swing.JTextField helpUsername;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblMesssge;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCode;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    // End of variables declaration//GEN-END:variables

    private void printEmptyLine() {
        System.out.println("");
    }

}
