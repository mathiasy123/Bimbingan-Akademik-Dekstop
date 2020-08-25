
package com.bimbinganakademik.dao;

import com.bimbinganakademik.koneksi.koneksiDB;

import com.bimbinganakademik.model.dosenModel;
import com.bimbinganakademik.model.mahasiswaModel;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class dosenDAO implements dosenDAOImplemen {
    Connection koneksi;
    
    private final String INSERT = "INSERT INTO dosen (NID, nama, password, jurusan) VALUES (?, ?, MD5(?), ?)";
    private final String UPDATE = "UPDATE dosen SET nama = ?, password = MD5(?), jurusan = ? WHERE NID = ?";
    private final String DELETE = "DELETE FROM dosen WHERE NID = ?";
    private final String SELECT = "SELECT * FROM dosen";

    public dosenDAO() {
        koneksi = koneksiDB.bukaKoneksi();
    }
    
    @Override
    public void insertDosen(dosenModel dosen){
        PreparedStatement statInsert = null;
        try{
            statInsert = this.koneksi.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

            statInsert.setInt(1, dosen.getNID());
            statInsert.setString(2, dosen.getNama());
            statInsert.setString(3, dosen.getPassword());
            statInsert.setString(4, dosen.getJurusan());
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statInsert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data dosen berhasil di tambah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data dosen gagal di tambah");
        } 
    }
    
    @Override
    public void updateDosen(dosenModel dosen){
        PreparedStatement statUpdate = null;
     
        try{
            statUpdate = this.koneksi.prepareStatement(UPDATE);
            
            statUpdate.setString(1, dosen.getNama());
            statUpdate.setString(2, dosen.getPassword());
            statUpdate.setString(3, dosen.getJurusan());
            statUpdate.setInt(4, dosen.getNID());
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statUpdate.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data dosen berhasil di ubah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data dosen gagal di ubah");
        }
    }
    
    public void deleteDosen(int nid){
        PreparedStatement statDelete = null;
       
        try{
            statDelete = koneksi.prepareStatement(DELETE);
            statDelete.setInt(1, nid);
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate() 
            statDelete.executeUpdate();
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data dosen gagal di hapus");
        }
    }
    
    @Override
    public List<dosenModel> selectDosen(){
        List<dosenModel> dataDosen = null;
        
        try{
            dataDosen = new ArrayList<dosenModel>();
            Statement statSelect = koneksi.createStatement();
            
            //SELECT menggunakan executeQuery()
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                dosenModel dosenModel = new dosenModel();
                dosenModel.setNID(hasilSelect.getInt(1));
                dosenModel.setNama(hasilSelect.getString(2));
                dosenModel.setPassword(hasilSelect.getString(3));
                dosenModel.setJurusan(hasilSelect.getString(4));
                
                dataDosen.add(dosenModel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data dosen gagal di ambil");
        }

        return dataDosen;
    }   
}
