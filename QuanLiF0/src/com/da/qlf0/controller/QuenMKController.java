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
import java.sql.PreparedStatement;
public class QuenMKController {
    private String SoCMND;
    private String mkMoi;

    public QuenMKController(String SoCMND, String mkMoi) {
        this.SoCMND = SoCMND;
        this.mkMoi = mkMoi;
    }
    public int Check_Bn() throws ClassNotFoundException, SQLException {
        Connection conn= null;
        
        conn = OracleConnection.getOracleConnection();
        
        String sql="select * from BENHNHAN where CMND_CCCD = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, SoCMND);
        int i = ps.executeUpdate();
        return i;
    }
    public int Check_Nv() throws ClassNotFoundException, SQLException {
        Connection conn= null;
        
        conn = OracleConnection.getOracleConnection();
        
        String sql="select * from CANBOYTE where CMND_CCCD = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, SoCMND);
        int i = ps.executeUpdate();
        return i;
    }
    public int DoiMK() throws ClassNotFoundException,SQLException {
        int flag=0;
        Connection conn= null;
        
        conn = OracleConnection.getOracleConnection();
        
        String sql="update TAIKHOANBENHNHAN set MatKhau = ? where SoCMND_CCCD = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, this.mkMoi);
        ps.setString(2, this.SoCMND);
        
        
         String sql2="update TAIKHOANCANBOYTE set MatKhau = ? where SoCMND_CCCD = ?";
        PreparedStatement ps2 = conn.prepareStatement(sql2);
        ps.setString(1, this.mkMoi);
        ps.setString(2, this.SoCMND);
        if(Check_Bn()!=0){
            ps.execute();
            flag=1;
        }else if(Check_Nv()!=0){
            ps2.execute();
            flag=1;
        }
        
        ps.close();
        ps2.cancel();
        conn.close();
        return flag;
    }
}
