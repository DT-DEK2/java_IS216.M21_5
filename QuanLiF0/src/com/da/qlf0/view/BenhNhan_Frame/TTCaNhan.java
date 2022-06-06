/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.da.qlf0.view.BenhNhan_Frame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.da.qlf0.bean.DanhMucTTCaNhan;
import com.da.qlf0.controller.ChuyenMH_ThongTinCaNhan;
import com.da.qlf0.controller.KiemTraLanDauKB;
import com.da.qlf0.controller.QuanLiBenhNhanController;
import com.da.qlf0.controller.XemTT_CapNhatDTController;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh Cuong
 */
public class TTCaNhan extends javax.swing.JPanel {

    /**
     * Creates new form TTCaNhan
     */
    private TTCaNhan_ttcb node1 = new TTCaNhan_ttcb();
    private TTCaNhan_Vaccine node2 = new TTCaNhan_Vaccine();
    private TTCaNhan_BenhNen node3 = new TTCaNhan_BenhNen();
    private String MABN;
    public TTCaNhan(String MABN) {
        initComponents();
        ChuyenMH_ThongTinCaNhan controller = new ChuyenMH_ThongTinCaNhan(jpnView, node1, node2, node3);
        controller.setView(jpnTTCoBan, jlbTTCoBan);

        ArrayList<DanhMucTTCaNhan> listItem = new ArrayList<>();
        listItem.add(new DanhMucTTCaNhan("ThongTinCoBan", jpnTTCoBan, jlbTTCoBan));
        listItem.add(new DanhMucTTCaNhan("TiemVaccine", jpnTiemPhong, jlbTiemPhong));
        listItem.add(new DanhMucTTCaNhan("BenhNen", jpnBenhNen, jlbBenhNen));

        controller.setEvent(listItem);
        this.MABN=MABN;
        setTT();
    }
    public void setTT()  {
         XemTT_CapNhatDTController tt_cn = new XemTT_CapNhatDTController(
                 this.MABN,
                 this.node1.getJcbNam(),
                 this.node1.getJcbNu(),
                 this.node1.getJcbTestPCR_Co(),
                 this.node1.getJcbTestPCR_Khong(),
                 this.node1.getJcbTestNhanh_Co(),
                 this.node1.getJcbTestNhanh_Khong(),
                 this.node1.getJcbTungLaF0_Co(),
                 this.node1.getJcbTungLaF0_Khong(),
                 this.node1.getJcobPhuong_Xa(),
                 this.node1.getJcobQuan_Huyen(),
                 this.node1.getJcobTinh_ThanhPho(),
                 this.node1.getJdcNgaySinh(),
                 this.node1.getJdcNgayTnF0(),
                 this.node1.getJdcNgayTestNhanh(),
                 this.node1.getJdcNgayTestPCR(),
                 this.node1.getJcobKQTestNhanh(),
                 this.node1.getJcobKQTestPCR(),
                 this.node1.getJdcNgayXHTTDT(),
                 this.node1.getJtfCMND_CCCD(),
                 this.node1.getJtfHoTen(),
                 this.node1.getJtfMABN(),
                 this.node1.getJtfNgheNghiep(),
                 this.node1.getJtfNoiLamViec(),
                 this.node1.getJtfNoiO(),
                 this.node1.getJtfSDT(),
                 this.node1.getJtfSoThangF0(),
                
                
                
                 this.node2.getJcobTiemVX_1(),
                 this.node2.getJcobTiemVX_2(),
                 this.node2.getJcobTiemVX_3(),
                 this.node2.getJdcTGMui1(),
                 this.node2.getJdcTGMui2(),
                 this.node2.getJdcTGMui3(),
                 this.node2.getJrbChuaTiem(),
                 this.node2.getJrbTiem1Mui(),
                 this.node2.getJrbTiem2Mui(),
                 this.node2.getJrbTiem3Mui(),
                 this.node2.getJrbTiem_KhongBiet(),
        
                 this.node3.getJrbBenhGan_Co(),
                 this.node3.getJrbBenhGan_Khong(),
                 this.node3.getJrbBenhPhoiMT_Co(),
                 this.node3.getJrbBenhPhoiMT_Khong(),
                 this.node3.getJrbBenhTKMT_Co(),
                 this.node3.getJrbBenhTKMT_Khong(),
                 this.node3.getJrbBenhThanMT_Co(),
                 this.node3.getJrbBenhThanMT_Khong(),
                 this.node3.getJrbBenhTim_Co(),
                 this.node3.getJrbBenhTim_Khong(),
                 this.node3.getJrbBeoPhi_Co(),
                 this.node3.getJrbBeoPhi_Khong(),
                 this.node3.getJrbCLBenhHT_Co(),
                 this.node3.getJrbCLBenhHT_Khong(),
                 this.node3.getJrbDaiTD_Co(),
                 this.node3.getJrbDaiTD_Khong(),
                 this.node3.getJrbGhepTang_TBM_Co(),
                 this.node3.getJrbGhepTang_TBM_Khong(),
                 this.node3.getJrbHIV_Co(),
                 this.node3.getJrbHIV_Khong(),
                 this.node3.getJrbHauSan_Co(),
                 this.node3.getJrbHauSan_Khong(),
                 this.node3.getJrbHenKQ_Co(),
                 this.node3.getJrbHenKQ_Khong(),
                 this.node3.getJrbHoiChungDown_Co(),
                 this.node3.getJrbHoiChungDown_Khong(),
                 this.node3.getJrbKQXN_AT(),
                 this.node3.getJrbKQXN_ChuaCoKQ(),
                 this.node3.getJrbKQXN_DT(),
                 this.node3.getJrbKhangSinh_Co(),
                 this.node3.getJrbKhangSinh_Khong(),
                 this.node3.getJrbKhangVirus_Co(),
                 this.node3.getJrbKhangVirus_Khong(),
                 this.node3.getJrbMachMauNao_Co(),
                 this.node3.getJrbMachMauNao_Khong(),
                 this.node3.getJrbMangThai_Co(),
                 this.node3.getJrbMangThai_Khong(),
                 this.node3.getJrbRoiLoanSDCGN_Co(),
                 this.node3.getJrbRoiLoanSDCGN_Khong(),
                 this.node3.getJrbSteroid_Co(),
                 this.node3.getJrbSteroid_Khong(),
                 this.node3.getJrbTangHA_Co(),
                 this.node3.getJrbTangHA_Khong(),
                 this.node3.getJrbThieuMD_Co(),
                 this.node3.getJrbThieuMD_Khong(),
                 this.node3.getJrbThuocDTCovid_Co(),
                 this.node3.getJrbThuocDTCovid_Khong(),
                 this.node3.getJrbThuocMD_Co(),
                 this.node3.getJrbThuocMD_Khong(),
                 this.node3.getJrbThuocUCMD_Co(),
                 this.node3.getJrbThuocUCMD_Khong(),
                 this.node3.getJrbTreSSXNcovid_Co(),
                 this.node3.getJrbTreSSXNcovid_Khong(),
                 this.node3.getJrbUngThu_Co(),
                 this.node3.getJrbUngThu_Khong(),
                 this.node3.getJtfSoTuanMT());
                  KiemTraLanDauKB kt = new KiemTraLanDauKB(this.MABN);
        try {
            if(kt.check()==1){
                try {
                    tt_cn.SetTTBN_LanDau();
                } catch (ParseException ex) {
                    Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    tt_cn.SetThongTin_BN();
                } catch (ParseException ex) {
                    Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenu = new javax.swing.JPanel();
        jpnTTCoBan = new javax.swing.JPanel();
        jlbTTCoBan = new javax.swing.JLabel();
        jpnTiemPhong = new javax.swing.JPanel();
        jlbTiemPhong = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpnBenhNen = new javax.swing.JPanel();
        jlbBenhNen = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1075, 550));

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));

