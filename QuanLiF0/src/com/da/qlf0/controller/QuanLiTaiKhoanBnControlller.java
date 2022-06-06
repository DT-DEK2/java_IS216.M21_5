/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.da.qlf0.dao.OracleConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Minh Cuong
 */
public class QuanLiTaiKhoanBnControlller {
    private JTextField CMND;
    private JPasswordField mkMoi;
    private JPasswordField makCu; 
    private String MABN;

    public QuanLiTaiKhoanBnControlller(String MABN, JTextField CMND, JPasswordField mkMoi, JPasswordField makCu) {
        this.MABN=MABN;
        this.CMND = CMND;
        this.mkMoi = mkMoi;
        this.makCu = makCu;
    }
    
    public void setData() throws ClassNotFoundException,SQLException{
        Connection conn= null;
        
        conn = OracleConnection.getOracleConnection();
        
        String sql="select * from TAIKHOANBENHNHAN where MaBenhNhan = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MABN);
       ResultSet rs = ps.executeQuery();
       while( rs.next()){
           CMND.setText(rs.getString("SoCMND_CCCD"));
           makCu.setText(rs.getString("MatKhau"));
       }
       
       ps.close();
       conn.close();
    }
    @SuppressWarnings("deprecation")
    public void update_mk() throws ClassNotFoundException,SQLException{
          Connection conn= null;
        
        conn = OracleConnection.getOracleConnection();
        
        String sql="update TAIKHOANBENHNHAN set MatKhau = ? where MaBenhNhan = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, mkMoi.getText());
        ps.setString(2, MABN);
        ps.execute();
        
        ps.close();
        conn.close();
    }
}
