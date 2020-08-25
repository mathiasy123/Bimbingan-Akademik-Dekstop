
package com.bimbinganakademik.model;

//CLASS INI BUAT MENGAMBIL DATA DENGAN TEKNIK SET DAN GET, LALU DI ALIHKAN KE TABEL MODEL MAHASISWA (ADMIN)
public class mahasiswaModel {
    
    private int NIM;
    private String nama;
    private String password;
    private String jurusan;
    private String kelas;
    
    public mahasiswaModel(){}
    
    public mahasiswaModel(int NIM, String nama, String password, String jurusan, String kelas){
        this.NIM = NIM;
        this.nama = nama;
        this.password = password;
        this.jurusan = jurusan;
        this.kelas = kelas;
    }
    
    public void setNIM(int NIM){this.NIM = NIM;}
    public void setNama(String nama){this.nama = nama;}
    public void setPassword(String password){this.password = password;}   
    public void setJurusan(String jurusan){this.jurusan = jurusan;}
    public void setKelas(String kelas){this.kelas = kelas;}
    
    public int getNIM(){return NIM;}
    public String getNama(){return nama;}
    public String getPassword(){return password;}
    public String getJurusan(){return jurusan;}
    public String getKelas(){return kelas;} 
}
