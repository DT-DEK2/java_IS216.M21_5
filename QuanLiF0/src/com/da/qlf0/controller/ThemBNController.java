/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;
import java.sql.Connection;
import com.da.qlf0.dao.OracleConnection;

import com.toedter.calendar.JDateChooser;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.Date;
import javax.swing.JFormattedTextField;
/**
 *
 * @author Minh Cuong
 */
public class ThemBNController {
    
    //Thong tin co ban
    private String MABN;
    private javax.swing.JCheckBox jcbNam;
    private javax.swing.JCheckBox jcbNu;
    private javax.swing.JCheckBox jcbTestNhanh_Co;
    private javax.swing.JCheckBox jcbTestNhanh_Khong;
    private javax.swing.JCheckBox jcbTestPCR_Co;
    private javax.swing.JCheckBox jcbTestPCR_Khong;
    private javax.swing.JCheckBox jcbTungLaF0_Co;
    private javax.swing.JCheckBox jcbTungLaF0_Khong;
    private javax.swing.JComboBox<String> jcobPhuong_Xa;
    private javax.swing.JComboBox<String> jcobQuan_Huyen;
    private javax.swing.JComboBox<String> jcobTinh_ThanhPho;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private com.toedter.calendar.JDateChooser jdcNgayTestNhanh;
    private com.toedter.calendar.JDateChooser jdcNgayTestPCR;
    private com.toedter.calendar.JDateChooser jdcNgayTnF0;
    private com.toedter.calendar.JDateChooser jdcNgayXHTTDT;
    private javax.swing.JTextField jtfCMND_CCCD;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMABN;
    private javax.swing.JTextField jtfNgheNghiep;
    private javax.swing.JTextField jtfNoiLamViec;
    private javax.swing.JTextField jtfNoiO;
    private javax.swing.JTextField jtfSDT;
    private javax.swing.JTextField jtfSoThangF0;

//Tiem VacXin
    private javax.swing.JComboBox<String> jcobLoaiVX1;
    private javax.swing.JComboBox<String> jcobLoaiVX2;
    private javax.swing.JComboBox<String> jcobLoaiVX3;
    private com.toedter.calendar.JDateChooser jdcTGTiem1;
    private com.toedter.calendar.JDateChooser jdcTGTiem2;
    private com.toedter.calendar.JDateChooser jdcTGTiem3;
    private javax.swing.JRadioButton jrbTiemVX_1m;
    private javax.swing.JRadioButton jrbTiemVX_2m;
    private javax.swing.JRadioButton jrbTiemVX_3m;
    private javax.swing.JRadioButton jrbTiemVX_ChuaTiem;
    private javax.swing.JRadioButton jrbTiemVX_KhongBiet;

//Benh Nen
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

    private javax.swing.JRadioButton jrbMangThai_Co;
    private javax.swing.JRadioButton jrbMangThai_Khong;
    private javax.swing.JRadioButton jrbHauSan_Co;
    private javax.swing.JRadioButton jrbHauSan_Khong;
    private javax.swing.JTextField jtfSoTuanMT;
    private javax.swing.JRadioButton jrbTreSSXNcovid_Co;
    private javax.swing.JRadioButton jrbTreSSXNcovid_Khong;
    private javax.swing.JRadioButton jrbKQXN_AT;
    private javax.swing.JRadioButton jrbKQXN_ChuaCoKQ;
    private javax.swing.JRadioButton jrbKQXN_DT;



    private javax.swing.JRadioButton jrbHenKQ_Co;
    private javax.swing.JRadioButton jrbHenKQ_Khong;
    private javax.swing.JRadioButton jrbHoiChungDown_Co;
    private javax.swing.JRadioButton jrbHoiChungDown_Khong;

  

    private javax.swing.JRadioButton jrbMachMauNao_Co;
    private javax.swing.JRadioButton jrbMachMauNao_Khong;
    private javax.swing.JRadioButton jrbUngThu_Co;
    private javax.swing.JRadioButton jrbUngThu_Khong;

    private javax.swing.JRadioButton jrbRoiLoanSDCGN_Co;
    private javax.swing.JRadioButton jrbRoiLoanSDCGN_Khong;

    private javax.swing.JRadioButton jrbTangHA_Co;
    private javax.swing.JRadioButton jrbTangHA_Khong;
    private javax.swing.JRadioButton jrbThieuMD_Co;
    private javax.swing.JRadioButton jrbThieuMD_Khong;

