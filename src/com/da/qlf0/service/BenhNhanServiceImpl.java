/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.service;

import com.da.qlf0.dao.BenhNhanDAO;
import com.da.qlf0.dao.BenhNhanDAOImpl;
import com.da.qlf0.model.BenhNhan;
import java.util.ArrayList;

/**
 *
 * @author Minh Cuong
 */
public class BenhNhanServiceImpl implements BenhNhanService {
    
    private BenhNhanDAO benhNhanDAO =null;
    public BenhNhanServiceImpl(){
        this.benhNhanDAO= new BenhNhanDAOImpl();
    }
    public ArrayList<BenhNhan> getList(){
       return benhNhanDAO.getList();
   }
}
