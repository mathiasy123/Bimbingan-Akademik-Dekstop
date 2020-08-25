
package com.bimbinganakademik.view;

import com.bimbinganakademik.controller.jadwalController;
import com.bimbinganakademik.model.jadwalModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class dataJadwalView extends javax.swing.JFrame {
    private jadwalController controllJadwal;
    private AbstractTableModel modelTabel;
    public jadwalModel jadwal = new jadwalModel();
    
    public dataJadwalView() {
        initComponents();
        controllJadwal = new jadwalController(this);
        controllJadwal.isiTabelJadwal();
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTambahJadwal = new javax.swing.JButton();
        btnHapusJadwal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJadwal = new javax.swing.JTable();
        btnHomeAdmin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tanggalAwal = new com.toedter.calendar.JDateChooser();
        tanggalAkhir = new com.toedter.calendar.JDateChooser();
        btnAbsen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganakademik/img/user icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Admin");

        jLabel5.setText("Tanggal awal");

        btnTambahJadwal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahJadwal.setBackground(new java.awt.Color(2, 117, 216));
        btnTambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahJadwal.setBorder(null);
        btnTambahJadwal.setContentAreaFilled(false);
        btnTambahJadwal.setOpaque(true);
        btnTambahJadwal.setText("TAMBAH");
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

        btnHapusJadwal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHapusJadwal.setBackground(new java.awt.Color(217, 83, 79));
        btnHapusJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusJadwal.setBorder(null);
        btnHapusJadwal.setContentAreaFilled(false);
        btnHapusJadwal.setOpaque(true);
        btnHapusJadwal.setText("HAPUS");
        btnHapusJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusJadwalMouseExited(evt);
            }
        });
        btnHapusJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusJadwalActionPerformed(evt);
            }
        });

        tabelJadwal.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tanggal Awal", "Tanggal Akhir"
            }
        ));
        tabelJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelJadwal.setGridColor(new java.awt.Color(0, 0, 0));
        tabelJadwal.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelJadwal);

        btnHomeAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnHomeAdmin.setBackground(new java.awt.Color(41, 43, 44));
        btnHomeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeAdmin.setBorder(null);
        btnHomeAdmin.setContentAreaFilled(false);
        btnHomeAdmin.setOpaque(true);
        btnHomeAdmin.setText("BERANDA");
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

        jLabel7.setText("Tanggal akhir");

        tanggalAwal.setDateFormatString("yyyy-MM-dd");
        tanggalAwal.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tanggalAwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tanggalAwalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tanggalAwalKeyReleased(evt);
            }
        });

        tanggalAkhir.setDateFormatString("yyyy-MM-dd");
        tanggalAkhir.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tanggalAkhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tanggalAkhirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tanggalAkhirKeyReleased(evt);
            }
        });

        btnAbsen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnAbsen.setBackground(new java.awt.Color(41, 43, 44));
        btnAbsen.setForeground(new java.awt.Color(255, 255, 255));
        btnAbsen.setBorder(null);
        btnAbsen.setContentAreaFilled(false);
        btnAbsen.setOpaque(true);
        btnAbsen.setText("DATA ABSEN");
        btnAbsen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbsenMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbsenMouseEntered(evt);
            }
        });
        btnAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tanggalAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addComponent(btnTambahJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapusJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnTambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdminActionPerformed
       this.dispose();
       new adminView().setVisible(true);
    }//GEN-LAST:event_btnHomeAdminActionPerformed
    
    private void btnTambahJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJadwalActionPerformed
        controllJadwal.insertTabelJadwal();
        controllJadwal.isiTabelJadwal();
        controllJadwal.kosong();
    }//GEN-LAST:event_btnTambahJadwalActionPerformed

    private void tabelJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelJadwalMouseClicked
        modelTabel = (AbstractTableModel)tabelJadwal.getModel();
        int barisTerpilih = tabelJadwal.getSelectedRow();
        
        jadwal.setID((int) modelTabel.getValueAt(barisTerpilih, 0));
    }//GEN-LAST:event_tabelJadwalMouseClicked

    private void btnHapusJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusJadwalActionPerformed
        controllJadwal.deleteTabelJadwal();
        controllJadwal.isiTabelJadwal();
        controllJadwal.kosong();
    }//GEN-LAST:event_btnHapusJadwalActionPerformed

    private void btnTambahJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseEntered
        btnTambahJadwal.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnTambahJadwalMouseEntered

    private void btnTambahJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseExited
        btnTambahJadwal.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnTambahJadwalMouseExited

    private void btnHapusJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusJadwalMouseEntered
        btnHapusJadwal.setBackground(new java.awt.Color(237, 103, 99));
    }//GEN-LAST:event_btnHapusJadwalMouseEntered

    private void btnHapusJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusJadwalMouseExited
        btnHapusJadwal.setBackground(new java.awt.Color(217, 83, 79));
    }//GEN-LAST:event_btnHapusJadwalMouseExited

    private void btnAbsenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbsenMouseEntered
        btnAbsen.setBackground(new java.awt.Color(71, 73, 74));
    }//GEN-LAST:event_btnAbsenMouseEntered

    private void btnAbsenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbsenMouseExited
        btnAbsen.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnAbsenMouseExited

    private void btnHomeAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeAdminMouseEntered
        btnHomeAdmin.setBackground(new java.awt.Color(71, 73, 74));
    }//GEN-LAST:event_btnHomeAdminMouseEntered

    private void btnHomeAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeAdminMouseExited
        btnHomeAdmin.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnHomeAdminMouseExited

    private void btnAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsenActionPerformed
       this.dispose();
       new dataAbsenView().setVisible(true);
    }//GEN-LAST:event_btnAbsenActionPerformed
    int keyval=0;
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        this.shiftentr(evt);
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        this.shiftrls(evt);
    }//GEN-LAST:event_formKeyReleased

    private void tanggalAwalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tanggalAwalKeyPressed
        this.shiftentr(evt);
    }//GEN-LAST:event_tanggalAwalKeyPressed

    private void tanggalAwalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tanggalAwalKeyReleased
        this.shiftrls(evt);
    }//GEN-LAST:event_tanggalAwalKeyReleased

    private void tanggalAkhirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tanggalAkhirKeyPressed
        this.shiftentr(evt);
    }//GEN-LAST:event_tanggalAkhirKeyPressed

    private void tanggalAkhirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tanggalAkhirKeyReleased
        this.shiftrls(evt);
    }//GEN-LAST:event_tanggalAkhirKeyReleased
    
    
    private void shiftentr(java.awt.event.KeyEvent evt){
    switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                
                break;
            case KeyEvent.VK_SHIFT:
                keyval = 1;
                break;
            case KeyEvent.VK_A:
                if(keyval==1){
                    this.dispose();
                    new dataAbsenView().setVisible(true);
                keyval=0;
                }
                break;
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                new adminView().setVisible(true);
                break;
        }
    }
    
    private void shiftrls(java.awt.event.KeyEvent evt){
    switch(evt.getKeyCode()){
            case KeyEvent.VK_SHIFT:
                keyval=0;
                break;

        }
    }
    public JDateChooser getTxtTanggalAwal(){return tanggalAwal;}
    public JDateChooser getTxtTanggalAkhir(){return tanggalAkhir;}
    public JTable getTabelJadwal(){return tabelJadwal;}
    
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
            java.util.logging.Logger.getLogger(dataJadwalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataJadwalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataJadwalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataJadwalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataJadwalView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsen;
    private javax.swing.JButton btnHapusJadwal;
    private javax.swing.JButton btnHomeAdmin;
    private javax.swing.JButton btnTambahJadwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelJadwal;
    private com.toedter.calendar.JDateChooser tanggalAkhir;
    private com.toedter.calendar.JDateChooser tanggalAwal;
    // End of variables declaration//GEN-END:variables
}
