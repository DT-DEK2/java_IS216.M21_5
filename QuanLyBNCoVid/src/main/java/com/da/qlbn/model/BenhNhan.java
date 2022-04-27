/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlbn.model;

import java.util.Date;

/**
 *
 * @author Minh Cuong
 */
public class BenhNhan {
    private String MaBenNhan;
    private String Hoten;
    private Date NgaySinh;
    private String GioiTinh;
    private String CMND_CCCD;
    private String NoiOHienTai;
    private String Tinh_ThanhPho;
    private String Quan_Huyen;
    private String Phuong_Xa;
    private String NgheNghiep;
    private String NoiLamViec;
    private String SoDienThoai;
    private Date NgayTiepNhan;
    private Date NgayXHTCDauTien;
    private short TunglaF0;
    private int SoNgayLaF0;
    private short TestNhanh;
    private Date NgayTestNhanh;
    private String KQXN_TestNhanh;
    private short TestRT_PCR;
    private Date NgayTestRT_PCR;
    private short KQXN_RT_PCR;

    public BenhNhan() {
    }

    public BenhNhan(String MaBenNhan, String Hoten, Date NgaySinh, String GioiTinh, String CMND_CCCD, String NoiOHienTai, String Tinh_ThanhPho, String Quan_Huyen, String Phuong_Xa, String NgheNghiep, String NoiLamViec, String SoDienThoai, Date NgayTiepNhan, Date NgayXHTCDauTien, short TunglaF0, int SoNgayLaF0, short TestNhanh, Date NgayTestNhanh, String KQXN_TestNhanh, short TestRT_PCR, Date NgayTestRT_PCR, short KQXN_RT_PCR) {
        this.MaBenNhan = MaBenNhan;
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.CMND_CCCD = CMND_CCCD;
        this.NoiOHienTai = NoiOHienTai;
        this.Tinh_ThanhPho = Tinh_ThanhPho;
        this.Quan_Huyen = Quan_Huyen;
        this.Phuong_Xa = Phuong_Xa;
        this.NgheNghiep = NgheNghiep;
        this.NoiLamViec = NoiLamViec;
        this.SoDienThoai = SoDienThoai;
        this.NgayTiepNhan = NgayTiepNhan;
        this.NgayXHTCDauTien = NgayXHTCDauTien;
        this.TunglaF0 = TunglaF0;
        this.SoNgayLaF0 = SoNgayLaF0;
        this.TestNhanh = TestNhanh;
        this.NgayTestNhanh = NgayTestNhanh;
        this.KQXN_TestNhanh = KQXN_TestNhanh;
        this.TestRT_PCR = TestRT_PCR;
        this.NgayTestRT_PCR = NgayTestRT_PCR;
        this.KQXN_RT_PCR = KQXN_RT_PCR;
    }
    

    public String getMaBenNhan() {
        return MaBenNhan;
    }

    public void setMaBenNhan(String MaBenNhan) {
        this.MaBenNhan = MaBenNhan;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCMND_CCCD() {
        return CMND_CCCD;
    }

    public void setCMND_CCCD(String CMND_CCCD) {
        this.CMND_CCCD = CMND_CCCD;
    }

    public String getNoiOHienTai() {
        return NoiOHienTai;
    }

    public void setNoiOHienTai(String NoiOHienTai) {
        this.NoiOHienTai = NoiOHienTai;
    }

    public String getTinh_ThanhPho() {
        return Tinh_ThanhPho;
    }

    public void setTinh_ThanhPho(String Tinh_ThanhPho) {
        this.Tinh_ThanhPho = Tinh_ThanhPho;
    }

    public String getQuan_Huyen() {
        return Quan_Huyen;
    }

    public void setQuan_Huyen(String Quan_Huyen) {
        this.Quan_Huyen = Quan_Huyen;
    }

    public String getPhuong_Xa() {
        return Phuong_Xa;
    }

    public void setPhuong_Xa(String Phuong_Xa) {
        this.Phuong_Xa = Phuong_Xa;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getNoiLamViec() {
        return NoiLamViec;
    }

    public void setNoiLamViec(String NoiLamViec) {
        this.NoiLamViec = NoiLamViec;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public Date getNgayTiepNhan() {
        return NgayTiepNhan;
    }

    public void setNgayTiepNhan(Date NgayTiepNhan) {
        this.NgayTiepNhan = NgayTiepNhan;
    }

    public Date getNgayXHTCDauTien() {
        return NgayXHTCDauTien;
    }

    public void setNgayXHTCDauTien(Date NgayXHTCDauTien) {
        this.NgayXHTCDauTien = NgayXHTCDauTien;
    }

    public short getTunglaF0() {
        return TunglaF0;
    }

    public void setTunglaF0(short TunglaF0) {
        this.TunglaF0 = TunglaF0;
    }

    public int getSoNgayLaF0() {
        return SoNgayLaF0;
    }

    public void setSoNgayLaF0(int SoNgayLaF0) {
        this.SoNgayLaF0 = SoNgayLaF0;
    }

    public short getTestNhanh() {
        return TestNhanh;
    }

    public void setTestNhanh(short TestNhanh) {
        this.TestNhanh = TestNhanh;
    }

    public Date getNgayTestNhanh() {
        return NgayTestNhanh;
    }

    public void setNgayTestNhanh(Date NgayTestNhanh) {
        this.NgayTestNhanh = NgayTestNhanh;
    }

    public String getKQXN_TestNhanh() {
        return KQXN_TestNhanh;
    }

    public void setKQXN_TestNhanh(String KQXN_TestNhanh) {
        this.KQXN_TestNhanh = KQXN_TestNhanh;
    }

    public short getTestRT_PCR() {
        return TestRT_PCR;
    }

    public void setTestRT_PCR(short TestRT_PCR) {
        this.TestRT_PCR = TestRT_PCR;
    }

    public Date getNgayTestRT_PCR() {
        return NgayTestRT_PCR;
    }

    public void setNgayTestRT_PCR(Date NgayTestRT_PCR) {
        this.NgayTestRT_PCR = NgayTestRT_PCR;
    }

    public short getKQXN_RT_PCR() {
        return KQXN_RT_PCR;
    }

    public void setKQXN_RT_PCR(short KQXN_RT_PCR) {
        this.KQXN_RT_PCR = KQXN_RT_PCR;
    }
    
}
