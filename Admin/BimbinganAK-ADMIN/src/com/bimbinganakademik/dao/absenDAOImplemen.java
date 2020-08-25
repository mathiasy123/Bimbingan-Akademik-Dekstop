
package com.bimbinganakademik.dao;

import com.bimbinganakademik.model.absenModel;

import java.util.List;

public interface absenDAOImplemen {
    
    public void insertAbsen(absenModel jadwal);
    
    public void deleteAbsen(int id, int NIM);
    
    public List<absenModel> selectAbsen();
}
