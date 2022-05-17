/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

import java.sql.Timestamp;

/**
 *
 * @author Minh Cuong
 */
public class CapNhat {
    private BenhNhan benhNhan;
    private Timestamp ThoiDiemCN;
    private CanBoYT canBoYT;

    public CapNhat() {
    }

    public CapNhat(BenhNhan benhNhan, Timestamp ThoiDiemCN, CanBoYT canBoYT) {
        this.benhNhan = benhNhan;
        this.ThoiDiemCN = ThoiDiemCN;
        this.canBoYT = canBoYT;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public Timestamp getThoiDiemCN() {
        return ThoiDiemCN;
    }

    public void setThoiDiemCN(Timestamp ThoiDiemCN) {
        this.ThoiDiemCN = ThoiDiemCN;
    }

    public CanBoYT getCanBoYT() {
        return canBoYT;
    }

    public void setCanBoYT(CanBoYT canBoYT) {
        this.canBoYT = canBoYT;
    }
    
}
