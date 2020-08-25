
package com.bimbinganakademik.controller;

import com.bimbinganakademik.dao.dosenDAO;
import com.bimbinganakademik.dao.dosenDAOImplemen;

import com.bimbinganakademik.model.dosenModel;
import com.bimbinganakademik.model.tabelDosenModel;

import com.bimbinganakademik.view.dataDosenView;

import java.util.List;
import javax.swing.JOptionPane;

public class dosenController {
    
    private dataDosenView dosenView;
    private dosenDAOImplemen implDosen;
    private List<dosenModel> dataDosen;
    
    public dosenController(dataDosenView dosenView){
        this.dosenView = dosenView;
        implDosen = new dosenDAO();
        dataDosen = implDosen.selectDosen();
    }
    
    //MENGOSONGKAN FIELD TEXT PADA FORM MAHASISWA
    public void kosong(){
        dosenView.getTxtNID().setText("");
        dosenView.getTxtNama().setText("");
        dosenView.getTxtPassword().setText("");
        dosenView.getTxtJurusan().setSelectedIndex(0);
    }
    
    //MENAMPILKAN DATA KE DALAM TABEL MAHASISWA
    public void isiTabelDosen(){
        //AMBIL DATA MAHASISWA DARI LIST YANG DIBUAT
        dataDosen = implDosen.selectDosen();
        //MASUKAN DATA MAHASISWA KE OBJEK TABEL MAHASISWA
        tabelDosenModel tabelDosen = new tabelDosenModel(dataDosen);
        //TAMPILKAN HASIL
        dosenView.getTabelDosen().setModel(tabelDosen);
    }
    
    //MEMASUKAN DATA (INSERT) YANG DIISI DARI FORM MAHASISWA
    public void insertTabelDosen(){
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        if((!dosenView.getTxtNID().getText().trim().isEmpty()) & (!dosenView.getTxtNama().getText().trim().isEmpty())){
            if(!dosenView.getTxtPassword().getText().trim().isEmpty()){
                //MENGAMBIL INPUTAN DARI TEXT FIELD DI FORM MAHASISWA
                dosenModel dosen = new dosenModel(Integer.parseInt(dosenView.getTxtNID().getText()), dosenView.getTxtNama().getText(), dosenView.getTxtPassword().getText(), dosenView.getTxtJurusan().getSelectedItem().toString());
        
                //MENG EKSEKUSI QUERY INSERT
                implDosen.insertDosen(dosen);
            }else{
                JOptionPane.showMessageDialog(dosenView, "Field form harus diisi semua");
            }
        }else{
            JOptionPane.showMessageDialog(dosenView, "Field form harus diisi semua");
        }
    }
    
    //MENGUBAH DATA (UPDATE) YANG DIISI DARI FORM MAHASISWA
    public void updateTabelDosen(){
        
        //CEK JIKA FIELD ADA YANG KOSONG ATAU TIDAK
        if((!dosenView.getTxtNID().getText().trim().isEmpty()) & (!dosenView.getTxtNama().getText().trim().isEmpty())){
            if(!dosenView.getTxtPassword().getText().trim().isEmpty()){
                dosenModel dosen = new dosenModel();
                dosen.setNID(Integer.parseInt(dosenView.getTxtNID().getText()));
                dosen.setNama(dosenView.getTxtNama().getText());
                dosen.setPassword(dosenView.getTxtPassword().getText());
                dosen.setJurusan(dosenView.getTxtJurusan().getSelectedItem().toString());

                implDosen.updateDosen(dosen);
            }else{
                JOptionPane.showMessageDialog(dosenView, "Field form harus diisi semua");
            }
        }else{
            JOptionPane.showMessageDialog(dosenView, "Field form harus diisi semua");
        }
    }
    
    public void deleteTabelDosen(){

        int nid = Integer.parseInt(dosenView.getTxtNID().getText());
        implDosen.deleteDosen(nid);
    }
}
