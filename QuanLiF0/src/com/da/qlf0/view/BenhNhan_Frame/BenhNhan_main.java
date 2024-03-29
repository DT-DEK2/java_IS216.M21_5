/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.da.qlf0.view.BenhNhan_Frame;

import com.da.qlf0.view.*;
import com.da.qlf0.bean.DanhMucBeanBNhan;
import com.da.qlf0.controller.ChuyenManHinhBNController;
import com.da.qlf0.controller.ChuyenManHinhController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Minh Cuong
 */
public class BenhNhan_main extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    

    private String MABN;
    public BenhNhan_main(String ten,String MABN) {
        initComponents();
        
        setTitle("Quản lí F0 tại nhà");
         this.jlbTen.setText(ten);
        this.MABN=MABN;
        ChuyenManHinhBNController controller = new ChuyenManHinhBNController(jpnView,this.MABN);
        controller.setView(jpnTrangChu,jlbTrangChu);
        
        ArrayList<DanhMucBeanBNhan> listItem = new ArrayList<>();
        listItem.add(new DanhMucBeanBNhan("TrangChu",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBeanBNhan("TTCaNhan",jpnTTCaNhan,jlbTTCaNhan));
        listItem.add(new DanhMucBeanBNhan("KhaiBao",jpnKBBenhTinh,jlbKBBenhTinh));
        
        listItem.add(new DanhMucBeanBNhan("YCHoTro",jpnYCHoTro,jlbYCHoTro));
        
        controller.setEvent(listItem);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       
    }

    public String getMa() {
        return this.MABN;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnKBBenhTinh = new javax.swing.JPanel();
        jlbKBBenhTinh = new javax.swing.JLabel();
        jpnTTCaNhan = new javax.swing.JPanel();
        jlbTTCaNhan = new javax.swing.JLabel();
        jpnYCHoTro = new javax.swing.JPanel();
        jlbYCHoTro = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jpnTag = new javax.swing.JPanel();
        jlbExit = new javax.swing.JLabel();
        jlbTen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1560, 680));
        setSize(new java.awt.Dimension(1025, 838));

        jpnMenu.setBackground(new java.awt.Color(102, 200, 153));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/prevention.png"))); // NOI18N
        jLabel1.setText("Quản lí F0 tại nhà");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jpnKBBenhTinh.setBackground(new java.awt.Color(0, 180, 153));

        jlbKBBenhTinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbKBBenhTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/online-learning.png"))); // NOI18N
        jlbKBBenhTinh.setText("Khai báo bệnh tình");

        javax.swing.GroupLayout jpnKBBenhTinhLayout = new javax.swing.GroupLayout(jpnKBBenhTinh);
        jpnKBBenhTinh.setLayout(jpnKBBenhTinhLayout);
        jpnKBBenhTinhLayout.setHorizontalGroup(
            jpnKBBenhTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKBBenhTinhLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlbKBBenhTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnKBBenhTinhLayout.setVerticalGroup(
            jpnKBBenhTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKBBenhTinhLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlbKBBenhTinh)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jpnTTCaNhan.setBackground(new java.awt.Color(0, 180, 153));

        jlbTTCaNhan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTTCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/ebooks.png"))); // NOI18N
        jlbTTCaNhan.setText("Thông tin cá nhân");

        javax.swing.GroupLayout jpnTTCaNhanLayout = new javax.swing.GroupLayout(jpnTTCaNhan);
        jpnTTCaNhan.setLayout(jpnTTCaNhanLayout);
        jpnTTCaNhanLayout.setHorizontalGroup(
            jpnTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTTCaNhanLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlbTTCaNhan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTTCaNhanLayout.setVerticalGroup(
            jpnTTCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTTCaNhanLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlbTTCaNhan)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jpnYCHoTro.setBackground(new java.awt.Color(0, 180, 153));

        jlbYCHoTro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbYCHoTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/hotline.png"))); // NOI18N
        jlbYCHoTro.setText("Yêu cầu hỗ trợ");

        javax.swing.GroupLayout jpnYCHoTroLayout = new javax.swing.GroupLayout(jpnYCHoTro);
        jpnYCHoTro.setLayout(jpnYCHoTroLayout);
        jpnYCHoTroLayout.setHorizontalGroup(
            jpnYCHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnYCHoTroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlbYCHoTro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnYCHoTroLayout.setVerticalGroup(
            jpnYCHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnYCHoTroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlbYCHoTro)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("UIT-2022");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jpnTrangChu.setBackground(new java.awt.Color(0, 180, 153));

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/quarantine.png"))); // NOI18N
        jlbTrangChu.setText("Trang Chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jlbTrangChu)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnYCHoTro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTTCaNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnKBBenhTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpnTTCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jpnKBBenhTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jpnYCHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setPreferredSize(new java.awt.Dimension(748, 0));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnTag.setBackground(new java.awt.Color(0, 102, 102));
        jpnTag.setPreferredSize(new java.awt.Dimension(1024, 20));

        jlbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/exit.png"))); // NOI18N
        jlbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbExitMouseClicked(evt);
            }
        });

        jlbTen.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jlbTen.setForeground(new java.awt.Color(255, 255, 255));
        jlbTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/user_login32.png"))); // NOI18N
        jlbTen.setText("user_name");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/more (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTagLayout = new javax.swing.GroupLayout(jpnTag);
        jpnTag.setLayout(jpnTagLayout);
        jpnTagLayout.setHorizontalGroup(
            jpnTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(946, 946, 946)
                .addComponent(jlbExit)
                .addGap(36, 36, 36))
        );
        jpnTagLayout.setVerticalGroup(
            jpnTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(jpnTagLayout.createSequentialGroup()
                        .addGroup(jpnTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTag, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnTag, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseClicked
                // TODO add your handling code here:
                this.dispose();
                Login login = new Login();
                login.setVisible(true);
    }//GEN-LAST:event_jlbExitMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       CapNhatMKBN cn = new CapNhatMKBN(this.MABN);
       cn.setVisible(true);
       cn.setLocationRelativeTo(null);
       cn.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BenhNhan_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenhNhan_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenhNhan_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenhNhan_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new BenhNhan_main("Dat", "123");

               frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 

                frame.setVisible(true);
            }
            });

    }

    public JPanel getJpnView() {
        return jpnView;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlbExit;
    private javax.swing.JLabel jlbKBBenhTinh;
    private javax.swing.JLabel jlbTTCaNhan;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JLabel jlbYCHoTro;
    private javax.swing.JPanel jpnKBBenhTinh;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnTTCaNhan;
    private javax.swing.JPanel jpnTag;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnYCHoTro;
    // End of variables declaration//GEN-END:variables
}
