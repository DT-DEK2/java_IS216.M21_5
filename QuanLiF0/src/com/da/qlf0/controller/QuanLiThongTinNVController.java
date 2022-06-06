/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JPasswordField;
import java.sql.CallableStatement;
/**
 *
 * @author Minh Cuong
 */
public class QuanLiThongTinNVController {
    private String MANV;
     private javax.swing.JComboBox<String> jcobGioiTinh;
    private javax.swing.JComboBox<String> jcobPhuong_Xa;
    private javax.swing.JComboBox<String> jcobQuan_Huyen;
    private javax.swing.JComboBox<String> jcobTinh_ThanhPho;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private javax.swing.JLabel jlbDonVi;
    private javax.swing.JLabel jlbMaNV;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JTextField jtfCMND;
    private javax.swing.JPasswordField jtfDatLaiMK;
    private javax.swing.JTextField jtfDonViCT;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoten;
    private javax.swing.JTextField jtfMatKhau;
    private javax.swing.JPasswordField jtfNhapLaiMK;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfTaiKhoan;
    

    public QuanLiThongTinNVController(String MANV,JComboBox<String> jcobGioiTinh, JComboBox<String> jcobPhuong_Xa, JComboBox<String> jcobQuan_Huyen, JComboBox<String> jcobTinh_ThanhPho, JDateChooser jdcNgaySinh, JLabel jlbDonVi, JLabel jlbMaNV, JLabel jlbTen, JTextField jtfCMND, JPasswordField jtfDatLaiMK, JTextField jtfDonViCT, JTextField jtfEmail, JTextField jtfHoten, JTextField jtfMatKhau, JPasswordField jtfNhapLaiMK, JTextField jtfSDT, JTextField jtfTaiKhoan) {
        this.MANV=MANV;
        this.jcobGioiTinh = jcobGioiTinh;
        this.jcobPhuong_Xa = jcobPhuong_Xa;
        this.jcobQuan_Huyen = jcobQuan_Huyen;
        this.jcobTinh_ThanhPho = jcobTinh_ThanhPho;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jlbDonVi = jlbDonVi;
        this.jlbMaNV = jlbMaNV;
        this.jlbTen = jlbTen;
        this.jtfCMND = jtfCMND;
        this.jtfDatLaiMK = jtfDatLaiMK;
        this.jtfDonViCT = jtfDonViCT;
        this.jtfEmail = jtfEmail;
        this.jtfHoten = jtfHoten;
        this.jtfMatKhau = jtfMatKhau;
        this.jtfNhapLaiMK = jtfNhapLaiMK;
        this.jtfSDT = jtfSDT;
        this.jtfTaiKhoan = jtfTaiKhoan;
    }
    public void setDataTaiKhoan()throws ClassNotFoundException, SQLException, ParseException{
         Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
         
     
         
         String sql =" select * from TAIKHOANCANBOYTE where MaNV like ?";
          PreparedStatement pr = cons.prepareStatement(sql);
          pr.setString(1, this.MANV);
         ResultSet rs= pr.executeQuery();
          while(rs.next()){
              jtfTaiKhoan.setText(rs.getString("SoCMND_CCCD"));
              jtfMatKhau.setText(rs.getString("MatKhau"));
          }
    }
    public void SetData() throws ClassNotFoundException, SQLException, ParseException{
        
        Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
         
     
         
         String sql =" select * from CANBOYTE where MaNV like ?";
          PreparedStatement pr = cons.prepareStatement(sql);
          pr.setString(1, this.MANV);
         ResultSet rs= pr.executeQuery();
         
         while(rs.next()){
             jlbMaNV.setText(this.MANV);
             jlbDonVi.setText(rs.getString("DonViCongTac"));
             jlbTen.setText(rs.getString("HoTen"));
             jtfHoten.setText(rs.getString("HoTen"));
             jcobGioiTinh.setSelectedItem(rs.getString("GioiTinh"));
             jtfCMND.setText(rs.getString("CMND_CCCD"));
             if(rs.getDate("NgaySinh")==null){
                 String date = "01-01-0001";
                    java.util.Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    jdcNgaySinh.setDate(date2);
             }else{
                 jdcNgaySinh.setDate(rs.getDate("NgaySinh"));
             }
             jtfSDT.setText(rs.getString("SDT"));
             jtfEmail.setText(rs.getString("Email"));
             jtfDonViCT.setText(rs.getString("DonViCongTac"));
             jcobTinh_ThanhPho.setSelectedItem(rs.getString("Tinh_ThanhPho"));
             jcobQuan_Huyen.setSelectedItem(rs.getString("Quan_Huyen"));
             jcobPhuong_Xa.setSelectedItem(rs.getString("Phuong_Xa"));
             
         }
    }
    public void Update_TTNV() throws ClassNotFoundException, SQLException{
        Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
         

         
         CallableStatement cSmt = null;
           cSmt=cons.prepareCall("{call UPDATE_CANBOYTE(?,?,?,?,?,?,?,?,?,?,?)}");
           
           cSmt.setString(1, this.MANV);
           cSmt.setString(2, jtfHoten.getText());
           cSmt.setString(3, jcobGioiTinh.getSelectedItem().toString());
           cSmt.setString(4, jtfCMND.getText());
            java.util.Date utilStartDate5 =jdcNgaySinh.getDate();
        java.sql.Date sqlStartDate5 = new java.sql.Date(utilStartDate5.getTime());
           cSmt.setDate(5, sqlStartDate5);
           cSmt.setString(6, jtfSDT.getText());
           cSmt.setString(7, jtfEmail.getText());
           cSmt.setString(8, jtfDonViCT.getText());
           cSmt.setString(9, jcobTinh_ThanhPho.getSelectedItem().toString());
           cSmt.setString(10, jcobQuan_Huyen.getSelectedItem().toString());
           cSmt.setString(11, jcobPhuong_Xa.getSelectedItem().toString());
            
           
           cSmt.execute();
           cSmt.close();
           cons.close();
    }
     @SuppressWarnings("deprecation")
    public void Update_TKNV() throws ClassNotFoundException, SQLException{
        Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
         

         
         CallableStatement cSmt = null;
           cSmt=cons.prepareCall("{call UPDATE_TAIKHOANCANBOYTE(?,?,?,?)}");
           
           cSmt.setString(1, this.MANV);
          
           cSmt.setString(2, jtfCMND.getText());
           cSmt.setString(3, jtfHoten.getText());
           cSmt.setString(4, jtfDatLaiMK.getText());
           
            
           
           cSmt.execute();
           cSmt.close();
           cons.close();
    }
}
