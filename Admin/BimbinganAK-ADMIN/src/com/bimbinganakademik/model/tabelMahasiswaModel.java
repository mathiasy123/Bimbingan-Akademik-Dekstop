
package com.bimbinganakademik.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

//CLASS INI UNTUK MENGATUR TABEL YANG ADA DI VIEW MAHASISWA (ADMIN)
public class tabelMahasiswaModel extends AbstractTableModel {
    
    List<mahasiswaModel> listMahasiswa;
    
    public tabelMahasiswaModel(List<mahasiswaModel> listMahasiswa){
        this.listMahasiswa = listMahasiswa;
    }
    @Override
    public int getColumnCount(){
        return 4;
    }
    @Override
    public int getRowCount(){
        return listMahasiswa.size();
    }
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "Jurusan";
            case 3:
                return "Kelas";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int baris, int kolom){
        switch(kolom){
            case 0:
                return listMahasiswa.get(baris).getNIM();
            case 1:
                return listMahasiswa.get(baris).getNama();
            case 2:
                return listMahasiswa.get(baris).getJurusan();
            case 3:
                return listMahasiswa.get(baris).getKelas();
            default:
                return null;
        }
    }
}
