
package bimbinganak.controller;

import bimbinganak.model.Absenobj;

import bimbinganak.view.Absen;
import bimbinganak.view.Validate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class absenCtrl {
    private ArrayList<String> id = new ArrayList<String>();
    
    private Absen absen;
    
    private Connection conn;
    
    private DefaultTableModel model;
    
    private String idosen;
    private String tgl;
    private boolean tkt =false;
    private Validate valid = new Validate();
    private String tglAw;
    private String tglAk;  
    private String idjd;
    private long tglN;
    
    //buat absen
    public absenCtrl(Absen abs,Connection conn,String idjd , String id, String tanggal_awal,String tanggal_akhir,DefaultTableModel modl){
        this.absen = abs;
        this.model = modl;
        absen.setPer("PERIODE "+tanggal_awal+" / "+tanggal_akhir);
        tglAw = tanggal_awal;
        tglAk = tanggal_akhir;
        
        idosen=id;
        this.idjd = idjd;

        try{
            String sql = "SELECT * FROM absen JOIN mahasiswa ON mahasiswa.NIM = absen.NIM WHERE pembimbing='"+id+"' AND jadwal_id='"+idjd+"' ORDER BY absen.id ASC";
        
            this.conn = conn;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Absenobj> absen = new ArrayList<Absenobj>();
            
            int i=1;
            
            while(rs.next()){
                Absenobj jdw = new Absenobj(i,rs.getInt("nim"),rs.getString("nama"),rs.getString("jurusan"),rs.getString("kelas"),rs.getInt("status"));
                this.id.add(rs.getString("id"));
                absen.add(jdw);
                i++;
            }
            
            i=1;
            int noo = i;
            for(Absenobj absenn : absen){  
                String hadir="";
                if(absenn.getStatus() == 1){
                    hadir = "hadir";
                }else{
                    hadir = "-";
                }
                
                Object[] data = {noo,absenn.getNim(),absenn.getNama(),absenn.getJurusan(),absenn.getKelas(),hadir};
                model.addRow(data);
                noo++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //VALIDASI
    public void valid(javax.swing.JTable AbsenTab){
        int row =-1;
        String nim ="";
       
        row = AbsenTab.getSelectedRow();
        try{
            nim = AbsenTab.getModel().getValueAt(row, 1).toString();
        }catch(Exception e){
            row =-1;
        }
        if(valid.isVisible()){
            row = -1;
        }
        if(row != -1){
            valid = new Validate(conn, id.get(row),nim,tglAw,tglAk,absen);
            valid.setVisible(true);
       }
    }
    
    //UPDATE ISI TABEL
    public void tabUpdate(){
        try{
            String sql = "SELECT * FROM absen JOIN mahasiswa ON mahasiswa.NIM = absen.NIM WHERE pembimbing='"+idosen+"' AND jadwal_id='"+idjd+"' ORDER BY absen.id ASC";
        
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Absenobj> absen = new ArrayList<Absenobj>();
            
            int i=1;
            
            model.setRowCount(0);
            while(rs.next()){
                Absenobj jdw = new Absenobj(i,rs.getInt("nim"),rs.getString("nama"),rs.getString("jurusan"),rs.getString("kelas"),rs.getInt("status"));
                this.id.add(rs.getString("id"));
                absen.add(jdw);
                i++;
            }
            
            i=1;
            int noo = i;
            
            for(Absenobj absenn : absen){
                String hadir="#ERROR";
                if(absenn.getStatus() == 1){
                    hadir = "hadir";
                }else{
                    hadir = "-";
                }
                
                Object[] data = {i,absenn.getNim(),absenn.getNama(),absenn.getJurusan(),absenn.getKelas(),hadir};
                model.addRow(data);
            
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
