
package com.bimbinganakademik.dao;

import com.bimbinganakademik.koneksi.koneksiDB;

import com.bimbinganakademik.model.jadwalModel;
import com.bimbinganakademik.model.mahasiswaModel;
import com.bimbinganakademik.view.dataJadwalView;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class jadwalDAO implements jadwalDAOImplemen {
    Connection koneksi;
    
    private java.sql.Date sqlAwal;
    private java.sql.Date sqlAkhir;
    private java.util.Date formatTanggalAwal;
    private java.util.Date formatTanggalAkhir;
    
    private final String INSERT = "INSERT INTO jadwal (tanggal_awal, tanggal_akhir) VALUES (?, ?)";
    private final String DELETE = "DELETE FROM jadwal WHERE id = ?";
    private final String SELECT = "SELECT * FROM jadwal";

    public jadwalDAO() {
        koneksi = koneksiDB.bukaKoneksi();
    }
    
    @Override
   public void insertJadwal(jadwalModel jadwal){
        PreparedStatement statInsert = null;
        try{
            String tglAwal = jadwal.getTanggalAwal();
            String tglAkhir = jadwal.getTanggalAkhir();
            try {
                formatTanggalAwal = new SimpleDateFormat("yyyy-MM-dd").parse(tglAwal);
                sqlAwal = new java.sql.Date(formatTanggalAwal.getTime());
                formatTanggalAwal = new SimpleDateFormat("yyyy-MM-dd").parse(tglAkhir);
                sqlAkhir = new java.sql.Date(formatTanggalAwal.getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Gagal input tanggal");
            }
            
            statInsert = this.koneksi.prepareStatement(INSERT);
            
            statInsert.setDate(1, sqlAwal);
            statInsert.setDate(2, sqlAkhir);
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statInsert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data jadwal berhasil di tambah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data jadwal gagal di tambah");
        } 
    }
    
    public void deleteJadwal(int id){
        PreparedStatement statDelete = null;
       
        try{
            statDelete = koneksi.prepareStatement(DELETE, Statement.RETURN_GENERATED_KEYS);
            statDelete.setInt(1, id);
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate() 
            statDelete.executeUpdate();
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data jadwal gagal di hapus");
        }
    }
    
    @Override
    public List<jadwalModel> selectJadwal(){
        List<jadwalModel> dataJadwal = null;
        
        try{
            dataJadwal = new ArrayList<jadwalModel>();
            Statement statSelect = koneksi.createStatement();
            
            //SELECT menggunakan executeQuery()
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                jadwalModel jwdModel = new jadwalModel();
                jwdModel.setID(hasilSelect.getInt(1));
                jwdModel.setTanggalAwal(hasilSelect.getString(2));
                jwdModel.setTanggalAkhir(hasilSelect.getString(3));
                
                dataJadwal.add(jwdModel);
            }
        }
        catch(SQLException error){
            System.out.println("Gagal untuk mengambil data jadwal");
        }
        
        return dataJadwal;
    }
}
