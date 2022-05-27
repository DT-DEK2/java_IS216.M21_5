/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import com.da.qlf0.dao.OracleConnection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Minh Cuong
 */
public class XemTT_CapNhatDTController {
    private String MABN;
    private javax.swing.JCheckBox jcbNam;
    private javax.swing.JCheckBox jcbNu;
   
    private javax.swing.JCheckBox jcbTestNhanh_Co;
    private javax.swing.JCheckBox jcbTestNhanh_Khong;
    private javax.swing.JCheckBox jcbTunglaF0_Co;
    private javax.swing.JCheckBox jcbTunglaF0_Khong;
    private javax.swing.JComboBox<String> jcobPhuong_Xa;
    private javax.swing.JComboBox<String> jcobQuan_Huyen;
    private javax.swing.JComboBox<String> jcobTinh_ThanhPho;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private com.toedter.calendar.JDateChooser jdcNgayTN;
    private com.toedter.calendar.JDateChooser jdcNgayTestNhanh;
    private com.toedter.calendar.JDateChooser jdcNgayTestPCR;
    private com.toedter.calendar.JDateChooser jdcNgayXHTTDT;
    private javax.swing.JTextField jtfCMND_CCCD;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMABN;
    private javax.swing.JTextField jtfNgheNghiep;
    private javax.swing.JTextField jtfNoiLamViec;
    private javax.swing.JTextField jtfNoiO;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfSoNgayF0;
   private javax.swing.JComboBox<String> jcobKQTestNhanh;
    private javax.swing.JComboBox<String> jcobKQTestPCR;
     private javax.swing.JCheckBox jcbTestPCR_Co;
    private javax.swing.JCheckBox jcbTestPCR_Khong;
    
    
     private javax.swing.JComboBox<String> jcobTiemVX_1;
    private javax.swing.JComboBox<String> jcobTiemVX_2;
    private javax.swing.JComboBox<String> jcobTiemVX_3;
    private com.toedter.calendar.JDateChooser jdcTGMui1;
    private com.toedter.calendar.JDateChooser jdcTGMui2;
    private com.toedter.calendar.JDateChooser jdcTGMui3;
    private javax.swing.JRadioButton jrbChuaTiem;
    private javax.swing.JRadioButton jrbTiem1Mui;
    private javax.swing.JRadioButton jrbTiem2Mui;
    private javax.swing.JRadioButton jrbTiem3Mui;
    private javax.swing.JRadioButton jrbTiem_KhongBiet;
    
    
    private javax.swing.JRadioButton jrbBenhGan_Co;
    private javax.swing.JRadioButton jrbBenhGan_Khong;
    private javax.swing.JRadioButton jrbBenhPhoiMT_Co;
    private javax.swing.JRadioButton jrbBenhPhoiMT_Khong;
    private javax.swing.JRadioButton jrbBenhTKMT_Co;
    private javax.swing.JRadioButton jrbBenhTKMT_Khong;
    private javax.swing.JRadioButton jrbBenhThanMT_Co;
    private javax.swing.JRadioButton jrbBenhThanMT_Khong;
    private javax.swing.JRadioButton jrbBenhTim_Co;
    private javax.swing.JRadioButton jrbBenhTim_Khong;
    private javax.swing.JRadioButton jrbBeoPhi_Co;
    private javax.swing.JRadioButton jrbBeoPhi_Khong;
    private javax.swing.JRadioButton jrbCLBenhHT_Co;
    private javax.swing.JRadioButton jrbCLBenhHT_Khong;
    private javax.swing.JRadioButton jrbDaiTD_Co;
    private javax.swing.JRadioButton jrbDaiTD_Khong;
    private javax.swing.JRadioButton jrbGhepTang_TBM_Co;
    private javax.swing.JRadioButton jrbGhepTang_TBM_Khong;
    private javax.swing.JRadioButton jrbHIV_Co;
    private javax.swing.JRadioButton jrbHIV_Khong;
    private javax.swing.JRadioButton jrbHauSan_Co;
    private javax.swing.JRadioButton jrbHauSan_Khong;
    private javax.swing.JRadioButton jrbHenKQ_Co;
    private javax.swing.JRadioButton jrbHenKQ_Khong;
    private javax.swing.JRadioButton jrbHoiChungDown_Co;
    private javax.swing.JRadioButton jrbHoiChungDown_Khong;
    private javax.swing.JRadioButton jrbKQXN_AT;
    private javax.swing.JRadioButton jrbKQXN_ChuaCoKQ;
    private javax.swing.JRadioButton jrbKQXN_DT;
    private javax.swing.JRadioButton jrbKhangSinh_Co;
    private javax.swing.JRadioButton jrbKhangSinh_Khong;
    private javax.swing.JRadioButton jrbKhangVirus_Co;
    private javax.swing.JRadioButton jrbKhangVirus_Khong;
    private javax.swing.JRadioButton jrbMachMauNao_Co;
    private javax.swing.JRadioButton jrbMachMauNao_Khong;
    private javax.swing.JRadioButton jrbMangThai_Co;
    private javax.swing.JRadioButton jrbMangThai_Khong;
    private javax.swing.JRadioButton jrbRoiLoanSDCGN_Co;
    private javax.swing.JRadioButton jrbRoiLoanSDCGN_Khong;
    private javax.swing.JRadioButton jrbSteroid_Co;
    private javax.swing.JRadioButton jrbSteroid_Khong;
    private javax.swing.JRadioButton jrbTangHA_Co;
    private javax.swing.JRadioButton jrbTangHA_Khong;
    private javax.swing.JRadioButton jrbThieuMD_Co;
    private javax.swing.JRadioButton jrbThieuMD_Khong;
    private javax.swing.JRadioButton jrbThuocDTCovid_Co;
    private javax.swing.JRadioButton jrbThuocDTCovid_Khong;
    private javax.swing.JRadioButton jrbThuocMD_Co;
    private javax.swing.JRadioButton jrbThuocMD_Khong;
    private javax.swing.JRadioButton jrbThuocUCMD_Co;
    private javax.swing.JRadioButton jrbThuocUCMD_Khong;
    private javax.swing.JRadioButton jrbTreSSXNcovid_Co;
    private javax.swing.JRadioButton jrbTreSSXNcovid_Khong;
    private javax.swing.JRadioButton jrbUngThu_Co;
    private javax.swing.JRadioButton jrbUngThu_Khong;
    private javax.swing.JTextField jtfSoTuanMT;
    
    
    private javax.swing.JComboBox<String> jcobDGTTBL;
    private javax.swing.JRadioButton jrbBuonNon_Co;
    private javax.swing.JRadioButton jrbBuonNon_Khong;
    private javax.swing.JRadioButton jrbCoGiat_Co;
    private javax.swing.JRadioButton jrbCoGiat_Khong;
    private javax.swing.JRadioButton jrbDKCL_Co;
    private javax.swing.JRadioButton jrbDKCL_Khong;
    private javax.swing.JRadioButton jrbDauBung_Co;
    private javax.swing.JRadioButton jrbDauBung_Khong;
    private javax.swing.JRadioButton jrbDauCo_Co;
    private javax.swing.JRadioButton jrbDauCo_Khong;
    private javax.swing.JRadioButton jrbDauDau_Co;
    private javax.swing.JRadioButton jrbDauDau_Khong;
    private javax.swing.JRadioButton jrbDauHong_Co;
    private javax.swing.JRadioButton jrbDauHong_Khong;
    private javax.swing.JRadioButton jrbDauKhop_Co;
    private javax.swing.JRadioButton jrbDauKhop_Khong;
    private javax.swing.JRadioButton jrbMatKhuuGiac_Co;
    private javax.swing.JRadioButton jrbMatKhuuGiac_Khong;
    private javax.swing.JRadioButton jrbMatViGiac_Co;
    private javax.swing.JRadioButton jrbMatViGiac_Khong;
    private javax.swing.JRadioButton jrbNoiHach_Co;
    private javax.swing.JRadioButton jrbNoiHach_Khong;
    private javax.swing.JRadioButton jrbSot_Co;
    private javax.swing.JRadioButton jrbSot_Khong;
    private javax.swing.JRadioButton jrbTTKhac_Co;
    private javax.swing.JRadioButton jrbTTKhac_Khong;
    private javax.swing.JRadioButton jrbXuatHuyet_Co;
    private javax.swing.JRadioButton jrbXuatHuyet_Khong;
    private javax.swing.JTextField jtfCanNang;
    private javax.swing.JTextField jtfChieuCao;
    private javax.swing.JTextField jtfChuanDoanTT;
    private javax.swing.JTextField jtfDoBH_Oxi;
    private javax.swing.JTextField jtfHuyetApTThu;
    private javax.swing.JTextField jtfHuyetApTTruong;
    private javax.swing.JTextField jtfNhietDo;
    private javax.swing.JTextField jtfNhipTho;
    private javax.swing.JTextField jtfNhipTim;
    private javax.swing.JTextField jtfTTKhac;
    
