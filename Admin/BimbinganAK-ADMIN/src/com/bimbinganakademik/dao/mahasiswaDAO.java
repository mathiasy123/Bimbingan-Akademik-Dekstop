
package com.bimbinganakademik.dao;

import com.bimbinganakademik.koneksi.koneksiDB;

import com.bimbinganakademik.model.mahasiswaModel;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class mahasiswaDAO implements mhsDAOImplemen {
    Connection koneksi;
    
    private final String INSERT = "INSERT INTO mahasiswa (NIM, nama, password, jurusan, kelas, pembimbing) VALUES (?, ?, MD5(?), ?, ?, NULL)";
    private final String UPDATE = "UPDATE mahasiswa SET nama = ?, password = MD5(?), jurusan = ?, kelas = ? WHERE NIM = ?";
    private final String DELETE = "DELETE FROM mahasiswa WHERE NIM = ?";
    private final String SELECT = "SELECT * FROM mahasiswa";

    public mahasiswaDAO() {
        koneksi = koneksiDB.bukaKoneksi();
    }
    
    @Override
    public void insertMhs(mahasiswaModel mhs){
        PreparedStatement statInsert = null;
        try{
            statInsert = this.koneksi.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

            statInsert.setInt(1, mhs.getNIM());
            statInsert.setString(2, mhs.getNama());
            statInsert.setString(3, mhs.getPassword());
            statInsert.setString(4, mhs.getJurusan());
            statInsert.setString(5, mhs.getKelas());
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statInsert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil di tambah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data mahasiswa gagal di tambah");
        } 
    }
    
    @Override
    public void updateMhs(mahasiswaModel mhs){
        PreparedStatement statUpdate = null;
     
        try{
            statUpdate = this.koneksi.prepareStatement(UPDATE);

            statUpdate.setString(1, mhs.getNama());
            statUpdate.setString(2, mhs.getPassword());
            statUpdate.setString(3, mhs.getJurusan());
            statUpdate.setString(4, mhs.getKelas());
            statUpdate.setInt(5, mhs.getNIM());
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate()
            statUpdate.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil di ubah");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data mahasiswa gagal di ubah");
        }
    }
    
    public void deleteMhs(int nim){
        PreparedStatement statDelete = null;
       
        try{
            statDelete = koneksi.prepareStatement(DELETE, Statement.RETURN_GENERATED_KEYS);
            statDelete.setInt(1, nim);
            
            //INSERT, DELETE, UPDATE menggunakan executeUpdate() 
            statDelete.executeUpdate();
        }
        catch(SQLException error){
           JOptionPane.showMessageDialog(null, "Data mahasiswa gagal di hapus");
        }
    }
    
    @Override
    public List<mahasiswaModel> selectMhs(){
        List<mahasiswaModel> dataMhs = null;
        
        try{
            dataMhs = new ArrayList<mahasiswaModel>();
            Statement statSelect = koneksi.createStatement();
            
            //SELECT menggunakan executeQuery()
            ResultSet hasilSelect = statSelect.executeQuery(SELECT);
            
            while(hasilSelect.next()){
                mahasiswaModel mhsModel = new mahasiswaModel();
                mhsModel.setNIM(hasilSelect.getInt(1));
                mhsModel.setNama(hasilSelect.getString(2));
                mhsModel.setPassword(hasilSelect.getString(3));
                mhsModel.setJurusan(hasilSelect.getString(4));
                mhsModel.setKelas(hasilSelect.getString(5));
                
                dataMhs.add(mhsModel);
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Data mahasiswa gagal di ambil");
        }
        
        return dataMhs;
    }
}
    