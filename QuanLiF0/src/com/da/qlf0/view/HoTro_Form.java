/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.da.qlf0.view;

import com.da.qlf0.controller.XoaBenhNhanController;
import com.da.qlf0.controller.XoaHoTroController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

/**
 *
 * @author Minh Cuong
 */
public class HoTro_Form extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinBN_Form
     */
    public HoTro_Form() {
        initComponents();
    }
    public HoTro_Form( String Hovaten, String Mabenhnhan,String CMND, String Noidung, String ChuyenNang,Timestamp time){
        initComponents();
        this.jlbTime.setText(Hovaten);
        this.jlbMABN.setText(Mabenhnhan);
        this.jlbCMND.setText(CMND);
        this.jlbNoiDung.setText(Noidung);
        this.jLabel10.setText(ChuyenNang);
        this.jlbTime.setText(time.toString());
        this.jlbHoTen1.setText(Hovaten);
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
        jlbTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbMABN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbCMND = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlbNoiDung = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlbHoTen1 = new javax.swing.JLabel();

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

        jlbTime.setBackground(new java.awt.Color(255, 255, 255));
        jlbTime.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbTime.setForeground(new java.awt.Color(20, 20, 20));
        jlbTime.setText("............");
        add(jlbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Dấu hiệu chuyển nặng:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jlbCMND.setBackground(new java.awt.Color(255, 255, 255));
        jlbCMND.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbCMND.setForeground(new java.awt.Color(20, 20, 20));
        jlbCMND.setText("............");
        add(jlbCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 20, 20));
        jLabel7.setText("Thời gian:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jlbNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        jlbNoiDung.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbNoiDung.setForeground(new java.awt.Color(20, 20, 20));
        jlbNoiDung.setText("............");
        add(jlbNoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 640, 60));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/confirmation.png"))); // NOI18N
        jButton3.setText("Xác nhận xử lí");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 41, 102));
        jLabel13.setText("Thông tin cơ bản");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 19, 157, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 41, 102));
        jLabel14.setText("Yêu cầu hỗ trợ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 93, 157, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(20, 20, 20));
        jLabel9.setText("Số CMND/CCCD:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 50, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("........");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/sending (2).png"))); // NOI18N
        jButton1.setText("Chuyển tiếp yêu cầu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 20, 20));
        jLabel8.setText("Nội dung:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jlbHoTen1.setBackground(new java.awt.Color(255, 255, 255));
        jlbHoTen1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jlbHoTen1.setForeground(new java.awt.Color(20, 20, 20));
        jlbHoTen1.setText("............");
        add(jlbHoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = "Có";
        options[1] = "Không";
        int dialogButton = JOptionPane.YES_NO_OPTION;
        var dialogResult = JOptionPane.showOptionDialog(frame.getContentPane(), "Xác nhận đã xử lí ?", "Xác nhận xử lí yêu cầu hỗ trợ", 0, JOptionPane.INFORMATION_MESSAGE, null, options, dialogButton);
        if(dialogResult == 0) {
            XoaHoTroController dl= new XoaHoTroController(this.jlbMABN.getText(),Timestamp.valueOf(this.jlbTime.getText()));
            try {
                dl.Xoa_Hotro();
                    JFrame frame3 = new JFrame();
                    frame.setBounds(0,0,100,50);
                    JOptionPane.showMessageDialog(frame,
                    "Đã xác nhận thành công !");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HoTro_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HoTro_Form.class.getName()).log(Level.SEVERE, null, ex);
                JFrame frame3 = new JFrame();
                    frame.setBounds(0,0,100,50);
                    JOptionPane.showMessageDialog(frame,
                    "Có lỗi xảy ra!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChuyenHoTroFrame cht = new ChuyenHoTroFrame(Timestamp.valueOf(this.jlbTime.getText()) , this.jlbMABN.getText());
        cht.setVisible(true);
        cht.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbCMND;
    private javax.swing.JLabel jlbHoTen1;
    private javax.swing.JLabel jlbMABN;
    private javax.swing.JLabel jlbNoiDung;
    private javax.swing.JLabel jlbTime;
    // End of variables declaration//GEN-END:variables
}