    private com.toedter.calendar.JDateChooser jdcNgayXN;
    
    
    private javax.swing.JRadioButton jrbDauNguc_Co;
    private javax.swing.JRadioButton jrbDauNguc_Khong;
    private javax.swing.JRadioButton jrbGoiA_Co;
    private javax.swing.JRadioButton jrbGoiA_Khong;
    private javax.swing.JRadioButton jrbGoiB_Co;
    private javax.swing.JRadioButton jrbGoiB_Khong;
    private javax.swing.JRadioButton jrbGoiC_Co;
    private javax.swing.JRadioButton jrbGoiC_Khong;
    private javax.swing.JRadioButton jrbHoRaDom_Co;
    private javax.swing.JRadioButton jrbHoRaDom_Khong;
    private javax.swing.JRadioButton jrbHoRaMau_Co;
    private javax.swing.JRadioButton jrbHoRaMau_Khong;
    private javax.swing.JRadioButton jrbHo_Co;
    private javax.swing.JRadioButton jrbHo_Khong;
    private javax.swing.JRadioButton jrbKQ_AT;
    private javax.swing.JRadioButton jrbKQ_DT;
    private javax.swing.JRadioButton jrbKhoTho_Co;
    private javax.swing.JRadioButton jrbKhoTho_Khong;
    private javax.swing.JRadioButton jrbKhongTT_Co;
    private javax.swing.JRadioButton jrbKhongTT_Khong;
    private javax.swing.JRadioButton jrbKietSuc_Co;
    private javax.swing.JRadioButton jrbKietSuc_Khong;
    private javax.swing.JRadioButton jrbMatKG_Co;
    private javax.swing.JRadioButton jrbMatKG_Khong;
    private javax.swing.JRadioButton jrbMatVG_Co;
    private javax.swing.JRadioButton jrbMatVG_Khong;
    private javax.swing.JRadioButton jrbOnLanh_Co;
    private javax.swing.JRadioButton jrbOnLanh_Khong;
    private javax.swing.JRadioButton jrbTieuChay_Co;
    private javax.swing.JRadioButton jrbTieuChay_Khong;
    private javax.swing.JRadioButton jrbXN_Co;
    private javax.swing.JRadioButton jrbXN_Khong;
    private javax.swing.JTextField jtfDoBHOxi;
    private javax.swing.JTextField jtfHuyetApTD;
    private javax.swing.JTextField jtfHuyetApToiThieu;
    private javax.swing.JTextField jtfMach;
    private javax.swing.JTextField jtfNhietDo_QTDT;
    private javax.swing.JTextField jtfNhipTho_QTDT;

