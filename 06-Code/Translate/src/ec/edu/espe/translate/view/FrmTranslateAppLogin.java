/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.translate.view;

import ec.edu.espe.translate.view.FrmAbout;
import ec.edu.espe.translate.view.FrmHelp;
import ec.edu.espe.translate.view.FrmLogIn;
import ec.edu.espe.translate.view.FrmNotifications;
import ec.edu.espe.translate.view.FrmRegister;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Granda
 */
public class FrmTranslateAppLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmCateringPlanner
     */
    public FrmTranslateAppLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCateringPlanner = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmHelp = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        mnuWorkers = new javax.swing.JMenu();
        itmRegister = new javax.swing.JMenuItem();
        itmLogIn = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itmNotifications = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("TRANSLATE APP V1.0");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 273, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/translate.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carlos", "Ricardo" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jButton1.setText("Ready");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        mnuCateringPlanner.setText("Translate");

        itmAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuCateringPlanner.add(itmAbout);

        itmHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itmHelp.setText("Help");
        itmHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmHelpActionPerformed(evt);
            }
        });
        mnuCateringPlanner.add(itmHelp);

        itmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuCateringPlanner.add(itmExit);

        jMenuBar1.add(mnuCateringPlanner);

        mnuWorkers.setText("Access");

        itmRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmRegister.setText("Register");
        itmRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegisterActionPerformed(evt);
            }
        });
        mnuWorkers.add(itmRegister);

        itmLogIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itmLogIn.setText("Log in");
        itmLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogInActionPerformed(evt);
            }
        });
        mnuWorkers.add(itmLogIn);

        jMenuBar1.add(mnuWorkers);

        jMenu1.setText("Menu");

        itmNotifications.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        itmNotifications.setText("View Notifications");
        itmNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNotificationsActionPerformed(evt);
            }
        });
        jMenu1.add(itmNotifications);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"Are you sure you want to quit TranslateApp?");
        if (i==0){
            JOptionPane.showMessageDialog(this,"Thanks for using TranslateApp");
            this.dispose();
        }else if (i==1){
            JOptionPane.showMessageDialog(this,"Welcome back");
        }
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmHelpActionPerformed
        FrmHelp frmHelp = new FrmHelp();
        frmHelp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmHelpActionPerformed

    private void itmLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogInActionPerformed
        FrmLogIn frmLogIn = new FrmLogIn();
        frmLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmLogInActionPerformed

    private void itmNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNotificationsActionPerformed
        FrmNotifications frmNotifications = new FrmNotifications();
        frmNotifications.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmNotificationsActionPerformed

    private void itmRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegisterActionPerformed
        FrmRegister frmRegister = new FrmRegister();
        frmRegister.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTranslateAppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTranslateAppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTranslateAppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTranslateAppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTranslateAppLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmHelp;
    private javax.swing.JMenuItem itmLogIn;
    private javax.swing.JMenuItem itmNotifications;
    private javax.swing.JMenuItem itmRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuCateringPlanner;
    private javax.swing.JMenu mnuWorkers;
    // End of variables declaration//GEN-END:variables
}
