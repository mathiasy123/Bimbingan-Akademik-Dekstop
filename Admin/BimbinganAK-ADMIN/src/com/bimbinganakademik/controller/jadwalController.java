
package com.bimbinganakademik.controller;

import com.bimbinganakademik.dao.jadwalDAO;
import com.bimbinganakademik.dao.jadwalDAOImplemen;

import com.bimbinganakademik.model.jadwalModel;
import com.bimbinganakademik.model.tabelJadwalModel;

import com.bimbinganakademik.view.dataJadwalView;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class jadwalController {
    private String tanggalAwal;
    private String tanggalAkhir;
    
    private dataJadwalView jadwalView;
    private jadwalDAOImplemen implJadwal;
    private List<jadwalModel> dataJadwal;
    
    public jadwalController(dataJadwalView jadwalView){
        this.jadwalView = jadwalView;
        implJadwal = new jadwalDAO();
        dataJadwal = implJadwal.selectJadwal();
    }
    
    //MENGOSONGKAN FIELD TEXT PADA FORM MAHASISWA
    public void kosong(){
        jadwalView.getTxtTanggalAwal().setDate(null);
        jadwalView.getTxtTanggalAkhir().setDate(null);
    }
    
    //MENAMPILKAN DATA KE DALAM TABEL MAHASISWA
    public void isiTabelJadwal(){
        //AMBIL DATA MAHASISWA DARI LIST YANG DIBUAT
        dataJadwal = implJadwal.selectJadwal();
        //MASUKAN DATA MAHASISWA KE OBJEK TABEL MAHASISWA
        tabelJadwalModel tabelJadwal = new tabelJadwalModel(dataJadwal);
        //TAMPILKAN HASIL
        jadwalView.getTabelJadwal().setModel(tabelJadwal);
    }
    
    //MEMASUKAN DATA (INSERT) YANG DIISI DARI FORM MAHASISWA
    public void insertTabelJadwal(){
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        
        tanggalAwal = ((JTextField)jadwalView.getTxtTanggalAwal().getDateEditor().getUiComponent()).getText();
        tanggalAkhir = ((JTextField)jadwalView.getTxtTanggalAkhir().getDateEditor().getUiComponent()).getText();
        
        if(!(tanggalAwal.isEmpty()) & !(tanggalAkhir.isEmpty())){

            //MENGAMBIL INPUTAN DARI TEXT FIELD DI FORM MAHASISWA
            jadwalModel jadwal = new jadwalModel();
            jadwal.setTanggalAwal(tanggalAwal);
            jadwal.setTanggalAkhir(tanggalAkhir);

            //MENG EKSEKUSI QUERY INSERT
            implJadwal.insertJadwal(jadwal);
        }else{
            JOptionPane.showMessageDialog(jadwalView, "Field form harus diisi semua");
        }
    }
    
    public void deleteTabelJadwal(){
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        int id = jadwalView.jadwal.getID();    
        implJadwal.deleteJadwal(id);
        
    }
}
