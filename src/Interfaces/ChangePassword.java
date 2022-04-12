package Interfaces;


import Project.DBConnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supun Rasanga
 */
public class ChangePassword extends javax.swing.JFrame {
    
    Connection con =null;
  PreparedStatement pst =null;
  ResultSet rs = null;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        
        //Connect to DB 
        con = DBConnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ConfirmBox = new javax.swing.JPasswordField();
        NameBox = new javax.swing.JPasswordField();
        NewBox = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        NewUser = new javax.swing.JPasswordField();
        CheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setBackground(new java.awt.Color(102, 51, 255));
        setLocation(new java.awt.Point(333, 182));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 126, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("New User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 126, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_DeleteRed_34218.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setIconTextGap(10);
        jButton2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Untitled-3.png"))); // NOI18N
        jButton1.setText("Change");
        jButton1.setMargin(new java.awt.Insets(2, -15, 2, -5));
        jButton1.setMaximumSize(new java.awt.Dimension(105, 33));
        jButton1.setMinimumSize(new java.awt.Dimension(105, 33));
        jButton1.setPreferredSize(new java.awt.Dimension(105, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Change Password");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 620, 30));

        ConfirmBox.setBackground(new java.awt.Color(255, 255, 153));
        ConfirmBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfirmBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfirmBoxKeyPressed(evt);
            }
        });
        getContentPane().add(ConfirmBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 290, 33));

        NameBox.setBackground(new java.awt.Color(255, 255, 153));
        NameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameBoxKeyPressed(evt);
            }
        });
        getContentPane().add(NameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 290, 33));

        NewBox.setBackground(new java.awt.Color(255, 255, 153));
        NewBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBoxActionPerformed(evt);
            }
        });
        NewBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewBoxKeyPressed(evt);
            }
        });
        getContentPane().add(NewBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 290, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Old User Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 126, 40));

        NewUser.setBackground(new java.awt.Color(255, 255, 153));
        NewUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewUserKeyPressed(evt);
            }
        });
        getContentPane().add(NewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 290, 33));

        CheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBox.setText("Show Feilds");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/membership.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String uid=NameBox.getText();
        String newuid =NewUser.getText();
        String pword=NewBox.getText();
        String confirmpword=ConfirmBox.getText();
        
        String admin =NameBox.getText();

        String sql="Select * from useraccount where UserName= ? OR Admin= ?";
        try {
            pst = DBConnect.connect().prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, admin);

            rs=pst.executeQuery();
            if(rs.next()){
                int x;
                x = JOptionPane.showConfirmDialog(null, "Do you really want to RESET PASSWORD ? ");
                if(x==0){
                    if(pword == null ? confirmpword == null : pword.equals(confirmpword)){
                        String sqll="UPDATE useraccount SET UserName ='"+ newuid+"', Pword='"+pword+"',ConfirmPword='"+confirmpword+"'";

                        pst=con.prepareStatement(sqll);
                        pst.execute();

                        JOptionPane.showMessageDialog(null, "Your password changed!!");
                        setVisible(false);
                        ConfirmBox.setText("");
                        ConfirmBox.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Your password and confirm password are incorrect!!\n Try again!");
                        ConfirmBox.setText("");
                        ConfirmBox.setText("");
                    }

                }

            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid USERID!");
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewBoxActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:
        
        if(CheckBox.isSelected()){
            
            ConfirmBox.setEchoChar((char)0);
            NewBox.setEchoChar((char)0);
            
        }
        else{
            ConfirmBox.setEchoChar('*');
            NewBox.setEchoChar('*');
           
            
        }
        
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void NameBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameBoxKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            NewUser.requestFocus();
         
    }//GEN-LAST:event_NameBoxKeyPressed

    private void NewUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewUserKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            NewBox.requestFocus();
    }//GEN-LAST:event_NewUserKeyPressed

    private void NewBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewBoxKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           ConfirmBox.requestFocus();
    }//GEN-LAST:event_NewBoxKeyPressed

    private void ConfirmBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmBoxKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
              
         String uid=NameBox.getText();
        String newuid =NewUser.getText();
        String pword=NewBox.getText();
        String confirmpword=ConfirmBox.getText();
        
        String admin =NameBox.getText();

        String sql="Select * from useraccount where UserName= ? OR Admin= ?";
        try {
            pst = DBConnect.connect().prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, admin);

            rs=pst.executeQuery();
            if(rs.next()){
                int x;
                x = JOptionPane.showConfirmDialog(null, "Do you really want to RESET PASSWORD ? ");
                if(x==0){
                    if(pword == null ? confirmpword == null : pword.equals(confirmpword)){
                        String sqll="UPDATE useraccount SET UserName ='"+ newuid+"', Pword='"+pword+"',ConfirmPword='"+confirmpword+"'";

                        pst=con.prepareStatement(sqll);
                        pst.execute();

                        JOptionPane.showMessageDialog(null, "Your password changed!!");
                        setVisible(false);
                        ConfirmBox.setText("");
                        ConfirmBox.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Your password and confirm password are incorrect!!\n Try again!");
                        ConfirmBox.setText("");
                        ConfirmBox.setText("");
                    }

                }

            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid USERID!");
            }

        } catch (Exception e) {
            System.out.print(e);
        }
          } 
    }//GEN-LAST:event_ConfirmBoxKeyPressed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JPasswordField ConfirmBox;
    private javax.swing.JPasswordField NameBox;
    private javax.swing.JPasswordField NewBox;
    private javax.swing.JPasswordField NewUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}