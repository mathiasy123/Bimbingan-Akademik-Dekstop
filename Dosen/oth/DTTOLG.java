/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rento
 */
public class DTTOLG {
    public long toLong(String dt){
        
        long res=0;
        
        String[] date = dt.split("-");
        

        dt = "";
        dt= date[0]+date[1]+date[2];
        res =Long.parseLong(dt);
        
        return res;
    }    
    
        public long toLongSql(String dt){
        long res=0;
        
        String[] date = dt.split("-");
        

        dt = "";
        dt= date[0]+date[1]+date[2];
        res =Long.parseLong(dt);
        
        return res;
    }
    
    public long getDate(Connection conn){
        long res;
        String dt = "0000-00-00";
            
        String sql = "SELECT CURDATE() AS datenow";
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
            dt = rs.getString("datenow");
           }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        res = this.toLong(dt);
            
        return res;
    }
    
}
