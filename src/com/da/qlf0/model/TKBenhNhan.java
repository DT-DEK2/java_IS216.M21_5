/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

/**
 *
 * @author Minh Cuong
 */
public class TKBenhNhan {
    private BenhNhan benhNhan;
    private String CMND_CCCD;
    private String HoTen;
    private String MatKhau;

    public TKBenhNhan() {
    }

    public TKBenhNhan(BenhNhan benhNhan, String CMND_CCCD, String HoTen, String MatKhau) {
        this.benhNhan = benhNhan;
        this.CMND_CCCD = CMND_CCCD;
        this.HoTen = HoTen;
        this.MatKhau = MatKhau;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getCMND_CCCD() {
        return CMND_CCCD;
    }

    public void setCMND_CCCD(String CMND_CCCD) {
        this.CMND_CCCD = CMND_CCCD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
