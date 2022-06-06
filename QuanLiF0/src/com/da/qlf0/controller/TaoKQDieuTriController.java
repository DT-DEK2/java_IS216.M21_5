/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import com.teamdev.jxbrowser.deps.org.checkerframework.common.returnsreceiver.qual.This;
import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.sql.Date;
import java.text.DateFormat;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Minh Cuong
 */
public class TaoKQDieuTriController {
    
    private String MABN;
    private javax.swing.JComboBox<String> jcobNoiTuVong;
    private com.toedter.calendar.JDateChooser jdcNgayNhapVien;
    private com.toedter.calendar.JDateChooser jdcNgayTuVong;
    private com.toedter.calendar.JDateChooser jdc_NgayKTCL;
    private com.toedter.calendar.JDateChooser jdc_NgayXNAT;
    private javax.swing.JRadioButton jrbCN_NV;
    private javax.swing.JRadioButton jrbHTCL;
    private javax.swing.JRadioButton jrbKhac;
    private javax.swing.JRadioButton jrbLiDoTV_BenhNen;
    private javax.swing.JRadioButton jrbLiDoTV_Covid;
    private javax.swing.JRadioButton jrbPCR;
    private javax.swing.JRadioButton jrbTestNhanh;
    private javax.swing.JRadioButton jrbTuVong;
    private javax.swing.JTextField jtfKhacCuThe;
    private javax.swing.JTextField jtfLidoTuVongKhac;
    private javax.swing.JTextField jtfLuuY;
    private javax.swing.JTextField jtfNoiTuVongKhac;
    private javax.swing.JTextField jtfTTkhiNV;
    private javax.swing.JTextField jtfTenCSNV;

    public TaoKQDieuTriController(String MABN, JComboBox<String> jcobNoiTuVong, JDateChooser jdcNgayNhapVien, JDateChooser jdcNgayTuVong, JDateChooser jdc_NgayKTCL, JDateChooser jdc_NgayXNAT, JRadioButton jrbCN_NV, JRadioButton jrbHTCL, JRadioButton jrbKhac, JRadioButton jrbLiDoTV_BenhNen, JRadioButton jrbLiDoTV_Covid, JRadioButton jrbPCR, JRadioButton jrbTestNhanh, JRadioButton jrbTuVong, JTextField jtfKhacCuThe, JTextField jtfLidoTuVongKhac, JTextField jtfLuuY, JTextField jtfNoiTuVongKhac, JTextField jtfTTkhiNV, JTextField jtfTenCSNV) {
        this.MABN=MABN;
        this.jcobNoiTuVong = jcobNoiTuVong;
        this.jdcNgayNhapVien = jdcNgayNhapVien;
        this.jdcNgayTuVong = jdcNgayTuVong;
        this.jdc_NgayKTCL = jdc_NgayKTCL;
        this.jdc_NgayXNAT = jdc_NgayXNAT;
        this.jrbCN_NV = jrbCN_NV;
        this.jrbHTCL = jrbHTCL;
        this.jrbKhac = jrbKhac;
        this.jrbLiDoTV_BenhNen = jrbLiDoTV_BenhNen;
        this.jrbLiDoTV_Covid = jrbLiDoTV_Covid;
        this.jrbPCR = jrbPCR;
        this.jrbTestNhanh = jrbTestNhanh;
        this.jrbTuVong = jrbTuVong;
        this.jtfKhacCuThe = jtfKhacCuThe;
        this.jtfLidoTuVongKhac = jtfLidoTuVongKhac;
        this.jtfLuuY = jtfLuuY;
        this.jtfNoiTuVongKhac = jtfNoiTuVongKhac;
        this.jtfTTkhiNV = jtfTTkhiNV;
        this.jtfTenCSNV = jtfTenCSNV;
    }
    public String GetTinhTrang( JRadioButton HTCL, JRadioButton CN_NV, JRadioButton tuvong, JRadioButton khac ){
        if(HTCL.isSelected()){
            return HTCL.getText();
        }
        if(CN_NV.isSelected()){
            return CN_NV.getText();
            
        }
        if(tuvong.isSelected()){
            return tuvong.getText();
                    
        }
        if(khac.isSelected()){
            return khac.getText();
        }
        return null;
    }
    
