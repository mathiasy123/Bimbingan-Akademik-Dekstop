
package com.bimbinganakademik.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelAbsenModel extends AbstractTableModel {
    List<absenModel> listAbsen;
    
    public tabelAbsenModel(List<absenModel> listAbsen){
        this.listAbsen = listAbsen;
    }
    @Override
    public int getColumnCount(){
        return 5;
    }
    @Override
    public int getRowCount(){
        return listAbsen.size();
    }
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
            case 0:
                return "ID";
            case 1:
                return "Jadwal";
            case 2:
                return "NIM";
            case 3:
                return "NID";
            case 4:
                return "Status";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int baris, int kolom){
        switch(kolom){
            case 0:
                return listAbsen.get(baris).getID();
            case 1:
                return listAbsen.get(baris).getJadwalID();
            case 2:
                return listAbsen.get(baris).getNIM();
            case 3:
                return listAbsen.get(baris).getNID();
            case 4:
                return listAbsen.get(baris).getStatus();
            default:
                return null;
        }
    }
}
