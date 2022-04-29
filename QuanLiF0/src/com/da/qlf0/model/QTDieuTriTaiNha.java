/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Minh Cuong
 */
public class QTDieuTriTaiNha {
   private Timestamp ThoiDiemCapNhat;
   private short Mach  ;
   private short NhietDo          ;    
   private short NhipTho     ;    
   private short SpO2    ; 
   private short HuyetApToiDa  ;    
   private short HuyetApToiThieu      ;         
   private short KietSuc          ;                          
   private short Ho  ;                         
   private short HoRaDom    ;                          
   private short OnLanh     ;                           
   private short MatViGiac  ;                   
   private short MatKhuuGiac            ;                        
   private short TieuChay;             
   private short HoRaMau     ;                     
   private short ThoDocHoacKhoTho   ;                      
   private short DauTucNgucKeoDai        ;                     
   private short LoMoKhongTinhTao       ;
   private short GoiThuocA       ;
   private short GoiThuocB       ;
   private short GoiThuocC       ;
   private short XetNghiem       ;
   private Date NgayXetNghiem       ;
   private  short KQXN       ;

    public QTDieuTriTaiNha() {
    }

    public QTDieuTriTaiNha(Timestamp ThoiDiemCapNhat, short Mach, short NhietDo, short NhipTho, short SpO2, short HuyetApToiDa, short HuyetApToiThieu, short KietSuc, short Ho, short HoRaDom, short OnLanh, short MatViGiac, short MatKhuuGiac, short TieuChay, short HoRaMau, short ThoDocHoacKhoTho, short DauTucNgucKeoDai, short LoMoKhongTinhTao, short GoiThuocA, short GoiThuocB, short GoiThuocC, short XetNghiem, Date NgayXetNghiem, short KQXN) {
        this.ThoiDiemCapNhat = ThoiDiemCapNhat;
        this.Mach = Mach;
        this.NhietDo = NhietDo;
        this.NhipTho = NhipTho;
        this.SpO2 = SpO2;
        this.HuyetApToiDa = HuyetApToiDa;
        this.HuyetApToiThieu = HuyetApToiThieu;
        this.KietSuc = KietSuc;
        this.Ho = Ho;
        this.HoRaDom = HoRaDom;
        this.OnLanh = OnLanh;
        this.MatViGiac = MatViGiac;
        this.MatKhuuGiac = MatKhuuGiac;
        this.TieuChay = TieuChay;
        this.HoRaMau = HoRaMau;
        this.ThoDocHoacKhoTho = ThoDocHoacKhoTho;
        this.DauTucNgucKeoDai = DauTucNgucKeoDai;
        this.LoMoKhongTinhTao = LoMoKhongTinhTao;
        this.GoiThuocA = GoiThuocA;
        this.GoiThuocB = GoiThuocB;
        this.GoiThuocC = GoiThuocC;
        this.XetNghiem = XetNghiem;
        this.NgayXetNghiem = NgayXetNghiem;
        this.KQXN = KQXN;
    }

    public Timestamp getThoiDiemCapNhat() {
        return ThoiDiemCapNhat;
    }

    public void setThoiDiemCapNhat(Timestamp ThoiDiemCapNhat) {
        this.ThoiDiemCapNhat = ThoiDiemCapNhat;
    }

    public short getMach() {
        return Mach;
    }

    public void setMach(short Mach) {
        this.Mach = Mach;
    }

    public short getNhietDo() {
        return NhietDo;
    }

    public void setNhietDo(short NhietDo) {
        this.NhietDo = NhietDo;
    }

    public short getNhipTho() {
        return NhipTho;
    }

    public void setNhipTho(short NhipTho) {
        this.NhipTho = NhipTho;
    }

    public short getSpO2() {
        return SpO2;
    }

    public void setSpO2(short SpO2) {
        this.SpO2 = SpO2;
    }

    public short getHuyetApToiDa() {
        return HuyetApToiDa;
    }

    public void setHuyetApToiDa(short HuyetApToiDa) {
        this.HuyetApToiDa = HuyetApToiDa;
    }

    public short getHuyetApToiThieu() {
        return HuyetApToiThieu;
    }

    public void setHuyetApToiThieu(short HuyetApToiThieu) {
        this.HuyetApToiThieu = HuyetApToiThieu;
    }

    public short getKietSuc() {
        return KietSuc;
    }

    public void setKietSuc(short KietSuc) {
        this.KietSuc = KietSuc;
    }

    public short getHo() {
        return Ho;
    }

    public void setHo(short Ho) {
        this.Ho = Ho;
    }

    public short getHoRaDom() {
        return HoRaDom;
    }

    public void setHoRaDom(short HoRaDom) {
        this.HoRaDom = HoRaDom;
    }

    public short getOnLanh() {
        return OnLanh;
    }

    public void setOnLanh(short OnLanh) {
        this.OnLanh = OnLanh;
    }

    public short getMatViGiac() {
        return MatViGiac;
    }

    public void setMatViGiac(short MatViGiac) {
        this.MatViGiac = MatViGiac;
    }

    public short getMatKhuuGiac() {
        return MatKhuuGiac;
    }

    public void setMatKhuuGiac(short MatKhuuGiac) {
        this.MatKhuuGiac = MatKhuuGiac;
    }

    public short getTieuChay() {
        return TieuChay;
    }

    public void setTieuChay(short TieuChay) {
        this.TieuChay = TieuChay;
    }

    public short getHoRaMau() {
        return HoRaMau;
    }

    public void setHoRaMau(short HoRaMau) {
        this.HoRaMau = HoRaMau;
    }

    public short getThoDocHoacKhoTho() {
        return ThoDocHoacKhoTho;
    }

    public void setThoDocHoacKhoTho(short ThoDocHoacKhoTho) {
        this.ThoDocHoacKhoTho = ThoDocHoacKhoTho;
    }

    public short getDauTucNgucKeoDai() {
        return DauTucNgucKeoDai;
    }

    public void setDauTucNgucKeoDai(short DauTucNgucKeoDai) {
        this.DauTucNgucKeoDai = DauTucNgucKeoDai;
    }

    public short getLoMoKhongTinhTao() {
        return LoMoKhongTinhTao;
    }

    public void setLoMoKhongTinhTao(short LoMoKhongTinhTao) {
        this.LoMoKhongTinhTao = LoMoKhongTinhTao;
    }

    public short getGoiThuocA() {
        return GoiThuocA;
    }

    public void setGoiThuocA(short GoiThuocA) {
        this.GoiThuocA = GoiThuocA;
    }

    public short getGoiThuocB() {
        return GoiThuocB;
    }

    public void setGoiThuocB(short GoiThuocB) {
        this.GoiThuocB = GoiThuocB;
    }

    public short getGoiThuocC() {
        return GoiThuocC;
    }

    public void setGoiThuocC(short GoiThuocC) {
        this.GoiThuocC = GoiThuocC;
    }

    public short getXetNghiem() {
        return XetNghiem;
    }

    public void setXetNghiem(short XetNghiem) {
        this.XetNghiem = XetNghiem;
    }

    public Date getNgayXetNghiem() {
        return NgayXetNghiem;
    }

    public void setNgayXetNghiem(Date NgayXetNghiem) {
        this.NgayXetNghiem = NgayXetNghiem;
    }

    public short getKQXN() {
        return KQXN;
    }

    public void setKQXN(short KQXN) {
        this.KQXN = KQXN;
    }
   
}