    public String GetLoaiXN( JRadioButton TestNhanh, JRadioButton TestPCR){
    
        if(TestNhanh.isSelected()){
            return TestNhanh.getText();
        }
        if(TestPCR.isSelected()){
            return TestPCR.getText();
        }
        
        return null;
    }
    
    public String GetTuvong(JRadioButton benhnen, JRadioButton covid){
        if(benhnen.isSelected()){
            return benhnen.getText();
        }
        if(covid.isSelected()){
            return covid.getText();
        }
        return null;
    }
    public void setDateToKQDieuTri() throws ClassNotFoundException, SQLException, ParseException{
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_KETQUADIEUTRITAINHA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, this.MABN);
        cStmt.setString(2, GetTinhTrang(jrbHTCL, jrbCN_NV, jrbTuVong,jrbKhac));
         cStmt.setString(3, jtfKhacCuThe.getText());
         
//             SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
//             
//             Date date1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(DateFormat.getDateInstance().format(jdc_NgayKTCL.getDate()));
        
//         java.util.Date utilStartDate =jdc_NgayKTCL.getDate();
//         
//        java.sql.Date sqlStartDate = new java.sql.Date(sdf);
//        cStmt.setDate(4, sqlStartDate);
        
//        Date date =new Date(jdc_NgayKTCL.getDate().getTime());
//        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
//        DateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
//        String format = formatter1.format(formatter.parse(jdc_NgayKTCL.getDate().toString()));
////         Date date1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(format).getTime();
//         java.sql.Date sqlStartDatex = new java.sql.Date(new SimpleDateFormat("dd-mm-yyyy").parse(format).getTime());
        Date date =new Date(jdc_NgayKTCL.getDate().getTime());
        cStmt.setDate(4, date);
    
        
       
        java.util.Date utilStartDate2 =jdc_NgayXNAT.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime());
        
        cStmt.setDate(5, sqlStartDate2);
        
        
        cStmt.setString(6, GetLoaiXN(jrbTestNhanh, jrbPCR));
        if(jrbCN_NV.isSelected()){
            cStmt.setInt(7, 1);
            
        }else{
            cStmt.setInt(7, 0);
        }
        
         java.util.Date utilStartDate3 =jdcNgayNhapVien.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate3.getTime());
        cStmt.setDate(8, sqlStartDate3);
        
        
        cStmt.setString(9, jtfTTkhiNV.getText());
        cStmt.setString(10,jtfTenCSNV.getText());
        cStmt.setString(11, jtfLuuY.getText());
        if(jrbTuVong.isSelected()){
            cStmt.setInt(12,1);
            
        }else{
            cStmt.setInt(12,0);
        }
           java.util.Date utilStartDate4=jdcNgayTuVong.getDate();
        java.sql.Date sqlStartDate4= new java.sql.Date(utilStartDate4.getTime());
        cStmt.setDate(13, sqlStartDate4);
        cStmt.setString(14, jcobNoiTuVong.getSelectedItem().toString());
        
        cStmt.setString(15, jtfNoiTuVongKhac.getText());
        cStmt.setString(16, GetTuvong(jrbLiDoTV_BenhNen,jrbLiDoTV_Covid));
         cStmt.setString(17,jtfLidoTuVongKhac.getText());
        
         if(jrbHTCL.isSelected()){
             cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
            cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
         }
         if(jrbCN_NV.isSelected()){
              cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
              
              cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
         }
         if(jrbTuVong.isSelected()){
             cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
              
              cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
         }
       
        if(jrbKhac.isSelected()){
            
            cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
             cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
             
              cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
        }else{
            cStmt.setString(3, null);
        }
        
        
        cStmt.execute();
        cStmt.close();
        conn.close();
        
        
        
    }    
     public void setDateToKQDieuTri_Update() throws ClassNotFoundException, SQLException, ParseException{
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call UPDATE_KETQUADIEUTRITAINHA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, this.MABN);
        cStmt.setString(2, GetTinhTrang(jrbHTCL, jrbCN_NV, jrbTuVong,jrbKhac));
         cStmt.setString(3, jtfKhacCuThe.getText());
         
