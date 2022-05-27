/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;


//import com.teamdev.jxbrowser.internal.rpc.transport.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import java.sql.Connection;
import com.da.qlf0.dao.OracleConnection;

import java.sql.CallableStatement;

/**
 *
 * @author Minh Cuong
 */
public class DangKyController {
    
    private String MABN;
      private javax.swing.JTextPane jtfCMND_CCCD;
    private javax.swing.JTextPane jtfHoTen;
    private javax.swing.JTextPane jtfMatKhau;
    private javax.swing.JTextPane jtfSDT;
    

    public DangKyController(JTextPane jtfCMND_CCCD, JTextPane jtfHoTen, JTextPane jtfMatKhau, JTextPane jtfSDT) {
        this.jtfCMND_CCCD = jtfCMND_CCCD;
        this.jtfHoTen = jtfHoTen;
        this.jtfMatKhau = jtfMatKhau;
        this.jtfSDT = jtfSDT;
        LayMABNTuDong td = new LayMABNTuDong();
        try {
            this.MABN=td.SetMABN();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DangKyController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DangKyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setData_DK()throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_BENHNHAN_DK(?,?,?,?,?)}");
        cStmt.setString(1, this.MABN);
        cStmt.setString(2, jtfHoTen.getText());
        cStmt.setString(3, jtfCMND_CCCD.getText());
        cStmt.setString(4, jtfSDT.getText());
        cStmt.setString(5, jtfMatKhau.getText());
        
        cStmt.execute();
            cStmt.close();
            conn.close();
    }
}
