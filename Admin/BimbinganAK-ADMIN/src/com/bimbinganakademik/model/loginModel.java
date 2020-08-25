
package com.bimbinganakademik.model;

public class loginModel {
    private int kode;
    private String password;
    
    public loginModel(){}
    
    public loginModel(int kode, String password){
        this.kode = kode;
        this.password = password;
    }
    
    public void setKode(int kode){this.kode = kode;}
    public void setPassword(String password){this.password = password;}
    
    public int getKode(){return kode;}
    public String getPassword(){return password;}
}
