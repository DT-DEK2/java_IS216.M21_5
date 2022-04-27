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
public class TiemVaccine {
    private BenhNhan benhNhan;
    private String TTTiemVC;
    private String Loai_VC1;
    private Timestamp NgayTiem1;
    private String Loai_VC2;
    private Timestamp NgayTiem2;
    private String Loai_VC3;
    private Timestamp NgayTiem3;

    public TiemVaccine() {
    }

    public TiemVaccine(BenhNhan benhNhan, String TTTiemVC, String Loai_VC1, Timestamp NgayTiem1, String Loai_VC2, Timestamp NgayTiem2, String Loai_VC3, Timestamp NgayTiem3) {
        this.benhNhan = benhNhan;
        this.TTTiemVC = TTTiemVC;
        this.Loai_VC1 = Loai_VC1;
        this.NgayTiem1 = NgayTiem1;
        this.Loai_VC2 = Loai_VC2;
        this.NgayTiem2 = NgayTiem2;
        this.Loai_VC3 = Loai_VC3;
        this.NgayTiem3 = NgayTiem3;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getTTTiemVC() {
        return TTTiemVC;
    }

    public void setTTTiemVC(String TTTiemVC) {
        this.TTTiemVC = TTTiemVC;
    }

    public String getLoai_VC1() {
        return Loai_VC1;
    }

    public void setLoai_VC1(String Loai_VC1) {
        this.Loai_VC1 = Loai_VC1;
    }

    public Timestamp getNgayTiem1() {
        return NgayTiem1;
    }

    public void setNgayTiem1(Timestamp NgayTiem1) {
        this.NgayTiem1 = NgayTiem1;
    }

    public String getLoai_VC2() {
        return Loai_VC2;
    }

    public void setLoai_VC2(String Loai_VC2) {
        this.Loai_VC2 = Loai_VC2;
    }

    public Timestamp getNgayTiem2() {
        return NgayTiem2;
    }

    public void setNgayTiem2(Timestamp NgayTiem2) {
        this.NgayTiem2 = NgayTiem2;
    }

    public String getLoai_VC3() {
        return Loai_VC3;
    }

    public void setLoai_VC3(String Loai_VC3) {
        this.Loai_VC3 = Loai_VC3;
    }

    public Timestamp getNgayTiem3() {
        return NgayTiem3;
    }

    public void setNgayTiem3(Timestamp NgayTiem3) {
        this.NgayTiem3 = NgayTiem3;
    }
    
}
