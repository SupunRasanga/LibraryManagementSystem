package Interfaces;


import Project.DBConnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class IssueBook extends javax.swing.JFrame {
    
    Connection con =null;
     ResultSet rs;
     ResultSet ps;
  
     


    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        StudentName = new javax.swing.JTextField();
        BOOKID = new javax.swing.JTextField();
        ISSUEDATE = new com.toedter.calendar.JDateChooser();
        DUEDATE = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        STUDENTID1 = new javax.swing.JTextField();
        BookName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 175));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Book ID");
        jLabel5.setMaximumSize(new java.awt.Dimension(122, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(122, 17));
        jLabel5.setPreferredSize(new java.awt.Dimension(122, 17));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 129, 29));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Member ID");
        jLabel6.setMaximumSize(new java.awt.Dimension(122, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(122, 17));
        jLabel6.setPreferredSize(new java.awt.Dimension(122, 17));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 129, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Issue Date ");
        jLabel7.setMaximumSize(new java.awt.Dimension(122, 17));
        jLabel7.setMinimumSize(new java.awt.Dimension(122, 17));
        jLabel7.setPreferredSize(new java.awt.Dimension(122, 17));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 129, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Due Date");
        jLabel8.setMaximumSize(new java.awt.Dimension(122, 17));
        jLabel8.setMinimumSize(new java.awt.Dimension(122, 17));
        jLabel8.setPreferredSize(new java.awt.Dimension(122, 17));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 129, 29));

        StudentName.setBackground(new java.awt.Color(255, 255, 153));
        StudentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNameActionPerformed(evt);
            }
        });
        getContentPane().add(StudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 290, 33));

        BOOKID.setBackground(new java.awt.Color(255, 255, 153));
        BOOKID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BOOKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKIDActionPerformed(evt);
            }
        });
        BOOKID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOOKIDKeyPressed(evt);
            }
        });
        getContentPane().add(BOOKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 290, 33));

        ISSUEDATE.setBackground(new java.awt.Color(255, 255, 153));
        ISSUEDATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(ISSUEDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 290, 33));

        DUEDATE.setBackground(new java.awt.Color(255, 255, 153));
        DUEDATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(DUEDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 290, 33));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/issue book.png"))); // NOI18N
        jButton1.setText("Issue");
        jButton1.setIconTextGap(10);
        jButton1.setMaximumSize(new java.awt.Dimension(95, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(95, 29));
        jButton1.setPreferredSize(new java.awt.Dimension(95, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 103, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_DeleteRed_34218.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, 37));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 110, 37));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Member Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 30));

        STUDENTID1.setBackground(new java.awt.Color(255, 255, 153));
        STUDENTID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        STUDENTID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STUDENTID1ActionPerformed(evt);
            }
        });
        STUDENTID1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                STUDENTID1KeyPressed(evt);
            }
        });
        getContentPane().add(STUDENTID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 33));

        BookName.setBackground(new java.awt.Color(255, 255, 153));
        BookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameActionPerformed(evt);
            }
        });
        BookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BookNameKeyPressed(evt);
            }
        });
        getContentPane().add(BookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 290, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Book Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/membership.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNameActionPerformed

    private void BOOKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOOKIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      
  SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String BID = BOOKID.getText();
        String SID = STUDENTID1.getText();
        String BName = BookName.getText();
        String SName = StudentName.getText();
        String IssueDate = dFormat.format(ISSUEDATE.getDate());
        String DueDate =dFormat.format(DUEDATE.getDate());
        String returnBook = "No";
        
        try{
           
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("select * from book where BookID ='"+BID+"'");
       
       if(rs.next()){
           
           ResultSet rs1 = st.executeQuery("select * from student where IndexNumber ='"+SID+"'");
           if(rs1.next()){
               
                st.executeUpdate("insert into issue values('"+BID+"', '"+SID+"','"+BName+"','"+SName+"', '"+IssueDate+"', '"+DueDate+"','"+returnBook+"')");
                JOptionPane.showMessageDialog(null, "Book Successfully Issued ");
               
           }else{
               
            ResultSet rs2 = st.executeQuery("select * from teacher where IDNumber ='"+SID+"'");
           if(rs2.next()){
               
                st.executeUpdate("insert into issue values('"+BID+"', '"+SID+"','"+BName+"','"+SName+"', '"+IssueDate+"', '"+DueDate+"','"+returnBook+"')");
                JOptionPane.showMessageDialog(null, "Book Successfully Issued ");
                
           }else{
               ResultSet rs3 = st.executeQuery("select * from nonacodemy where IDNumber ='"+SID+"'");
           if(rs3.next()){
               
                st.executeUpdate("insert into issue values('"+BID+"', '"+SID+"','"+BName+"','"+SName+"', '"+IssueDate+"', '"+DueDate+"','"+returnBook+"')");
                JOptionPane.showMessageDialog(null, "Book Successfully Issued ");
                
           }else{
               JOptionPane.showMessageDialog(null,"Incorrect MEMBERID ");
           }
               
               
               
               
           }
       }
            
         
           
           
       }
       else
                JOptionPane.showMessageDialog(null,"Incorrect BOOKID ");
                setVisible(false);
                new IssueBook().setVisible(true);
       
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Incorrect BOOKID ");
             setVisible(false);
             new IssueBook().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String SID = STUDENTID1.getText();
        String BID = BOOKID.getText();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery( "select * from book where BookID ='"+BID+"'") ;
            
            if(rs.next()){
                ResultSet rs1 = st.executeQuery("select * from student where IndexNumber = '"+SID+"'");
                
                 if(rs1.next()){
                     StudentName.setText(rs1.getString("StudentName"));
                     STUDENTID1.setEditable(false);
                
                     
                 }
                 else{
                     
                 ResultSet rs2 = st.executeQuery("select * from teacher where IDNumber = '"+SID+"'");
                 
                 if(rs2.next()){
                      StudentName.setText(rs2.getString("FullName"));
                      STUDENTID1.setEditable(false);
                      
                 }else{
                      ResultSet rs3 = st.executeQuery("select * from nonacodemy where IDNumber = '"+SID+"'");
                 
                 if(rs3.next()){
                     StudentName.setText(rs3.getString("FullName"));
                      STUDENTID1.setEditable(false);
                 }else
                 {
                   JOptionPane.showMessageDialog(null,"Incorrect Member ID");  
                 }
                     
                 }
                 }
                 
                     
                 
                
                 
                
                 
                     
                  
                
                    
                 
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Book ID");
            }
            
             
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection error"); 
        }
       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String BID = BOOKID.getText();
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery( "select * from book where BookID ='"+BID+"'") ;
            
             if(rs.next())
        { 
           BookName.setText(rs.getString("BookName")); 
           BOOKID.setEditable(false);
            
            
        }else{
                 JOptionPane.showMessageDialog(null,"Incorrect Book ID");
             }
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection error"); 
        
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void STUDENTID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STUDENTID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STUDENTID1ActionPerformed

    private void BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameActionPerformed

    private void BOOKIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOOKIDKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String BID = BOOKID.getText();
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery( "select * from book where BookID ='"+BID+"'") ;
            
             if(rs.next())
        { 
           BookName.setText(rs.getString("BookName")); 
           BOOKID.setEditable(false);
            
            
        }else{
                 JOptionPane.showMessageDialog(null,"Incorrect Book ID");
                 BOOKID.requestFocus();
             }
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection error"); 
        
            
        }
          STUDENTID1.requestFocus();  
            
        }
            
    }//GEN-LAST:event_BOOKIDKeyPressed

    private void STUDENTID1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_STUDENTID1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             
              String SID = STUDENTID1.getText();
        String BID = BOOKID.getText();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery( "select * from book where BookID ='"+BID+"'") ;
            
            if(rs.next()){
                ResultSet rs1 = st.executeQuery("select * from student where IndexNumber = '"+SID+"'");
                
                 if(rs1.next()){
                     StudentName.setText(rs1.getString("StudentName"));
                     STUDENTID1.setEditable(false);
                
                     
                 }
                 else{
                     
                 ResultSet rs2 = st.executeQuery("select * from teacher where IDNumber = '"+SID+"'");
                 
                 if(rs2.next()){
                      StudentName.setText(rs2.getString("FullName"));
                      STUDENTID1.setEditable(false);
                      
                 }else{
                      ResultSet rs3 = st.executeQuery("select * from nonacodemy where IDNumber = '"+SID+"'");
                 
                 if(rs3.next()){
                     StudentName.setText(rs3.getString("FullName"));
                      STUDENTID1.setEditable(false);
                 }else
                 {
                   JOptionPane.showMessageDialog(null,"Incorrect Member ID"); 
                   STUDENTID1.requestFocus();
                 }
                     
                 }
                 }
                          
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Book ID");
                STUDENTID1.requestFocus();
            }
            
             
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection error"); 
        }
       
        
        
        
         }
        
                     
                 
                
                 
                
                 
                     
                  
                
                    
        
    }//GEN-LAST:event_STUDENTID1KeyPressed

    private void BookNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BookNameKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_BookNameKeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyPressed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BOOKID;
    private javax.swing.JTextField BookName;
    private com.toedter.calendar.JDateChooser DUEDATE;
    private com.toedter.calendar.JDateChooser ISSUEDATE;
    private javax.swing.JTextField STUDENTID1;
    private javax.swing.JTextField StudentName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
