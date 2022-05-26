/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

/**
 *
 * @author Minh Cuong
 */
public class TKCanBoYT {
    private CanBoYT canBoYT;
    private String CMND_CCCD;
    private String HoTen;
    private String MatKhau;

    public TKCanBoYT() {
    }

    public TKCanBoYT(CanBoYT canBoYT, String CMND_CCCD, String HoTen, String MatKhau) {
        this.canBoYT = canBoYT;
        this.CMND_CCCD = CMND_CCCD;
        this.HoTen = HoTen;
        this.MatKhau = MatKhau;
    }

    public CanBoYT getCanBoYT() {
        return canBoYT;
    }

    public void setCanBoYT(CanBoYT canBoYT) {
        this.canBoYT = canBoYT;
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
