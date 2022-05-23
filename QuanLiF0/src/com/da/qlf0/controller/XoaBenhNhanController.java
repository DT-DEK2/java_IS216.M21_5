/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;

/**
 *
 * @author Minh Cuong
 */
public class XoaBenhNhanController {
    private String MABN;

    public XoaBenhNhanController(String MABN) {
        this.MABN = MABN;
    }
    
    
    public int Xoa_BN() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call DELETE_BENHNHAN(?)}");
        cStmt.setString(1, this.MABN);
        
        
        int x=cStmt.executeUpdate();
        cStmt.close();
        conn.close();
        
        return x;
        
    }
}