    private javax.swing.JRadioButton jrbThuocDTCovid_Co;
    private javax.swing.JRadioButton jrbThuocDTCovid_Khong;
    private javax.swing.JRadioButton jrbThuocUCMD_Co;
    private javax.swing.JRadioButton jrbThuocUCMD_Khong;
    private javax.swing.JRadioButton jrbSteroid_Co;
    private javax.swing.JRadioButton jrbSteroid_Khong;
    private javax.swing.JRadioButton jrbKhangSinh_Co;
    private javax.swing.JRadioButton jrbKhangSinh_Khong;
    private javax.swing.JRadioButton jrbKhangVirus_Co;
    private javax.swing.JRadioButton jrbKhangVirus_Khong;
    private javax.swing.JRadioButton jrbThuocMD_Co;
    private javax.swing.JRadioButton jrbThuocMD_Khong;
	


//Tinh Trang Luc Tiep Nhan

    private javax.swing.JComboBox<String> jcobDGTTBL;
    private javax.swing.JRadioButton jrbBuonNon_Co;
    private javax.swing.JRadioButton jrbBuonNon_Khong;
    private javax.swing.JRadioButton jrbCoGiat_Co;
    private javax.swing.JRadioButton jrbCoGiat_Khong;
    private javax.swing.JRadioButton jrbDKCL_Co;
    private javax.swing.JRadioButton jrbDKCL_Khong;
    private javax.swing.JRadioButton jrbDauDau_Co;
    private javax.swing.JRadioButton jrbDauDau_Khong;
    private javax.swing.JRadioButton jrbDauBung_Co;
    private javax.swing.JRadioButton jrbDauBung_Khong;
    private javax.swing.JRadioButton jrbDauCo_Co;
    private javax.swing.JRadioButton jrbDauCo_Khong;
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
    private javax.swing.JTextField jtfNhietTho;
    private javax.swing.JTextField jtfNhipTim;
    private javax.swing.JTextField jtfTTKhac;
    private javax.swing.JComboBox<String> jcobKQTestNhanh;
    private javax.swing.JComboBox<String> jcobKQTestPCR;

    
    

