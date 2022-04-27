/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlbn.model;

import java.sql.Timestamp;

/**
 *
 * @author Minh Cuong
 */
public class HoTro {
    private BenhNhan benhNhan;
    private CanBoYT canBoYT;
    private String YeuCau;
    private Timestamp ThoiDiemYC;

    public HoTro() {
    }

    public HoTro(BenhNhan benhNhan, CanBoYT canBoYT, String YeuCau, Timestamp ThoiDiemYC) {
        this.benhNhan = benhNhan;
        this.canBoYT = canBoYT;
        this.YeuCau = YeuCau;
        this.ThoiDiemYC = ThoiDiemYC;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public CanBoYT getCanBoYT() {
        return canBoYT;
    }

    public void setCanBoYT(CanBoYT canBoYT) {
        this.canBoYT = canBoYT;
    }

    public String getYeuCau() {
        return YeuCau;
    }

    public void setYeuCau(String YeuCau) {
        this.YeuCau = YeuCau;
    }

    public Timestamp getThoiDiemYC() {
        return ThoiDiemYC;
    }

    public void setThoiDiemYC(Timestamp ThoiDiemYC) {
        this.ThoiDiemYC = ThoiDiemYC;
    }
    
}