    public XemTT_CapNhatDTController(
            String MABN,
            JCheckBox jcbNam,
            JCheckBox jcbNu,
           
            JCheckBox jcbTestPCR_Co,
            JCheckBox jcbTestPCR_Khong ,
            JCheckBox jcbTestNhanh_Co, 
            JCheckBox jcbTestNhanh_Khong, 
            JCheckBox jcbTunglaF0_Co, 
            JCheckBox jcbTunglaF0_Khong,
            JComboBox<String> jcobPhuong_Xa,
            JComboBox<String> jcobQuan_Huyen,
            JComboBox<String> jcobTinh_ThanhPho, 
            JDateChooser jdcNgaySinh, 
            JDateChooser jdcNgayTN, 
            JDateChooser jdcNgayTestNhanh, 
            JDateChooser jdcNgayTestPCR, 
            JComboBox<String> jcobKQTestNhanh ,
            JComboBox<String> jcobKQTestPCR,
            JDateChooser jdcNgayXHTTDT, 
            JTextField jtfCMND_CCCD, 
            JTextField jtfHoTen, 
            JTextField jtfMABN, 
            JTextField jtfNgheNghiep,
            JTextField jtfNoiLamViec, 
            JTextField jtfNoiO, 
            JTextField jtfSDT,
            JTextField jtfSoNgayF0, 
            JComboBox<String> jcobTiemVX_1,
            JComboBox<String> jcobTiemVX_2,
            JComboBox<String> jcobTiemVX_3,
            JDateChooser jdcTGMui1, 
            JDateChooser jdcTGMui2,
            JDateChooser jdcTGMui3, 
            JRadioButton jrbChuaTiem, 
            JRadioButton jrbTiem1Mui, 
            JRadioButton jrbTiem2Mui, 
            JRadioButton jrbTiem3Mui, 
            JRadioButton jrbTiem_KhongBiet,
            JRadioButton jrbBenhGan_Co,
            JRadioButton jrbBenhGan_Khong,
            JRadioButton jrbBenhPhoiMT_Co, 
            JRadioButton jrbBenhPhoiMT_Khong,
            JRadioButton jrbBenhTKMT_Co, 
            JRadioButton jrbBenhTKMT_Khong,
            JRadioButton jrbBenhThanMT_Co,
            JRadioButton jrbBenhThanMT_Khong, 
            JRadioButton jrbBenhTim_Co,
            JRadioButton jrbBenhTim_Khong,
            JRadioButton jrbBeoPhi_Co, 
            JRadioButton jrbBeoPhi_Khong,
            JRadioButton jrbCLBenhHT_Co, 
            JRadioButton jrbCLBenhHT_Khong, 
            JRadioButton jrbDaiTD_Co, 
            JRadioButton jrbDaiTD_Khong, 
            JRadioButton jrbGhepTang_TBM_Co,
            JRadioButton jrbGhepTang_TBM_Khong, 
            JRadioButton jrbHIV_Co, 
            JRadioButton jrbHIV_Khong, 
            JRadioButton jrbHauSan_Co,
            JRadioButton jrbHauSan_Khong, 
            JRadioButton jrbHenKQ_Co, 
            JRadioButton jrbHenKQ_Khong,
            JRadioButton jrbHoiChungDown_Co,
            JRadioButton jrbHoiChungDown_Khong,
            JRadioButton jrbKQXN_AT, 
            JRadioButton jrbKQXN_ChuaCoKQ,
            JRadioButton jrbKQXN_DT,
            JRadioButton jrbKhangSinh_Co, 
            JRadioButton jrbKhangSinh_Khong,
            JRadioButton jrbKhangVirus_Co,
            JRadioButton jrbKhangVirus_Khong,
            JRadioButton jrbMachMauNao_Co, 
            JRadioButton jrbMachMauNao_Khong,
            JRadioButton jrbMangThai_Co,
            JRadioButton jrbMangThai_Khong,
            JRadioButton jrbRoiLoanSDCGN_Co, 
            JRadioButton jrbRoiLoanSDCGN_Khong, 
            JRadioButton jrbSteroid_Co, 
            JRadioButton jrbSteroid_Khong, 
            JRadioButton jrbTangHA_Co, 
            JRadioButton jrbTangHA_Khong,
            JRadioButton jrbThieuMD_Co, 
            JRadioButton jrbThieuMD_Khong, 
            JRadioButton jrbThuocDTCovid_Co,
            JRadioButton jrbThuocDTCovid_Khong,
            JRadioButton jrbThuocMD_Co, 
            JRadioButton jrbThuocMD_Khong, 
            JRadioButton jrbThuocUCMD_Co, 
            JRadioButton jrbThuocUCMD_Khong,
            JRadioButton jrbTreSSXNcovid_Co,
            JRadioButton jrbTreSSXNcovid_Khong,
            JRadioButton jrbUngThu_Co, 
            JRadioButton jrbUngThu_Khong,
            JTextField jtfSoTuanMT, 
            JComboBox<String> jcobDGTTBL,
            JRadioButton jrbBuonNon_Co, 
            JRadioButton jrbBuonNon_Khong, 
            JRadioButton jrbCoGiat_Co, 
            JRadioButton jrbCoGiat_Khong,
            JRadioButton jrbDKCL_Co, 
            JRadioButton jrbDKCL_Khong, 
            JRadioButton jrbDauBung_Co, 
            JRadioButton jrbDauBung_Khong,
            JRadioButton jrbDauCo_Co,
            JRadioButton jrbDauCo_Khong,
            JRadioButton jrbDauDau_Co, 
            JRadioButton jrbDauDau_Khong,
            JRadioButton jrbDauHong_Co,
            JRadioButton jrbDauHong_Khong,
            JRadioButton jrbDauKhop_Co,
            JRadioButton jrbDauKhop_Khong,
            JRadioButton jrbMatKhuuGiac_Co,
            JRadioButton jrbMatKhuuGiac_Khong,
            JRadioButton jrbMatViGiac_Co, 
            JRadioButton jrbMatViGiac_Khong,
            JRadioButton jrbNoiHach_Co, 
            JRadioButton jrbNoiHach_Khong,
            JRadioButton jrbSot_Co,
            JRadioButton jrbSot_Khong,
            JRadioButton jrbTTKhac_Co,
            JRadioButton jrbTTKhac_Khong, 
            JRadioButton jrbXuatHuyet_Co, 
            JRadioButton jrbXuatHuyet_Khong,
            JTextField jtfCanNang, 
            JTextField jtfChieuCao, 
            JTextField jtfChuanDoanTT,
            JTextField jtfDoBH_Oxi, 
            JTextField jtfHuyetApTThu,
            JTextField jtfHuyetApTTruong,
            JTextField jtfNhietDo,
            JTextField jtfNhipTho, 
            JTextField jtfNhipTim, 
            JTextField jtfTTKhac, 
            JDateChooser jdcNgayXN,
            
            JRadioButton jrbDauNguc_Co, 
            JRadioButton jrbDauNguc_Khong,
            JRadioButton jrbGoiA_Co, 
            JRadioButton jrbGoiA_Khong,
            JRadioButton jrbGoiB_Co,
            JRadioButton jrbGoiB_Khong,
            JRadioButton jrbGoiC_Co, 
            JRadioButton jrbGoiC_Khong, 
            JRadioButton jrbHoRaDom_Co, 
            JRadioButton jrbHoRaDom_Khong,
            JRadioButton jrbHoRaMau_Co, 
            JRadioButton jrbHoRaMau_Khong,
            JRadioButton jrbHo_Co, 
            JRadioButton jrbHo_Khong, 
            JRadioButton jrbKQ_AT,
            JRadioButton jrbKQ_DT, 
            JRadioButton jrbKhoTho_Co, 
            JRadioButton jrbKhoTho_Khong, 
            JRadioButton jrbKhongTT_Co, 
            JRadioButton jrbKhongTT_Khong, 
            JRadioButton jrbKietSuc_Co, 
            JRadioButton jrbKietSuc_Khong, 
            JRadioButton jrbMatKG_Co, 
            JRadioButton jrbMatKG_Khong,
            JRadioButton jrbMatVG_Co, 
            JRadioButton jrbMatVG_Khong, 
            JRadioButton jrbOnLanh_Co, 
            JRadioButton jrbOnLanh_Khong,
            JRadioButton jrbTieuChay_Co, 
            JRadioButton jrbTieuChay_Khong,
            JRadioButton jrbXN_Co, 
            JRadioButton jrbXN_Khong, 
            JTextField jtfDoBHOxi, 
            JTextField jtfHuyetApTD, 
            JTextField jtfHuyetApToiThieu,
            JTextField jtfMach, 
            JTextField jtfNhietDo_QTDT,
            JTextField jtfNhipTho_QTDT) {
        this.MABN=MABN;
        this.jcbNam = jcbNam;
        this.jcbNu = jcbNu;
        
        this.jcbTestNhanh_Co = jcbTestNhanh_Co;
        this.jcbTestNhanh_Khong = jcbTestNhanh_Khong;
        this.jcbTestPCR_Co=jcbTestPCR_Co;
        this.jcbTestPCR_Khong=jcbTestPCR_Khong;
        this.jcbTunglaF0_Co = jcbTunglaF0_Co;
        this.jcbTunglaF0_Khong = jcbTunglaF0_Khong;
        this.jcobPhuong_Xa = jcobPhuong_Xa;
        this.jcobQuan_Huyen = jcobQuan_Huyen;
        this.jcobTinh_ThanhPho = jcobTinh_ThanhPho;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jdcNgayTN = jdcNgayTN;
        this.jdcNgayTestNhanh = jdcNgayTestNhanh;
        this.jdcNgayTestPCR = jdcNgayTestPCR;
        this.jdcNgayXHTTDT = jdcNgayXHTTDT;
          this.jcobKQTestNhanh=jcobKQTestNhanh;
          this.jcobKQTestPCR=jcobKQTestPCR;
        this.jtfCMND_CCCD = jtfCMND_CCCD;
        this.jtfHoTen = jtfHoTen;
        this.jtfMABN = jtfMABN;
        this.jtfNgheNghiep = jtfNgheNghiep;
        this.jtfNoiLamViec = jtfNoiLamViec;
        this.jtfNoiO = jtfNoiO;
        this.jtfSDT = jtfSDT;
        this.jtfSoNgayF0 = jtfSoNgayF0;
        this.jcobTiemVX_1 = jcobTiemVX_1;
        this.jcobTiemVX_2 = jcobTiemVX_2;
        this.jcobTiemVX_3 = jcobTiemVX_3;
        this.jdcTGMui1 = jdcTGMui1;
        this.jdcTGMui2 = jdcTGMui2;
        this.jdcTGMui3 = jdcTGMui3;
        this.jrbChuaTiem = jrbChuaTiem;
        this.jrbTiem1Mui = jrbTiem1Mui;
        this.jrbTiem2Mui = jrbTiem2Mui;
        this.jrbTiem3Mui = jrbTiem3Mui;
        this.jrbTiem_KhongBiet = jrbTiem_KhongBiet;
        this.jrbBenhGan_Co = jrbBenhGan_Co;
        this.jrbBenhGan_Khong = jrbBenhGan_Khong;
        this.jrbBenhPhoiMT_Co = jrbBenhPhoiMT_Co;
        this.jrbBenhPhoiMT_Khong = jrbBenhPhoiMT_Khong;
        this.jrbBenhTKMT_Co = jrbBenhTKMT_Co;
        this.jrbBenhTKMT_Khong = jrbBenhTKMT_Khong;
        this.jrbBenhThanMT_Co = jrbBenhThanMT_Co;
        this.jrbBenhThanMT_Khong = jrbBenhThanMT_Khong;
        this.jrbBenhTim_Co = jrbBenhTim_Co;
        this.jrbBenhTim_Khong = jrbBenhTim_Khong;
        this.jrbBeoPhi_Co = jrbBeoPhi_Co;
        this.jrbBeoPhi_Khong = jrbBeoPhi_Khong;
        this.jrbCLBenhHT_Co = jrbCLBenhHT_Co;
        this.jrbCLBenhHT_Khong = jrbCLBenhHT_Khong;
        this.jrbDaiTD_Co = jrbDaiTD_Co;
        this.jrbDaiTD_Khong = jrbDaiTD_Khong;
        this.jrbGhepTang_TBM_Co = jrbGhepTang_TBM_Co;
        this.jrbGhepTang_TBM_Khong = jrbGhepTang_TBM_Khong;
        this.jrbHIV_Co = jrbHIV_Co;
        this.jrbHIV_Khong = jrbHIV_Khong;
        this.jrbHauSan_Co = jrbHauSan_Co;
        this.jrbHauSan_Khong = jrbHauSan_Khong;
        this.jrbHenKQ_Co = jrbHenKQ_Co;
        this.jrbHenKQ_Khong = jrbHenKQ_Khong;
        this.jrbHoiChungDown_Co = jrbHoiChungDown_Co;
        this.jrbHoiChungDown_Khong = jrbHoiChungDown_Khong;
        this.jrbKQXN_AT = jrbKQXN_AT;
        this.jrbKQXN_ChuaCoKQ = jrbKQXN_ChuaCoKQ;
        this.jrbKQXN_DT = jrbKQXN_DT;
        this.jrbKhangSinh_Co = jrbKhangSinh_Co;
        this.jrbKhangSinh_Khong = jrbKhangSinh_Khong;
        this.jrbKhangVirus_Co = jrbKhangVirus_Co;
        this.jrbKhangVirus_Khong = jrbKhangVirus_Khong;
        this.jrbMachMauNao_Co = jrbMachMauNao_Co;
        this.jrbMachMauNao_Khong = jrbMachMauNao_Khong;
        this.jrbMangThai_Co = jrbMangThai_Co;
        this.jrbMangThai_Khong = jrbMangThai_Khong;
        this.jrbRoiLoanSDCGN_Co = jrbRoiLoanSDCGN_Co;
        this.jrbRoiLoanSDCGN_Khong = jrbRoiLoanSDCGN_Khong;
        this.jrbSteroid_Co = jrbSteroid_Co;
        this.jrbSteroid_Khong = jrbSteroid_Khong;
        this.jrbTangHA_Co = jrbTangHA_Co;
        this.jrbTangHA_Khong = jrbTangHA_Khong;
        this.jrbThieuMD_Co = jrbThieuMD_Co;
        this.jrbThieuMD_Khong = jrbThieuMD_Khong;
        this.jrbThuocDTCovid_Co = jrbThuocDTCovid_Co;
        this.jrbThuocDTCovid_Khong = jrbThuocDTCovid_Khong;
        this.jrbThuocMD_Co = jrbThuocMD_Co;
        this.jrbThuocMD_Khong = jrbThuocMD_Khong;
        this.jrbThuocUCMD_Co = jrbThuocUCMD_Co;
        this.jrbThuocUCMD_Khong = jrbThuocUCMD_Khong;
        this.jrbTreSSXNcovid_Co = jrbTreSSXNcovid_Co;
        this.jrbTreSSXNcovid_Khong = jrbTreSSXNcovid_Khong;
        this.jrbUngThu_Co = jrbUngThu_Co;
        this.jrbUngThu_Khong = jrbUngThu_Khong;
        this.jtfSoTuanMT = jtfSoTuanMT;
        this.jcobDGTTBL = jcobDGTTBL;
        this.jrbBuonNon_Co = jrbBuonNon_Co;
        this.jrbBuonNon_Khong = jrbBuonNon_Khong;
        this.jrbCoGiat_Co = jrbCoGiat_Co;
        this.jrbCoGiat_Khong = jrbCoGiat_Khong;
        this.jrbDKCL_Co = jrbDKCL_Co;
        this.jrbDKCL_Khong = jrbDKCL_Khong;
        this.jrbDauBung_Co = jrbDauBung_Co;
        this.jrbDauBung_Khong = jrbDauBung_Khong;
        this.jrbDauCo_Co = jrbDauCo_Co;
        this.jrbDauCo_Khong = jrbDauCo_Khong;
        this.jrbDauDau_Co = jrbDauDau_Co;
        this.jrbDauDau_Khong = jrbDauDau_Khong;
        this.jrbDauHong_Co = jrbDauHong_Co;
        this.jrbDauHong_Khong = jrbDauHong_Khong;
        this.jrbDauKhop_Co = jrbDauKhop_Co;
        this.jrbDauKhop_Khong = jrbDauKhop_Khong;
        this.jrbMatKhuuGiac_Co = jrbMatKhuuGiac_Co;
        this.jrbMatKhuuGiac_Khong = jrbMatKhuuGiac_Khong;
        this.jrbMatViGiac_Co = jrbMatViGiac_Co;
        this.jrbMatViGiac_Khong = jrbMatViGiac_Khong;
        this.jrbNoiHach_Co = jrbNoiHach_Co;
        this.jrbNoiHach_Khong = jrbNoiHach_Khong;
        this.jrbSot_Co = jrbSot_Co;
        this.jrbSot_Khong = jrbSot_Khong;
        this.jrbTTKhac_Co = jrbTTKhac_Co;
        this.jrbTTKhac_Khong = jrbTTKhac_Khong;
        this.jrbXuatHuyet_Co = jrbXuatHuyet_Co;
        this.jrbXuatHuyet_Khong = jrbXuatHuyet_Khong;
        this.jtfCanNang = jtfCanNang;
        this.jtfChieuCao = jtfChieuCao;
        this.jtfChuanDoanTT = jtfChuanDoanTT;
        this.jtfDoBH_Oxi = jtfDoBH_Oxi;
        this.jtfHuyetApTThu = jtfHuyetApTThu;
        this.jtfHuyetApTTruong = jtfHuyetApTTruong;
        this.jtfNhietDo = jtfNhietDo;
        this.jtfNhipTho = jtfNhipTho;
        this.jtfNhipTim = jtfNhipTim;
        this.jtfTTKhac = jtfTTKhac;
        this.jdcNgayXN = jdcNgayXN;
        
        this.jrbDauNguc_Co = jrbDauNguc_Co;
        this.jrbDauNguc_Khong = jrbDauNguc_Khong;
        this.jrbGoiA_Co = jrbGoiA_Co;
        this.jrbGoiA_Khong = jrbGoiA_Khong;
        this.jrbGoiB_Co = jrbGoiB_Co;
        this.jrbGoiB_Khong = jrbGoiB_Khong;
        this.jrbGoiC_Co = jrbGoiC_Co;
        this.jrbGoiC_Khong = jrbGoiC_Khong;
        this.jrbHoRaDom_Co = jrbHoRaDom_Co;
        this.jrbHoRaDom_Khong = jrbHoRaDom_Khong;
        this.jrbHoRaMau_Co = jrbHoRaMau_Co;
        this.jrbHoRaMau_Khong = jrbHoRaMau_Khong;
        this.jrbHo_Co = jrbHo_Co;
        this.jrbHo_Khong = jrbHo_Khong;
        this.jrbKQ_AT = jrbKQ_AT;
        this.jrbKQ_DT = jrbKQ_DT;
        this.jrbKhoTho_Co = jrbKhoTho_Co;
        this.jrbKhoTho_Khong = jrbKhoTho_Khong;
        this.jrbKhongTT_Co = jrbKhongTT_Co;
        this.jrbKhongTT_Khong = jrbKhongTT_Khong;
        this.jrbKietSuc_Co = jrbKietSuc_Co;
        this.jrbKietSuc_Khong = jrbKietSuc_Khong;
        this.jrbMatKG_Co = jrbMatKG_Co;
        this.jrbMatKG_Khong = jrbMatKG_Khong;
        this.jrbMatVG_Co = jrbMatVG_Co;
        this.jrbMatVG_Khong = jrbMatVG_Khong;
        this.jrbOnLanh_Co = jrbOnLanh_Co;
        this.jrbOnLanh_Khong = jrbOnLanh_Khong;
        this.jrbTieuChay_Co = jrbTieuChay_Co;
        this.jrbTieuChay_Khong = jrbTieuChay_Khong;
        this.jrbXN_Co = jrbXN_Co;
        this.jrbXN_Khong = jrbXN_Khong;
        this.jtfDoBHOxi = jtfDoBHOxi;
        this.jtfHuyetApTD = jtfHuyetApTD;
        this.jtfHuyetApToiThieu = jtfHuyetApToiThieu;
        this.jtfMach = jtfMach;
        this.jtfNhietDo_QTDT = jtfNhietDo_QTDT;
        this.jtfNhipTho_QTDT = jtfNhipTho_QTDT;
    }
    
