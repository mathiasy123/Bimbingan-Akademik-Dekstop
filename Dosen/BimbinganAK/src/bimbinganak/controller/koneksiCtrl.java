
package bimbinganak.controller;

import bimbinganak.model.DBobj;
import bimbinganak.view.popupE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class koneksiCtrl {
    
    private Connection conn;
    private DBobj db = new DBobj();
    
    //KONEKSI DARI JSON
    public koneksiCtrl(){
       try{
            String aa = System.getProperty("user.home")+"/.BimbingProgFile/config/db_con.json";
            BufferedReader buff = new BufferedReader(new FileReader(aa));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke database");
        }
    }
    
    //KONEKSI TANPA JSON
    public koneksiCtrl(String ip, String port, String db){
       this.db.setIp(ip);
       this.db.setPort(port);
       this.db.setDb(db);
    }
    
    //RETURN CONNECTION
    public Connection getConnection(String user, String pass){
        try{
            String DB_URL = "jdbc:mysql://"+db.getIp()+":"+db.getPort()+"/"+db.getDb()+"";
            this.conn = DriverManager.getConnection(DB_URL, user, pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Tidak Terhubung ke database","Alert",JOptionPane.WARNING_MESSAGE);
        }
        return this.conn;
    }
    
    //SAVE KONEKSI KE JSON
    public void saveConnection(){
       /* Gson gs = new GsonBuilder().setPrettyPrinting().create();
        String rs = gs.toJson(this.db);
        
        String aa = System.getProperty("user.home")+"/.BimbingProgFile/config/db_con.json";
        
        try{
            FileWriter wr = new FileWriter(aa); 
            wr.write(rs);
            wr.flush();
            wr.close();
        }catch(Exception e){
            new popupE(e).setVisible(true);
        };/**/
    }
    
    public DBobj getDb(){
        return db;
    }
}
