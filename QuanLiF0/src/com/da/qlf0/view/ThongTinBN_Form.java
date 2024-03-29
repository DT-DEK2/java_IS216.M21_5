/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.da.qlf0.view;

import com.da.qlf0.controller.XemTT_CapNhatDTController;
import com.da.qlf0.controller.XoaBenhNhanController;
import com.da.qlf0.view.CapNhat.CapNhat_Frame;
import com.da.qlf0.view.KQDieuTri;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Minh Cuong
 */
public class ThongTinBN_Form extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinBN_Form
     */
    private String ID;
    public ThongTinBN_Form() {
        initComponents();
    }
    public ThongTinBN_Form( String Hovaten, String Mabenhnhan, String CMND, String SDT,  String DiaChi, String ID){
        initComponents();
        this.jlbCMND.setText(CMND);
        this.jlbSDT.setText(SDT);
        
        this.jlbDiaChi.setText(DiaChi);
        this.jlbHoTen.setText(Hovaten);
        this.jlbMABN.setText(Mabenhnhan);
        this.ID=ID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlbHoTen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbMABN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jlbCMND = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlbSDT = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlbDiaChi = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        setMinimumSize(new java.awt.Dimension(1070, 184));
        setPreferredSize(new java.awt.Dimension(1075, 191));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 20, 20));
        jLabel1.setText("Họ và tên: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 50, -1, -1));

        jlbHoTen.setBackground(new java.awt.Color(255, 255, 255));
        jlbHoTen.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbHoTen.setForeground(new java.awt.Color(20, 20, 20));
        jlbHoTen.setText("............");
        add(jlbHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Mã bệnh nhân:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 50, -1, -1));

        jlbMABN.setBackground(new java.awt.Color(255, 255, 255));
        jlbMABN.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbMABN.setForeground(new java.awt.Color(20, 20, 20));
        jlbMABN.setText("............");
        add(jlbMABN, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/search.png"))); // NOI18N
        jButton1.setText("Xem chi tiết");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 46, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 20, 20));
        jLabel5.setText("Số CMND/CCCD:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 50, -1, -1));

        jlbCMND.setBackground(new java.awt.Color(255, 255, 255));
        jlbCMND.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbCMND.setForeground(new java.awt.Color(20, 20, 20));
        jlbCMND.setText("............");
        add(jlbCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 20, 20));
        jLabel7.setText("Số điện thoại:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 132, -1, -1));

        jlbSDT.setBackground(new java.awt.Color(255, 255, 255));
        jlbSDT.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbSDT.setForeground(new java.awt.Color(20, 20, 20));
        jlbSDT.setText("............");
        add(jlbSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 132, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 20, 20));
        jLabel10.setText("Địa chỉ đang sinh sống:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jlbDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        jlbDiaChi.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbDiaChi.setForeground(new java.awt.Color(20, 20, 20));
        jlbDiaChi.setText("............");
        add(jlbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/trash.png"))); // NOI18N
        jButton2.setText("Xóa bệnh nhân");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/create.png"))); // NOI18N
        jButton3.setText("Tạo kết quả điều trị");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 86, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 41, 102));
        jLabel13.setText("Thông tin cơ bản");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 19, 157, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 41, 102));
        jLabel14.setText("Thông tin liên hệ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 93, 157, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        XoaBenhNhanController dl = new XoaBenhNhanController(this.jlbMABN.getText());
        JFrame frame1 = new JFrame();
        String[] options = new String[2];
        options[0] = "Có";
        options[1] = "Không";
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showOptionDialog(frame1.getContentPane(), "Bạn muốn xóa bệnh nhân này?", "Xóa bệnh nhân", 0, JOptionPane.INFORMATION_MESSAGE, null, options, dialogButton);
        if(dialogResult == 0) {
            try {
                int i = dl.Xoa_BN();
                if(i!=0){
                     JFrame frame = new JFrame();
                        frame.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Xóa thành công bệnh nhân");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongTinBN_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ThongTinBN_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        JFrame frame = new JFrame();
        JPanel KQ = new KQDieuTri(this.jlbMABN.getText());
//        
//        JScrollPane scrollp = new JScrollPane(KQ, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        frame.setResizable(true);
//        frame.setLocationRelativeTo(null);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//        frame.setUndecorated(true);
//                    frame.add(scrollp);
//          
//                    frame.validate();
//                    frame.repaint();
//                    frame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CapNhat_Frame cn = new CapNhat_Frame(this.jlbMABN.getText(),this.ID);
        cn.setVisible(true);
        cn.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        XemTT_CapNhatDTController tt_cn = new XemTT_CapNhatDTController(this.ID,
                this.jlbMABN.getText(),
                cn.getNode1().getJcbNam(),
                cn.getNode1().getJcbNu(),
                cn.getNode1().getJcbTestPCR_Co(),
                cn.getNode1().getJcbTestPCR_Khong(),
                cn.getNode1().getJcbTestNhanh_Co(),
                cn.getNode1().getJcbTestNhanh_Khong(),
                cn.getNode1().getJcbTungLaF0_Co(),
                cn.getNode1().getJcbTungLaF0_Khong(),
                cn.getNode1().getJcobPhuong_Xa(),
                cn.getNode1().getJcobQuan_Huyen(),
                cn.getNode1().getJcobTinh_ThanhPho(),
                cn.getNode1().getJdcNgaySinh(),
                cn.getNode1().getJdcNgayTnF0(),
                cn.getNode1().getJdcNgayTestNhanh(),
                cn.getNode1().getJdcNgayTestPCR(),
                cn.getNode1().getJcobKQTestNhanh(),
                cn.getNode1().getJcobKQTestPCR(),
                cn.getNode1().getJdcNgayXHTTDT(),
                cn.getNode1().getJtfCMND_CCCD(),
                cn.getNode1().getJtfHoTen(),
                cn.getNode1().getJtfMABN(),
                cn.getNode1().getJtfNgheNghiep(),
                cn.getNode1().getJtfNoiLamViec(),
                cn.getNode1().getJtfNoiO(),
                cn.getNode1().getJtfSDT(),
                cn.getNode1().getJtfSoThangF0(),
                
                
                
                cn.getNode2().getJcobTiemVX_1(),
                cn.getNode2().getJcobTiemVX_2(),
                cn.getNode2().getJcobTiemVX_3(),
                cn.getNode2().getJdcTGMui1(),
                cn.getNode2().getJdcTGMui2(),
                cn.getNode2().getJdcTGMui3(),
                cn.getNode2().getJrbChuaTiem(),
                cn.getNode2().getJrbTiem1Mui(),
                cn.getNode2().getJrbTiem2Mui(),
                cn.getNode2().getJrbTiem3Mui(),
                cn.getNode2().getJrbTiem_KhongBiet(),
        
                cn.getNode3().getJrbBenhGan_Co(),
                cn.getNode3().getJrbBenhGan_Khong(),
                cn.getNode3().getJrbBenhPhoiMT_Co(),
                cn.getNode3().getJrbBenhPhoiMT_Khong(),
                cn.getNode3().getJrbBenhTKMT_Co(),
                cn.getNode3().getJrbBenhTKMT_Khong(),
                cn.getNode3().getJrbBenhThanMT_Co(),
                cn.getNode3().getJrbBenhThanMT_Khong(),
                cn.getNode3().getJrbBenhTim_Co(),
                cn.getNode3().getJrbBenhTim_Khong(),
                cn.getNode3().getJrbBeoPhi_Co(),
                cn.getNode3().getJrbBeoPhi_Khong(),
                cn.getNode3().getJrbCLBenhHT_Co(),
                cn.getNode3().getJrbCLBenhHT_Khong(),
                cn.getNode3().getJrbDaiTD_Co(),
                cn.getNode3().getJrbDaiTD_Khong(),
                cn.getNode3().getJrbGhepTang_TBM_Co(),
                cn.getNode3().getJrbGhepTang_TBM_Khong(),
                cn.getNode3().getJrbHIV_Co(),
                cn.getNode3().getJrbHIV_Khong(),
                cn.getNode3().getJrbHauSan_Co(),
                cn.getNode3().getJrbHauSan_Khong(),
                cn.getNode3().getJrbHenKQ_Co(),
                cn.getNode3().getJrbHenKQ_Khong(),
                cn.getNode3().getJrbHoiChungDown_Co(),
                cn.getNode3().getJrbHoiChungDown_Khong(),
                cn.getNode3().getJrbKQXN_AT(),
                cn.getNode3().getJrbKQXN_ChuaCoKQ(),
                cn.getNode3().getJrbKQXN_DT(),
                cn.getNode3().getJrbKhangSinh_Co(),
                cn.getNode3().getJrbKhangSinh_Khong(),
                cn.getNode3().getJrbKhangVirus_Co(),
                cn.getNode3().getJrbKhangVirus_Khong(),
                cn.getNode3().getJrbMachMauNao_Co(),
                cn.getNode3().getJrbMachMauNao_Khong(),
                cn.getNode3().getJrbMangThai_Co(),
                cn.getNode3().getJrbMangThai_Khong(),
                cn.getNode3().getJrbRoiLoanSDCGN_Co(),
                cn.getNode3().getJrbRoiLoanSDCGN_Khong(),
                cn.getNode3().getJrbSteroid_Co(),
                cn.getNode3().getJrbSteroid_Khong(),
                cn.getNode3().getJrbTangHA_Co(),
                cn.getNode3().getJrbTangHA_Khong(),
                cn.getNode3().getJrbThieuMD_Co(),
                cn.getNode3().getJrbThieuMD_Khong(),
                cn.getNode3().getJrbThuocDTCovid_Co(),
                cn.getNode3().getJrbThuocDTCovid_Khong(),
                cn.getNode3().getJrbThuocMD_Co(),
                cn.getNode3().getJrbThuocMD_Khong(),
                cn.getNode3().getJrbThuocUCMD_Co(),
                cn.getNode3().getJrbThuocUCMD_Khong(),
                cn.getNode3().getJrbTreSSXNcovid_Co(),
                cn.getNode3().getJrbTreSSXNcovid_Khong(),
                cn.getNode3().getJrbUngThu_Co(),
                cn.getNode3().getJrbUngThu_Khong(),
                cn.getNode3().getJtfSoTuanMT(),
                
                
                cn.getNode4().getJcobDGTTBL(),
                cn.getNode4().getJrbBuonNon_Co(),
                cn.getNode4().getJrbBuonNon_Khong(),
                cn.getNode4().getJrbCoGiat_Co(),
                cn.getNode4().getJrbCoGiat_Khong(),
                cn.getNode4().getJrbDKCL_Co(),
                cn.getNode4().getJrbDKCL_Khong(),
                cn.getNode4().getJrbDauBung_Co(),
                cn.getNode4().getJrbDauBung_Khong(),
                cn.getNode4().getJrbDauCo_Co(),
                cn.getNode4().getJrbDauCo_Khong(),
                cn.getNode4().getJrbDauDau_Co(),
                cn.getNode4().getJrbDauDau_Khong(),
                cn.getNode4().getJrbDauHong_Co(),
                cn.getNode4().getJrbDauHong_Khong(),
                cn.getNode4().getJrbDauKhop_Co(),
                cn.getNode4().getJrbDauKhop_Khong(),
                cn.getNode4().getJrbMatKhuuGiac_Co(),
                cn.getNode4().getJrbMatKhuuGiac_Khong(),
                cn.getNode4().getJrbMatViGiac_Co(),
                cn.getNode4().getJrbMatViGiac_Khong(),
                cn.getNode4().getJrbNoiHach_Co(),
                cn.getNode4().getJrbNoiHach_Khong(),
                cn.getNode4().getJrbSot_Co(),
                cn.getNode4().getJrbSot_Khong(),
                cn.getNode4().getJrbTTKhac_Co(),
                cn.getNode4().getJrbTTKhac_Khong(),
                cn.getNode4().getJrbXuatHuyet_Co(),
                cn.getNode4().getJrbXuatHuyet_Khong(),
                cn.getNode4().getJtfCanNang(),
                cn.getNode4().getJtfChieuCao(),
                cn.getNode4().getJtfChuanDoanTT(),
                cn.getNode4().getJtfDoBH_Oxi(),
                cn.getNode4().getJtfHuyetApTThu(),
                cn.getNode4().getJtfHuyetApTTruong(),
                cn.getNode4().getJtfNhietDo(),
                cn.getNode4().getJtfNhipTho(),
                cn.getNode4().getJtfNhipTim(),
                cn.getNode4().getJtfTTKhac(),
                
                cn.getNode5().getJdcNgayXN(),
                
                cn.getNode5().getJrbDauNguc_Co(),
                cn.getNode5().getJrbDauNguc_Khong(),
                cn.getNode5().getJrbGoiA_Co(),
                cn.getNode5().getJrbGoiA_Khong(),
                  cn.getNode5().getJrbGoiB_Co(),
                cn.getNode5().getJrbGoiB_Khong(),
                  cn.getNode5().getJrbGoiC_Co(),
                cn.getNode5().getJrbGoiC_Khong(),
                cn.getNode5().getJrbHoRaDom_Co(),
                cn.getNode5().getJrbHoRaDom_Khong(),
                cn.getNode5().getJrbHoRaMau_Co(),
                cn.getNode5().getJrbHoRaMau_Khong(),
                cn.getNode5().getJrbHo_Co(),
                cn.getNode5().getJrbHo_Khong(),
                cn.getNode5().getJrbKQ_AT(),
                cn.getNode5().getJrbKQ_DT(),
                cn.getNode5().getJrbKhoTho_Co(),
                cn.getNode5().getJrbKhoTho_Khong(),
                cn.getNode5().getJrbKhongTT_Co(),
                cn.getNode5().getJrbKhongTT_Khong(),
                cn.getNode5().getJrbKietSuc_Co(),
                cn.getNode5().getJrbKietSuc_Khong(),
                cn.getNode5().getJrbMatKG_Co(),
                cn.getNode5().getJrbMatKG_Khong(),
                cn.getNode5().getJrbMatVG_Co(),
                cn.getNode5().getJrbMatVG_Khong(),
                cn.getNode5().getJrbOnLanh_Co(),
                cn.getNode5().getJrbOnLanh_Khong(),
                cn.getNode5().getJrbTieuChay_Co(),
                cn.getNode5().getJrbTieuChay_Khong(),
                cn.getNode5().getJrbXN_Co(),
                cn.getNode5().getJrbXN_Khong(),
                cn.getNode5().getJtfDoBHOxi(),
                cn.getNode5().getJtfHuyetApTD(),
                cn.getNode5().getJtfHuyetApToiThieu(),
                cn.getNode5().getJtfMach(),
                cn.getNode5().getJtfNhietDo_QTDT(),
                cn.getNode5().getJtfNhipTho_QTDT());
        try {
            tt_cn.SetThongTin();
            cn.getNode5().getJlbTimeStamp().setText(tt_cn.getTimeStamp());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongTinBN_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinBN_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinBN_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlbCMND;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbHoTen;
    private javax.swing.JLabel jlbMABN;
    private javax.swing.JLabel jlbSDT;
    // End of variables declaration//GEN-END:variables
}
