
/* 
TABLE doctors
    doctorUserName varchar(50)      1
    password varchar(50)            2
    doctorEmail varchar(80)         3
    confirmedEmail boolean          4
    doctorName varchar(50)          5
    doctorLastName1 varchar(50)     6
    doctorLastName2 varchar(50)     7
    doctorSex varchar(1)            8
 */

package views;

import dao.impls.DoctorDaoImpl;
import dao.entities.Doctors;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import medicapp.Helper;

/**
 * @author Cageceal
 */
public class Singup extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Singup() {

        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);

        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/MedicApp_Logo_1.png"));
        Icon showLogo = new ImageIcon(logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),
                Image.SCALE_DEFAULT));
        lblLogo.setIcon(showLogo);

        this.setLocationRelativeTo(null);

        Helper.consoleMessage("opnView", this.getClass().toString());
        printEmptyLine();

    }

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
                        .addComponent(rbtnFemale, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(5, 5, 5)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSingup)
                    .addComponent(btnGoBack))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed

        Helper.consoleMessage("clsView", this.getClass().toString());
        Login login = new Login("opn");
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnGoBackActionPerformed

    @SuppressWarnings({"deprecation", "deprecation"})
    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed

        // 1.1.- Check all fields are filled
        if (txtUsername.getText().isEmpty() != true && txtEmail.getText().isEmpty() != true
                && txtPassword1.getText().isEmpty() != true && txtPassword2.getText().isEmpty() != true
                && txtName.getText().isEmpty() != true && txtLastname1.getText().isEmpty() != true
                && txtLastname2.getText().isEmpty() != true
                && (rbtnMale.isSelected() != false || rbtnFemale.isSelected() != false)) {

            //1.2.- Check the password match
            if (txtPassword1.getText().equals(txtPassword2.getText()) == true) {

                DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();

                // 2.- Check if username is on the DB
                Helper.consoleMessage("usrSch", txtUsername.getText());
                boolean checkUsername = doctorDaoImpl.existUsername(txtUsername.getText());
                if (checkUsername == false) {

                    Helper.consoleMessage("usrSchNo", txtUsername.getText());

                    // 3.- Check if email is on the DB (encrypted)
                    Helper.consoleMessage("emlSch", txtEmail.getText());
                    String encryptedEmail = Helper.encrypt(txtEmail.getText());
                    boolean checkEmail = doctorDaoImpl.existEmail(encryptedEmail);
                    if (checkEmail == false) {

                        Helper.consoleMessage("emlSchNo", txtEmail.getText());

                        // 4.1.- Create a new Doctor in DB
                        String encryptedPassword = Helper.encrypt(txtPassword1.getText());
                        String doctorSex = null;

                        if (rbtnFemale.isSelected() == true) {
                            doctorSex = "M";
                        }
                        if (rbtnMale.isSelected() == true) {
                            doctorSex = "H";
                        }

                        Doctors doctor = new Doctors();
                        doctor.setUserName(txtUsername.getText());              //1
                        doctor.setPassword(encryptedPassword);                  //2
                        doctor.setEmail(encryptedEmail);                        //3
                        doctor.setConfirmedEmail(false);                        //4
                        doctor.setName(txtName.getText());                      //5
                        doctor.setLastName1(txtLastname1.getText());            //6
                        doctor.setLastName2(txtLastname2.getText());            //7
                        doctor.setSex(doctorSex);                               //8

                        Helper.consoleMessage("usrCrt", doctor.getUserName());
                        boolean created = doctorDaoImpl.create(doctor);

                        if (created == true) {

                            Helper.consoleMessage("usrCrtOk", txtUsername.getText());
                            Helper.userMessage("usrCrtOk", txtUsername.getText());

                            printEmptyLine();
                            Helper.consoleMessage("clsView", this.getClass().toString());
                            this.dispose();

                            // Shows singup view
                            Login login = new Login("opn");
                            login.setVisible(true);

                        } else {
                            // If the doctor was not crate
                            Helper.consoleMessage("usrCrtNo", doctor.getUserName());
                            printEmptyLine();
                            Helper.userMessage("usrCrtNo", doctor.getUserName());
                        }

                    } else {
                        // If the email exist in DB
                        Helper.consoleMessage("emlSchOk", txtEmail.getText());
                        printEmptyLine();
                        Helper.userMessage("emlSchOk", txtEmail.getText());
                    }

                } else {
                    // If the username exist in DB
                    Helper.consoleMessage("usrSchOk", txtUsername.getText());
                    printEmptyLine();
                    Helper.userMessage("usrSchOk", txtUsername.getText());
                }

            } else {
                // If passwords does not match
                Helper.consoleMessage("pssNtm");
                printEmptyLine();
                Helper.userMessage("pssNm");
            }

        } else {
            // If some field is missing
            Helper.consoleMessage("mssFld");
            printEmptyLine();
            Helper.userMessage("frmNo");
        }

    }//GEN-LAST:event_btnSingupActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

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

    private void printEmptyLine() {
        System.out.println("");
    }

}
