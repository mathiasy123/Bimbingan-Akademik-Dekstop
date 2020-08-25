
package com.bimbinganakademik.model;

public class dosenModel {
    
    private int NID;
    private String nama;
    private String password;
    private String jurusan;
    
    public dosenModel() {}
    
    public dosenModel(int NID, String nama, String password, String jurusan) {
        this.NID = NID;
        this.nama = nama;
        this.password = password;
        this.jurusan = jurusan;
    }
    
    public void setNID(int NID){this.NID = NID;}
    public void setNama(String nama){this.nama = nama;}
    public void setPassword(String password){this.password = password;}
    public void setJurusan(String jurusan){this.jurusan = jurusan;}
    
    public int getNID(){return NID;}
    public String getNama(){return nama;}
    public String getPassword(){return password;}
    public String getJurusan(){return jurusan;}
}
