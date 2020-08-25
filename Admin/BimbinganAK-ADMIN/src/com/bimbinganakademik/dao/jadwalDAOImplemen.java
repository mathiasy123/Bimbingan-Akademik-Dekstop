
package com.bimbinganakademik.dao;

import com.bimbinganakademik.model.jadwalModel;
import java.util.List;

public interface jadwalDAOImplemen {
    
    public void insertJadwal(jadwalModel jadwal);
    
    public void deleteJadwal(int id);
    
    public List<jadwalModel> selectJadwal();
}
