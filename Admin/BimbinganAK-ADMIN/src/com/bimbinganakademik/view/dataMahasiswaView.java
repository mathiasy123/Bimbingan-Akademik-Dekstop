
package com.bimbinganakademik.view;

import com.bimbinganakademik.controller.mahasiswaController;

import com.bimbinganakademik.model.mahasiswaModel;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class dataMahasiswaView extends javax.swing.JFrame {
    private mahasiswaController controllMhs;
    private AbstractTableModel modelTabel;
    
    public dataMahasiswaView() {
        initComponents();
        controllMhs = new mahasiswaController(this);
        controllMhs.isiTabelMhs();
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertMhs = new javax.swing.JButton();
        btnHapusMhs = new javax.swing.JButton();
        btnUpdateMhs = new javax.swing.JButton();
        btnHomeMhs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        fieldNIM = new javax.swing.JTextField();
        fieldJurusan = new javax.swing.JComboBox<>();
        fieldKelas = new javax.swing.JComboBox<>();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Kelas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Jenis kelamin");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganakademik/img/user icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Admin");

        btnInsertMhs.setBackground(new java.awt.Color(2, 117, 216));
        btnInsertMhs.setBorder(null);
        btnInsertMhs.setContentAreaFilled(false);
        btnInsertMhs.setOpaque(true);
        btnInsertMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnInsertMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertMhs.setText("TAMBAH");
        btnInsertMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertMhs.setBackground(new java.awt.Color(66,139,202));
        btnInsertMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertMhsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertMhsMouseEntered(evt);
            }
        });
        btnInsertMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertMhsActionPerformed(evt);
            }
        });

        btnHapusMhs.setBackground(new java.awt.Color(217, 83, 79));
        btnHapusMhs.setBorder(null);
        btnHapusMhs.setContentAreaFilled(false);
        btnHapusMhs.setOpaque(true);
        btnHapusMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHapusMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusMhs.setText("HAPUS");
        btnHapusMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMhsMouseExited(evt);
            }
        });
        btnHapusMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMhsActionPerformed(evt);
            }
        });

        btnUpdateMhs.setBackground(new java.awt.Color(240, 173, 78));
        btnUpdateMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnUpdateMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMhs.setBorder(null);
        btnUpdateMhs.setContentAreaFilled(false);
        btnUpdateMhs.setOpaque(true);
        btnUpdateMhs.setText("UBAH");
        btnUpdateMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMhsMouseExited(evt);
            }
        });
        btnUpdateMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMhsActionPerformed(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMhsMouseExited(evt);
            }
        });
        btnHomeMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeMhsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NIM");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Kelas");

        tabelMahasiswa.setAutoCreateRowSorter(true);
        tabelMahasiswa.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Kelas"
            }
        ));
        tabelMahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelMahasiswa.setGridColor(new java.awt.Color(0, 0, 0));
        tabelMahasiswa.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);

        fieldNIM.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldNIM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNIM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNIMKeyPressed(evt);
            }
        });

        fieldJurusan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Informatika", "Sistem Informasi", "Game Computing and Technology", "Desain Komunikasi Visual", "Business in Creative Industry", "Akuntansi", "Manajemen", "Strategic Communication", "Broadcasting", "Advertising and Digital Communication", "Arsitektur", "Matematika Bisnis"}));
        fieldJurusan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldJurusanKeyPressed(evt);
            }
        });

        fieldKelas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"03PAIF", "03PAGC", "03PAMN", "03PACI"}));
        fieldKelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldKelasKeyPressed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHomeMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnHomeMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldKelas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(fieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldJurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInsertMhs, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnUpdateMhs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapusMhs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertMhsActionPerformed
            controllMhs.insertTabelMhs();
            controllMhs.isiTabelMhs();
            controllMhs.kosong();
    }//GEN-LAST:event_btnInsertMhsActionPerformed

    private void btnHapusMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMhsActionPerformed
            
            controllMhs.deleteTabelMhs();
            controllMhs.isiTabelMhs();
            controllMhs.kosong();
    }//GEN-LAST:event_btnHapusMhsActionPerformed

    private void btnUpdateMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMhsActionPerformed
            controllMhs.updateTabelMhs();
            controllMhs.isiTabelMhs();
            controllMhs.kosong();
    }//GEN-LAST:event_btnUpdateMhsActionPerformed

    private void btnHomeMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeMhsActionPerformed
        this.dispose();
        new adminView().setVisible(true);
    }//GEN-LAST:event_btnHomeMhsActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        modelTabel = (AbstractTableModel)tabelMahasiswa.getModel();
        int barisTerpilih = tabelMahasiswa.getSelectedRow();

        fieldNIM.setText(modelTabel.getValueAt(barisTerpilih, 0).toString());
        fieldNama.setText(modelTabel.getValueAt(barisTerpilih, 1).toString());
        fieldJurusan.setSelectedItem(modelTabel.getValueAt(barisTerpilih, 2).toString());
        fieldKelas.setSelectedItem(modelTabel.getValueAt(barisTerpilih, 3).toString());
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void btnHomeMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMhsMouseEntered
       btnHomeMhs.setBackground(new java.awt.Color(61, 63, 64));
    }//GEN-LAST:event_btnHomeMhsMouseEntered

    private void btnHomeMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMhsMouseExited
        btnHomeMhs.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnHomeMhsMouseExited

    private void btnInsertMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMhsMouseEntered
        btnInsertMhs.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnInsertMhsMouseEntered

    private void btnInsertMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMhsMouseExited
        btnInsertMhs.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnInsertMhsMouseExited

    private void btnUpdateMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMhsMouseEntered
       btnUpdateMhs.setBackground(new java.awt.Color(245, 183, 88));
    }//GEN-LAST:event_btnUpdateMhsMouseEntered

    private void btnUpdateMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMhsMouseExited
       btnUpdateMhs.setBackground(new java.awt.Color(240, 173, 78));
    }//GEN-LAST:event_btnUpdateMhsMouseExited

    private void btnHapusMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMhsMouseEntered
        btnHapusMhs.setBackground(new java.awt.Color(227, 93, 89));
    }//GEN-LAST:event_btnHapusMhsMouseEntered

    private void btnHapusMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMhsMouseExited
        btnHapusMhs.setBackground(new java.awt.Color(217, 83, 79));
    }//GEN-LAST:event_btnHapusMhsMouseExited

    private void fieldNIMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNIMKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldNIM.getText().equals(""))){
                fieldNama.requestFocus();
                }
                break;
            case KeyEvent.VK_DOWN:
                fieldNama.requestFocus();
                break;
            case KeyEvent.VK_RIGHT:
                fieldKelas.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldNIMKeyPressed

    private void fieldNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNamaKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldNama.getText().equals(""))){
                fieldJurusan.requestFocus();
                }
                break;
            case KeyEvent.VK_DOWN:
                fieldJurusan.requestFocus();
                break;
            case KeyEvent.VK_UP:
                fieldNIM.requestFocus();
                break;
            case KeyEvent.VK_RIGHT:
                fieldPassword.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldNamaKeyPressed

    private void fieldJurusanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJurusanKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                fieldKelas.requestFocus();
                break;
            case KeyEvent.VK_UP:
                fieldNama.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldJurusanKeyPressed

    private void fieldKelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldKelasKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                fieldPassword.requestFocus();
                break;
            case KeyEvent.VK_DOWN:
                fieldPassword.requestFocus();
                break;
            case KeyEvent.VK_LEFT:
                fieldNIM.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldKelasKeyPressed

    private void fieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldPassword.getText().equals(""))){
                controllMhs.insertTabelMhs();
                controllMhs.isiTabelMhs();
                controllMhs.kosong();
                fieldNIM.requestFocus();
                }
                break;
            case KeyEvent.VK_UP:
                fieldKelas.requestFocus();
                break;
            case KeyEvent.VK_LEFT:
                fieldNama.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldPasswordKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                fieldNIM.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_formKeyPressed
    
    public JTable getTabelMhs(){return tabelMahasiswa;}
    public JButton getButtonInsert(){return btnInsertMhs;}
    public JButton getButtonUpdate(){return btnHapusMhs;}
    public JButton getButtonDelete(){return btnUpdateMhs;}
    public JTextField getTxtNIM(){return fieldNIM;}
    public JTextField getTxtNama(){return fieldNama;}
    public JTextField getTxtPassword(){return fieldPassword;}
    public JComboBox getTxtJurusan(){return fieldJurusan;}
    public JComboBox getTxtKelas(){return fieldKelas;}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dataMahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataMahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataMahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataMahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataMahasiswaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusMhs;
    private javax.swing.JButton btnHomeMhs;
    private javax.swing.JButton btnInsertMhs;
    private javax.swing.JButton btnUpdateMhs;
    private javax.swing.JComboBox<String> fieldJurusan;
    private javax.swing.JComboBox<String> fieldKelas;
    private javax.swing.JTextField fieldNIM;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMahasiswa;
    // End of variables declaration//GEN-END:variables

}
