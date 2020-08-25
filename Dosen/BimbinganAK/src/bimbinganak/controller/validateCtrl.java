
package bimbinganak.controller;

import bimbinganak.view.Absen;
import bimbinganak.view.Validate;
import bimbinganak.view.popupE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class validateCtrl {
    
    private Connection conn;
    private String nim;
    private String tglAw;
    private String tglAk;
    private String id;
    private Absen abs;
    
    Validate vl;
    
    public validateCtrl(Validate vll,Connection conn,String id, String nim,String tglAw,String tglAk,Absen abs){
        this.nim = nim;
        this.id = id;
       
        this.tglAw = tglAw;
        this.tglAk = tglAk;
        this.conn= conn;
        this.abs = abs;
        vl = vll;
        
        try {
            String sql = "SELECT nama FROM mahasiswa WHERE NIM='"+nim+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                vl.setTit(nim+" - "+rs.getString("nama"));
            }
        } catch (SQLException ex) {
            new popupE(ex).setVisible(true);
        }
    }
    
    //SUBMIT VALIDASI
    public void submit(){
        boolean cek = false;
        int er =0;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE NIM='"+nim+"' and password=MD5('"+vl.getpass()+"')";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){cek = true;}
            
            if(!cek){
                er = 1;
            }
        } catch (SQLException e) {
            new popupE(e).setVisible(true);
        }
        if(vl.getket().equals("")){
            cek = false;
            er = 2;
        }
        if(vl.getpass().equals("")){
        cek = false;
        er = 3;
        }
        
        switch(er){
            case 1:
                vl.clrpass();
                JOptionPane.showMessageDialog(null,"Password mahasiswa salah.","Alert",JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Harap isi keterangan.","Alert",JOptionPane.WARNING_MESSAGE); 
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Harap isi Password.","Alert",JOptionPane.WARNING_MESSAGE); 
                break;
        }
        
        if(cek){
            try {
                String sql="";
                String sqlck = "SELECT id FROM keterangan WHERE id='"+id+"'";
                Statement stmtt = conn.createStatement();
                ResultSet rs = stmtt.executeQuery(sqlck);
                if(rs.next()){
                    sql = "UPDATE keterangan SET keterangan='"+vl.getket()+"' WHERE id='"+id+"'";
                }else{
                    sql = "INSERT INTO keterangan(id, keterangan) VALUES ('"+id+"','"+vl.getket()+"')";
                }
            
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                new popupE(e).setVisible(true);
            }
            
            try {
                String sql = "UPDATE absen SET status='1' WHERE id='"+id+"'";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                new popupE(e).setVisible(true);
            }
            abs.tabUpdate();
            vl.dispose();
        }
    }
}
