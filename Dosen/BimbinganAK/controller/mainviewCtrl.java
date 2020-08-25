
package bimbinganak.controller;

import bimbinganak.model.Jadwalobj;
import bimbinganak.view.Absen;
import bimbinganak.view.MainView;
import bimbinganak.view.popupE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oth.DTTOLG;

public class mainviewCtrl {
    private MainView mv;
    
    private Connection conn;
    private DefaultTableModel model;
    
    private Absen absen = new Absen();
    private DTTOLG conv = new DTTOLG();
    
    private ArrayList<String> id = new ArrayList<String>();
    
    //MEMBUAT HALAMAN BERANDA
    public mainviewCtrl(MainView mvv,Connection conn,ResultSet rs,DefaultTableModel model){
        this.conn = conn;
        this.mv = mvv;
        this.model = model;
        try {
            if(rs.next()){
                mv.setNama(rs.getString("nama"));
                mv.setNID(rs.getString("NID"));
            }
            try{
            String sql = "SELECT jadwal.id AS jdwid,jadwal.tanggal_awal,jadwal.tanggal_akhir FROM jadwal INNER JOIN absen ON absen.jadwal_id = jadwal.id INNER JOIN mahasiswa ON absen.NIM = mahasiswa.NIM WHERE pembimbing='"+mv.getNID()+"' ORDER BY jdwid ASC,tanggal_akhir DESC,tanggal_awal DESC";
            //String sql = "SELECT jadwal.id,jadwal.tanggal_awal,jadwal.tanggal_akhir FROM jadwal INNER JOIN absen ON absen.jadwal_id = jadwal.id INNER JOIN mahasiswa ON absen.NIM = mahasiswa.NIM WHERE pembimbing='"+mv.getNID()+"' ORDER BY tanggal_akhir DESC,tanggal_awal DESC";
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<Jadwalobj> jadwal = new ArrayList<Jadwalobj>();
            int i=1;
            
            while(rs.next()){
                Jadwalobj jdw = new Jadwalobj(i,rs.getString("jdwid"),rs.getString("tanggal_awal"),rs.getString("tanggal_akhir"));

                jadwal.add(jdw);
                i++;
            }
            String tglch = "";
            String tglchh = "";  
            long idck=-1;
            i=0;
            int noo = 1;
            for(Jadwalobj jadwall : jadwal){
                boolean ck = true;
                
                long jdwid = Long.parseLong(jadwall.getId());
                
                String tglaw = jadwall.getTanggalAw();
                String tglak = jadwall.getTanggalAk();
                long datenow = conv.getDate(this.conn);
                long tglck = conv.toLongSql(tglak);
                Object[] data = {noo,tglaw,tglak};
                if(idck != jdwid){
                    if(datenow < tglck){
                        model.addRow(data);
                        this.id.add(jadwal.get(i).getId());
                        noo++;
                    }
                    idck = jdwid;
                }
                
                if(i < jadwal.size()-1){i++;}
            }
            
            }catch(Exception e){
                new popupE(e).setVisible(true);
                e.printStackTrace();
            }
        } catch (SQLException e) {
           new popupE(e).setVisible(true);
        }
    }
    
    //KETIKA VIEW BUTTON DI KLIK
    public void view(javax.swing.JTable JadwalTab){
        int row = -1;
        String tanggal_awal="";
        String tanggal_akhir="";
        String id ="";
        
        row = JadwalTab.getSelectedRow();
        try{
           
            tanggal_awal = JadwalTab.getModel().getValueAt(row, 1).toString();
            tanggal_akhir = JadwalTab.getModel().getValueAt(row, 2).toString();
        }catch(Exception e){
            row =-1;
        }
        if(absen.isVisible()){
            row = -1;
        }
        if(row != -1){
            absen = new Absen(conn,this.id.get(row),mv.getNID(),tanggal_awal,tanggal_akhir);
            absen.setVisible(true);
       }
    }
}
