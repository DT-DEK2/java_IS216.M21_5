/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

/**
 *
 * @author Minh Cuong
 */
public class MangThai {
    private BenhNhan benhNhan;
    private short MangThai;
    private int SoTuanMangThai;
    private short HauSan;
    private short TreSSDuocXNCovid;
    private String KQXN;

    public MangThai() {
    }

    public MangThai(BenhNhan benhNhan, short MangThai, int SoTuanMangThai, short HauSan, short TreSSDuocXNCovid, String KQXN) {
        this.benhNhan = benhNhan;
        this.MangThai = MangThai;
        this.SoTuanMangThai = SoTuanMangThai;
        this.HauSan = HauSan;
        this.TreSSDuocXNCovid = TreSSDuocXNCovid;
        this.KQXN = KQXN;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public short getMangThai() {
        return MangThai;
    }

    public void setMangThai(short MangThai) {
        this.MangThai = MangThai;
    }

    public int getSoTuanMangThai() {
        return SoTuanMangThai;
    }

    public void setSoTuanMangThai(int SoTuanMangThai) {
        this.SoTuanMangThai = SoTuanMangThai;
    }

    public short getHauSan() {
        return HauSan;
    }

    public void setHauSan(short HauSan) {
        this.HauSan = HauSan;
    }

    public short getTreSSDuocXNCovid() {
        return TreSSDuocXNCovid;
    }

    public void setTreSSDuocXNCovid(short TreSSDuocXNCovid) {
        this.TreSSDuocXNCovid = TreSSDuocXNCovid;
    }

    public String getKQXN() {
        return KQXN;
    }

    public void setKQXN(String KQXN) {
        this.KQXN = KQXN;
    }
    
}
