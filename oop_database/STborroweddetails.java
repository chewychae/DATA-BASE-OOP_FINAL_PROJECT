/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class STborroweddetails extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form STborroweddetails
     */
    public STborroweddetails() {
        initComponents();
        model = (DefaultTableModel) StudentTable.getModel();
        LoadData();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        Text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        SCAN = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("STUDENT'S BORROWED DETAILS");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        combo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Full Name", "Department" }));
        combo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Text.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Text.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Full Name", "Deparment"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTable);

        SCAN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCAN.setText("SCAN");
        SCAN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCANActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setText("Click the student to know the details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SCAN)
                .addGap(40, 40, 40))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SCAN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        try {
            DB_connection.init();
            PreparedStatement ps = null;
            Connection c = DB_connection.getConnection();
            ResultSet rs;

            if (combo.getSelectedItem().equals("ID")) {
                ps = c.prepareStatement("SELECT * FROM my.student WHERE ID LIKE '%" + Text.getText() + "%'");
            } else if (combo.getSelectedItem().equals("Full Name")) {
                ps = c.prepareStatement("SELECT * FROM my.student WHERE Full_Name LIKE '%" + Text.getText() + "%'");
            } else if (combo.getSelectedItem().equals("Department")) {
                ps = c.prepareStatement("SELECT * FROM my.student WHERE Department LIKE '%" + Text.getText() + "%'");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a valid search criteria.");
                return;
            }

            rs = ps.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("ID"), rs.getString("Full_Name"), rs.getString("Gender"),
                    rs.getString("Age"), rs.getString("Birthday"), rs.getString("Contact"), rs.getString("Address"),
                    rs.getString("Email_Address"), rs.getString("Department"), rs.getString("INSTRUCTOR_ID"), rs.getString("COURSE_ID")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataEncode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TextActionPerformed

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
        int row = StudentTable.getSelectedRow();
        String id = model.getValueAt(row, 0).toString();

        ID.setText(id);


    }//GEN-LAST:event_StudentTableMouseClicked

    private void SCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCANActionPerformed
        try {
            String id = ID.getText();

            new STBooks(id).setVisible(true);

        } catch (Exception e) {
        }

        

    }//GEN-LAST:event_SCANActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(STborroweddetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STborroweddetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STborroweddetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STborroweddetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STborroweddetails().setVisible(true);
            }
        });
    }

    void LoadData() {
        try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;
            model.setRowCount(0);
            ps = c.prepareStatement("SELECT * FROM my.student;");
            rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{rs.getString("ID"), rs.getString("Full_Name"),
                    rs.getString("Department")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(DataEncodeinstructors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton SCAN;
    private javax.swing.JTable StudentTable;
    private javax.swing.JTextField Text;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}