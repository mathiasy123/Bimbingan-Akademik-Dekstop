
package bimbinganak.controller;

import bimbinganak.view.Login;
import bimbinganak.view.MainView;
import bimbinganak.view.popupE;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginCtrl {
    private Login lg;
    private koneksiCtrl koneks = new koneksiCtrl("localhost","3306","bimbinganak");
    
    //VALIDASI LOGIN (NID DAN PASSWORD)
    public loginCtrl(Login lg,String id, String pass) {
        this.lg = lg;
            String sql = "SELECT * FROM dosen WHERE NID='"+id+"'AND password=MD5('"+pass+"')";
            int er=0;
            if(id.equals("")){
            er = 1;
            }else if(pass.equals("")){
            er = 2;
            }
        switch(er){
            case 1:
               JOptionPane.showMessageDialog(null,"kolom id kosong","Alert",JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
               JOptionPane.showMessageDialog(null,"kolom password kosong.","Alert",JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                break;
            case 0:
                this.lg(sql);
                break;
        }
    }
    
    public void lg(String sql){
        try{
            Connection conn = koneks.getConnection("root","");
            Statement stmt = conn.createStatement();
            Statement stmtt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rspass = stmtt.executeQuery(sql);
            if(rs.next()){
                new MainView(conn,rspass).setVisible(true);
                lg.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"NID atau password salah, silahkan coba lagi", "Gagal", JOptionPane.WARNING_MESSAGE);
                lg.clr();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Maaf tidak terhubung ke database");
        }
        }
}
