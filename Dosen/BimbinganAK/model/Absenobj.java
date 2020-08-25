
package bimbinganak.model;

public class Absenobj {
    private int No;
    private int nim;
    private String nama;
    private String kelas;

    private String jurusan;

    private int status;
    
    //setter
    public Absenobj(int no,int nim, String nama, String kelas, String jurusan, int status ){
    this.No = no;
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.jurusan = jurusan;
    this.status = status;
    }
    //getters
    public int getNo(){
    return No;
    }
    public int getNim(){
    return nim;
    }
    public String getNama(){
    return nama;
    }
    public String getKelas(){
    return kelas;
    }

    public String getJurusan(){
    return jurusan;
    }

    public int getStatus(){
    return status;
    }
    
}