    public void SetDataTTCB() throws ClassNotFoundException, SQLException, ParseException {
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM BENHNHAN WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.jtfMABN.setText(this.MABN);
                this.jtfHoTen.setText(rs.getString("HoTen"));
                this.jdcNgaySinh.setDate(rs.getDate("NgaySinh"));
                
                if(rs.getString("GioiTinh").equals("Nam")){
                    this.jcbNam.setSelected(true);
                }else{
                    this.jcbNu.setSelected(true);
                }
                
                
                this.jtfCMND_CCCD.setText(rs.getString("CMND_CCCD"));
                this.jtfNoiO.setText(rs.getString("NoiOHienTai"));
                this.jcobTinh_ThanhPho.setSelectedItem(rs.getString("Tinh_ThanhPho"));
                this.jcobQuan_Huyen.setSelectedItem(rs.getString("Quan_Huyen"));
                this.jcobPhuong_Xa.setSelectedItem(rs.getString("Phuong_Xa"));
                
                this.jtfNgheNghiep.setText(rs.getString("NgheNghiep"));
                this.jtfNoiLamViec.setText(rs.getString("NoiLamViec"));
                this.jtfSDT.setText(rs.getString("SoDienThoai"));
                this.jdcNgayTN.setDate(rs.getDate("NgayTiepNhan"));
                this.jdcNgayXHTTDT.setDate(rs.getDate("NgayXuatHienTrieuChungDauTien"));
                
                if(rs.getInt("TungLaF0")==1){
                    this.jcbTunglaF0_Co.setSelected(true);
                    
                }else{
                    this.jcbTunglaF0_Khong.setSelected(true);
                }
                
                this.jtfSoNgayF0.setText(rs.getString("SoNgayLaF0"));
                
                 if(rs.getInt("TestNhanh")==1){
                    this.jcbTestNhanh_Co.setSelected(true);
                     this.jdcNgayTestNhanh.setDate(rs.getDate("NgayTestNhanh"));
                    
                }else{
                    this.jcbTestNhanh_Khong.setSelected(true);
                    String date = "01-01-0001";
                    java.util.Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    this.jdcNgayTestNhanh.setDate(date2);
                }
//                this.jdcNgayTestNhanh.setDate(rs.getDate("NgayTestNhanh"));
               
//                this.jdcNgayTestPCR.setDate(rs.getDate("NgayTestRT_PCR"));
                this.jcobKQTestNhanh.setSelectedItem(rs.getString("KetQuaXetNghiem1"));
                this.jcobKQTestPCR.setSelectedItem(rs.getString("KetQuaXetNghiem2"));
                 if(rs.getInt("TestRT_PCR")==1){
                    this.jcbTestPCR_Co.setSelected(true);
                     this.jdcNgayTestPCR.setDate(rs.getDate("NgayTestRT_PCR"));
                    
                }else{
                    this.jcbTestPCR_Khong.setSelected(true);
                    String date = "01-01-0001";
                    java.util.Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    this.jdcNgayTestPCR.setDate(date2);
                }
             
            }
            ps.close();
            conn.close();
    }
    public void SetDataTiemVX() throws ClassNotFoundException, SQLException, ParseException {
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM TIEMVACCINE WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getString("TinhTrangTiemVaccine").equals("Chưa tiêm")){
                    this.jrbChuaTiem.setSelected(true);
                     String date = "01-01-0001";
                    java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    this.jdcTGMui1.setDate(date1);
                    this.jdcTGMui2.setDate(date1);
                    this.jdcTGMui3.setDate(date1);
                }else if(rs.getString("TinhTrangTiemVaccine").equals("1 Mũi")){
                    this.jrbTiem1Mui.setSelected(true);
                     String date = "01-01-0001";
                    java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    this.jdcTGMui1.setDate(rs.getDate("NgayTiem1"));
                    this.jdcTGMui2.setDate(date1);
                    this.jdcTGMui3.setDate(date1);
                }else if(rs.getString("TinhTrangTiemVaccine").equals("2 Mũi")){
                    this.jrbTiem2Mui.setSelected(true);
                    String date = "01-01-0001";
                    java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                    this.jdcTGMui1.setDate(rs.getDate("NgayTiem1"));
                 this.jdcTGMui2.setDate(rs.getDate("NgayTiem2"));
                    this.jdcTGMui3.setDate(date1);
                }else if(rs.getString("TinhTrangTiemVaccine").equals("3 Mũi")){
                    this.jrbTiem3Mui.setSelected(true);
                    this.jdcTGMui1.setDate(rs.getDate("NgayTiem1"));
                     this.jdcTGMui2.setDate(rs.getDate("NgayTiem2"));
                    this.jdcTGMui3.setDate(rs.getDate("NgayTiem3"));
                }else if(rs.getString("TinhTrangTiemVaccine").equals("Không biết")){
                    this.jrbTiem_KhongBiet.setSelected(true);
                     String date = "01-01-0001";
                    java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                   
                    this.jdcTGMui1.setDate(date1);
                    this.jdcTGMui2.setDate(date1);
                    this.jdcTGMui3.setDate(date1);
                }
                this.jcobTiemVX_1.setSelectedItem(rs.getString("Loai_Vaccine1"));
                this.jcobTiemVX_2.setSelectedItem(rs.getString("Loai_Vaccine2"));
                this.jcobTiemVX_3.setSelectedItem(rs.getString("Loai_Vaccine3"));
                
             
            }
    }
    public void SetDataBenhNen() throws ClassNotFoundException, SQLException {
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM BENHNEN WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 if(rs.getInt("TangHuyetAp")==1){
                    this.jrbTangHA_Co.setSelected(true);
                    
                }else{
                    this.jrbTangHA_Khong.setSelected(true);
                }
                if(rs.getInt("UngThu")==1){
                    this.jrbUngThu_Co.setSelected(true);
                    
                }else{
                    this.jrbUngThu_Khong.setSelected(true);
                }
                   if(rs.getInt("DaiThaoDuong")==1){
                    this.jrbDaiTD_Co.setSelected(true);
                    
                }else{
                    this.jrbDaiTD_Khong.setSelected(true);
                }
                    if(rs.getInt("HIV_AIDS")==1){
                    this.jrbHIV_Co.setSelected(true);
                    
                }else{
                    this.jrbHIV_Khong.setSelected(true);
                }
                if(rs.getInt("BenhLyMachMauNao")==1){
                    this.jrbMachMauNao_Co.setSelected(true);
                    
                }else{
                    this.jrbMachMauNao_Khong.setSelected(true);
                }
                 if(rs.getInt("BenhTimMach")==1){
                    this.jrbBenhTim_Co.setSelected(true);
                    
                }else{
                    this.jrbBenhTim_Khong.setSelected(true);
                }
                  if(rs.getInt("BenhGan")==1){
                    this.jrbBenhGan_Co.setSelected(true);
                    
                }else{
                    this.jrbBenhGan_Khong.setSelected(true);
                }
                if(rs.getInt("BenhThanManTinh")==1){
                    this.jrbBenhThanMT_Co.setSelected(true);
                    
                }else{
                    this.jrbBenhThanMT_Khong.setSelected(true);
                }
                if(rs.getInt("HoiChungDown")==1){
                    this.jrbHoiChungDown_Co.setSelected(true);
                    
                }else{
                    this.jrbHoiChungDown_Khong.setSelected(true);
                }
                 if(rs.getInt("HenKhiQuan")==1){
                    this.jrbHenKQ_Co.setSelected(true);
                    
                }else{
                    this.jrbHenKQ_Khong.setSelected(true);
                }
                 if(rs.getInt("RoiLoanSuDungChatGayNghien")==1){
                    this.jrbRoiLoanSDCGN_Co.setSelected(true);
                    
                }else{
                    this.jrbRoiLoanSDCGN_Khong.setSelected(true);
                }
                  if(rs.getInt("BeoPhi")==1){
                    this.jrbBeoPhi_Co.setSelected(true);
                    
                }else{
                    this.jrbBeoPhi_Khong.setSelected(true);
                }
                  if(rs.getInt("GhepTangHoacCayGhepTeBaoGocTaoMau")==1){
                    this.jrbGhepTang_TBM_Co.setSelected(true);
                    
                }else{
                    this.jrbGhepTang_TBM_Khong.setSelected(true);
                }
                 if(rs.getInt("ThieuHutMienDich")==1){
                    this.jrbThieuMD_Co.setSelected(true);
                    
                }else{
                    this.jrbThieuMD_Khong.setSelected(true);
                }
                 if(rs.getInt("CacLoaiBenhHeThong")==1){
                    this.jrbCLBenhHT_Co.setSelected(true);
                    
                }else{
                    this.jrbCLBenhHT_Khong.setSelected(true);
                }
                  if(rs.getInt("BenhPhoiManTinh")==1){
                    this.jrbBenhPhoiMT_Co.setSelected(true);
                    
                }else{
                    this.jrbBenhPhoiMT_Khong.setSelected(true);
                }
                 if(rs.getInt("BenhHeThanKinhManTinh")==1){
                    this.jrbBenhTKMT_Co.setSelected(true);
                    
                }else{
                    this.jrbBenhTKMT_Khong.setSelected(true);
                }
                 

            
            }
            
            
    }
    public void SetDataMangThai() throws ClassNotFoundException, SQLException {
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM MANGTHAI WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getInt("MangThai")==1){
                    this.jrbMangThai_Co.setSelected(true);
                    
                }else{
                    this.jrbMangThai_Khong.setSelected(true);
                }
                 this.jtfSoTuanMT.setText(rs.getString("SoTuanMangThai"));
                 
                 if(rs.getInt("HauSan")==1){
                    this.jrbHauSan_Co.setSelected(true);
                    
                }else{
                    this.jrbHauSan_Khong.setSelected(true);
                }
                 
                 if(rs.getInt("TreSoSinhDuocXetNghiemCovid_19")==1){
                    this.jrbTreSSXNcovid_Co.setSelected(true);
                    if(rs.getString("KetQuaXetNghiemCovid_19").equals("Dương tính")){
                            this.jrbKQXN_DT.setSelected(true);
               
                    }else if(rs.getString("KetQuaXetNghiemCovid_19").equals("Âm tính")){
                        this.jrbKQXN_AT.setSelected(true);
                    }else if(rs.getString("KetQuaXetNghiemCovid_19").equals("Chưa có kết quả")){
                         this.jrbKQXN_ChuaCoKQ.setSelected(true);
                    }
                    
                }else{
                    this.jrbTreSSXNcovid_Khong.setSelected(true);
                      this.jrbKQXN_DT.setSelected(false);
                      this.jrbKQXN_AT.setSelected(false);
                      this.jrbKQXN_ChuaCoKQ.setSelected(false);
                }
                  
            }
    }
     public void SetDataThuocDaDungTruocTT() throws ClassNotFoundException, SQLException {
       Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM THUOCDUNGTRUOCKHITIEPNHAN WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getInt("Steroid")==1){
                    this.jrbSteroid_Co.setSelected(true);
                    
                }else{
                    this.jrbSteroid_Khong.setSelected(true);
                }
                 if(rs.getInt("CacLoaiThuocMienDichKhac")==1){
                    this.jrbThuocMD_Co.setSelected(true);
                    
                }else{
                    this.jrbThuocMD_Khong.setSelected(true);
                }
                 if(rs.getInt("KhangSinh")==1){
                    this.jrbKhangSinh_Co.setSelected(true);
                    
                }else{
                    this.jrbKhangSinh_Khong.setSelected(true);
                }
                 if(rs.getInt("KhangVirus")==1){
                    this.jrbKhangVirus_Co.setSelected(true);
                    
                }else{
                    this.jrbKhangVirus_Khong.setSelected(true);
                }
                 if(rs.getInt("CacLoaiThuocDieuTriCovidKhac")==1){
                    this.jrbThuocDTCovid_Co.setSelected(true);
                    
                }else{
                    this.jrbThuocDTCovid_Khong.setSelected(true);
                }
                 if(rs.getInt("CacThuocUcCheMienDichKhac")==1){
                    this.jrbThuocUCMD_Co.setSelected(true);
                    
                }else{
                    this.jrbThuocUCMD_Khong.setSelected(true);
                }
            }
    }
      public void SetDataTongTrang() throws ClassNotFoundException, SQLException {
       Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM TONGTRANG WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               this.jtfNhietDo.setText(Integer.toString(rs.getInt("NhietDo")));
               this.jtfNhipTim.setText(Integer.toString(rs.getInt("NhipTim")));
               this.jtfHuyetApTThu.setText(Integer.toString(rs.getInt("HuyetApTamThu")));
               this.jtfHuyetApTTruong.setText(Integer.toString(rs.getInt("HuyetApTamTruong")));
               this.jtfDoBH_Oxi.setText(Integer.toString(rs.getInt("DoBaoHoaOxyTrongMau")));
               this.jtfChieuCao.setText(Integer.toString(rs.getInt("ChieuCao")));
               this.jtfCanNang.setText(Integer.toString(rs.getInt("CanNang")));
               this.jtfNhipTho.setText(Integer.toString(rs.getInt("NhipTho")));
            }
    }
      public void SetDataTTLucTiepNhan() throws ClassNotFoundException, SQLException {
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM TRIEUCHUNGTAITHOIDIEMTIEPNHAN WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 if(rs.getInt("Sot")==1){
                    this.jrbSot_Co.setSelected(true);
                    
                }else{
                    this.jrbSot_Khong.setSelected(true);
                }
                 if(rs.getInt("DauHong")==1){
                    this.jrbDauHong_Co.setSelected(true);
                    
                }else{
                    this.jrbDauHong_Khong.setSelected(true);
                }
                 if(rs.getInt("NoiHachNgoaiVi")==1){
                    this.jrbNoiHach_Co.setSelected(true);
                    
                }else{
                    this.jrbNoiHach_Khong.setSelected(true);
                }
                if(rs.getInt("DauDau")==1){
                    this.jrbDauDau_Co.setSelected(true);
                    
                }else{
                    this.jrbDauDau_Khong.setSelected(true);
                }
                if(rs.getInt("MatKhuuGiac")==1){
                    this.jrbMatKhuuGiac_Co.setSelected(true);
                    
                }else{
                    this.jrbMatKhuuGiac_Khong.setSelected(true);
                }
                  if(rs.getInt("CoGiat")==1){
                    this.jrbCoGiat_Co.setSelected(true);
                    
                }else{
                    this.jrbCoGiat_Khong.setSelected(true);
                }
                 if(rs.getInt("DauCo")==1){
                    this.jrbDauCo_Co.setSelected(true);
                    
                }else{
                    this.jrbDauCo_Khong.setSelected(true);
                }
                 if(rs.getInt("DauKhop")==1){
                    this.jrbDauKhop_Co.setSelected(true);
                    
                }else{
                    this.jrbDauKhop_Khong.setSelected(true);
                }
                 if(rs.getInt("DauBung")==1){
                    this.jrbDauBung_Co.setSelected(true);
                    
                }else{
                    this.jrbDauBung_Khong.setSelected(true);
                }
                  if(rs.getInt("MatViGiac")==1){
                    this.jrbMatViGiac_Co.setSelected(true);
                    
                }else{
                    this.jrbMatViGiac_Khong.setSelected(true);
                }
                 if(rs.getInt("BuonNon")==1){
                    this.jrbBuonNon_Co.setSelected(true);
                    
                }else{
                    this.jrbBuonNon_Khong.setSelected(true);
                }
                 if(rs.getInt("XuatHuyet")==1){
                    this.jrbXuatHuyet_Co.setSelected(true);
                    
                }else{
                    this.jrbXuatHuyet_Khong.setSelected(true);
                }
                this.jtfTTKhac.setText(rs.getString("TrieuChungKhac"));
                 
            
            }
    }
        public void SetDataDanhGiaSoLuoc() throws ClassNotFoundException, SQLException {
       Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM DANHGIASOLUOC WHERE MaBenhNhan LIKE ? ";
        ps=conn.prepareStatement(sql);
        
         ps.setString(1, this.MABN);
 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.jtfChuanDoanTT.setText(rs.getString("ChuanDoanLucTiepNhan"));
                this.jcobDGTTBL.setSelectedItem(rs.getString("DanhGiaTinhTrangBenhLyCOVID_19"));
                 if(rs.getInt("DanhGiaDuDieuKienCachLyTaiNha")==1){
                    this.jrbDKCL_Co.setSelected(true);
                    
                }else{
                    this.jrbDKCL_Khong.setSelected(true);
                }
            }
    }
       public void SetDataQTDT() throws ClassNotFoundException, SQLException {
//         Connection conn = null;
//    
//        conn = OracleConnection.getOracleConnection();
//        PreparedStatement ps=null;
//        String sql ="SELECT * FROM QUATRINHDIEUTRITAINHA WHERE MaBenhNhan LIKE ? ";
//        ps=conn.prepareStatement(sql);
//        
//         ps.setString(1, this.MABN);
// 
//            ResultSet rs = ps.executeQuery();
//            int rc= ps.executeUpdate();
//            if (rc!=0){
//                 while(rs.next()){
//                      this.jtfMach.setText(Integer.toString(rs.getInt("Mach")));
//                      this.jtfNhietDo_QTDT.setText(Integer.toString(rs.getInt("NhietDo")));
//                      this.jtfNhipTho_QTDT.setText(Integer.toString(rs.getInt("NhipTho")));
//                      this.jtfDoBHOxi.setText(Integer.toString(rs.getInt("SpO2")));
//                      this.jtfHuyetApTD.setText(Integer.toString(rs.getInt("HuyetApToiDa")));
//                      this.jtfHuyetApToiThieu.setText(Integer.toString(rs.getInt("HuyetApToiThieu")));
//                      
//                      
//                      if(rs.getInt("KietSuc")==1){
//                           this.jrbKietSuc_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbKietSuc_Khong.setSelected(true);
//                            }
//                       if(rs.getInt("Ho")==1){
//                           this.jrbHo_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbHo_Khong.setSelected(true);
//                            }
//                     if(rs.getInt("HoRaDom")==1){
//                           this.jrbHoRaDom_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbHoRaDom_Khong.setSelected(true);
//                            }
//                     if(rs.getInt("OnLanh")==1){
//                           this.jrbOnLanh_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbOnLanh_Khong.setSelected(true);
//                            }
//                       if(rs.getInt("MatViGiac")==1){
//                           this.jrbMatVG_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbMatVG_Khong.setSelected(true);
//                            }
//                        if(rs.getInt("MatKhuuGiac")==1){
//                           this.jrbMatKG_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbMatKG_Khong.setSelected(true);
//                            }
//                      if(rs.getInt("TieuChay")==1){
//                           this.jrbTieuChay_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbTieuChay_Khong.setSelected(true);
//                            }
//                      
//                      if(rs.getInt("HoRaMau")==1){
//                           this.jrbHoRaMau_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbHoRaMau_Khong.setSelected(true);
//                            }
//                      if(rs.getInt("ThoDocHoacKhoTho")==1){
//                           this.jrbKhoTho_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbKhoTho_Khong.setSelected(true);
//                            }
//                      if(rs.getInt("DauTucNgucKeoDai")==1){
//                           this.jrbDauNguc_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbDauNguc_Khong.setSelected(true);
//                            }
//                      if(rs.getInt("LoMoKhongTinhTao")==1){
//                           this.jrbKhongTT_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbKhongTT_Khong.setSelected(true);
//                            }
//                      
//                       if(rs.getInt("GoiThuocA")==1){
//                           this.jrbGoiA_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbGoiA_Khong.setSelected(true);
//                            }
//                        if(rs.getInt("GoiThuocB")==1){
//                           this.jrbGoiB_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbGoiB_Khong.setSelected(true);
//                            }
//                         if(rs.getInt("GoiThuocC")==1){
//                           this.jrbGoiC_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbGoiC_Khong.setSelected(true);
//                            }
//                         
//                      if(rs.getInt("XetNghiem")==1){
//                           this.jrbXN_Co.setSelected(true);
//                    
//                     }else{
//                            this.jrbXN_Khong.setSelected(true);
//                            }
//                      this.jdcNgayXN.setDate(rs.getDate("NgayXetNghiem"));
//                      
//                        if(rs.getString("KetQuaXetNghiem1").equals("Dương tính")){
//                           this.jrbKQ_DT.setSelected(true);
//                    
//                     }else{
//                            this.jrbKQ_AT.setSelected(true);
//                            }
//
//                 
//                 }
//            }else if(rc==0){
                       this.jtfMach.setText("");
                      this.jtfNhietDo_QTDT.setText("");
                      this.jtfNhipTho_QTDT.setText("");
                      this.jtfDoBHOxi.setText("");
                      this.jtfHuyetApTD.setText("");
                      this.jtfHuyetApToiThieu.setText("");
                      this.jrbKietSuc_Co.setSelected(true);
                        this.jrbHo_Co.setSelected(true);
                         this.jrbHoRaDom_Co.setSelected(true);
                        this.jrbOnLanh_Co.setSelected(true);
                         this.jrbMatVG_Co.setSelected(true);
                         this.jrbMatKG_Co.setSelected(true);
                          this.jrbTieuChay_Co.setSelected(true);
                         this.jrbHoRaMau_Co.setSelected(true);
                        this.jrbKhoTho_Co.setSelected(true);
                         this.jrbDauNguc_Co.setSelected(true);
                        this.jrbKhongTT_Co.setSelected(true);
                         this.jrbGoiA_Co.setSelected(true);
                          this.jrbGoiB_Co.setSelected(true);
                          this.jrbGoiC_Co.setSelected(true);
                         this.jrbXN_Khong.setSelected(true);

//            }
                 
            
    }
      public void SetThongTin() throws ClassNotFoundException, SQLException, ParseException {
                SetDataTTCB();
                SetDataTiemVX();
                SetDataBenhNen();
                SetDataMangThai();
                SetDataThuocDaDungTruocTT();
                SetDataTongTrang();
                SetDataTTLucTiepNhan();
                SetDataDanhGiaSoLuoc();
                SetDataQTDT();
      }
      public int GetInt(JRadioButton btn_co ,JRadioButton btn_khong){
        if(btn_co.isSelected())
            return 1;
        else if(btn_khong.isSelected())
            return 0;
        return -1;
    }
     public int GetInt_jcb(JCheckBox cb_co ,JCheckBox cb_khong){
        if(cb_co.isSelected())
            return 1;
        else if(cb_khong.isSelected())
            return 0;
        return -1;
    }
     public String GetGioiTinh(JCheckBox jcbNam ,JCheckBox jcbNu){
        if(jcbNam.isSelected())
            return jcbNam.getText();
        else if(jcbNu.isSelected())
            return jcbNu.getText();
        return null;
    }
    public void UpdateDataTo_BenhNhan() throws ClassNotFoundException, SQLException{
        

        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call UPDATE_BENHNHAN(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setString(2, jtfHoTen.getText());
        java.util.Date utilStartDate =jdcNgaySinh.getDate();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(3, sqlStartDate);
        cStmt.setString(4, GetGioiTinh(jcbNam,jcbNu));
        cStmt.setString(5, jtfCMND_CCCD.getText());
        cStmt.setString(6, jtfNoiO.getText());
        cStmt.setString(7, jcobTinh_ThanhPho.getSelectedItem().toString());
        cStmt.setString(8, jcobQuan_Huyen.getSelectedItem().toString());
        cStmt.setString(9, jcobPhuong_Xa.getSelectedItem().toString());
        cStmt.setString(10,jtfNgheNghiep.getText() );
        cStmt.setString(11,jtfNoiLamViec.getText());
        cStmt.setString(12, jtfSDT.getText());
        java.util.Date utilStartDate2 =jdcNgayTN.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(13, sqlStartDate2);
        java.util.Date utilStartDate3 =jdcNgayXHTTDT.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(14, sqlStartDate3);
        cStmt.setInt(15, GetInt_jcb(jcbTunglaF0_Co, jcbTunglaF0_Khong));
//        cStmt.setString(16, jtfSoThangF0.getText());
        if(jcbTunglaF0_Khong.isSelected()){
            cStmt.setString(16,null);
        }else{
            cStmt.setString(16, jtfSoNgayF0.getText());
        }
        cStmt.setInt(17, GetInt_jcb(jcbTestNhanh_Co, jcbTestNhanh_Khong));
        
        java.util.Date utilStartDate4 =jdcNgayTestNhanh.getDate();
        java.sql.Date sqlStartDate4 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(18, sqlStartDate4);
//        cStmt.setString(19, jcobKQTestNhanh.getSelectedItem().toString());
        if(jcbTestNhanh_Khong.isSelected()){
            cStmt.setNull(18, java.sql.Types.DATE);
            cStmt.setString(19,null);
        }else {
            cStmt.setString(19, jcobKQTestNhanh.getSelectedItem().toString());
        }
        
        cStmt.setInt(20, GetInt_jcb(jcbTestPCR_Co, jcbTestPCR_Khong));
         java.util.Date utilStartDate5 =jdcNgayTestPCR.getDate();
        java.sql.Date sqlStartDate5 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(21, sqlStartDate5);
//        cStmt.setString(22, jcobKQTestPCR.getSelectedItem().toString());
         if(jcbTestPCR_Khong.isSelected()){
                cStmt.setNull(21, java.sql.Types.DATE);
            cStmt.setString(22,null);
        }else{
              cStmt.setString(22, jcobKQTestPCR.getSelectedItem().toString());

         } 
             
         cStmt.execute();
            cStmt.close();
            conn.close();
    }
    public String Get_TTTiem(JRadioButton jrbChuaTiem, JRadioButton jrbTiem1,
            JRadioButton jrbCTiem2,JRadioButton jrbTiem3,JRadioButton jrbKhongBiet){
        if(jrbChuaTiem.isSelected())
            return jrbChuaTiem.getText();
        if(jrbTiem1.isSelected())
            return jrbTiem1.getText();
        if(jrbCTiem2.isSelected())
            return jrbCTiem2.getText();
        if(jrbTiem3.isSelected())
            return jrbTiem3.getText();
        if(jrbKhongBiet.isSelected())
            return jrbKhongBiet.getText();
        return null;
    }
    public void UpdateDataTo_TiemVX() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call UPDATE_TIEMVACCINE(?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setString(2,Get_TTTiem(jrbChuaTiem,jrbTiem1Mui,jrbTiem2Mui,jrbTiem3Mui,jrbTiem_KhongBiet));
//        cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
        java.util.Date utilStartDate =jdcTGMui1.getDate();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        java.util.Date utilStartDate2 =jdcTGMui2.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime());
        
        java.util.Date utilStartDate3 =jdcTGMui3.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate3.getTime());
        cStmt.setDate(4,sqlStartDate);
        
