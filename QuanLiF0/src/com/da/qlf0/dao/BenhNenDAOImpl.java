/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.dao;

import com.da.qlf0.model.BenhNen;
import com.da.qlf0.model.BenhNhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Cuong
 */
public class BenhNenDAOImpl implements BenhNenDAO{
       @Override
    public ArrayList<BenhNen> getList() {
        Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
        String sql = "SELECT * FROM BENHNEN";
        ArrayList<BenhNen> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BenhNen benhNen = new BenhNen();
//                benhNen.setMa(rs.getString("MaBenhNhan"));
//                benhNen.setHoten(rs.getString("HoTen"));
//                benhNen.setNgaySinh(rs.getDate("NgaySinh"));
//                benhNen.setGioiTinh(rs.getString("GioiTinh"));
//                benhNen.setCMND_CCCD(rs.getString("CMND/CCCD"));
//                benhNen.setNoiOHienTai(rs.getString("NoiOHienTai"));
//                benhNen.setTinh_ThanhPho(rs.getString("Tinh/ThanhPho"));
//                benhNen.setQuan_Huyen(rs.getString("Quan/Huyen"));
//                benhNen.setPhuong_Xa(rs.getString("Phuong/Xa"));
//                benhNen.setNgheNghiep(rs.getString("NgheNghiep"));
//                benhNen.setNoiLamViec(rs.getString("NoiLamViec"));
//                benhNen.setSoDienThoai(rs.getString("SoDienThoai"));
//                benhNen.setNgayTiepNhan(rs.getDate("NgayTiepNhan"));
//                benhNen.setNgayXHTCDauTien(rs.getDate("NgayXuatHienTrieuChungDauTien"));
//                benhNen.setTunglaF0(rs.getShort("TungLaF0"));
//                benhNen.setSoNgayLaF0(rs.getInt("SoNgayLaF0"));
//                benhNen.setTestNhanh(rs.getShort("TestNhanh"));
//                benhNhan.setNgayTestNhanh(rs.getDate("NgayTestNhanh"));
//                benhNhan.setKQXN_TestNhanh(rs.getString("KetQuaXetNghiem1"));
//                benhNhan.setTestRT_PCR(rs.getShort("TestRT-PCR"));
//                benhNhan.setNgayTestRT_PCR(rs.getDate("NgayTestRT_PCR"));
//                benhNhan.setKQXN_RT_PCR(rs.getString("KetQuaXetNghiem2"));
//                list.add(benhNhan);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
