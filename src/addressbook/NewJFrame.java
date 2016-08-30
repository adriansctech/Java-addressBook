/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author adrian
 */

import classBD.conectionBD;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
            
    private conectionBD conectionClass;
    
    public NewJFrame() {
            initComponents();
            //Center JFrame
            setLocationRelativeTo(null);
            conectionClass = new conectionBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newContactMnuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        viewTableMnuItem = new javax.swing.JMenuItem();
        exitMnuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        showInfoMnuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Address Book");
        setResizable(false);

        jMenu1.setText("Contacts");

        newContactMnuItem.setText("Add new Contact");
        newContactMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContactMnuItemActionPerformed(evt);
            }
        });
        jMenu1.add(newContactMnuItem);

        jMenuItem2.setText("Modify contacts");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        viewTableMnuItem.setText("View Contacts on table");
        viewTableMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTableMnuItemActionPerformed(evt);
            }
        });
        jMenu1.add(viewTableMnuItem);

        exitMnuItem.setText("Exit");
        exitMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMnuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMnuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("DataBase");

        jMenuItem1.setText("Clear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Info");

        showInfoMnuItem.setText("Show info");
        showInfoMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoMnuItemActionPerformed(evt);
            }
        });
        jMenu2.add(showInfoMnuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newContactMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContactMnuItemActionPerformed
        NewJInternalFrame addContact = new NewJInternalFrame();
        jDesktopPane1.add(addContact);
        addContact.show();
        addContact.setVisible(true);
    }//GEN-LAST:event_newContactMnuItemActionPerformed

    private void viewTableMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTableMnuItemActionPerformed
        ViewJInternalFrame viewContacts = new ViewJInternalFrame();
        jDesktopPane1.add(viewContacts);
        viewContacts.show();
        viewContacts.setVisible(true);
    }//GEN-LAST:event_viewTableMnuItemActionPerformed

    private void exitMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMnuItemActionPerformed
        super.dispose();
    }//GEN-LAST:event_exitMnuItemActionPerformed

    private void showInfoMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoMnuItemActionPerformed
        JOptionPane.showMessageDialog(null, "Address book generate with SQLITE DB by Adrián Sánchez Carchano");
    }//GEN-LAST:event_showInfoMnuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        conectionClass.dropDataBase();
        JOptionPane.showMessageDialog(null, "The DataBase is Clear");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ModifyJInternalFrame modifyContacts = new ModifyJInternalFrame();
        jDesktopPane1.add(modifyContacts);
        modifyContacts.show();
        modifyContacts.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMnuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem newContactMnuItem;
    private javax.swing.JMenuItem showInfoMnuItem;
    private javax.swing.JMenuItem viewTableMnuItem;
    // End of variables declaration//GEN-END:variables
}