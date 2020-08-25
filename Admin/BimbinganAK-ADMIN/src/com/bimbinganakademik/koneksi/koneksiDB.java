
package com.bimbinganakademik.koneksi;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksiDB {
    
    private static Connection koneksi = null;
    private static Statement perintah = null;

    public static Connection bukaKoneksi(){
         if(koneksi == null){
            String url = "jdbc:mysql://localhost:3306/bimbinganak";
            String user = "root";
            String pass = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection(url, user, pass);
                perintah = koneksi.createStatement();
                JOptionPane.showMessageDialog(null, "Anda terhubung");
            } 
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Anda tidak terhubung, mohon coba lagi");
            }
        }
        return koneksi;
    }
    
    public static Connection tutupKoneksi(){
        if(koneksi != null) {
            try {
                koneksi.close();
            }
            catch(Exception e) {
                System.out.println("Gagal menutup koneksi");
            }
        }
        return koneksi;
    }
}
