
package bimbinganak.view;

import bimbinganak.controller.mainviewCtrl;
import com.sun.glass.events.KeyEvent;

import java.sql.Connection;
import java.sql.ResultSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import oth.DTTOLG;

public class MainView extends javax.swing.JFrame {
    private Connection conn;
    private Absen absen = new Absen();
    private DTTOLG conv = new DTTOLG();
    ArrayList<String> id = new ArrayList<String>();
    mainviewCtrl mv;

    public MainView() {
        initComponents();
        this.dispose();
    }
    
    public MainView(Connection conn, ResultSet rs) {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)JadwalTab.getModel();
        mv = new mainviewCtrl(this,conn,rs,model);
    }
    
    
    public void setNama(String a){nama.setText(a);}
    public void setNID(String a){NID.setText(a);}
    public String getNID(){return NID.getText();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        View = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JadwalTab = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        NID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bimbingan Akademik");
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(70, 112, 144));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        View.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        View.setBackground(new java.awt.Color(92,184,92));
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("DETAIL");
        View.setBorder(null);
        View.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View.setBorder(null);
        View.setContentAreaFilled(false);
        View.setOpaque(true);
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewMouseEntered(evt);
            }
        });
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        JadwalTab.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JadwalTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor", "Tanggal Awal", "Tanggal Akhir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JadwalTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JadwalTab.setSelectionBackground(new java.awt.Color(255, 255, 102));
        JadwalTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JadwalTabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(JadwalTab);
        if (JadwalTab.getColumnModel().getColumnCount() > 0) {
            JadwalTab.getColumnModel().getColumn(0).setResizable(false);
            JadwalTab.getColumnModel().getColumn(1).setResizable(false);
            JadwalTab.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(247, 247, 247));

        nama.setBackground(new java.awt.Color(51, 51, 51));
        nama.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nama.setText("NAMA");

        NID.setBackground(new java.awt.Color(102, 102, 102));
        NID.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        NID.setText("NID");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bimbinganak/img/user icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dosen");

        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("KELUAR");
        btnLogout.setBackground(new java.awt.Color(41, 43, 44));

        btnLogout.setBorder(null);

        btnLogout.setContentAreaFilled(false);

        btnLogout.setOpaque(true);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NID)
                            .addComponent(nama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        mv.view(JadwalTab);
    }//GEN-LAST:event_ViewActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah ANDA ingin keluar?", "logout", JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {System.exit(0);}
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setBackground(new java.awt.Color(71, 73, 74));
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setBackground(new java.awt.Color(41, 43, 44));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseEntered
        View.setBackground(new java.awt.Color(102,194,102));
    }//GEN-LAST:event_ViewMouseEntered

    private void ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseExited
        View.setBackground(new java.awt.Color(92,184,92));
    }//GEN-LAST:event_ViewMouseExited

    private void JadwalTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JadwalTabKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        mv.view(JadwalTab);
        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah ANDA ingin keluar?", "logout", JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {System.exit(0);}
        }
    }//GEN-LAST:event_JadwalTabKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah ANDA ingin keluar?", "logout", JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {System.exit(0);}
        }
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JadwalTab;
    private javax.swing.JLabel NID;
    private javax.swing.JButton View;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama;
    // End of variables declaration//GEN-END:variables
}