//        cStmt.setString(5,jcobLoaiVX2.getSelectedItem().toString());
        
        cStmt.setDate(6,sqlStartDate2);
        
//        cStmt.setString(7,jcobLoaiVX3.getSelectedItem().toString());
        
        cStmt.setDate(8,sqlStartDate3);
        
        if(jrbChuaTiem.isSelected()){
            cStmt.setString(3,null);
            cStmt.setString(5,null);
            cStmt.setString(7,null);
                        cStmt.setNull(4, java.sql.Types.DATE);
            cStmt.setNull(6, java.sql.Types.DATE);
            cStmt.setNull(8, java.sql.Types.DATE);
        }
//        }else{
////            cStmt.setString(3,jcobTiemVX_1.getSelectedItem().toString());
////            cStmt.setString(5,jcobTiemVX_2.getSelectedItem().toString());
////            cStmt.setString(7,jcobTiemVX_3.getSelectedItem().toString());
//        }
        if(jrbTiem1Mui.isSelected()){
            cStmt.setString(3,jcobTiemVX_1.getSelectedItem().toString());
            cStmt.setString(5,null);
            cStmt.setString(7,null);
            cStmt.setNull(6, java.sql.Types.DATE);
            cStmt.setNull(8, java.sql.Types.DATE);

        }
