/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlbn.model;

/**
 *
 * @author Minh Cuong
 */
public class ThuocSD_TruocNhapVien {
    private BenhNhan benhNhan;
    private short Steroid;
    private short CacLoaiTMDKhac;
    private short KhangSinh;
    private short KhangVirus;
    private short CacLoaiTDTCovidKhac;
    private short CacLoaiTUCMDKhac;

    public ThuocSD_TruocNhapVien() {
    }

    public ThuocSD_TruocNhapVien(BenhNhan benhNhan, short Steroid, short CacLoaiTMDKhac, short KhangSinh, short KhangVirus, short CacLoaiTDTCovidKhac, short CacLoaiTUCMDKhac) {
        this.benhNhan = benhNhan;
        this.Steroid = Steroid;
        this.CacLoaiTMDKhac = CacLoaiTMDKhac;
        this.KhangSinh = KhangSinh;
        this.KhangVirus = KhangVirus;
        this.CacLoaiTDTCovidKhac = CacLoaiTDTCovidKhac;
        this.CacLoaiTUCMDKhac = CacLoaiTUCMDKhac;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public short getSteroid() {
        return Steroid;
    }

    public void setSteroid(short Steroid) {
        this.Steroid = Steroid;
    }

    public short getCacLoaiTMDKhac() {
        return CacLoaiTMDKhac;
    }

    public void setCacLoaiTMDKhac(short CacLoaiTMDKhac) {
        this.CacLoaiTMDKhac = CacLoaiTMDKhac;
    }

    public short getKhangSinh() {
        return KhangSinh;
    }

    public void setKhangSinh(short KhangSinh) {
        this.KhangSinh = KhangSinh;
    }

    public short getKhangVirus() {
        return KhangVirus;
    }

    public void setKhangVirus(short KhangVirus) {
        this.KhangVirus = KhangVirus;
    }

    public short getCacLoaiTDTCovidKhac() {
        return CacLoaiTDTCovidKhac;
    }

    public void setCacLoaiTDTCovidKhac(short CacLoaiTDTCovidKhac) {
        this.CacLoaiTDTCovidKhac = CacLoaiTDTCovidKhac;
    }

    public short getCacLoaiTUCMDKhac() {
        return CacLoaiTUCMDKhac;
    }

    public void setCacLoaiTUCMDKhac(short CacLoaiTUCMDKhac) {
        this.CacLoaiTUCMDKhac = CacLoaiTUCMDKhac;
    }
    
}
