
package bimbinganak.view;

import bimbinganak.controller.absenCtrl;
import java.awt.event.KeyEvent;

import java.sql.*;

import javax.swing.table.DefaultTableModel;

public class Absen extends javax.swing.JFrame {
    absenCtrl absen;
    public Absen() {
        initComponents();
        try{
            this.dispose();
        }catch(Exception e){}
    }

    public Absen(Connection conn,String idjd , String id, String tanggal_awal,String tanggal_akhir) {
        initComponents();

        DefaultTableModel model = (DefaultTableModel)AbsenTab.getModel();
        absen = new absenCtrl(this,conn,idjd,id,tanggal_awal,tanggal_akhir,model);
    }
    
    public void tabUpdate(){absen.tabUpdate();}
    public void setPer(String a){periode.setText(a);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AbsenTab = new javax.swing.JTable();
        btnValidasi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        periode = new javax.swing.JLabel();

        setTitle("Bimbingan Akademik");

        jPanel1.setBackground(new java.awt.Color(70, 112, 144));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AbsenTab.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        AbsenTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "NIM", "Nama", "Jurusan", "Kelas", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AbsenTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbsenTab.setSelectionBackground(new java.awt.Color(255, 255, 102));
        AbsenTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AbsenTabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(AbsenTab);

        btnValidasi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnValidasi.setForeground(new java.awt.Color(255, 255, 255));
        btnValidasi.setBackground(new java.awt.Color(2, 117, 216));
        btnValidasi.setText("VALIDASI");
        btnValidasi.setBorder(null);
        btnValidasi.setContentAreaFilled(false);
        btnValidasi.setOpaque(true);
        btnValidasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidasiMouseExited(evt);
            }
        });
        btnValidasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidasiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Absen Bimbingan Akademik");

        periode.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        periode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periode.setText("#NO DATA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(periode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnValidasi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(periode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidasi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //TOMBOL VALIDASI
    private void btnValidasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidasiActionPerformed
       absen.valid(AbsenTab);
    }//GEN-LAST:event_btnValidasiActionPerformed

    private void btnValidasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidasiMouseEntered
        btnValidasi.setBackground(new java.awt.Color(22, 137, 236));
    }//GEN-LAST:event_btnValidasiMouseEntered

    private void btnValidasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidasiMouseExited
        btnValidasi.setBackground(new java.awt.Color(2, 117, 216));
    }//GEN-LAST:event_btnValidasiMouseExited

    private void AbsenTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AbsenTabKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            absen.valid(AbsenTab);
        }
    }//GEN-LAST:event_AbsenTabKeyPressed

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
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Absen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AbsenTab;
    private javax.swing.JButton btnValidasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel periode;
    // End of variables declaration//GEN-END:variables
}
