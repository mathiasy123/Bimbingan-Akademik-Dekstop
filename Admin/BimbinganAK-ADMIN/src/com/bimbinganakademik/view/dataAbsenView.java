
package com.bimbinganakademik.view;

import com.bimbinganakademik.controller.absenController;
import com.bimbinganakademik.model.absenModel;
import com.sun.glass.events.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class dataAbsenView extends javax.swing.JFrame {
    
    private absenController controllAbsen;
    private AbstractTableModel modelTabel;
    public absenModel absen = new absenModel();
    
    public int NIM;
    public int NID;
    public int ID;
    
    public dataAbsenView() {
        initComponents();
        controllAbsen = new absenController(this);
        controllAbsen.isiTabelAbsen();
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }
    
    public void setNilaiFieldNIM(){
        listDosen listDsn = new listDosen();
        listDsn.dataAbsen = this;
        fieldNIM.setText(Integer.toString(NIM));
    }
    
    public void setNilaiFieldNID(){
        listDosen listDsn = new listDosen();
        listDsn.dataAbsen = this;
        fieldNID.setText(Integer.toString(NID));
    }
    
    public void setNilaiFieldJadwal(){
        listJadwal listJwd = new listJadwal();
        listJwd.dataAbsen = this;
        fieldJadwal.setText(Integer.toString(ID));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldNIM = new javax.swing.JTextField();
        fieldNID = new javax.swing.JTextField();
        btnTambahDosen = new javax.swing.JButton();
        btnTambahAbsen = new javax.swing.JButton();
        btnHapusAbsen = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelAbsen = new javax.swing.JTable();
        btnHomeAdmin = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fieldJadwal = new javax.swing.JTextField();
        btnTambahMhs = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnTambahJadwal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        fieldNIM.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldNIM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNIM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNIMKeyPressed(evt);
            }
        });

        fieldNID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldNID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNIDKeyPressed(evt);
            }
        });

        btnTambahDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahDosen.setBackground(new java.awt.Color(138, 67, 210));
        btnTambahDosen.setText("TAMBAH DOSEN");
        btnTambahDosen.setBorder(null);
        btnTambahDosen.setContentAreaFilled(false);
        btnTambahDosen.setOpaque(true);
        btnTambahDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahDosenMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahDosenMouseEntered(evt);
            }
        });
        btnTambahDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDosenActionPerformed(evt);
            }
        });

        btnTambahAbsen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahAbsen.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahAbsen.setBackground(new java.awt.Color(2, 117, 216));
        btnTambahAbsen.setText("TAMBAH");
        btnTambahAbsen.setBorder(null);
        btnTambahAbsen.setContentAreaFilled(false);
        btnTambahAbsen.setOpaque(true);
        btnTambahAbsen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahAbsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahAbsenMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahAbsenMouseEntered(evt);
            }
        });
        btnTambahAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAbsenActionPerformed(evt);
            }
        });

        btnHapusAbsen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHapusAbsen.setBackground(new java.awt.Color(217, 83, 79));
        btnHapusAbsen.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusAbsen.setText("HAPUS");
        btnHapusAbsen.setBorder(null);
        btnHapusAbsen.setContentAreaFilled(false);
        btnHapusAbsen.setOpaque(true);
        btnHapusAbsen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusAbsen.setBackground(new java.awt.Color(217, 83, 79));
        btnHapusAbsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusAbsenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusAbsenMouseExited(evt);
            }
        });
        btnHapusAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusAbsenActionPerformed(evt);
            }
        });

        tabelAbsen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelAbsen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Jadwal", "NIM", "NID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelAbsen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelAbsen.setGridColor(new java.awt.Color(0, 0, 0));
        tabelAbsen.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelAbsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAbsenMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelAbsen);

        btnHomeAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHomeAdmin.setBackground(new java.awt.Color(41, 43, 44));
        btnHomeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeAdmin.setText("KEMBALI");
        btnHomeAdmin.setBorder(null);
        btnHomeAdmin.setContentAreaFilled(false);
        btnHomeAdmin.setOpaque(true);
        btnHomeAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomeAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeAdminMouseExited(evt);
            }
        });
        btnHomeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAdminActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganakademik/img/user icon.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel28.setText("Admin");

        jLabel29.setText("NIM");

        fieldJadwal.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fieldJadwal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldJadwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldJadwalKeyPressed(evt);
            }
        });

        btnTambahMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahMhs.setBackground(new java.awt.Color(138, 67, 210));
        btnTambahMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahMhs.setBorder(null);
        btnTambahMhs.setContentAreaFilled(false);
        btnTambahMhs.setOpaque(true);
        btnTambahMhs.setText("TAMBAH MAHASISWA");
        btnTambahMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMhsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMhsMouseEntered(evt);
            }
        });
        btnTambahMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMhsActionPerformed(evt);
            }
        });

        jLabel30.setText("NID");

        jLabel33.setText("Jadwal");

        btnTambahJadwal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahJadwal.setBackground(new java.awt.Color(138, 67, 210));
        btnTambahJadwal.setText("TAMBAH JADWAL");
        btnTambahJadwal.setBorder(null);
        btnTambahJadwal.setContentAreaFilled(false);
        btnTambahJadwal.setOpaque(true);
        btnTambahJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahJadwalMouseExited(evt);
            }
        });
        btnTambahJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahJadwalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel29))
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldNID, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(fieldJadwal)
                                    .addComponent(fieldNIM))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTambahMhs, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(btnTambahDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnHapusAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambahAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnHomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(fieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambahMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(fieldNID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambahDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(fieldJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTambahAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMhsActionPerformed
        listMahasiswa listMhs = new listMahasiswa();
        listMhs.dataAbsen = this;
        listMhs.setVisible(true);
        fieldNID.requestFocus();
    }//GEN-LAST:event_btnTambahMhsActionPerformed

    private void btnTambahDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDosenActionPerformed
        listDosen listDsn = new listDosen();
        listDsn.dataAbsen = this;
        listDsn.setVisible(true);
        fieldJadwal.requestFocus();
    }//GEN-LAST:event_btnTambahDosenActionPerformed

    private void btnHomeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdminActionPerformed
        this.dispose();
        new dataJadwalView().setVisible(true);
    }//GEN-LAST:event_btnHomeAdminActionPerformed

    private void btnTambahJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJadwalActionPerformed
        listJadwal listJwd = new listJadwal();
        listJwd.dataAbsen = this;
        listJwd.setVisible(true);
    }//GEN-LAST:event_btnTambahJadwalActionPerformed

    private void tabelAbsenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAbsenMouseClicked
        modelTabel = (AbstractTableModel)tabelAbsen.getModel();
        int barisTerpilih = tabelAbsen.getSelectedRow();
        
        absen.setID((int) modelTabel.getValueAt(barisTerpilih, 0));
        absen.setNIM((int) modelTabel.getValueAt(barisTerpilih, 2));
    }//GEN-LAST:event_tabelAbsenMouseClicked

    private void btnHapusAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusAbsenActionPerformed
        controllAbsen.deleteTabelAbsen();
        controllAbsen.isiTabelAbsen();
        controllAbsen.kosong();
    }//GEN-LAST:event_btnHapusAbsenActionPerformed

    private void btnTambahMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMhsMouseEntered
        btnTambahMhs.setBackground(new java.awt.Color(148, 77, 220));
    }//GEN-LAST:event_btnTambahMhsMouseEntered

    private void btnTambahMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMhsMouseExited
        btnTambahMhs.setBackground(new java.awt.Color(138, 67, 210));
    }//GEN-LAST:event_btnTambahMhsMouseExited

    private void btnTambahDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahDosenMouseEntered
        btnTambahDosen.setBackground(new java.awt.Color(148, 77, 220));
    }//GEN-LAST:event_btnTambahDosenMouseEntered

    private void btnTambahDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahDosenMouseExited
        btnTambahDosen.setBackground(new java.awt.Color(138, 67, 210));
    }//GEN-LAST:event_btnTambahDosenMouseExited

    private void btnTambahJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseEntered
        btnTambahJadwal.setBackground(new java.awt.Color(148, 77, 220));
    }//GEN-LAST:event_btnTambahJadwalMouseEntered

    private void btnTambahJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseExited
        btnTambahJadwal.setBackground(new java.awt.Color(138, 67, 210));
    }//GEN-LAST:event_btnTambahJadwalMouseExited

    private void btnTambahAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAbsenActionPerformed
        controllAbsen.insertTabelAbsen();
        controllAbsen.isiTabelAbsen();
        controllAbsen.kosong();
    }//GEN-LAST:event_btnTambahAbsenActionPerformed

    private void btnTambahAbsenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahAbsenMouseEntered
        btnTambahAbsen.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnTambahAbsenMouseEntered

    private void btnTambahAbsenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahAbsenMouseExited
        btnTambahAbsen.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnTambahAbsenMouseExited

    private void btnHapusAbsenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusAbsenMouseEntered
        btnHapusAbsen.setBackground(new java.awt.Color(237, 103, 99));
    }//GEN-LAST:event_btnHapusAbsenMouseEntered

    private void btnHapusAbsenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusAbsenMouseExited
        btnHapusAbsen.setBackground(new java.awt.Color(217, 83, 79));
    }//GEN-LAST:event_btnHapusAbsenMouseExited

    private void btnHomeAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeAdminMouseEntered
        btnHomeAdmin.setBackground(new java.awt.Color(71, 73, 74));
    }//GEN-LAST:event_btnHomeAdminMouseEntered

    private void btnHomeAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeAdminMouseExited
        btnHomeAdmin.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnHomeAdminMouseExited

    private void fieldNIMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNIMKeyPressed

        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldNIM.getText().equals(""))){
                fieldNID.requestFocus();
                }
                break;
            case KeyEvent.VK_DOWN:
                fieldNID.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
        
    }//GEN-LAST:event_fieldNIMKeyPressed

    private void fieldNIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNIDKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!fieldNIM.getText().equals("")){
                fieldJadwal.requestFocus();
                }
                break;
            case KeyEvent.VK_DOWN:
                fieldJadwal.requestFocus();
                break;
            case KeyEvent.VK_UP:
                fieldNIM.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }//GEN-LAST:event_fieldNIDKeyPressed

    private void fieldJadwalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJadwalKeyPressed
       switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                if(!(fieldJadwal.getText().equals(""))){
                    controllAbsen.insertTabelAbsen();
                    controllAbsen.isiTabelAbsen();
                    controllAbsen.kosong();
                }
                break;
            case KeyEvent.VK_UP:
                fieldNID.requestFocus();
                break;   
            case KeyEvent.VK_DOWN:
                fieldNIM.requestFocus();
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
        
        
    }//GEN-LAST:event_fieldJadwalKeyPressed

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
    
    public JTextField getTxtNIM(){return fieldNIM;}
    public JTextField getTxtJadwal(){return fieldJadwal;}
    public JTextField getTxtNID(){return fieldNID;}
    public JTable getTabelAbsen(){return tabelAbsen;}
    
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
            java.util.logging.Logger.getLogger(dataAbsenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataAbsenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataAbsenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataAbsenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataAbsenView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusAbsen;
    private javax.swing.JButton btnHomeAdmin;
    private javax.swing.JButton btnTambahAbsen;
    private javax.swing.JButton btnTambahDosen;
    private javax.swing.JButton btnTambahJadwal;
    private javax.swing.JButton btnTambahMhs;
    public javax.swing.JTextField fieldJadwal;
    public javax.swing.JTextField fieldNID;
    private javax.swing.JTextField fieldNIM;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelAbsen;
    // End of variables declaration//GEN-END:variables
}
