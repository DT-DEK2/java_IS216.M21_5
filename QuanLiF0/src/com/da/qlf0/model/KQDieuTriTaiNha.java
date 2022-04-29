/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Minh Cuong
 */
public class KQDieuTriTaiNha {
   private BenhNhan benhNhan;
   private String TinhTrang  ;
   private String TinhTrangKhac          ;    
   private Date NgKetThucCLTN     ;    
   private Date NgXNAT    ; 
   private short LoaiXetNghiem  ;    
   private short NhapVien      ;         
   private Date NgayNhapVien          ;                          
   private String TCKhiNhapVien  ;                         
   private String TenCoSoNhapVien    ;                          
   private String LuuY     ;                           
   private short TuVong  ;                   
   private Date NgayTuVong            ;                        
   private String NoiTuVong;             
   private String NoiTuVongKhac     ;                     
   private short LyDoTuVong   ;                      
   private String LyDoTuVongKhac        ;                     

    public KQDieuTriTaiNha() {
    }

    public KQDieuTriTaiNha(BenhNhan benhNhan, String TinhTrang, String TinhTrangKhac, Date NgKetThucCLTN, Date NgXNAT, short LoaiXetNghiem, short NhapVien, Date NgayNhapVien, String TCKhiNhapVien, String TenCoSoNhapVien, String LuuY, short TuVong, Date NgayTuVong, String NoiTuVong, String NoiTuVongKhac, short LyDoTuVong, String LyDoTuVongKhac) {
        this.benhNhan = benhNhan;
        this.TinhTrang = TinhTrang;
        this.TinhTrangKhac = TinhTrangKhac;
        this.NgKetThucCLTN = NgKetThucCLTN;
        this.NgXNAT = NgXNAT;
        this.LoaiXetNghiem = LoaiXetNghiem;
        this.NhapVien = NhapVien;
        this.NgayNhapVien = NgayNhapVien;
        this.TCKhiNhapVien = TCKhiNhapVien;
        this.TenCoSoNhapVien = TenCoSoNhapVien;
        this.LuuY = LuuY;
        this.TuVong = TuVong;
        this.NgayTuVong = NgayTuVong;
        this.NoiTuVong = NoiTuVong;
        this.NoiTuVongKhac = NoiTuVongKhac;
        this.LyDoTuVong = LyDoTuVong;
        this.LyDoTuVongKhac = LyDoTuVongKhac;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTinhTrangKhac() {
        return TinhTrangKhac;
    }

    public void setTinhTrangKhac(String TinhTrangKhac) {
        this.TinhTrangKhac = TinhTrangKhac;
    }

    public Date getNgKetThucCLTN() {
        return NgKetThucCLTN;
    }

    public void setNgKetThucCLTN(Date NgKetThucCLTN) {
        this.NgKetThucCLTN = NgKetThucCLTN;
    }

    public Date getNgXNAT() {
        return NgXNAT;
    }

    public void setNgXNAT(Date NgXNAT) {
        this.NgXNAT = NgXNAT;
    }

    public short getLoaiXetNghiem() {
        return LoaiXetNghiem;
    }

    public void setLoaiXetNghiem(short LoaiXetNghiem) {
        this.LoaiXetNghiem = LoaiXetNghiem;
    }

    public short getNhapVien() {
        return NhapVien;
    }

    public void setNhapVien(short NhapVien) {
        this.NhapVien = NhapVien;
    }

    public Date getNgayNhapVien() {
        return NgayNhapVien;
    }

    public void setNgayNhapVien(Date NgayNhapVien) {
        this.NgayNhapVien = NgayNhapVien;
    }

    public String getTCKhiNhapVien() {
        return TCKhiNhapVien;
    }

    public void setTCKhiNhapVien(String TCKhiNhapVien) {
        this.TCKhiNhapVien = TCKhiNhapVien;
    }

    public String getTenCoSoNhapVien() {
        return TenCoSoNhapVien;
    }

    public void setTenCoSoNhapVien(String TenCoSoNhapVien) {
        this.TenCoSoNhapVien = TenCoSoNhapVien;
    }

    public String getLuuY() {
        return LuuY;
    }

    public void setLuuY(String LuuY) {
        this.LuuY = LuuY;
    }

    public short getTuVong() {
        return TuVong;
    }

    public void setTuVong(short TuVong) {
        this.TuVong = TuVong;
    }

    public Date getNgayTuVong() {
        return NgayTuVong;
    }

    public void setNgayTuVong(Date NgayTuVong) {
        this.NgayTuVong = NgayTuVong;
    }

    public String getNoiTuVong() {
        return NoiTuVong;
    }

    public void setNoiTuVong(String NoiTuVong) {
        this.NoiTuVong = NoiTuVong;
    }

    public String getNoiTuVongKhac() {
        return NoiTuVongKhac;
    }

    public void setNoiTuVongKhac(String NoiTuVongKhac) {
        this.NoiTuVongKhac = NoiTuVongKhac;
    }

    public short getLyDoTuVong() {
        return LyDoTuVong;
    }

    public void setLyDoTuVong(short LyDoTuVong) {
        this.LyDoTuVong = LyDoTuVong;
    }

    public String getLyDoTuVongKhac() {
        return LyDoTuVongKhac;
    }

    public void setLyDoTuVongKhac(String LyDoTuVongKhac) {
        this.LyDoTuVongKhac = LyDoTuVongKhac;
    }
   
}