//        else{
//             cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
//        }
        if(jrbTiem2Mui.isSelected()){
             cStmt.setString(3,jcobTiemVX_1.getSelectedItem().toString());

            cStmt.setString(5,jcobTiemVX_2.getSelectedItem().toString());
            cStmt.setString(7,null);
                        cStmt.setNull(8, java.sql.Types.DATE);

        }
//        else{
//            cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
//            cStmt.setString(5,jcobLoaiVX2.getSelectedItem().toString());
//        }
        if(jrbTiem3Mui.isSelected()){
             cStmt.setString(3,jcobTiemVX_1.getSelectedItem().toString());
             
            cStmt.setString(5,jcobTiemVX_2.getSelectedItem().toString());
          cStmt.setString(7,jcobTiemVX_3.getSelectedItem().toString());
                        
        }

        if(jrbTiem_KhongBiet.isSelected()){
            cStmt.setString(3,null);
            cStmt.setString(5,null);
            cStmt.setString(7,null);
             cStmt.setNull(4, java.sql.Types.DATE);
            cStmt.setNull(6, java.sql.Types.DATE);
            cStmt.setNull(8, java.sql.Types.DATE);
        }
      
        
        cStmt.execute();
        cStmt.close();
        conn.close();
        
        
        
    }
    public void UpdateDataTo_BenhNen() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call UPDATE_BENHNEN(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, GetInt(jrbTangHA_Co, jrbTangHA_Khong));
        cStmt.setInt(3, GetInt(jrbUngThu_Co, jrbUngThu_Khong));
        cStmt.setInt(4, GetInt(jrbDaiTD_Co, jrbDaiTD_Khong));
        cStmt.setInt(5, GetInt(jrbHIV_Co, jrbHIV_Khong));
        cStmt.setInt(6, GetInt(jrbMachMauNao_Co, jrbMachMauNao_Khong));
        cStmt.setInt(7, GetInt(jrbBenhTim_Co, jrbBenhTim_Khong));
        cStmt.setInt(8, GetInt(jrbBenhGan_Co, jrbBenhGan_Khong));
        cStmt.setInt(9, GetInt(jrbBenhThanMT_Co, jrbBenhThanMT_Khong));
        cStmt.setInt(10, GetInt(jrbHoiChungDown_Co, jrbHoiChungDown_Khong));
        cStmt.setInt(11, GetInt(jrbHenKQ_Co, jrbHenKQ_Khong));
        cStmt.setInt(12, GetInt(jrbRoiLoanSDCGN_Co, jrbRoiLoanSDCGN_Khong));
        cStmt.setInt(13, GetInt(jrbBeoPhi_Co, jrbBeoPhi_Khong));
        cStmt.setInt(14, GetInt(jrbGhepTang_TBM_Co, jrbGhepTang_TBM_Khong));
        cStmt.setInt(15, GetInt(jrbThieuMD_Co, jrbThieuMD_Khong));
        cStmt.setInt(16, GetInt(jrbCLBenhHT_Co, jrbCLBenhHT_Khong));
        cStmt.setInt(17, GetInt(jrbBenhPhoiMT_Co, jrbBenhPhoiMT_Khong));
        cStmt.setInt(18, GetInt(jrbBenhTKMT_Co, jrbBenhTKMT_Khong));
       
        
        
        cStmt.execute();
        cStmt.close();
        conn.close();
    }
    public String Get_KQXNTreSS(JRadioButton jrbDuongTinh, JRadioButton jrbAmTinh,
            JRadioButton jrbChuaCoKQ){
        if(jrbDuongTinh.isSelected())
            return jrbDuongTinh.getText();
        if(jrbAmTinh.isSelected())
            return jrbAmTinh.getText();
        if(jrbChuaCoKQ.isSelected())
            return jrbChuaCoKQ.getText();
       
        return null;
    }
    public void UpdateDataTo_MangThai() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call UPDATE_MANGTHAI(?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, GetInt(jrbMangThai_Co, jrbMangThai_Khong));
