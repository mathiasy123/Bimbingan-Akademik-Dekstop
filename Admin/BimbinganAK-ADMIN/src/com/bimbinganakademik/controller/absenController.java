
package com.bimbinganakademik.controller;

import com.bimbinganakademik.dao.absenDAO;
import com.bimbinganakademik.dao.absenDAOImplemen;
import com.bimbinganakademik.model.absenModel;
import com.bimbinganakademik.model.tabelAbsenModel;
import com.bimbinganakademik.view.dataAbsenView;
import java.util.List;
import javax.swing.JOptionPane;

public class absenController {
    private dataAbsenView absenView;
    private absenDAOImplemen implAbsen;
    private List<absenModel> dataAbsen;
    
    public absenController(dataAbsenView absenView){
        this.absenView = absenView;
        implAbsen = new absenDAO();
        dataAbsen = implAbsen.selectAbsen();
    }
    
    //MENGOSONGKAN FIELD TEXT PADA FORM MAHASISWA
    public void kosong(){
        absenView.getTxtNIM().setText("");
        absenView.getTxtNID().setText("");
        absenView.getTxtJadwal().setText("");
    }
    
    //MENAMPILKAN DATA KE DALAM TABEL MAHASISWA
    public void isiTabelAbsen(){
        //AMBIL DATA MAHASISWA DARI LIST YANG DIBUAT
        dataAbsen = implAbsen.selectAbsen();
        //MASUKAN DATA MAHASISWA KE OBJEK TABEL MAHASISWA
        tabelAbsenModel tabelAbsen = new tabelAbsenModel(dataAbsen);
        //TAMPILKAN HASIL
        absenView.getTabelAbsen().setModel(tabelAbsen);
    }
    
    //MEMASUKAN DATA (INSERT) YANG DIISI DARI FORM MAHASISWA
    public void insertTabelAbsen(){
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        if((!absenView.getTxtNIM().getText().trim().isEmpty()) & (!absenView.getTxtNID().getText().trim().isEmpty())){
            if(!absenView.getTxtJadwal().getText().trim().isEmpty()){
                //MENGAMBIL INPUTAN DARI TEXT FIELD DI FORM MAHASISWA
                absenModel absen = new absenModel();
                absen.setNIM(Integer.parseInt(absenView.getTxtNIM().getText()));
                absen.setNID(Integer.parseInt(absenView.getTxtNID().getText()));
                absen.setJadwalID(Integer.parseInt(absenView.getTxtJadwal().getText()));
                absen.setStatus(0);
                
                //MENG EKSEKUSI QUERY INSERT
                implAbsen.insertAbsen(absen);
            }else{
                JOptionPane.showMessageDialog(absenView, "Field form harus diisi semua");
            }
        }else{
            JOptionPane.showMessageDialog(absenView, "Field form harus diisi semua");
        }
    }
    
    public void deleteTabelAbsen(){
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        int id = absenView.absen.getID();  
        int NIM = absenView.absen.getNIM();
        implAbsen.deleteAbsen(id, NIM);
        
    }
}
