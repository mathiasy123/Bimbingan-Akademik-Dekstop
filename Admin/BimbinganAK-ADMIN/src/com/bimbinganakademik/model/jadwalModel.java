
package com.bimbinganakademik.model;

public class jadwalModel {
    private int ID;
    private String tanggalAwal;
    private String tanggalAkhir;
    
    public jadwalModel(){}
    
    public jadwalModel(int ID, String tanggalAwal, String tanggalAkhir, String status){
        this.ID = ID;
        this.tanggalAwal = tanggalAwal;
        this.tanggalAkhir = tanggalAkhir;
    }
    
    public void setID(int ID){this.ID = ID;}
    public void setTanggalAwal(String tanggalAwal){this.tanggalAwal = tanggalAwal;}
    public void setTanggalAkhir(String tanggalAkhir){this.tanggalAkhir = tanggalAkhir;}
    
    public int getID(){return ID;}
    public String getTanggalAwal(){return tanggalAwal;}
    public String getTanggalAkhir(){return tanggalAkhir;}
}
