/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import javax.swing.JRadioButton;
/**
 *
 * @author Minh Cuong
 */
public class DangNhapController {
    
    
    private JTextField jtfCMND_CCCD;
    private JTextField jtfMatKhau;
   private JRadioButton btnBenhNhan;
   private JRadioButton btnCanBoYTe;
    
    private String ten;

    public DangNhapController(JTextField jtfCMND_CCCD, JTextField jtfMatKhau) {
      
        this.jtfCMND_CCCD = jtfCMND_CCCD;
        this.jtfMatKhau = jtfMatKhau;
       
        
    }

    
    
    public int login(String role) throws ClassNotFoundException, SQLException{
        Connection cons=null;
        int i=0;
        cons= OracleConnection.getOracleConnection();

	
        String sql = "SELECT * FROM "+" "+role+" "+" WHERE SoCMND_CCCD LIKE ? AND MATKHAU LIKE ?";
        
        PreparedStatement ps = cons.prepareStatement(sql);
            
            ps.setString(1, jtfCMND_CCCD.getText());
            ps.setString(2, jtfMatKhau.getText());
            i=ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.ten=rs.getString("HOTEN");
            }
            ps.close();
            cons.close();
        return i ;
    }

    public String getTen() {
        return ten;
    }
    
    
}
