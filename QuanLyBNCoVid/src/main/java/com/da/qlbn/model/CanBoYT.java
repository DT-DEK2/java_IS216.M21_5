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
public class CanBoYT {
    private String MaNV;
    private String HoTen;
    private String GioiTinh;
    private String CMND_CCCD;
    private Date NgaySinh;
    private String SDT;
    private String DonViCongTac;
    private String Tinh_ThanhPho;
    private String Quan_Huyen;
    private String Phuong_Xa;

    public CanBoYT() {
    }

    public CanBoYT(String MaNV, String HoTen, String GioiTinh, String CMND_CCCD, Date NgaySinh, String SDT, String DonViCongTac, String Tinh_ThanhPho, String Quan_Huyen, String Phuong_Xa) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.CMND_CCCD = CMND_CCCD;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.DonViCongTac = DonViCongTac;
        this.Tinh_ThanhPho = Tinh_ThanhPho;
        this.Quan_Huyen = Quan_Huyen;
        this.Phuong_Xa = Phuong_Xa;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
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

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDonViCongTac() {
        return DonViCongTac;
    }

    public void setDonViCongTac(String DonViCongTac) {
        this.DonViCongTac = DonViCongTac;
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
    
}
