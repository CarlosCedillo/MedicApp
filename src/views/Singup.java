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
public class Singup extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Index
     */
    public Singup() {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //pnlAccount.setBackground(Color.black);
        
        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/MedicApp_Logo_1.png"));
        Icon showLogo = new ImageIcon(logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(showLogo);
        
        this.setLocationRelativeTo(null);
        
        System.out.println("Now is visible "+this.getClass());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSex = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        pnlAccount = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        lblPass2 = new javax.swing.JLabel();
        pnlAccount2 = new javax.swing.JPanel();
        lblUser2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastname1 = new javax.swing.JTextField();
        lblEmail3 = new javax.swing.JLabel();
        lblEmail4 = new javax.swing.JLabel();
        txtLastname2 = new javax.swing.JTextField();
        lblEmail5 = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        btnGoBack = new javax.swing.JButton();
        btnSingup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBackground(new java.awt.Color(37, 73, 138));

        pnlAccount.setBackground(new java.awt.Color(37, 73, 138));
        pnlAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Nombre de usuario");

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Correo electrónico");

        lblPass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña");

        txtPassword1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPassword2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblPass2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPass2.setForeground(new java.awt.Color(255, 255, 255));
        lblPass2.setText("Confirmar contraseña");

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword1)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );
        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAccount2.setBackground(new java.awt.Color(37, 73, 138));
        pnlAccount2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Información Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblUser2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(255, 255, 255));
        lblUser2.setText("Nombre");

        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtLastname1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmail3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail3.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail3.setText("Apellido 1");

        lblEmail4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail4.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail4.setText("Apellido 2");

        txtLastname2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmail5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail5.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail5.setText("Sexo:");

        rbtnMale.setBackground(new java.awt.Color(37, 73, 138));
        buttonGroupSex.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtnMale.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMale.setText("Masculino");

        rbtnFemale.setBackground(new java.awt.Color(37, 73, 138));
        buttonGroupSex.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbtnFemale.setText("Femenino");

        javax.swing.GroupLayout pnlAccount2Layout = new javax.swing.GroupLayout(pnlAccount2);
        pnlAccount2.setLayout(pnlAccount2Layout);
        pnlAccount2Layout.setHorizontalGroup(
            pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccount2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEmail3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail4, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(lblEmail5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAccount2Layout.createSequentialGroup()
                        .addComponent(rbtnMale)
                        .addGap(12, 12, 12)
                        .addComponent(rbtnFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtLastname1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastname2))
                .addGap(15, 15, 15))
        );
        pnlAccount2Layout.setVerticalGroup(
            pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccount2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail3)
                    .addComponent(txtLastname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail4)
                    .addComponent(txtLastname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlAccount2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail5)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnGoBack.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGoBack.setText("Regresar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        btnSingup.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSingup.setText("Registrarse");
        btnSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAccount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSingup)
                        .addGap(30, 30, 30))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSingup)
                    .addComponent(btnGoBack))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed

        System.out.println("Closing "+this.getClass()+"\n");
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnGoBackActionPerformed

    @SuppressWarnings({"deprecation", "deprecation"})
    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed
        
        // Check if the form is filled in
        if(
            txtUsername.getText().isEmpty() != true &&
            txtEmail.getText().isEmpty() != true &&
            txtPassword1.getText().isEmpty() != true &&
            txtPassword2.getText().isEmpty() != true &&
            txtName.getText().isEmpty() != true &&
            txtLastname1.getText().isEmpty() != true &&
            txtLastname2.getText().isEmpty() != true && 
            (   rbtnMale.isSelected() != false || 
                rbtnFemale.isSelected() != false )
        ){
            
            // Check if the passwords match
            if( txtPassword1.getText().equals(txtPassword2.getText()) ){
                
                // 1.- First check if the username exist in th DB
                DoctorDaoImpl docDaoImpl = new DoctorDaoImpl();
                System.out.println("\nVerifaying user "+txtUsername.getText()+" does not exist in DB");
                boolean checkUsername = docDaoImpl.existUsername( txtUsername.getText() );
                if( checkUsername == false ){
                    
                    // 2.- Next check if the email exist in the DB
                    String code = Helper.getCode();
                    System.out.println("Verifaying email "+txtEmail.getText()+" does not exist in DB");
                    String encryptedMail = Helper.encrypt(code, txtEmail.getText());
                    boolean checkEmail = docDaoImpl.existEmail( encryptedMail );
                    if( checkEmail == false ){
                        
                        try {
                            
                            String encryptedPass = Helper.encrypt(code, txtPassword1.getText());
                            String doctorSex="";
                            
                            if( rbtnMale.isSelected() == true ){
                                doctorSex = "H";
                            }
                            
                            if( rbtnFemale.isSelected() == true ){
                                doctorSex = "M";
                            }
                            
                            // 3.- Now the new user is created
                            System.out.println("Creating user "+txtUsername.getText());
                            boolean created = docDaoImpl.create(txtUsername.getText(), encryptedPass, encryptedMail,
                                    txtName.getText(), txtLastname1.getText(), txtLastname2.getText(), doctorSex);
                            
                            if( created == true ){
                                
                                String activationCode = Helper.createCode(6);
                                Helper.sendActivation(txtEmail.getText(), txtUsername.getText(), activationCode);
                                
                                Helper.message("1a", txtUsername.getText(), txtEmail.getText());
                                System.out.println("User "+txtUsername.getText()+" created successfully\n");
                                
                                this.dispose();
                                
                                //Now show a window where the user must enter the "activation key" that was sended to the email
                                Confirmation confirmation = new Confirmation(activationCode);
                                confirmation.setVisible(true);
                                
                            }
                            
                        } catch (MessagingException | IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        
                    }else{
                        // If the mail exist
                        System.out.println("The email "+txtEmail.getText()+" is already been used");
                        Helper.message("2a", txtEmail.getText());
                    }
                    
                }else{
                    // If the username exist
                    System.out.println("User "+txtUsername.getText()+" already exist in DB\n");
                    Helper.message("1a", txtUsername.getText());
                }
                
            }else{
                // if the passwords not match
                System.out.println("The passwords does not match\n");
                Helper.message("1b");
            }
        
        }else{
            // if comething is missing on the form
            System.out.println("Must fill in all the fields\n");
            Helper.message("1a");
        }
        
    }//GEN-LAST:event_btnSingupActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSingup;
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail3;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JLabel lblEmail5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JPanel pnlAccount;
    private javax.swing.JPanel pnlAccount2;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastname1;
    private javax.swing.JTextField txtLastname2;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