        jpnTTCoBan.setBackground(new java.awt.Color(0, 180, 153));

        jlbTTCoBan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlbTTCoBan.setText("Thông tin cơ bản");

        javax.swing.GroupLayout jpnTTCoBanLayout = new javax.swing.GroupLayout(jpnTTCoBan);
        jpnTTCoBan.setLayout(jpnTTCoBanLayout);
        jpnTTCoBanLayout.setHorizontalGroup(
            jpnTTCoBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTTCoBanLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jlbTTCoBan)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpnTTCoBanLayout.setVerticalGroup(
            jpnTTCoBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTTCoBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTTCoBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnTiemPhong.setBackground(new java.awt.Color(0, 180, 153));

        jlbTiemPhong.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlbTiemPhong.setText("Thông Tin Tiêm Phòng");

        javax.swing.GroupLayout jpnTiemPhongLayout = new javax.swing.GroupLayout(jpnTiemPhong);
        jpnTiemPhong.setLayout(jpnTiemPhongLayout);
        jpnTiemPhongLayout.setHorizontalGroup(
            jpnTiemPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTiemPhongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbTiemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpnTiemPhongLayout.setVerticalGroup(
            jpnTiemPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTiemPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lưu thông tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jpnBenhNen.setBackground(new java.awt.Color(0, 180, 153));

        jlbBenhNen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlbBenhNen.setText("Thông Tin Bệnh Nền");

        javax.swing.GroupLayout jpnBenhNenLayout = new javax.swing.GroupLayout(jpnBenhNen);
        jpnBenhNen.setLayout(jpnBenhNenLayout);
        jpnBenhNenLayout.setHorizontalGroup(
            jpnBenhNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBenhNenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbBenhNen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jpnBenhNenLayout.setVerticalGroup(
            jpnBenhNenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBenhNenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBenhNen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpnTTCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnTiemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnBenhNen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTTCoBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTiemPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jpnBenhNen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = "Có";
        options[1] = "Không";
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showOptionDialog(frame.getContentPane(), "Bạn muốn lưu thông tin!", "Lưu thông tin!", 0, JOptionPane.INFORMATION_MESSAGE, null, options, dialogButton);
        if (dialogResult == 0) {
        
             XemTT_CapNhatDTController tt_cn = new XemTT_CapNhatDTController(
                 this.MABN,
                 this.node1.getJcbNam(),
                 this.node1.getJcbNu(),
                 this.node1.getJcbTestPCR_Co(),
                 this.node1.getJcbTestPCR_Khong(),
                 this.node1.getJcbTestNhanh_Co(),
                 this.node1.getJcbTestNhanh_Khong(),
                 this.node1.getJcbTungLaF0_Co(),
                 this.node1.getJcbTungLaF0_Khong(),
                 this.node1.getJcobPhuong_Xa(),
                 this.node1.getJcobQuan_Huyen(),
                 this.node1.getJcobTinh_ThanhPho(),
                 this.node1.getJdcNgaySinh(),
                 this.node1.getJdcNgayTnF0(),
                 this.node1.getJdcNgayTestNhanh(),
                 this.node1.getJdcNgayTestPCR(),
                 this.node1.getJcobKQTestNhanh(),
                 this.node1.getJcobKQTestPCR(),
                 this.node1.getJdcNgayXHTTDT(),
                 this.node1.getJtfCMND_CCCD(),
                 this.node1.getJtfHoTen(),
                 this.node1.getJtfMABN(),
                 this.node1.getJtfNgheNghiep(),
                 this.node1.getJtfNoiLamViec(),
                 this.node1.getJtfNoiO(),
                 this.node1.getJtfSDT(),
                 this.node1.getJtfSoThangF0(),
                
                
                
                 this.node2.getJcobTiemVX_1(),
                 this.node2.getJcobTiemVX_2(),
                 this.node2.getJcobTiemVX_3(),
                 this.node2.getJdcTGMui1(),
                 this.node2.getJdcTGMui2(),
                 this.node2.getJdcTGMui3(),
                 this.node2.getJrbChuaTiem(),
                 this.node2.getJrbTiem1Mui(),
                 this.node2.getJrbTiem2Mui(),
                 this.node2.getJrbTiem3Mui(),
                 this.node2.getJrbTiem_KhongBiet(),
        
                 this.node3.getJrbBenhGan_Co(),
                 this.node3.getJrbBenhGan_Khong(),
                 this.node3.getJrbBenhPhoiMT_Co(),
                 this.node3.getJrbBenhPhoiMT_Khong(),
                 this.node3.getJrbBenhTKMT_Co(),
                 this.node3.getJrbBenhTKMT_Khong(),
                 this.node3.getJrbBenhThanMT_Co(),
                 this.node3.getJrbBenhThanMT_Khong(),
                 this.node3.getJrbBenhTim_Co(),
                 this.node3.getJrbBenhTim_Khong(),
                 this.node3.getJrbBeoPhi_Co(),
                 this.node3.getJrbBeoPhi_Khong(),
                 this.node3.getJrbCLBenhHT_Co(),
                 this.node3.getJrbCLBenhHT_Khong(),
                 this.node3.getJrbDaiTD_Co(),
                 this.node3.getJrbDaiTD_Khong(),
                 this.node3.getJrbGhepTang_TBM_Co(),
                 this.node3.getJrbGhepTang_TBM_Khong(),
                 this.node3.getJrbHIV_Co(),
                 this.node3.getJrbHIV_Khong(),
                 this.node3.getJrbHauSan_Co(),
                 this.node3.getJrbHauSan_Khong(),
                 this.node3.getJrbHenKQ_Co(),
                 this.node3.getJrbHenKQ_Khong(),
                 this.node3.getJrbHoiChungDown_Co(),
                 this.node3.getJrbHoiChungDown_Khong(),
                 this.node3.getJrbKQXN_AT(),
                 this.node3.getJrbKQXN_ChuaCoKQ(),
                 this.node3.getJrbKQXN_DT(),
                 this.node3.getJrbKhangSinh_Co(),
                 this.node3.getJrbKhangSinh_Khong(),
                 this.node3.getJrbKhangVirus_Co(),
                 this.node3.getJrbKhangVirus_Khong(),
                 this.node3.getJrbMachMauNao_Co(),
                 this.node3.getJrbMachMauNao_Khong(),
                 this.node3.getJrbMangThai_Co(),
                 this.node3.getJrbMangThai_Khong(),
                 this.node3.getJrbRoiLoanSDCGN_Co(),
                 this.node3.getJrbRoiLoanSDCGN_Khong(),
                 this.node3.getJrbSteroid_Co(),
                 this.node3.getJrbSteroid_Khong(),
                 this.node3.getJrbTangHA_Co(),
                 this.node3.getJrbTangHA_Khong(),
                 this.node3.getJrbThieuMD_Co(),
                 this.node3.getJrbThieuMD_Khong(),
                 this.node3.getJrbThuocDTCovid_Co(),
                 this.node3.getJrbThuocDTCovid_Khong(),
                 this.node3.getJrbThuocMD_Co(),
                 this.node3.getJrbThuocMD_Khong(),
                 this.node3.getJrbThuocUCMD_Co(),
                 this.node3.getJrbThuocUCMD_Khong(),
                 this.node3.getJrbTreSSXNcovid_Co(),
                 this.node3.getJrbTreSSXNcovid_Khong(),
                 this.node3.getJrbUngThu_Co(),
                 this.node3.getJrbUngThu_Khong(),
                 this.node3.getJtfSoTuanMT());
              if (node1.getJtfHoTen().getText().length() == 0
               || node1.getJtfCMND_CCCD().getText().length() == 0
               || node1.getJtfNoiO().getText().length()== 0
               || node1.getJtfSDT().getText().length()== 0
               
                    
                    ) {
                        JFrame frame4 = new JFrame();
                            frame.setBounds(0,0,100,50);
                            JOptionPane.showMessageDialog(frame,
                            "Vui lòng nhập dữ liệu bắt buộc!");
                }else {
                    try {
                        tt_cn.UpdateTT_BN();
                        JFrame frame2 = new JFrame();
                        frame.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Cập nhật thành công");
                       
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
                            ex.printStackTrace();
                        JFrame frame2 = new JFrame();
                        frame.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Cập nhật thất bại\n" +
                         ex.getMessage()
                            );
                    } catch (SQLException ex) {
                        Logger.getLogger(TTCaNhan.class.getName()).log(Level.SEVERE, null, ex);
                         ex.printStackTrace();
                        JFrame frame2 = new JFrame();
                        frame.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Cập nhật thất bại\n" +
                         ex.getSQLState()+"\n"+
                         ex.getMessage()

                            );
                    }
                    
                    
				}
        }
//                       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlbBenhNen;
    private javax.swing.JLabel jlbTTCoBan;
    private javax.swing.JLabel jlbTiemPhong;
    private javax.swing.JPanel jpnBenhNen;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnTTCoBan;
    private javax.swing.JPanel jpnTiemPhong;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
