/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.lang.model.util.Types;
import javax.swing.JTextField;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Minh Cuong
 */
public class LayMABNTuDong {
  
    
    public LayMABNTuDong(){
        
    }
    public String SetMABN()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call MaBenhNhan_TuDong}");
        cStmt.registerOutParameter(1, OracleTypes.VARCHAR);
      
         cStmt.execute();
         String x =cStmt.getString(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
    
}
