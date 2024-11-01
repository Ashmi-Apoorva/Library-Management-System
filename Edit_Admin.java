/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 */
import java.sql.*;
import javax.swing.*;
public class Edit_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Admin
     */
    public Edit_Admin() {
        initComponents();
        setDefaultCloseOperation(Edit_Admin.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        columnlist = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 31, 37, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER  UPDATED  VALUE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 110, 235, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 225, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 225, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 142, 235, 36));

        columnlist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        columnlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER_ID", "NAME", "PASSWORD", "CONTACT" }));
        columnlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnlistActionPerformed(evt);
            }
        });
        getContentPane().add(columnlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 63, 235, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
        String user = "root";
        String pwd = "squealing";
        String id = t1.getText();
        String column = columnlist.getSelectedItem().toString();
        String query = "update admin set "+column+"='"+id+"';";
        try {
            Connection conn = DriverManager.getConnection(url,user,pwd);
            Statement stmnt = conn.createStatement();
            int rows = stmnt.executeUpdate(query);
            if(rows>0)
            {
                JOptionPane.showMessageDialog(this, "Credentials updated Successfully");
            }
            t1.setText(null);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());               
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void columnlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnlistActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> columnlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
