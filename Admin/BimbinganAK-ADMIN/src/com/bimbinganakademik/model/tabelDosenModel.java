
package com.bimbinganakademik.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class tabelDosenModel extends AbstractTableModel {
    List<dosenModel> listDosen;
    
    public tabelDosenModel(List<dosenModel> listDosen){
        this.listDosen = listDosen;
    }
    @Override
    public int getColumnCount(){
        return 3;
    }
    @Override
    public int getRowCount(){
        return listDosen.size();
    }
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
            case 0:
                return "NID";
            case 1:
                return "Nama";
            case 2:
                return "Jurusan";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int baris, int kolom){
        switch(kolom){
            case 0:
                return listDosen.get(baris).getNID();
            case 1:
                return listDosen.get(baris).getNama();
            case 2:
                return listDosen.get(baris).getJurusan();
            default:
                return null;
        }
    }
}
