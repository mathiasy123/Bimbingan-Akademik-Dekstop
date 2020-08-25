
package com.bimbinganakademik.dao;

import com.bimbinganakademik.model.dosenModel;

import java.util.List;

public interface dosenDAOImplemen {
    
    public void insertDosen(dosenModel dosen);
    
    public void updateDosen(dosenModel dosen);
    
    public void deleteDosen(int nid);
    
    public List<dosenModel> selectDosen();
    
}
