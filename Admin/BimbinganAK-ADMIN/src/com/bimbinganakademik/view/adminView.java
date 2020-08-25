
package com.bimbinganakademik.view;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class adminView extends javax.swing.JFrame {

    public adminView() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(71, 85, 119));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelIkon = new javax.swing.JLabel();
        btnDataMahasiswa = new javax.swing.JButton();
        btnDataDosen = new javax.swing.JButton();
        btnDataJadwal = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        setFocusable(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Admin");

        labelIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganakademik/img/user icon.png"))); // NOI18N
        labelIkon.setText("IKON USER");

        btnDataMahasiswa.setBackground(new java.awt.Color(92,184,92));
        btnDataMahasiswa.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDataMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        btnDataMahasiswa.setText("DATA MAHASISWA");
        btnDataMahasiswa.setBorder(null);
        btnDataMahasiswa.setContentAreaFilled(false);
        btnDataMahasiswa.setOpaque(true);
        btnDataMahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDataMahasiswaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataMahasiswaMouseExited(evt);
            }
        });
        btnDataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataMahasiswaActionPerformed(evt);
            }
        });

        btnDataDosen.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDataDosen.setForeground(new java.awt.Color(255, 255, 255));
        btnDataDosen.setText("DATA DOSEN");
        btnDataDosen.setBackground(new java.awt.Color(92,184,92));
        btnDataDosen.setBorder(null);
        btnDataDosen.setContentAreaFilled(false);
        btnDataDosen.setOpaque(true);
        btnDataDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDataDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataDosenMouseExited(evt);
            }
        });
        btnDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataDosenActionPerformed(evt);
            }
        });

        btnDataJadwal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDataJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnDataJadwal.setText("DATA JADWAL");
        btnDataJadwal.setBackground(new java.awt.Color(92,184,92));
        btnDataJadwal.setBorder(null);
        btnDataJadwal.setContentAreaFilled(false);
        btnDataJadwal.setOpaque(true);
        btnDataJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDataJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataJadwalMouseExited(evt);
            }
        });
        btnDataJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataJadwalActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("KELUAR");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setBackground(new java.awt.Color(41, 43, 44));

        btnLogout.setBorder(null);

        btnLogout.setContentAreaFilled(false);

        btnLogout.setOpaque(true);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDataMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(labelIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnDataMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDataJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataMahasiswaActionPerformed
        this.dispose();
        new dataMahasiswaView().setVisible(true);
    }//GEN-LAST:event_btnDataMahasiswaActionPerformed

    private void btnDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataDosenActionPerformed
        this.dispose();
        new dataDosenView().setVisible(true);
    }//GEN-LAST:event_btnDataDosenActionPerformed

    private void btnDataJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataJadwalActionPerformed
        this.dispose();
        new dataJadwalView().setVisible(true);
    }//GEN-LAST:event_btnDataJadwalActionPerformed

    private void btnDataMahasiswaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataMahasiswaMouseEntered
        btnDataMahasiswa.setBackground(new java.awt.Color(102,194,102));
    }//GEN-LAST:event_btnDataMahasiswaMouseEntered

    private void btnDataMahasiswaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataMahasiswaMouseExited
        btnDataMahasiswa.setBackground(new java.awt.Color(92,184,92));
    }//GEN-LAST:event_btnDataMahasiswaMouseExited

    private void btnDataDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataDosenMouseEntered
        btnDataDosen.setBackground(new java.awt.Color(102, 194, 102));
    }//GEN-LAST:event_btnDataDosenMouseEntered

    private void btnDataDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataDosenMouseExited
        btnDataDosen.setBackground(new java.awt.Color(92,184,92));
    }//GEN-LAST:event_btnDataDosenMouseExited

    private void btnDataJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataJadwalMouseEntered
        btnDataJadwal.setBackground(new java.awt.Color(102,194,102));
    }//GEN-LAST:event_btnDataJadwalMouseEntered

    private void btnDataJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataJadwalMouseExited
        btnDataJadwal.setBackground(new java.awt.Color(92,184,92));
    }//GEN-LAST:event_btnDataJadwalMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setBackground(new java.awt.Color(71, 73, 74));
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah ANDA ingin keluar aplikasi?","KELAR",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {System.exit(0);}
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()){
            case KeyEvent.VK_1:
                this.dispose();
                new dataMahasiswaView().setVisible(true);
                break;
            case KeyEvent.VK_2:
                this.dispose();
                new dataDosenView().setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.dispose();
                new dataJadwalView().setVisible(true);
                break;
            case KeyEvent.VK_ESCAPE:
                int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah ANDA ingin keluar aplikasi?","KELAR",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION) {System.exit(0);}
                break;
        }
        /*
                this.dispose();
        new dataMahasiswaView().setVisible(true);
    }                                                

    private void btnDataDosenActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        new dataDosenView().setVisible(true);
    }                                            

    private void btnDataJadwalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.dispose();
        new dataJadwalView().setVisible(true);
        */
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataDosen;
    private javax.swing.JButton btnDataJadwal;
    private javax.swing.JButton btnDataMahasiswa;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIkon;
    // End of variables declaration//GEN-END:variables
}
