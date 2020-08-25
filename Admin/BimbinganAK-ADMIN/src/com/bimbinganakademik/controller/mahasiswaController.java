
package com.bimbinganakademik.controller;

import com.bimbinganakademik.dao.mahasiswaDAO;
import com.bimbinganakademik.dao.mhsDAOImplemen;

import com.bimbinganakademik.model.tabelMahasiswaModel;
import com.bimbinganakademik.model.mahasiswaModel;

import com.bimbinganakademik.view.dataMahasiswaView;

import java.util.List;
import javax.swing.JOptionPane;

public class mahasiswaController {
    
    private dataMahasiswaView mhsView;
    private mhsDAOImplemen implMahasiswa;
    private List<mahasiswaModel> dataMhs;
    
    public mahasiswaController(dataMahasiswaView mhsView){
        this.mhsView = mhsView;
        implMahasiswa = new mahasiswaDAO();
        dataMhs = implMahasiswa.selectMhs();
    }
    
    //MENGOSONGKAN FIELD TEXT PADA FORM MAHASISWA
    public void kosong(){
        mhsView.getTxtNIM().setText("");
        mhsView.getTxtNama().setText("");
        mhsView.getTxtPassword().setText("");
        mhsView.getTxtJurusan().setSelectedIndex(0);
        mhsView.getTxtKelas().setSelectedIndex(0);
    }
    
    //MENAMPILKAN DATA KE DALAM TABEL MAHASISWA
    public void isiTabelMhs(){
        //AMBIL DATA MAHASISWA DARI LIST YANG DIBUAT
        dataMhs = implMahasiswa.selectMhs();
        //MASUKAN DATA MAHASISWA KE OBJEK TABEL MAHASISWA
        tabelMahasiswaModel tabelMhs = new tabelMahasiswaModel(dataMhs);
        //TAMPILKAN HASIL
        mhsView.getTabelMhs().setModel(tabelMhs);
    }
    
    //MEMASUKAN DATA (INSERT) YANG DIISI DARI FORM MAHASISWA
    public void insertTabelMhs(){
        
        if((!mhsView.getTxtNIM().getText().trim().isEmpty()) & (!mhsView.getTxtNama().getText().trim().isEmpty())){
            if(!mhsView.getTxtPassword().getText().trim().isEmpty()){
                //MENGAMBIL INPUTAN DARI TEXT FIELD DI FORM MAHASISWA
                mahasiswaModel mhs = new mahasiswaModel(Integer.parseInt(mhsView.getTxtNIM().getText()), mhsView.getTxtNama().getText(), mhsView.getTxtPassword().getText(), mhsView.getTxtJurusan().getSelectedItem().toString(), mhsView.getTxtKelas().getSelectedItem().toString());
                
                //MENG EKSEKUSI QUERY INSERT
                implMahasiswa.insertMhs(mhs);
            }else{
                JOptionPane.showMessageDialog(mhsView, "Field form harus diisi semua");
            }
        }else{
            JOptionPane.showMessageDialog(mhsView, "Field form harus diisi semua");
        }
    }
    
    //MENGUBAH DATA (UPDATE) YANG DIISI DARI FORM MAHASISWA
    public void updateTabelMhs(){
        
        if((!mhsView.getTxtNIM().getText().trim().isEmpty()) & (!mhsView.getTxtNama().getText().trim().isEmpty())){
            if(!mhsView.getTxtPassword().getText().trim().isEmpty()){
                mahasiswaModel mhs = new mahasiswaModel();
                mhs.setNIM(Integer.parseInt(mhsView.getTxtNIM().getText()));
                mhs.setNama(mhsView.getTxtNama().getText());
                mhs.setPassword(mhsView.getTxtPassword().getText());
                mhs.setJurusan(mhsView.getTxtJurusan().getSelectedItem().toString());
                mhs.setKelas(mhsView.getTxtKelas().getSelectedItem().toString());

                implMahasiswa.updateMhs(mhs);
            }else{
                JOptionPane.showMessageDialog(mhsView, "Field form harus diisi semua");
            }
        }else{
            JOptionPane.showMessageDialog(mhsView, "Field form harus diisi semua");
        }
    }
    
    public void deleteTabelMhs(){
 
        int nim = Integer.parseInt(mhsView.getTxtNIM().getText());
        implMahasiswa.deleteMhs(nim); 
    }
}
