
package com.bimbinganakademik.dao;

import com.bimbinganakademik.model.mahasiswaModel;

import java.util.List;

public interface mhsDAOImplemen {
    
    public void insertMhs(mahasiswaModel mhs);
    
    public void updateMhs(mahasiswaModel mhs);
    
    public void deleteMhs(int nim);
    
    public List<mahasiswaModel> selectMhs();
}