    public ThemBNController(JCheckBox jcbNam,
            JCheckBox jcbNu,
            JComboBox<String> jcobKQTestNhanh,
            JComboBox<String> jcobKQTestPCR,
            JCheckBox jcbTestNhanh_Co,
            JCheckBox jcbTestNhanh_Khong,
            JCheckBox jcbTestPCR_Co,
            JCheckBox jcbTestPCR_Khong, 
            JCheckBox jcbTungLaF0_Co,
            JCheckBox jcbTungLaF0_Khong, 
            JComboBox<String> jcobPhuong_Xa,
            JComboBox<String> jcobQuan_Huyen,
            JComboBox<String> jcobTinh_ThanhPho,
            JDateChooser jdcNgaySinh,
            JDateChooser jdcNgayTestNhanh,
            JDateChooser jdcNgayTestPCR,
            JDateChooser jdcNgayTnF0,
            JDateChooser jdcNgayXHTTDT,
            JTextField jtfCMND_CCCD,
            JTextField jtfHoTen, 
            JTextField jtfMABN,
            JTextField jtfNgheNghiep,
            JTextField jtfNoiLamViec,
            JTextField jtfNoiO,
            JTextField jtfSDT,
            JTextField jtfSoThangF0, 
            JComboBox<String> jcobLoaiVX1,
            JComboBox<String> jcobLoaiVX2,
            JComboBox<String> jcobLoaiVX3,
            JDateChooser jdcTGTiem1, 
            JDateChooser jdcTGTiem2, 
            JDateChooser jdcTGTiem3,
            JRadioButton jrbTiemVX_1m,
            JRadioButton jrbTiemVX_2m, 
            JRadioButton jrbTiemVX_3m, 
            JRadioButton jrbTiemVX_ChuaTiem,
            JRadioButton jrbTiemVX_KhongBiet,
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
            JRadioButton jrbMangThai_Co,
            JRadioButton jrbMangThai_Khong,
            JRadioButton jrbHauSan_Co, 
            JRadioButton jrbHauSan_Khong,
            JTextField jtfSoTuanMT, 
            JRadioButton jrbTreSSXNcovid_Co,
            JRadioButton jrbTreSSXNcovid_Khong, 
            JRadioButton jrbKQXN_AT,
            JRadioButton jrbKQXN_ChuaCoKQ, 
            JRadioButton jrbKQXN_DT,
            JRadioButton jrbHenKQ_Co, 
            JRadioButton jrbHenKQ_Khong,
            JRadioButton jrbHoiChungDown_Co,
            JRadioButton jrbHoiChungDown_Khong,
            JRadioButton jrbMachMauNao_Co, 
            JRadioButton jrbMachMauNao_Khong, 
            JRadioButton jrbUngThu_Co, 
            JRadioButton jrbUngThu_Khong,
            JRadioButton jrbRoiLoanSDCGN_Co, 
            JRadioButton jrbRoiLoanSDCGN_Khong,
            JRadioButton jrbTangHA_Co,
            JRadioButton jrbTangHA_Khong, 
            JRadioButton jrbThieuMD_Co, 
            JRadioButton jrbThieuMD_Khong,
            JRadioButton jrbThuocDTCovid_Co,
            JRadioButton jrbThuocDTCovid_Khong,
            JRadioButton jrbThuocUCMD_Co, 
            JRadioButton jrbThuocUCMD_Khong, 
            JRadioButton jrbThuocMD_Co,
            JRadioButton jrbThuocMD_Khong,
            JRadioButton jrbSteroid_Co, 
            JRadioButton jrbSteroid_Khong, 
            JRadioButton jrbKhangSinh_Co,
            JRadioButton jrbKhangSinh_Khong,
            JRadioButton jrbKhangVirus_Co, 
            JRadioButton jrbKhangVirus_Khong,
            JComboBox<String> jcobDGTTBL, 
            JRadioButton jrbBuonNon_Co, 
            JRadioButton jrbBuonNon_Khong, 
            JRadioButton jrbCoGiat_Co, 
            JRadioButton jrbCoGiat_Khong,
            JRadioButton jrbDKCL_Co, 
            JRadioButton jrbDKCL_Khong,
            JRadioButton jrbDauBung_Co,
            JRadioButton jrbDauBung_Khong,
            JRadioButton jrbDauDau_Co,
            JRadioButton jrbDauDau_Khong,
            JRadioButton jrbDauCo_Co, 
            JRadioButton jrbDauCo_Khong,
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
            JTextField jtfNhietTho,
            JTextField jtfNhipTim,
            JTextField jtfTTKhac) {
        
        
        this.jcbNam = jcbNam;
        
        this.jcbNu = jcbNu;
        this.jcobKQTestNhanh=jcobKQTestNhanh;
        this.jcobKQTestPCR=jcobKQTestPCR;
        this.jcbTestNhanh_Co = jcbTestNhanh_Co;
        this.jcbTestNhanh_Khong = jcbTestNhanh_Khong;
        this.jcbTestPCR_Co = jcbTestPCR_Co;
        this.jcbTestPCR_Khong = jcbTestPCR_Khong;
        this.jcbTungLaF0_Co = jcbTungLaF0_Co;
        this.jcbTungLaF0_Khong = jcbTungLaF0_Khong;
        this.jcobPhuong_Xa = jcobPhuong_Xa;
        this.jcobQuan_Huyen = jcobQuan_Huyen;
        this.jcobTinh_ThanhPho = jcobTinh_ThanhPho;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jdcNgayTestNhanh = jdcNgayTestNhanh;
        this.jdcNgayTestPCR = jdcNgayTestPCR;
        this.jdcNgayTnF0 = jdcNgayTnF0;
        this.jdcNgayXHTTDT = jdcNgayXHTTDT;
        this.jtfCMND_CCCD = jtfCMND_CCCD;
        this.jtfHoTen = jtfHoTen;
        this.jtfMABN = jtfMABN;
        this.jtfNgheNghiep = jtfNgheNghiep;
        this.jtfNoiLamViec = jtfNoiLamViec;
        this.jtfNoiO = jtfNoiO;
        this.jtfSDT = jtfSDT;
        this.jtfSoThangF0 = jtfSoThangF0;
        this.jcobLoaiVX1 = jcobLoaiVX1;
        this.jcobLoaiVX2 = jcobLoaiVX2;
        this.jcobLoaiVX3 = jcobLoaiVX3;
        this.jdcTGTiem1 = jdcTGTiem1;
        this.jdcTGTiem2 = jdcTGTiem2;
        this.jdcTGTiem3 = jdcTGTiem3;
        this.jrbTiemVX_1m = jrbTiemVX_1m;
        this.jrbTiemVX_2m = jrbTiemVX_2m;
        this.jrbTiemVX_3m = jrbTiemVX_3m;
        this.jrbTiemVX_ChuaTiem = jrbTiemVX_ChuaTiem;
        this.jrbTiemVX_KhongBiet = jrbTiemVX_KhongBiet;
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
        this.jrbMangThai_Co = jrbMangThai_Co;
        this.jrbMangThai_Khong = jrbMangThai_Khong;
        this.jrbHauSan_Co = jrbHauSan_Co;
        this.jrbHauSan_Khong = jrbHauSan_Khong;
        this.jtfSoTuanMT = jtfSoTuanMT;
        this.jrbTreSSXNcovid_Co = jrbTreSSXNcovid_Co;
        this.jrbTreSSXNcovid_Khong = jrbTreSSXNcovid_Khong;
        this.jrbKQXN_AT = jrbKQXN_AT;
        this.jrbKQXN_ChuaCoKQ = jrbKQXN_ChuaCoKQ;
        this.jrbKQXN_DT = jrbKQXN_DT;
        this.jrbHenKQ_Co = jrbHenKQ_Co;
        this.jrbHenKQ_Khong = jrbHenKQ_Khong;
        this.jrbHoiChungDown_Co = jrbHoiChungDown_Co;
        this.jrbHoiChungDown_Khong = jrbHoiChungDown_Khong;
        this.jrbMachMauNao_Co = jrbMachMauNao_Co;
        this.jrbMachMauNao_Khong = jrbMachMauNao_Khong;
        this.jrbUngThu_Co = jrbUngThu_Co;
        this.jrbUngThu_Khong = jrbUngThu_Khong;
        this.jrbRoiLoanSDCGN_Co = jrbRoiLoanSDCGN_Co;
        this.jrbRoiLoanSDCGN_Khong = jrbRoiLoanSDCGN_Khong;
        this.jrbTangHA_Co = jrbTangHA_Co;
        this.jrbTangHA_Khong = jrbTangHA_Khong;
        this.jrbThieuMD_Co = jrbThieuMD_Co;
        this.jrbThieuMD_Khong = jrbThieuMD_Khong;
        this.jrbThuocDTCovid_Co = jrbThuocDTCovid_Co;
        this.jrbThuocDTCovid_Khong = jrbThuocDTCovid_Khong;
        this.jrbThuocUCMD_Co = jrbThuocUCMD_Co;
        this.jrbThuocUCMD_Khong = jrbThuocUCMD_Khong;
        this.jrbThuocMD_Co=jrbThuocMD_Co;
        this.jrbThuocMD_Khong=jrbThuocMD_Khong;
        this.jrbSteroid_Co = jrbSteroid_Co;
        this.jrbSteroid_Khong = jrbSteroid_Khong;
        this.jrbKhangSinh_Co = jrbKhangSinh_Co;
        this.jrbKhangSinh_Khong = jrbKhangSinh_Khong;
        this.jrbKhangVirus_Co = jrbKhangVirus_Co;
        this.jrbKhangVirus_Khong = jrbKhangVirus_Khong;
        this.jcobDGTTBL = jcobDGTTBL;
        this.jrbBuonNon_Co = jrbBuonNon_Co;
        this.jrbBuonNon_Khong = jrbBuonNon_Khong;
        this.jrbCoGiat_Co = jrbCoGiat_Co;
        this.jrbCoGiat_Khong = jrbCoGiat_Khong;
        this.jrbDKCL_Co = jrbDKCL_Co;
        this.jrbDKCL_Khong = jrbDKCL_Khong;
        this.jrbDauBung_Co = jrbDauBung_Co;
        this.jrbDauBung_Khong = jrbDauBung_Khong;
        this.jrbDauDau_Co=jrbDauDau_Co;
        this.jrbDauDau_Khong=jrbDauDau_Khong;
        this.jrbDauCo_Co = jrbDauCo_Co;
        this.jrbDauCo_Khong = jrbDauCo_Khong;
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
        this.jtfNhietTho = jtfNhietTho;
        this.jtfNhipTim = jtfNhipTim;
        this.jtfTTKhac = jtfTTKhac;
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
    public void SetDataTo_BenhNhan() throws ClassNotFoundException, SQLException{
        

        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_BENHNHAN(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
        java.util.Date utilStartDate2 =jdcNgayTnF0.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(13, sqlStartDate2);
        java.util.Date utilStartDate3 =jdcNgayXHTTDT.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(14, sqlStartDate3);
        cStmt.setInt(15, GetInt_jcb(jcbTungLaF0_Co, jcbTungLaF0_Khong));
//        cStmt.setString(16, jtfSoThangF0.getText());
        if(jcbTungLaF0_Khong.isSelected()){
            cStmt.setString(16,null);
        }else{
            cStmt.setString(16, jtfSoThangF0.getText());
        }
        cStmt.setInt(17, GetInt_jcb(jcbTestNhanh_Co, jcbTestNhanh_Khong));
        
        java.util.Date utilStartDate4 =jdcNgayTestNhanh.getDate();
        java.sql.Date sqlStartDate4 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(18, sqlStartDate4);
//        cStmt.setString(19, jcobKQTestNhanh.getSelectedItem().toString());
        if(jcbTestNhanh_Khong.isSelected()){
            
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
    public void SetDataTo_TiemVX() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_TIEMVACCINE(?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setString(2,Get_TTTiem(jrbTiemVX_ChuaTiem,jrbTiemVX_1m,jrbTiemVX_2m,jrbTiemVX_3m,jrbTiemVX_KhongBiet));
//        cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
        java.util.Date utilStartDate =jdcTGTiem1.getDate();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        java.util.Date utilStartDate2 =jdcTGTiem2.getDate();
        java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate.getTime());
        
        java.util.Date utilStartDate3 =jdcTGTiem3.getDate();
        java.sql.Date sqlStartDate3 = new java.sql.Date(utilStartDate.getTime());
        cStmt.setDate(4,sqlStartDate);
        
//        cStmt.setString(5,jcobLoaiVX2.getSelectedItem().toString());
        
        cStmt.setDate(6,sqlStartDate2);
        
//        cStmt.setString(7,jcobLoaiVX3.getSelectedItem().toString());
        
        cStmt.setDate(8,sqlStartDate3);
        
        if(jrbTiemVX_ChuaTiem.isSelected()){
            cStmt.setString(3,null);
            cStmt.setString(5,null);
            cStmt.setString(7,null);
        }else{
            cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
            cStmt.setString(5,jcobLoaiVX2.getSelectedItem().toString());
            cStmt.setString(7,jcobLoaiVX3.getSelectedItem().toString());
        }
        if(jrbTiemVX_1m.isSelected()){
            
            cStmt.setString(5,null);
            cStmt.setString(7,null);
        }else{
             cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
        }
        if(jrbTiemVX_2m.isSelected()){
            
            
            cStmt.setString(7,null);
        }else{
            cStmt.setString(3,jcobLoaiVX1.getSelectedItem().toString());
            cStmt.setString(5,jcobLoaiVX2.getSelectedItem().toString());
        }
        if(jrbTiemVX_KhongBiet.isSelected()){
            cStmt.setString(3,null);
            cStmt.setString(5,null);
            cStmt.setString(7,null);
        }
      
        
        cStmt.execute();
        cStmt.close();
        conn.close();
        
        
        
    }
    public void SetDataTo_BenhNen() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_BENHNEN(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
    public void SetDataTo_MangThai() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_MANGTHAI(?,?,?,?,?,?)}");
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
    public void SetDataTo_ThuocDaDungTruocTT() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call INSERT_THUOCDUNGTRUOCKHITIEPNHAN(?,?,?,?,?,?,?)}");
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
     public void SetDataTo_TongTrang() throws ClassNotFoundException, SQLException{
         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call INSERT_TONGTRANG(?,?,?,?,?,?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setInt(2, Integer.parseInt(jtfNhietDo.getText()));
        cStmt.setInt(3, Integer.parseInt(jtfNhipTim.getText()));
        cStmt.setInt(4, Integer.parseInt(jtfHuyetApTThu.getText()));
        cStmt.setInt(5, Integer.parseInt(jtfHuyetApTTruong.getText()));
        cStmt.setInt(6, Integer.parseInt(jtfDoBH_Oxi.getText()));
        cStmt.setInt(7, Integer.parseInt(jtfChieuCao.getText()));
        cStmt.setInt(8, Integer.parseInt(jtfCanNang.getText()));
        cStmt.setInt(9, Integer.parseInt(jtfNhietTho.getText()));
     
        
        
        
        cStmt.execute();
        cStmt.close();
        conn.close();
     }
     public void SetDataTo_TTLucTiepNhan() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call INSERT_TRIEUCHUNGTAITHOIDIEMTIEPNHAN(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
     public void SetDataTo_DanhGiaSoLuoc() throws ClassNotFoundException, SQLException{
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{call INSERT_DANHGIASOLUOC(?,?,?,?)}");
        cStmt.setString(1, jtfMABN.getText());
        cStmt.setString(2, jtfChuanDoanTT.getText());
        cStmt.setString(3, jcobDGTTBL.getSelectedItem().toString());
        cStmt.setInt(4, GetInt(jrbDKCL_Co, jrbDKCL_Khong));
       
        
         cStmt.execute();
        cStmt.close();
        conn.close();
    }
}
