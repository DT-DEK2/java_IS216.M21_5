/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlbn.model;

/**
 *
 * @author Minh Cuong
 */
public class TCTaiThoiDiemTiepNhan {
   private BenhNhan benhNhan;
   private short Sot         ;
   private short DauHong          ;    
   private short NoiHachNgoaiVi     ;    
   private short DauDau     ; 
   private short MatKhuuGiac  ;    
   private short CoGiat      ;         
   private short DauCo         ;                          
   private short DauKhop        ;
   private short DauBung        ;
   private short MatViGiac        ;
   private short BuonNon        ;
   private short XuatHuyet        ;
   private short TrieuChungKhac        ;

    public TCTaiThoiDiemTiepNhan() {
    }

    public TCTaiThoiDiemTiepNhan(BenhNhan benhNhan, short Sot, short DauHong, short NoiHachNgoaiVi, short DauDau, short MatKhuuGiac, short CoGiat, short DauCo, short DauKhop, short DauBung, short MatViGiac, short BuonNon, short XuatHuyet, short TrieuChungKhac) {
        this.benhNhan = benhNhan;
        this.Sot = Sot;
        this.DauHong = DauHong;
        this.NoiHachNgoaiVi = NoiHachNgoaiVi;
        this.DauDau = DauDau;
        this.MatKhuuGiac = MatKhuuGiac;
        this.CoGiat = CoGiat;
        this.DauCo = DauCo;
        this.DauKhop = DauKhop;
        this.DauBung = DauBung;
        this.MatViGiac = MatViGiac;
        this.BuonNon = BuonNon;
        this.XuatHuyet = XuatHuyet;
        this.TrieuChungKhac = TrieuChungKhac;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public short getSot() {
        return Sot;
    }

    public void setSot(short Sot) {
        this.Sot = Sot;
    }

    public short getDauHong() {
        return DauHong;
    }

    public void setDauHong(short DauHong) {
        this.DauHong = DauHong;
    }

    public short getNoiHachNgoaiVi() {
        return NoiHachNgoaiVi;
    }

    public void setNoiHachNgoaiVi(short NoiHachNgoaiVi) {
        this.NoiHachNgoaiVi = NoiHachNgoaiVi;
    }

    public short getDauDau() {
        return DauDau;
    }

    public void setDauDau(short DauDau) {
        this.DauDau = DauDau;
    }

    public short getMatKhuuGiac() {
        return MatKhuuGiac;
    }

    public void setMatKhuuGiac(short MatKhuuGiac) {
        this.MatKhuuGiac = MatKhuuGiac;
    }

    public short getCoGiat() {
        return CoGiat;
    }

    public void setCoGiat(short CoGiat) {
        this.CoGiat = CoGiat;
    }

    public short getDauCo() {
        return DauCo;
    }

    public void setDauCo(short DauCo) {
        this.DauCo = DauCo;
    }

    public short getDauKhop() {
        return DauKhop;
    }

    public void setDauKhop(short DauKhop) {
        this.DauKhop = DauKhop;
    }

    public short getDauBung() {
        return DauBung;
    }

    public void setDauBung(short DauBung) {
        this.DauBung = DauBung;
    }

    public short getMatViGiac() {
        return MatViGiac;
    }

    public void setMatViGiac(short MatViGiac) {
        this.MatViGiac = MatViGiac;
    }

    public short getBuonNon() {
        return BuonNon;
    }

    public void setBuonNon(short BuonNon) {
        this.BuonNon = BuonNon;
    }

    public short getXuatHuyet() {
        return XuatHuyet;
    }

    public void setXuatHuyet(short XuatHuyet) {
        this.XuatHuyet = XuatHuyet;
    }

    public short getTrieuChungKhac() {
        return TrieuChungKhac;
    }

    public void setTrieuChungKhac(short TrieuChungKhac) {
        this.TrieuChungKhac = TrieuChungKhac;
    }
   
}
