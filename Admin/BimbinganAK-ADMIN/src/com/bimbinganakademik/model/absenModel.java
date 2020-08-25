
package com.bimbinganakademik.model;

public class absenModel {
    private int ID;
    private int NIM;
    private int NID;
    private int jadwal_id;
    private int status;
    
    public absenModel(){}
    
    public absenModel(int ID, int NIM, int NID, int jadwal_id, int status){
        this.ID = ID;
        this.NIM = NIM;
        this.NID = NID;
        this.jadwal_id = jadwal_id;
        this.status = status;
    }
    
    public void setID(int ID){this.ID = ID;}
    public void setNIM(int NIM){this.NIM = NIM;}
    public void setNID(int NID){this.NID = NID;}
    public void setJadwalID(int jadwal_id){this.jadwal_id = jadwal_id;}
    public void setStatus(int status){this.status = status;}
    
    public int getID(){return ID;}
    public int getNIM(){return NIM;}
    public int getNID(){return NID;}
    public int getJadwalID(){return jadwal_id;}
    public int getStatus(){return status;}
}
