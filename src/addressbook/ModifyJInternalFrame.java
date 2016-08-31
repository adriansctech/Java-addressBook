/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import classBD.conectionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class ModifyJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModifyJInternalFrame
     */
    private conectionBD connectionBD = null;
    private ResultSet rs = null;    
    private int count = 1;
    private int limitContacts;
    private boolean pass;
    
    public ModifyJInternalFrame() {
        initComponents();
        pass = false;
        idJtext.setEnabled(false);
        connectionBD = new conectionBD();
        rs = connectionBD.queryById(count);
        prepareLabels(pass);
        
        completeInfo();
        limitContacts = connectionBD.checkDataBase();
        
        if(limitContacts==0){
            JOptionPane.showMessageDialog(null, "The DataBase is empty, please insert a new register");
            dispose();
        }
        System.out.println("THE LIMIT OF THE CONTACTS IS: "+limitContacts);        
    }
    
    
       
    private void prepareLabels(boolean pass){        
        nameJtext.setEnabled(pass);
        surnameJtext.setEnabled(pass);
        addressJtext.setEnabled(pass);
        countryJtext.setEnabled(pass);
    }
    
    
    private void completeInfo(){
        try {
            idJtext.setText(rs.getString("id"));
            nameJtext.setText(rs.getString("name"));
            surnameJtext.setText(rs.getString("surname"));
            addressJtext.setText(rs.getString("address"));
            countryJtext.setText(rs.getString("country"));
        } catch (SQLException ex) {
            Logger.getLogger(ModifyJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idJtext = new javax.swing.JTextField();
        nameJtext = new javax.swing.JTextField();
        surnameJtext = new javax.swing.JTextField();
        addressJtext = new javax.swing.JTextField();
        countryJtext = new javax.swing.JTextField();
        firstJbutton = new javax.swing.JButton();
        previousJbutton = new javax.swing.JButton();
        nextJbutton = new javax.swing.JButton();
        lastJbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        modifyJbutton = new javax.swing.JButton();
        deleteJbutton = new javax.swing.JButton();
        saveJbutton = new javax.swing.JButton();
        cancelJbutton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modify any contact");

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("ID: ");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("NAME: ");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("SURNAME: ");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("ADDRESS: ");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("COUNTRY: ");

        idJtext.setText("jTextField1");

        nameJtext.setText("jTextField2");

        surnameJtext.setText("jTextField3");

        addressJtext.setText("jTextField4");

        countryJtext.setText("jTextField5");

        firstJbutton.setText("|<");
        firstJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstJbuttonActionPerformed(evt);
            }
        });

        previousJbutton.setText("<");
        previousJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousJbuttonActionPerformed(evt);
            }
        });

        nextJbutton.setText(">");
        nextJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJbuttonActionPerformed(evt);
            }
        });

        lastJbutton.setText(">|");
        lastJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastJbuttonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 171, 99));

        modifyJbutton.setText("Modify");
        modifyJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyJbuttonActionPerformed(evt);
            }
        });

        deleteJbutton.setText("Delete");
        deleteJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJbuttonActionPerformed(evt);
            }
        });

        saveJbutton.setText("Save");
        saveJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJbuttonActionPerformed(evt);
            }
        });

        cancelJbutton.setText("Cancel");
        cancelJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modifyJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(modifyJbutton)
                .addGap(18, 18, 18)
                .addComponent(saveJbutton)
                .addGap(18, 18, 18)
                .addComponent(deleteJbutton)
                .addGap(18, 18, 18)
                .addComponent(cancelJbutton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(previousJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(idJtext)
                            .addComponent(surnameJtext)
                            .addComponent(addressJtext)
                            .addComponent(countryJtext)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nextJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(surnameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addressJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(countryJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstJbutton)
                    .addComponent(previousJbutton)
                    .addComponent(nextJbutton)
                    .addComponent(lastJbutton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyJbuttonActionPerformed
        prepareLabels(true);
    }//GEN-LAST:event_modifyJbuttonActionPerformed

    private void nextJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJbuttonActionPerformed
        limitContacts = connectionBD.checkDataBase();
        if(Integer.parseInt(idJtext.getText())==limitContacts){
            JOptionPane.showMessageDialog(null, "This is the last contact");
        }else{
            rs = connectionBD.queryNextRegister(Integer.parseInt(idJtext.getText()));
            completeInfo();
        }       
    }//GEN-LAST:event_nextJbuttonActionPerformed

    private void previousJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousJbuttonActionPerformed
        if(Integer.parseInt(idJtext.getText())==1){
            JOptionPane.showMessageDialog(null, "This is the first contact");
        }else{            
            rs = connectionBD.queryPreviousRegister(Integer.parseInt(idJtext.getText()));
            completeInfo();
        }
    }//GEN-LAST:event_previousJbuttonActionPerformed

    private void firstJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstJbuttonActionPerformed
        if(Integer.parseInt(idJtext.getText())==1){
            JOptionPane.showMessageDialog(null, "This is the first contact");
        }else{            
            rs = connectionBD.queryById(1);
            completeInfo();
        }
    }//GEN-LAST:event_firstJbuttonActionPerformed

    private void lastJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastJbuttonActionPerformed
        if(Integer.parseInt(idJtext.getText())==limitContacts){
            JOptionPane.showMessageDialog(null, "This is the last contact");
        }else{            
            rs = connectionBD.queryById(limitContacts);
            completeInfo();
        }
    }//GEN-LAST:event_lastJbuttonActionPerformed

    private void saveJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJbuttonActionPerformed
        connectionBD.update(nameJtext.getText(), 
                            surnameJtext.getText(), 
                            addressJtext.getText(), 
                            countryJtext.getText(), 
                            Integer.parseInt(idJtext.getText()));
        prepareLabels(false);
    }//GEN-LAST:event_saveJbuttonActionPerformed

    private void cancelJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJbuttonActionPerformed
        prepareLabels(false);
    }//GEN-LAST:event_cancelJbuttonActionPerformed

    private void deleteJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJbuttonActionPerformed
        connectionBD.delete(Integer.parseInt(idJtext.getText()));
        rs=connectionBD.genericQuery();
        completeInfo();
    }//GEN-LAST:event_deleteJbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJtext;
    private javax.swing.JButton cancelJbutton;
    private javax.swing.JTextField countryJtext;
    private javax.swing.JButton deleteJbutton;
    private javax.swing.JButton firstJbutton;
    private javax.swing.JTextField idJtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lastJbutton;
    private javax.swing.JButton modifyJbutton;
    private javax.swing.JTextField nameJtext;
    private javax.swing.JButton nextJbutton;
    private javax.swing.JButton previousJbutton;
    private javax.swing.JButton saveJbutton;
    private javax.swing.JTextField surnameJtext;
    // End of variables declaration//GEN-END:variables
}
