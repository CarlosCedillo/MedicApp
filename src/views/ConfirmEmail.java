
/*
    This view is only created when a doctor ir registarted in the app
    Or when (he or she) try to login and the account is not activated

    call
        opn = Open
        rfh = Refresh
    
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
public class ConfirmEmail extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public ConfirmEmail() {/* Not sure what to put here >_< */ }

    public ConfirmEmail(String call, String userName, String email, String confirmationCode) {

        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);

        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/MedicApp_Logo_1.png"));
        Icon showLogo = new ImageIcon(logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(showLogo);

        this.setLocationRelativeTo(null);

        lblMessage.setForeground(Color.WHITE);
        lblCode.setForeground(Color.WHITE);

        lblMessage.setText("<HTML>Hola " + userName + ":<br>"
                + "Código de confirmación enviado a " + email + "</HTML>");

        // Helper to keep data
        hlplEmail.setText(email);
        hlpUsername.setText(userName);
        hlpCode.setText(confirmationCode);

        switch (call) {

            case "opn":
                Helper.consoleMessage("opnView", this.getClass().toString());
                printEmptyLine();
            break;

            case "rfh":
                Helper.consoleMessage("rfshView", this.getClass().toString());
                printEmptyLine();
            break;

            default:
                System.out.println(call + ": Not supported yet");
            break;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hlpUsername = new javax.swing.JTextField();
        hlplEmail = new javax.swing.JTextField();
        hlpCode = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnChangeEmail = new javax.swing.JButton();
        btnNewCode = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        hlpUsername.setText("jTextField1");

        hlplEmail.setText("jTextField2");

        hlpCode.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMessage.setText("Dínamico...");

        lblCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCode.setText("Código:");

        txtCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnChangeEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnChangeEmail.setText("Cambiar correo");
        btnChangeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeEmailActionPerformed(evt);
            }
        });

        btnNewCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNewCode.setText("Reenviar código");
        btnNewCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCodeActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChangeEmail)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewCode)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(lblCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 360, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeEmail)
                    .addComponent(btnNewCode)
                    .addComponent(btnConfirm))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeEmailActionPerformed

        UpdateEmail updateEmail = new UpdateEmail(hlpUsername.getText(), hlplEmail.getText(), this);
        updateEmail.setVisible(true);

    }//GEN-LAST:event_btnChangeEmailActionPerformed

    private void btnNewCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCodeActionPerformed

        try {

            // Create new confimation code
            String newConfirmationCode = Helper.createCode();

            // Send code to email
            Helper.sendEmail(3, hlpUsername.getText(), hlplEmail.getText(), newConfirmationCode);

            Helper.consoleMessage("sndCde", hlpUsername.getText(), hlplEmail.getText());
            printEmptyLine();
            Helper.userMessage("sndCde", hlpUsername.getText(), hlplEmail.getText());

            this.dispose();

            ConfirmEmail confirmEmail = new ConfirmEmail("rfh", hlpUsername.getText(), hlplEmail.getText(), newConfirmationCode);
            confirmEmail.setVisible(true);

        } catch (MessagingException | IOException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnNewCodeActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        // Check if the there is something in the field
        if (txtCode.getText().isEmpty() == false) {

            // Check if the code is the same
            if (txtCode.getText().equals(hlpCode.getText())) {

                DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();

                // Set confirmatedEmail = true and check it
                Helper.consoleMessage("cnfMsg", hlpUsername.getText());
                boolean confirmated = doctorDaoImpl.setconfirmedEmail(hlpUsername.getText());
                if (confirmated == true) {

                    Helper.consoleMessage("cnfChkOk", hlpUsername.getText());
                    printEmptyLine();
                    Helper.userMessage("cnfEmlOk");

                    Helper.consoleMessage("clsView", this.getClass().toString());
                    this.dispose();

                    Login login = new Login("opn");
                    login.setVisible(true);

                } else {
                    // If was not confirmet
                    Helper.consoleMessage("cnfChkNo", hlpUsername.getText());
                    printEmptyLine();
                    Helper.userMessage("cnfEmlNo");
                }

            } else {
                // If the code is not equal
                Helper.consoleMessage("cdeNte");
                printEmptyLine();
                Helper.userMessage("cdeNte");
            }

        } else {
            // If miss something
            Helper.consoleMessage("mssFld");
            printEmptyLine();
            Helper.userMessage("frmNo");
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

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
                new ConfirmEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeEmail;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnNewCode;
    private javax.swing.JTextField hlpCode;
    private javax.swing.JTextField hlpUsername;
    private javax.swing.JTextField hlplEmail;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables

    private void printEmptyLine() {
        System.out.println("");
    }

}
