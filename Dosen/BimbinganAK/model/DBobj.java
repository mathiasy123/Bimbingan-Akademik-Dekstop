
package bimbinganak.model;



public class DBobj {
    
    private String ip;
    private String port;
    private String db;
    
    //Setters1
    public DBobj(String ip, String port, String db) {
        this.ip = ip;
        this.port = port;
        this.db = db;
    }

    public DBobj() {
        
    }
    
    //Getters
    public String getIp(){
    return ip;
    }
    public String getPort(){
    return port;
    }
    public String getDb(){
    return db;
    }
    
    //Setters2
    public void setIp(String ip){
    this.ip = ip;
    }
    
    public void setPort(String port){
    this.port = port;
    }
    
    public void setDb(String db){
    this.db = db;
    }
    
}
