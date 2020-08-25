
package com.bimbinganakademik.dao;

import com.bimbinganakademik.koneksi.koneksiDB;
import com.bimbinganakademik.model.absenModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class absenDAO implements absenDAOImplemen {
    Connection koneksi;
    
    private final String INSERT = "INSERT INTO absen (jadwal_id, NIM, NID, status) VALUES (?, ?, ?, ?)";
    private final String UPDATE = "UPDATE mahasiswa SET pembimbing = ? WHERE NIM = ?";
    private final String UPDATE2 = "UPDATE mahasiswa SET pembimbing = NULL WHERE NIM = ?";
    private final String DELETE = "DELETE FROM absen WHERE id = ?";
    private final String SELECT = "SELECT * FROM absen";

    public absenDAO() {
        koneksi = koneksiDB.bukaKoneksi();
    }
    
   @Override 
   public void insertAbsen(absenModel absen){
        PreparedStatement statInsert = null;
        PreparedStatement statUpdate = null;
        try{
            statUpdate = this.koneksi.prepareStatement(UPDATE);
            statUpdate.setInt(1, absen.getNID());
            statUpdate.setInt(2, absen.getNIM());
            
            statUpdate.executeUpdate();
            
            statInsert = this.koneksi.prepareStatement(INSERT);
            
            statInsert.setInt(1, absen.getJadwalID());
            statInsert.setInt(2, absen.getNIM());
            statInsert.setInt(3, absen.getNID());
            statInsert.setInt(4, absen.getStatus());

            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statInsert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data absen berhasil di tambah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data absen gagal di tambah");
        } 
    }
    
    public void deleteAbsen(int id, int NIM){
        PreparedStatement statDelete = null;
        PreparedStatement statUpdate2 = null;
        try{
            statUpdate2 = koneksi.prepareStatement(UPDATE2);
            statUpdate2.setInt(1, NIM);
            statUpdate2.executeUpdate();
            
            statDelete = koneksi.prepareStatement(DELETE);
            statDelete.setInt(1, id);
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate() 
            statDelete.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data absen berhasil di hapus");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data absen gagal di hapus");
        }
    }
    
    @Override
    public List<absenModel> selectAbsen(){
        List<absenModel> dataAbsen = null;
        
        try{
            dataAbsen = new ArrayList<absenModel>();
            Statement statSelect = koneksi.createStatement();
            
            //SELECT menggunakan executeQuery()
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                absenModel absModel = new absenModel();
                absModel.setID(hasilSelect.getInt(1));
                absModel.setJadwalID(hasilSelect.getInt(2));
                absModel.setNIM(hasilSelect.getInt(3));
                absModel.setNID(hasilSelect.getInt(4));
                absModel.setStatus(0);
                
                dataAbsen.add(absModel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data absen gagal di ambil");
        }
        
        return dataAbsen;
    }
}
