
package bimbinganak.model;


public class Jadwalobj {
    private int no;
    private String id;
    private String tanggal_awal;
    private String tanggal_akhir;

    //setters
    public Jadwalobj(int no,String id, String tanggal_awal,String tanggal_akhir){
    this.no = no;
    this.id = id;
    this.tanggal_awal = tanggal_awal;
    this.tanggal_akhir=tanggal_akhir;
    
    }
    
    //getters
    public int getNo(){
    return no;
    }
    public String getId(){
    return id;
    }
    public String getTanggalAw(){
    return tanggal_awal;
    }
    public String getTanggalAk(){
    return tanggal_akhir;
    }


    
    
}
