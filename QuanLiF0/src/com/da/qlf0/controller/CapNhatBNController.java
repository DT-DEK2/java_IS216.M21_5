/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

/**
 *
 * @author NDAT_UIT
 */
public class CapNhatBNController {
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

}
