/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlbn.model;

/**
 *
 * @author Minh Cuong
 */
public class TongTrang {
    private BenhNhan benhNhan;
   private short NhietDo         ;
   private short NhipTim          ;    
   private short HuyetApTamThu     ;    
   private short HuyetApTamTruong    ; 
   private short DoBaoHoaOxyTrongMau  ;    
   private short ChieuCao      ;         
   private short CanNang        ;                          
   private short NhipTho        ;  

    public TongTrang() {
    }

    public TongTrang(BenhNhan benhNhan, short NhietDo, short NhipTim, short HuyetApTamThu, short HuyetApTamTruong, short DoBaoHoaOxyTrongMau, short ChieuCao, short CanNang, short NhipTho) {
        this.benhNhan = benhNhan;
        this.NhietDo = NhietDo;
        this.NhipTim = NhipTim;
        this.HuyetApTamThu = HuyetApTamThu;
        this.HuyetApTamTruong = HuyetApTamTruong;
        this.DoBaoHoaOxyTrongMau = DoBaoHoaOxyTrongMau;
        this.ChieuCao = ChieuCao;
        this.CanNang = CanNang;
        this.NhipTho = NhipTho;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public short getNhietDo() {
        return NhietDo;
    }

    public void setNhietDo(short NhietDo) {
        this.NhietDo = NhietDo;
    }

    public short getNhipTim() {
        return NhipTim;
    }

    public void setNhipTim(short NhipTim) {
        this.NhipTim = NhipTim;
    }

    public short getHuyetApTamThu() {
        return HuyetApTamThu;
    }

    public void setHuyetApTamThu(short HuyetApTamThu) {
        this.HuyetApTamThu = HuyetApTamThu;
    }

    public short getHuyetApTamTruong() {
        return HuyetApTamTruong;
    }

    public void setHuyetApTamTruong(short HuyetApTamTruong) {
        this.HuyetApTamTruong = HuyetApTamTruong;
    }

    public short getDoBaoHoaOxyTrongMau() {
        return DoBaoHoaOxyTrongMau;
    }

    public void setDoBaoHoaOxyTrongMau(short DoBaoHoaOxyTrongMau) {
        this.DoBaoHoaOxyTrongMau = DoBaoHoaOxyTrongMau;
    }

    public short getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(short ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public short getCanNang() {
        return CanNang;
    }

    public void setCanNang(short CanNang) {
        this.CanNang = CanNang;
    }

    public short getNhipTho() {
        return NhipTho;
    }

    public void setNhipTho(short NhipTho) {
        this.NhipTho = NhipTho;
    }
   
}
