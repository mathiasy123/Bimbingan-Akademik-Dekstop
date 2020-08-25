
package com.bimbinganakademik.view;

import com.bimbinganakademik.koneksi.koneksiDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listDosen extends javax.swing.JFrame {
    
    private DefaultTableModel modelTabel;
    private Connection koneksi;
    public dataAbsenView dataAbsen = null;
    
    public listDosen() {
        initComponents();
        koneksi = koneksiDB.bukaKoneksi();
        
        tampilDosen();
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }
    
    public void tampilDosen(){
        modelTabel = new DefaultTableModel();
        modelTabel.addColumn("NID");
        modelTabel.addColumn("Nama");
        modelTabel.addColumn("Jurusan");
        
        try {
            koneksi = koneksiDB.bukaKoneksi();
            String SELECT = "SELECT NID, nama, jurusan FROM dosen";
            Statement statSelect = koneksi.createStatement();
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                modelTabel.addRow(new Object[]{
                   hasilSelect.getInt(1),
                   hasilSelect.getString(2),
                   hasilSelect.getString(3)
                });
                
                tabelListDosen.setModel(modelTabel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Gagal mendapatkan list dosen");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelListDosen = new javax.swing.JTable();
        btnTambahDosen = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bimbingan Akademik");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("LIST DOSEN");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabelListDosen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabelListDosen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelListDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelListDosen.setGridColor(new java.awt.Color(0, 0, 0));
        tabelListDosen.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tabelListDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelListDosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelListDosen);

        btnTambahDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTambahDosen.setBackground(new java.awt.Color(2, 117, 216));
        btnTambahDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahDosen.setBorder(null);
        btnTambahDosen.setContentAreaFilled(false);
        btnTambahDosen.setOpaque(true);
        btnTambahDosen.setText("TAMBAH");
        btnTambahDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahDosenMouseExited(evt);
            }
        });
        btnTambahDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTambahDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambahDosen, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelListDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelListDosenMouseClicked
        int barisTerpilih = tabelListDosen.getSelectedRow();
        dataAbsen.NID = (int) modelTabel.getValueAt(barisTerpilih, 0);
    }//GEN-LAST:event_tabelListDosenMouseClicked

    private void btnTambahDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDosenActionPerformed
        dataAbsen.setNilaiFieldNID();
        this.dispose();
    }//GEN-LAST:event_btnTambahDosenActionPerformed

    private void btnTambahDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahDosenMouseEntered
        btnTambahDosen.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnTambahDosenMouseEntered

    private void btnTambahDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahDosenMouseExited
        btnTambahDosen.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnTambahDosenMouseExited

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
            java.util.logging.Logger.getLogger(listDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambahDosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelListDosen;
    // End of variables declaration//GEN-END:variables
}
