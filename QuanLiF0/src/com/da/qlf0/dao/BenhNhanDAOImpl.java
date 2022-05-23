/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.dao;
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
public class BenhNhanDAOImpl implements BenhNhanDAO {
       @Override
    public ArrayList<BenhNhan> getList() {
        Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
        String sql = "SELECT * FROM BENHNHAN";
        ArrayList<BenhNhan> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BenhNhan benhNhan = new BenhNhan();
                benhNhan.setMaBenhNhan(rs.getString("MaBenhNhan"));
                benhNhan.setHoten(rs.getString("HoTen"));
                benhNhan.setNgaySinh(rs.getDate("NgaySinh"));
                benhNhan.setGioiTinh(rs.getString("GioiTinh"));
                benhNhan.setCMND_CCCD(rs.getString("CMND/CCCD"));
                benhNhan.setNoiOHienTai(rs.getString("NoiOHienTai"));
                benhNhan.setTinh_ThanhPho(rs.getString("Tinh/ThanhPho"));
                benhNhan.setQuan_Huyen(rs.getString("Quan/Huyen"));
                benhNhan.setPhuong_Xa(rs.getString("Phuong/Xa"));
                benhNhan.setNgheNghiep(rs.getString("NgheNghiep"));
                benhNhan.setNoiLamViec(rs.getString("NoiLamViec"));
                benhNhan.setSoDienThoai(rs.getString("SoDienThoai"));
                benhNhan.setNgayTiepNhan(rs.getDate("NgayTiepNhan"));
                benhNhan.setNgayXHTCDauTien(rs.getDate("NgayXuatHienTrieuChungDauTien"));
                benhNhan.setTunglaF0(rs.getShort("TungLaF0"));
                benhNhan.setSoNgayLaF0(rs.getInt("SoNgayLaF0"));
                benhNhan.setTestNhanh(rs.getShort("TestNhanh"));
                benhNhan.setNgayTestNhanh(rs.getDate("NgayTestNhanh"));
                benhNhan.setKQXN_TestNhanh(rs.getString("KetQuaXetNghiem1"));
                benhNhan.setTestRT_PCR(rs.getShort("TestRT-PCR"));
                benhNhan.setNgayTestRT_PCR(rs.getDate("NgayTestRT_PCR"));
                benhNhan.setKQXN_RT_PCR(rs.getString("KetQuaXetNghiem2"));
                list.add(benhNhan);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
