/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Minh Cuong
 */
public class KiemTraLanDauKB {
    private String MABN;

    public KiemTraLanDauKB(String MABN) {
        this.MABN = MABN;
    }
    
    
    
    public int check() throws ClassNotFoundException, SQLException {
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM BENHNHAN WHERE MaBenhNhan like ? AND NgayTiepNhan IS NULL";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            int x = ps.executeUpdate();
            return x;
    }
}
