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
public class LIB2 extends javax.swing.JFrame {
    LIB2 LIB2;
     DefaultTableModel model;
    /**
     * Creates new form LIB2
     */
    public LIB2() {
        initComponents();
        model = (DefaultTableModel) Itable.getModel();
        LoadData();
    }

    LIB2(String ID, String booktitle, String booktype) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this();
        
        bi.setText(ID);
        bt.setText(booktitle);
        bty.setText(booktype);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        Text = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt = new javax.swing.JTextField();
        bty = new javax.swing.JTextField();
        bi = new javax.swing.JTextField();
        db = new javax.swing.JTextField();
        dr = new javax.swing.JTextField();
        iid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Itable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel10.setText("SELECT BOOKS YOU WANT TO BORROW");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setText("Instructor's Library");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("FIND:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Book's Title", "Book's Type", "Date of Borrow", "Date of Return", "Instructor's ID", "Book's ID" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel11.setText("SELECT BOOKS YOU WANT TO BORROW:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        book.setBackground(new java.awt.Color(204, 204, 204));
        book.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        book.setText("Books");
        book.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton6.setText("RESET");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(4, 4, 4)
                        .addComponent(jButton6)
                        .addContainerGap())))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Book's Title:");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Book's Type:");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Book's ID:");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Date of Borrow:");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Date of Return:");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Select Instructor:");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });

        Itable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Book's Title", "Book's Type", "Date of Borrow", "Date of Return", "Instructor's ID", "Book's ID"
            }
        ));
        Itable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Itable);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Update");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Delete");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bty, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(iid, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(dr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jButton1)
                    .addComponent(bty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    listofinstructors listofinstructors;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (listofinstructors == null) {
            listofinstructors = new listofinstructors();
            listofinstructors.LIB2 = this;
        }        
        listofinstructors.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btActionPerformed

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
     try {
            DB_connection.init();
            PreparedStatement ps = null;
            Connection c = DB_connection.getConnection();
            ResultSet rs;

            if (Combo.getSelectedItem().equals("ID")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE ID LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Book's Title")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Full_Name LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Book's Type")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Gender LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Date of Borrow")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Age LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Date of Return")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Birthday LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Instructor's ID")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Contact LIKE '%" + Text.getText() + "%'");
            } else if (Combo.getSelectedItem().equals("Book's ID")) {
                ps = c.prepareStatement("SELECT * FROM my.ilibrary WHERE Address LIKE '%" + Text.getText() + "%'");
            }  else {
                JOptionPane.showMessageDialog(this, "Please select a valid search criteria.");
                return;
            }

            rs = ps.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("ID"), rs.getString("Book_title"), rs.getString("Book_type"), rs.getString("Date_borrow"),
                    rs.getString("Date_return"), rs.getString("INSTRUCTOR_ID"), rs.getString("Book_ID")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataEncode.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_TextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;
            ps = c.prepareStatement("Insert into my.ilibrary (Book_title, Book_type, Date_borrow, Date_return, INSTRUCTOR_ID, Book_ID) values ('" + bt.getText() + "','" + bty.getText() + "','" + db.getText() + "','" + dr.getText() + "',"
                    + "                                                                                                                            '" + iid.getText() + "','" + bi.getText() + "')");
 
            if (!ps.execute()) {
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY SAVE!!");

                bt.setText("");
                bty.setText("");
                db.setText("");
                dr.setText("");
                iid.setText("");
                bi.setText("");
                

                LoadData();
            }

        } catch (SQLException ex) {
            Logger.getLogger(LIB2.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int row = Itable.getSelectedRow();
        String ID = model.getValueAt(row, 0).toString();

        try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;
            ps = c.prepareStatement("UPDATE my.ilibrary SET Book_title = ('" + bt.getText() + "'), Book_type = ('" + bty.getText() + "'),"
                    + " Date_borrow = ('" + db.getText() + "'), Date_return = ('" + dr.getText() + "'), INSTRUCTOR_ID = ('" + iid.getText() + "'), Book_ID = ('" + bi.getText() + "') WHERE ID= '" + ID + "'");

            if (!ps.execute()) {
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY UPDATED!!");
                LoadData();

                bt.setText("");
                bty.setText("");
                dr.setText("");
                db.setText("");
                iid.setText("");
                bi.setText("");
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataEncodeCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ItableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItableMouseClicked
         int row = Itable.getSelectedRow();
        String ID = model.getValueAt(row, 0).toString();
        String booktitle = model.getValueAt(row, 1).toString();
        String booktype = model.getValueAt(row, 2).toString();
        String dateborrow = model.getValueAt(row, 3).toString();
        String datereturn = model.getValueAt(row, 4).toString();
        String insid = model.getValueAt(row, 5).toString();
        String bid = model.getValueAt(row, 6).toString();
        

        bt.setText(booktitle);
        bty.setText(booktype);
        db.setText(dateborrow);
        dr.setText(datereturn);
        iid.setText(insid);
        bi.setText(bid);
        
    }//GEN-LAST:event_ItableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int row = Itable.getSelectedRow();
        String ID = model.getValueAt(row, 0).toString();

        try {
            DB_connection.init();
            PreparedStatement ps;
            Connection c = DB_connection.getConnection();
            ResultSet rs;
            ps = c.prepareStatement("DELETE FROM my.ilibrary WHERE ID = " + ID + " ");

            if (!ps.execute()) {
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY DELETE!!");
                LoadData();
                bt.setText("");
                bty.setText("");
                dr.setText("");
                db.setText("");
                iid.setText("");
                bi.setText("");
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataEncodeCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboActionPerformed
            MyLibrary2 MyLibrary2;
    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        if (MyLibrary2 == null) {
            MyLibrary2 = new MyLibrary2();
            MyLibrary2.LIB2 = this;
        }
          MyLibrary2.setVisible(true);
    }//GEN-LAST:event_bookActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                bt.setText("");
                bty.setText("");
                dr.setText("");
                db.setText("");
                iid.setText("");
                bi.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

     public void updateData(String data) {
        iid.setText(data);
    } 
     
      public void updateData2 (String data, String data2, String data3) {
        bi.setText(data);
        bt.setText(data2);
        bty.setText(data3);
        
    }
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
            java.util.logging.Logger.getLogger(LIB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LIB2().setVisible(true);
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
            ps = c.prepareStatement("SELECT * FROM my.ilibrary;");
            rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{rs.getString("ID"), rs.getString("Book_title"), rs.getString("Book_type"), rs.getString("Date_borrow"), rs.getString("Date_return"), rs.getString("INSTRUCTOR_ID"), rs.getString("Book_ID")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(DataEncodeinstructors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JTable Itable;
    private javax.swing.JTextField Text;
    private javax.swing.JTextField bi;
    private javax.swing.JButton book;
    private javax.swing.JTextField bt;
    private javax.swing.JTextField bty;
    private javax.swing.JTextField db;
    private javax.swing.JTextField dr;
    private javax.swing.JTextField iid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

   

    
}