//        cStmt.setString(3,jtfSoTuanMT.getText());
        cStmt.setInt(4, GetInt(jrbHauSan_Co, jrbHauSan_Khong));
//        cStmt.setInt(5, GetInt(jrbTreSSXNcovid_Co, jrbTreSSXNcovid_Khong));
//        cStmt.setString(6, Get_KQXNTreSS(jrbKQXN_DT, jrbKQXN_AT,jrbKQXN_ChuaCoKQ));
        
        if(jrbMangThai_Khong.isSelected()){
            cStmt.setString(3,null);
        }else{
            cStmt.setString(3,jtfSoTuanMT.getText());
        }
        
        if(jrbHauSan_Khong.isSelected()){
            cStmt.setInt(5,-1);
            cStmt.setString(6,null);
        }else{
            cStmt.setInt(5, GetInt(jrbTreSSXNcovid_Co, jrbTreSSXNcovid_Khong));
        cStmt.setString(6, Get_KQXNTreSS(jrbKQXN_DT, jrbKQXN_AT,jrbKQXN_ChuaCoKQ));
        }
        if(jrbTreSSXNcovid_Khong.isSelected()&&jrbHauSan_Co.isSelected()){
            cStmt.setString(6,null);
        }
        
        cStmt.execute();
        cStmt.close();
        conn.close();
    }
    public void UpdateDataTo_ThuocDaDungTruocTT() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call UPDATE_THUOCDUNGTRUOCKHITIEPNHAN(?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, GetInt(jrbSteroid_Co, jrbSteroid_Khong));
        cStmt.setInt(3, GetInt(jrbThuocUCMD_Co, jrbThuocUCMD_Khong));
        cStmt.setInt(4, GetInt(jrbKhangSinh_Co, jrbKhangSinh_Khong));
        cStmt.setInt(5, GetInt(jrbKhangVirus_Co, jrbKhangVirus_Khong));
        cStmt.setInt(6, GetInt(jrbThuocDTCovid_Co, jrbThuocDTCovid_Khong));
        cStmt.setInt(7, GetInt(jrbThuocMD_Co, jrbThuocMD_Khong));
     
        cStmt.execute();
        cStmt.close();
        conn.close();
    }
     public void UpdateDataTo_TongTrang() throws ClassNotFoundException, SQLException{
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call UPDATE_TONGTRANG(?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, Integer.parseInt(jtfNhietDo.getText()));
        cStmt.setInt(3, Integer.parseInt(jtfNhipTim.getText()));
        cStmt.setInt(4, Integer.parseInt(jtfHuyetApTThu.getText()));
        cStmt.setInt(5, Integer.parseInt(jtfHuyetApTTruong.getText()));
        cStmt.setInt(6, Integer.parseInt(jtfDoBH_Oxi.getText()));
        cStmt.setInt(7, Integer.parseInt(jtfChieuCao.getText()));
        cStmt.setInt(8, Integer.parseInt(jtfCanNang.getText()));
        cStmt.setInt(9, Integer.parseInt(jtfNhipTho.getText()));
     
        
        
        
        cStmt.execute();
        cStmt.close();
        conn.close();
     }
     public void UpdateDataTo_TTLucTiepNhan() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call UPDATE_TRIEUCHUNGTAITHOIDIEMTIEPNHAN(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, GetInt(jrbSot_Co, jrbSot_Khong));
        cStmt.setInt(3, GetInt(jrbDauHong_Co, jrbDauBung_Khong));
        cStmt.setInt(4, GetInt(jrbNoiHach_Co, jrbNoiHach_Khong));
        cStmt.setInt(5, GetInt(jrbDauDau_Co, jrbDauDau_Khong));
        cStmt.setInt(6, GetInt(jrbMatKhuuGiac_Co, jrbMatKhuuGiac_Khong));
        cStmt.setInt(7, GetInt(jrbCoGiat_Co, jrbCoGiat_Khong));
        cStmt.setInt(8, GetInt(jrbDauCo_Co, jrbDauCo_Khong));
        cStmt.setInt(9, GetInt(jrbDauKhop_Co, jrbDauKhop_Khong));
        cStmt.setInt(10, GetInt(jrbDauBung_Co, jrbDauBung_Khong));
        cStmt.setInt(11, GetInt(jrbMatViGiac_Co, jrbMatViGiac_Khong));
        cStmt.setInt(12, GetInt(jrbBuonNon_Co, jrbBuonNon_Khong));
        cStmt.setInt(13, GetInt(jrbXuatHuyet_Co, jrbXuatHuyet_Khong));
        cStmt.setString(14,jtfTTKhac.getText());
        
     
        cStmt.execute();
        cStmt.close();
        conn.close();
    }
     public void UpdateDataTo_DanhGiaSoLuoc() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call UPDATE_DANHGIASOLUOC(?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setString(2, jtfChuanDoanTT.getText());
        cStmt.setString(3, jcobDGTTBL.getSelectedItem().toString());
        cStmt.setInt(4, GetInt(jrbDKCL_Co, jrbDKCL_Khong));
       
        
         cStmt.execute();
        cStmt.close();
        conn.close();
    }
     public String getKQ_QTDT(JRadioButton btDT, JRadioButton btAT){
         if(btDT.isSelected())
             return btDT.getText();
         if(btAT.isSelected())
             return btAT.getText();
         return null;
     }
      public void UpdateDataTo_QTDT() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call UPDATE_QUATRINHDIEUTRITAINHA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
           long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        cStmt.setTimestamp(1,timestamp );
        cStmt.setInt(2, Integer.parseInt(jtfMach.getText()));
        cStmt.setInt(3, Integer.parseInt(jtfNhietDo_QTDT.getText()));
        cStmt.setInt(4, Integer.parseInt(jtfNhipTho_QTDT.getText()));
        cStmt.setInt(5, Integer.parseInt(jtfDoBHOxi.getText()));
        cStmt.setInt(6, Integer.parseInt(jtfHuyetApTD.getText()));
        cStmt.setInt(7, Integer.parseInt(jtfHuyetApToiThieu.getText()));
        cStmt.setInt(8, GetInt(jrbKietSuc_Co, jrbKietSuc_Khong));
        cStmt.setInt(9, GetInt(jrbHo_Co, jrbHo_Khong));
        cStmt.setInt(10, GetInt(jrbHoRaDom_Co, jrbHoRaDom_Khong));
        cStmt.setInt(11, GetInt(jrbOnLanh_Co, jrbOnLanh_Khong));
        cStmt.setInt(12, GetInt(jrbMatVG_Co, jrbMatVG_Khong));
        cStmt.setInt(13, GetInt(jrbMatKG_Co, jrbMatKG_Khong));
        cStmt.setInt(14, GetInt(jrbTieuChay_Co, jrbTieuChay_Khong));
        cStmt.setInt(15, GetInt(jrbHoRaMau_Co, jrbHoRaMau_Khong));
        cStmt.setInt(16, GetInt(jrbKhoTho_Co, jrbKhoTho_Khong));
        cStmt.setInt(17, GetInt(jrbDauNguc_Co, jrbDauNguc_Khong));
        cStmt.setInt(18, GetInt(jrbKhongTT_Co, jrbKhongTT_Khong));
        cStmt.setInt(19, GetInt(jrbGoiA_Co, jrbGoiA_Khong));
        cStmt.setInt(20, GetInt(jrbGoiB_Co, jrbGoiB_Khong));
        cStmt.setInt(21, GetInt(jrbGoiC_Co, jrbGoiC_Khong));
        cStmt.setInt(22, GetInt(jrbXN_Co, jrbXN_Khong));
        
        
     
        
        
        
        
        if(jrbXN_Co.isSelected()){
            java.util.Date utilStartDate3 =jdcNgayXN.getDate();
             java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate3.getTime());
                cStmt.setDate(23,sqlStartDate3);
            cStmt.setString(24, getKQ_QTDT(jrbKQ_DT, jrbKQ_AT));
        }else{
            cStmt.setNull(23, java.sql.Types.DATE);
             cStmt.setString(24, null);
             
        } 
    
        
         cStmt.execute();
        cStmt.close();
        conn.close();
    }
