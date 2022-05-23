/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

/**
 *
 * @author Minh Cuong
 */
public class DanhGiaSL {
    private BenhNhan benhNhan;
    private String ChuanDoanLucNV;
    private String DanhGiaTTBenhLyCV;
    private short DanhGiaDKCLTaiNha;

    public DanhGiaSL() {
    }

    public DanhGiaSL(BenhNhan benhNhan, String ChuanDoanLucNV, String DanhGiaTTBenhLyCV, short DanhGiaDKCLTaiNha) {
        this.benhNhan = benhNhan;
        this.ChuanDoanLucNV = ChuanDoanLucNV;
        this.DanhGiaTTBenhLyCV = DanhGiaTTBenhLyCV;
        this.DanhGiaDKCLTaiNha = DanhGiaDKCLTaiNha;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getChuanDoanLucNV() {
        return ChuanDoanLucNV;
    }

    public void setChuanDoanLucNV(String ChuanDoanLucNV) {
        this.ChuanDoanLucNV = ChuanDoanLucNV;
    }

    public String getDanhGiaTTBenhLyCV() {
        return DanhGiaTTBenhLyCV;
    }

    public void setDanhGiaTTBenhLyCV(String DanhGiaTTBenhLyCV) {
        this.DanhGiaTTBenhLyCV = DanhGiaTTBenhLyCV;
    }

    public short getDanhGiaDKCLTaiNha() {
        return DanhGiaDKCLTaiNha;
    }

    public void setDanhGiaDKCLTaiNha(short DanhGiaDKCLTaiNha) {
        this.DanhGiaDKCLTaiNha = DanhGiaDKCLTaiNha;
    }
    
}
