/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

/**
 *
 * @author Minh Cuong
 */
import com.da.qlf0.dao.OracleConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Timestamp;
public class XoaHoTroController {
    private String MABN;
    private Timestamp time;
    public XoaHoTroController(String MABN, Timestamp time) {
        this.MABN = MABN;
        this.time=time;
    }
    
    
    public void Xoa_Hotro() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call DELETE_DaHoTro(?,?)}");
        cStmt.setString(1, this.MABN);
        cStmt.setTimestamp(2, this.time);
        
        
       cStmt.execute();
        cStmt.close();
        conn.close();
        
        
        
    }
}
