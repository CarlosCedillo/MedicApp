
/*
    This is the welcome view... only access through login
    
        TABLE doctors
            doctorUserName varchar(50)       1
            password varchar(50)             2
            doctorEmail varchar(80)          3
            confirmedEmail boolean           4
            doctorName varchar(50)           5
            doctorLastName1 varchar(50)      6
            doctorLastName2 varchar(50)      7
            doctorSex varchar(1)             8
 */

package views;

import dao.entities.Doctors;
import dao.impls.DoctorDaoImpl;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import medicapp.Helper;

/**
 * @author Cageceal
 */
public class Welcome extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Doctors doctor = new Doctors();

    public Welcome() {/* Not sure what to put here >_< */}

    public Welcome( String username ) {
        
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);

        this.setTitle("MedicApp");
        Image image = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(image);

        this.setLocationRelativeTo(null);
        
        Helper.consoleMessage("opnView", this.getClass().toString());
        pintEmptyLine();
        
        List<Doctors> doctorInfo = null;
        DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
        
            
        try {
            
            Helper.consoleMessage("getAll", username);
            doctorInfo = doctorDaoImpl.getDoctorInfo(username);
            for( Doctors temp : doctorInfo ){
            
                doctor.setUserName         (temp.getUserName());                   //1
                doctor.setPassword         (temp.getPassword());                   //2
                doctor.setEmail            (temp.getEmail());                      //3
                doctor.setConfirmedEmail   (temp.isConfirmedEmail());              //4
                doctor.setName             (temp.getName());                       //5
                doctor.setLastName1        (temp.getLastName1());                  //6
                doctor.setLastName2        (temp.getLastName2());                  //7
                doctor.setSex              (temp.getSex());                        //8
            
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        String doctorFullName = doctor.getName()+" "+doctor.getLastName1()+" "+doctor.getLastName2();
        
        switch( doctor.getSex() ){
            
            case "M":
                lblWelcomeMessage.setText("Bienvenida Dra. "+doctorFullName);
            break;
            
            case "H":
                lblWelcomeMessage.setText("Bienvenido Dr. "+doctorFullName);
            break;
            
            default:
                lblWelcomeMessage.setText("Espera... ¿qué?");
            break;
            
        }
        
        if( doctor.isConfirmedEmail() == true ){
            lblEmailStatus.setForeground(Color.GREEN);
            lblEmailStatus.setText("Correo confirmado");
        }else{
            lblEmailStatus.setForeground(Color.RED);
            lblEmailStatus.setText("Correo confirmado");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWelcome = new javax.swing.JPanel();
        lblWelcomeMessage = new javax.swing.JLabel();
        lblEmailStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlWelcome.setBackground(new java.awt.Color(37, 73, 138));

        lblWelcomeMessage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblWelcomeMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeMessage.setText("Bienvenido <Esta parte es dinamica...>");

        lblEmailStatus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmailStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailStatus.setText("Correo <Dinamico>");

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWelcomeMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addGap(841, 841, 841)
                .addComponent(lblEmailStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWelcomeMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addComponent(lblEmailStatus)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
                | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Welcome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEmailStatus;
    private javax.swing.JLabel lblWelcomeMessage;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables

    private void pintEmptyLine() {
        System.out.println("");
    }
    
}