//     JDateChooser jdcNgayXN,
//            JDateChooser jdcTGCapNhat, 
//            JRadioButton jrbDauNguc_Co, 
//            JRadioButton jrbDauNguc_Khong,
//            JRadioButton jrbGoiA_Co, 
//            JRadioButton jrbGoiA_Khong,
//            JRadioButton jrbGoiB_Co,
//            JRadioButton jrbGoiB_Khong,
//            JRadioButton jrbGoiC_Co, 
//            JRadioButton jrbGoiC_Khong, 
//            JRadioButton jrbHoRaDom_Co, 
//            JRadioButton jrbHoRaDom_Khong,
//            JRadioButton jrbHoRaMau_Co, 
//            JRadioButton jrbHoRaMau_Khong,
//            JRadioButton jrbHo_Co, 
//            JRadioButton jrbHo_Khong, 
//            JRadioButton jrbKQ_AT,
//            JRadioButton jrbKQ_DT, 
//            JRadioButton jrbKhoTho_Co, 
//            JRadioButton jrbKhoTho_Khong, 
//            JRadioButton jrbKhongTT_Co, 
//            JRadioButton jrbKhongTT_Khong, 
//            JRadioButton jrbKietSuc_Co, 
//            JRadioButton jrbKietSuc_Khong, 
//            JRadioButton jrbMatKG_Co, 
//            JRadioButton jrbMatKG_Khong,
//            JRadioButton jrbMatVG_Co, 
//            JRadioButton jrbMatVG_Khong, 
//            JRadioButton jrbOnLanh_Co, 
//            JRadioButton jrbOnLanh_Khong,
//            JRadioButton jrbTieuChay_Co, 
//            JRadioButton jrbTieuChay_Khong,
//            JRadioButton jrbXN_Co, 
//            JRadioButton jrbXN_Khong, 
//            JTextField jtfDoBHOxi, 
//            JTextField jtfHuyetApTD, 
//            JTextField jtfHuyetApToiThieu,
//            JTextField jtfMach, 
//            JTextField jtfNhietDo_QTDT,
//            JTextField jtfNhipTho_QTDT)
     public void UpdateTT() throws ClassNotFoundException, SQLException {
              UpdateDataTo_BenhNhan();
                UpdateDataTo_TiemVX();
                UpdateDataTo_BenhNen();
                UpdateDataTo_MangThai();
                UpdateDataTo_ThuocDaDungTruocTT();
                UpdateDataTo_TongTrang();
                UpdateDataTo_TTLucTiepNhan();
                UpdateDataTo_DanhGiaSoLuoc();
                UpdateDataTo_QTDT();
     }
}
