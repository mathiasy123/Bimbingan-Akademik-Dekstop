
package com.bimbinganakademik.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelJadwalModel extends AbstractTableModel {
    
    List<jadwalModel> listJadwal;
    
    public tabelJadwalModel(List<jadwalModel> listJadwal){
        this.listJadwal = listJadwal;
    }
    @Override
    public int getColumnCount(){
        return 3;
    }
    @Override
    public int getRowCount(){
        return listJadwal.size();
    }
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
            case 0:
                return "ID";
            case 1:
                return "Tanggal Awal";
            case 2:
                return "Tanggal Akhir";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int baris, int kolom){
        switch(kolom){
            case 0:
                return listJadwal.get(baris).getID();
            case 1:
                return listJadwal.get(baris).getTanggalAwal();
            case 2:
                return listJadwal.get(baris).getTanggalAkhir();
            default:
                return null;
        }
    }
}
