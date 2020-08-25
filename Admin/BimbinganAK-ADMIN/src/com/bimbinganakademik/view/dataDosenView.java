
package com.bimbinganakademik.view;

import com.bimbinganakademik.controller.dosenController;

import com.bimbinganakademik.model.dosenModel;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class dataDosenView extends javax.swing.JFrame {
    private dosenController controllDosen;
    private AbstractTableModel modelTabel;
    
    public dataDosenView() {
        initComponents();
        controllDosen = new dosenController(this);
        controllDosen.isiTabelDosen();
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertDosen = new javax.swing.JButton();
        btnHapusDosen = new javax.swing.JButton();
        btnUpdateDosen = new javax.swing.JButton();
        btnHomeMhs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDosen = new javax.swing.JTable();
        fieldNID = new javax.swing.JTextField();
        fieldJurusan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganakademik/img/user icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Admin");

        btnInsertDosen.setBackground(new java.awt.Color(2, 117, 216));
        btnInsertDosen.setBorder(null);
        btnInsertDosen.setContentAreaFilled(false);
        btnInsertDosen.setOpaque(true);
        btnInsertDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnInsertDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertDosen.setText("TAMBAH");
        btnInsertDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertDosenMouseExited(evt);
            }
        });
        btnInsertDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDosenActionPerformed(evt);
            }
        });

        btnHapusDosen.setBackground(new java.awt.Color(217, 83, 79));
        btnHapusDosen.setBorder(null);
        btnHapusDosen.setContentAreaFilled(false);
        btnHapusDosen.setOpaque(true);
        btnHapusDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHapusDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusDosen.setText("HAPUS");
        btnHapusDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusDosenMouseExited(evt);
            }
        });
        btnHapusDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDosenActionPerformed(evt);
            }
        });

        btnUpdateDosen.setBackground(new java.awt.Color(240, 173, 78));
        btnUpdateDosen.setBorder(null);
        btnUpdateDosen.setContentAreaFilled(false);
        btnUpdateDosen.setOpaque(true);
        btnUpdateDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnUpdateDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDosen.setText("UBAH");
        btnUpdateDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateDosenMouseExited(evt);
            }
        });
        btnUpdateDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDosenActionPerformed(evt);
            }
        });

        btnHomeMhs.setBackground(new java.awt.Color(41, 43, 44));
        btnHomeMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHomeMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeMhs.setText("BERANDA");
        btnHomeMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomeMhs.setBorder(null);
        btnHomeMhs.setContentAreaFilled(false);
        btnHomeMhs.setOpaque(true);
        btnHomeMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMhsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMhsMouseEntered(evt);
            }
        });
        btnHomeMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeMhsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama");

        fieldNama.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNamaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        fieldPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPasswordKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jurusan");

        tabelDosen.setAutoCreateRowSorter(true);
        tabelDosen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NID", "Nama", "Jurusan"
            }
        ));
        tabelDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelDosen.setGridColor(new java.awt.Color(0, 0, 0));
        tabelDosen.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDosen);

        fieldNID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldNID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNIDKeyPressed(evt);
            }
        });

        fieldJurusan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Informatika", "Sistem Informasi", "Game Computing and Technology", "Desain Komunikasi Visual", "Business in Creative Industry", "Akuntansi", "Manajemen", "Strategic Communication", "Broadcasting", "Advertising and Digital Communication", "Arsitektur", "Matematika Bisnis"}));
        fieldJurusan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldJurusanKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldNID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHomeMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnHomeMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(fieldNID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldJurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInsertDosen, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnUpdateDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapusDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDosenActionPerformed
        controllDosen.insertTabelDosen();
        controllDosen.isiTabelDosen();
        controllDosen.kosong();
    }//GEN-LAST:event_btnInsertDosenActionPerformed

    private void btnHapusDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDosenActionPerformed
        controllDosen.deleteTabelDosen();
        controllDosen.isiTabelDosen();
        controllDosen.kosong();
    }//GEN-LAST:event_btnHapusDosenActionPerformed

    private void btnUpdateDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDosenActionPerformed
       controllDosen.updateTabelDosen();
       controllDosen.isiTabelDosen();
       controllDosen.kosong();
    }//GEN-LAST:event_btnUpdateDosenActionPerformed

    private void btnHomeMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeMhsActionPerformed
        this.dispose();
        new adminView().setVisible(true);
    }//GEN-LAST:event_btnHomeMhsActionPerformed

    private void tabelDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDosenMouseClicked
        modelTabel = (AbstractTableModel)tabelDosen.getModel();
        int barisTerpilih = tabelDosen.getSelectedRow();

        fieldNID.setText(modelTabel.getValueAt(barisTerpilih, 0).toString());
        fieldNama.setText(modelTabel.getValueAt(barisTerpilih, 1).toString());
        fieldJurusan.setSelectedItem(modelTabel.getValueAt(barisTerpilih, 2).toString());
    }//GEN-LAST:event_tabelDosenMouseClicked

    private void btnInsertDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertDosenMouseEntered
        btnInsertDosen.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnInsertDosenMouseEntered

    private void btnInsertDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertDosenMouseExited
        btnInsertDosen.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnInsertDosenMouseExited

    private void btnUpdateDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateDosenMouseEntered
        btnUpdateDosen.setBackground(new java.awt.Color(245, 183, 88));
    }//GEN-LAST:event_btnUpdateDosenMouseEntered

    private void btnUpdateDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateDosenMouseExited
        btnUpdateDosen.setBackground(new java.awt.Color(240, 173, 78));
    }//GEN-LAST:event_btnUpdateDosenMouseExited

    private void btnHapusDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusDosenMouseEntered
        btnHapusDosen.setBackground(new java.awt.Color(237, 93, 89));
    }//GEN-LAST:event_btnHapusDosenMouseEntered

    private void btnHapusDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusDosenMouseExited
        btnHapusDosen.setBackground(new java.awt.Color(217, 83, 79));
    }//GEN-LAST:event_btnHapusDosenMouseExited

    private void btnHomeMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMhsMouseEntered
        btnHomeMhs.setBackground(new java.awt.Color(61, 63, 64));
    }//GEN-LAST:event_btnHomeMhsMouseEntered

    private void btnHomeMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMhsMouseExited
        btnHomeMhs.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnHomeMhsMouseExited

    private void fieldNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNamaKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldNama.getText().equals(""))){
                    fieldJurusan.requestFocus();
                }
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
            case KeyEvent.VK_DOWN:
                fieldJurusan.requestFocus();
                break;
            case KeyEvent.VK_UP:
                fieldNID.requestFocus();
                break;
        }
    }//GEN-LAST:event_fieldNamaKeyPressed

    private void fieldNIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNIDKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldNID.getText().equals(""))){
                    fieldNama.requestFocus();
                }
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
            case KeyEvent.VK_DOWN:
                fieldNama.requestFocus();
                break;
            case KeyEvent.VK_RIGHT:
                fieldPassword.requestFocus();
                break;
        }
    }//GEN-LAST:event_fieldNIDKeyPressed

    private void fieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldPassword.getText().equals(""))){
                    controllDosen.insertTabelDosen();
                    controllDosen.isiTabelDosen();
                    controllDosen.kosong();
                    }
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
            case KeyEvent.VK_LEFT:
                fieldNID.requestFocus();
                break;
            case KeyEvent.VK_DOWN:
                fieldNID.requestFocus();
                break;
        }
        
    }//GEN-LAST:event_fieldPasswordKeyPressed

    private void fieldJurusanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJurusanKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                fieldPassword.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
            case KeyEvent.VK_DOWN:
                fieldPassword.requestFocus();
                break;
            case KeyEvent.VK_UP:
                fieldNama.requestFocus();
                break;
        }
    }//GEN-LAST:event_fieldJurusanKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        fieldNID.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        this.dispose();
        new adminView().setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed
    
    public JTable getTabelDosen(){return tabelDosen;}
    public JButton getButtonInsert(){return btnInsertDosen;}
    public JButton getButtonUpdate(){return btnHapusDosen;}
    public JButton getButtonDelete(){return btnUpdateDosen;}
    public JTextField getTxtNID(){return fieldNID;}
    public JTextField getTxtNama(){return fieldNama;}
    public JTextField getTxtPassword(){return fieldPassword;}
    public JComboBox getTxtJurusan(){return fieldJurusan;}
    
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
            java.util.logging.Logger.getLogger(dataDosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataDosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataDosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataDosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataDosenView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusDosen;
    private javax.swing.JButton btnHomeMhs;
    private javax.swing.JButton btnInsertDosen;
    private javax.swing.JButton btnUpdateDosen;
    private javax.swing.JComboBox<String> fieldJurusan;
    private javax.swing.JTextField fieldNID;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDosen;
    // End of variables declaration//GEN-END:variables
}