//             SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
//             
//             Date date1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(DateFormat.getDateInstance().format(jdc_NgayKTCL.getDate()));
        
//         java.util.Date utilStartDate =jdc_NgayKTCL.getDate();
//         
//        java.sql.Date sqlStartDate = new java.sql.Date(sdf);
//        cStmt.setDate(4, sqlStartDate);
        
//        Date date =new Date(jdc_NgayKTCL.getDate().getTime());
//        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
//        DateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
//        String format = formatter1.format(formatter.parse(jdc_NgayKTCL.getDate().toString()));
////         Date date1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(format).getTime();
//         java.sql.Date sqlStartDatex = new java.sql.Date(new SimpleDateFormat("dd-mm-yyyy").parse(format).getTime());
        Date date =new Date(jdc_NgayKTCL.getDate().getTime());
        cStmt.setDate(4, date);
    
        
       
        java.util.Date utilStartDate2 =jdc_NgayXNAT.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime());
        
        cStmt.setDate(5, sqlStartDate2);
        
        
        cStmt.setString(6, GetLoaiXN(jrbTestNhanh, jrbPCR));
        if(jrbCN_NV.isSelected()){
            cStmt.setInt(7, 1);
            
        }else{
            cStmt.setInt(7, 0);
        }
        
         java.util.Date utilStartDate3 =jdcNgayNhapVien.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate3.getTime());
        cStmt.setDate(8, sqlStartDate3);
        
        
        cStmt.setString(9, jtfTTkhiNV.getText());
        cStmt.setString(10,jtfTenCSNV.getText());
        cStmt.setString(11, jtfLuuY.getText());
        if(jrbTuVong.isSelected()){
            cStmt.setInt(12,1);
            
        }else{
            cStmt.setInt(12,0);
        }
           java.util.Date utilStartDate4=jdcNgayTuVong.getDate();
        java.sql.Date sqlStartDate4= new java.sql.Date(utilStartDate4.getTime());
        cStmt.setDate(13, sqlStartDate4);
        cStmt.setString(14, jcobNoiTuVong.getSelectedItem().toString());
        
        cStmt.setString(15, jtfNoiTuVongKhac.getText());
        cStmt.setString(16, GetTuvong(jrbLiDoTV_BenhNen,jrbLiDoTV_Covid));
         cStmt.setString(17,jtfLidoTuVongKhac.getText());
        
         if(jrbHTCL.isSelected()){
             cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
            cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
         }
         if(jrbCN_NV.isSelected()){
              cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
              
              cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
         }
         if(jrbTuVong.isSelected()){
             cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
              
              cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
         }
       
        if(jrbKhac.isSelected()){
            
            cStmt.setNull(4, java.sql.Types.DATE);
              cStmt.setNull(5, java.sql.Types.DATE);
              cStmt.setString(6, null);
             cStmt.setNull(8, java.sql.Types.DATE);
             cStmt.setString(9, null);
             cStmt.setString(10,null);
            cStmt.setString(11, null);
             
              cStmt.setNull(13, java.sql.Types.DATE);
             cStmt.setString(14,null);
              cStmt.setString(15, null);
                cStmt.setString(16, null);
             cStmt.setString(17,null);
        }else{
            cStmt.setString(3, null);
        }
        
        
        cStmt.execute();
        cStmt.close();
        conn.close();
        
        
        
    }    
     public int check_KQDT() throws ClassNotFoundException, SQLException{
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call Kiemtra_KTDT(?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setString(2, MABN);
         cStmt.execute();
         int x =cStmt.getInt(1);
           if(x==1)
                return 1;
           else
               return 0;
     }
}
