
package com.bimbinganakademik.controller;

import com.bimbinganakademik.koneksi.koneksiDB;
import com.bimbinganakademik.model.loginModel;
import com.bimbinganakademik.view.adminView;
import com.bimbinganakademik.view.loginView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginController {
    private loginView logView = new loginView();
    private Connection koneksi;
    private final String SELECT = "SELECT * FROM admin WHERE kode_admin = ? AND password = ?";
    private PreparedStatement statLogin;
    
    public void setKoneksi(Connection koneksi) throws SQLException{
        this.koneksi = koneksiDB.bukaKoneksi();
        this.statLogin = this.koneksi.prepareStatement(SELECT);
    }

    public boolean validasiLogin(loginModel log){
        boolean cek = false;
        try {
            statLogin.setInt(1, log.getKode());
            statLogin.setString(2, log.getPassword());

            ResultSet hasilValidasi = statLogin.executeQuery();

            if(hasilValidasi.next()){
                loginModel lgModel = new loginModel(hasilValidasi.getInt("kode_admin"), hasilValidasi.getString("password"));
                cek = true;
                new adminView().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(logView, "Kode identitas atau password salah");
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(logView, "Gagal login, silahkan coba lagi");
            
        }
        return cek;
    }
}

