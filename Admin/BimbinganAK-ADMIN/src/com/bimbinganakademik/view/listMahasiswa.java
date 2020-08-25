
package com.bimbinganakademik.view;

import com.bimbinganakademik.koneksi.koneksiDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class listMahasiswa extends javax.swing.JFrame {
    
    private DefaultTableModel modelTabel;
    private Connection koneksi;
    public dataAbsenView dataAbsen = null;
    
    public listMahasiswa() {
        initComponents();
        
        tampilListMhs();
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }
    
        
    private final void tampilListMhs(){
        modelTabel = new DefaultTableModel();
        modelTabel.addColumn("NIM");
        modelTabel.addColumn("Nama");
        modelTabel.addColumn("Jurusan");
        modelTabel.addColumn("Kelas");
        
        try {
            koneksi = koneksiDB.bukaKoneksi();
            String SELECT = "SELECT NIM, nama, jurusan, kelas FROM mahasiswa WHERE pembimbing IS NULL";
            Statement statSelect = koneksi.createStatement();
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                modelTabel.addRow(new Object[]{
                   hasilSelect.getInt(1),
                   hasilSelect.getString(2),
                   hasilSelect.getString(3),
                   hasilSelect.getString(4)
                });
                
                tabelListMhs.setModel(modelTabel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan list mahasiswa");
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelListMhs = new javax.swing.JTable();
        btnTambahListMhs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bimbingan Akademik");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("LIST MAHASISWA");

        tabelListMhs.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelListMhs.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Kelas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelListMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelListMhs.setGridColor(new java.awt.Color(0, 0, 0));
        tabelListMhs.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelListMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelListMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelListMhs);

        btnTambahListMhs.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahListMhs.setBackground(new java.awt.Color(2, 117, 216));
        btnTambahListMhs.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahListMhs.setBorder(null);
        btnTambahListMhs.setContentAreaFilled(false);
        btnTambahListMhs.setOpaque(true);
        btnTambahListMhs.setText("TAMBAH");
        btnTambahListMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahListMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahListMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahListMhsMouseExited(evt);
            }
        });
        btnTambahListMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahListMhsActionPerformed(evt);
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
                .addComponent(btnTambahListMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambahListMhs, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
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
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tabelListMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelListMhsMouseClicked
        int barisTerpilih = tabelListMhs.getSelectedRow();
        dataAbsen.NIM = (int) modelTabel.getValueAt(barisTerpilih, 0);
    }//GEN-LAST:event_tabelListMhsMouseClicked

    private void btnTambahListMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahListMhsActionPerformed
        dataAbsen.setNilaiFieldNIM();
        this.dispose();
    }//GEN-LAST:event_btnTambahListMhsActionPerformed

    private void btnTambahListMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahListMhsMouseEntered
        btnTambahListMhs.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnTambahListMhsMouseEntered

    private void btnTambahListMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahListMhsMouseExited
        btnTambahListMhs.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnTambahListMhsMouseExited
    
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
            java.util.logging.Logger.getLogger(listMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnTambahListMhs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelListMhs;
    // End of variables declaration//GEN-END:variables
}
