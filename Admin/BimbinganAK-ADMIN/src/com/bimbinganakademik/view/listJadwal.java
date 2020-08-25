
package com.bimbinganakademik.view;

import com.bimbinganakademik.koneksi.koneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listJadwal extends javax.swing.JFrame {
    private DefaultTableModel modelTabel;
    private Connection koneksi;
    public dataAbsenView dataAbsen = null;
    
    public listJadwal() {
        initComponents();
        
        koneksi = koneksiDB.bukaKoneksi();
        
        tampilJadwal();
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }
    
    public void tampilJadwal(){
        modelTabel = new DefaultTableModel();
        modelTabel.addColumn("ID");
        modelTabel.addColumn("Tanggal Awal");
        modelTabel.addColumn("Tanggal Akhir");
        
        try {
            koneksi = koneksiDB.bukaKoneksi();
            String SELECT = "SELECT * FROM jadwal";
            Statement statSelect = koneksi.createStatement();
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                modelTabel.addRow(new Object[]{
                   hasilSelect.getInt(1),
                   hasilSelect.getDate(2),
                   hasilSelect.getDate(3),
                });
                
                tabelListJadwal.setModel(modelTabel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan list jadwal");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelListJadwal = new javax.swing.JTable();
        btnTambahJadwal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bimbingan Akademik");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("LIST JADWAL");

        tabelListJadwal.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelListJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Tanggal Awal", "Tanggal Akhir"
            }
        ));
        tabelListJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelListJadwal.setGridColor(new java.awt.Color(0, 0, 0));
        tabelListJadwal.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelListJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelListJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelListJadwal);

        btnTambahJadwal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahJadwal.setBackground(new java.awt.Color(2, 117, 216));
        btnTambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahJadwal.setBorder(null);
        btnTambahJadwal.setContentAreaFilled(false);
        btnTambahJadwal.setOpaque(true);
        btnTambahJadwal.setText("TAMBAH");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(16, 16, 16))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelListJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelListJadwalMouseClicked
        int barisTerpilih = tabelListJadwal.getSelectedRow();
        dataAbsen.ID = (int) modelTabel.getValueAt(barisTerpilih, 0);
    }//GEN-LAST:event_tabelListJadwalMouseClicked

    private void btnTambahJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJadwalActionPerformed
        dataAbsen.setNilaiFieldJadwal();
        this.dispose();
    }//GEN-LAST:event_btnTambahJadwalActionPerformed

    private void btnTambahJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseEntered
        btnTambahJadwal.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnTambahJadwalMouseEntered

    private void btnTambahJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahJadwalMouseExited
        btnTambahJadwal.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnTambahJadwalMouseExited

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
            java.util.logging.Logger.getLogger(listJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambahJadwal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelListJadwal;
    // End of variables declaration//GEN-END:variables
}
