/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.da.qlf0.view;

import com.da.qlf0.controller.DangNhapController;
import com.da.qlf0.view.BenhNhan_Frame.BenhNhan_main;
import com.da.qlf0.view.MainFrame;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh Cuong
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
       
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng nhập");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_role = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtfCMND_CCCD = new javax.swing.JTextField();
        jtfMatKhau = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jbtnBenhNhan = new javax.swing.JRadioButton();
        jbtnCanBoYTe = new javax.swing.JRadioButton();
        btnDangNhap = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, 21));
        jLabel7.setText("Covid Management System");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/covid-19.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel8)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 153));

        jtfCMND_CCCD.setBackground(new java.awt.Color(102, 153, 153));
        jtfCMND_CCCD.setFont(jtfCMND_CCCD.getFont().deriveFont(jtfCMND_CCCD.getFont().getStyle() | java.awt.Font.BOLD));
        jtfCMND_CCCD.setText("Nhập số CMND/CCCD");
        jtfCMND_CCCD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfCMND_CCCD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfCMND_CCCD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCMND_CCCDFocusGained(evt);
            }
        });
        jtfCMND_CCCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfCMND_CCCDMousePressed(evt);
            }
        });
        jtfCMND_CCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCMND_CCCDActionPerformed(evt);
            }
        });

        jtfMatKhau.setBackground(new java.awt.Color(102, 153, 153));
        jtfMatKhau.setFont(jtfMatKhau.getFont());
        jtfMatKhau.setText("sssssssssssssssssss");
        jtfMatKhau.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfMatKhauFocusGained(evt);
            }
        });
        jtfMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatKhauActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel1.setText("Đăng nhập với:");

        btnG_role.add(jbtnBenhNhan);
        jbtnBenhNhan.setFont(jbtnBenhNhan.getFont().deriveFont(jbtnBenhNhan.getFont().getStyle() | java.awt.Font.BOLD));
        jbtnBenhNhan.setText("Bệnh nhân");
        jbtnBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBenhNhanActionPerformed(evt);
            }
        });

        btnG_role.add(jbtnCanBoYTe);
        jbtnCanBoYTe.setFont(jbtnCanBoYTe.getFont().deriveFont(jbtnCanBoYTe.getFont().getStyle() | java.awt.Font.BOLD));
        jbtnCanBoYTe.setText("Cán bộ y tế");
        jbtnCanBoYTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCanBoYTeActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(102, 153, 153));
        btnDangNhap.setFont(btnDangNhap.getFont().deriveFont(btnDangNhap.getFont().getStyle() | java.awt.Font.BOLD));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 153, 153));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD));
        jButton2.setText("Đăng kí");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel4.setText("Quên mật khẩu ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/logging.png"))); // NOI18N
        jLabel6.setText("LOGIN");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/user.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/padlock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jtfCMND_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbtnBenhNhan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCanBoYTe)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(153, 153, 153))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfCMND_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jtfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnBenhNhan)
                        .addComponent(jbtnCanBoYTe)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCMND_CCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCMND_CCCDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfCMND_CCCDActionPerformed

    private void jtfMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatKhauActionPerformed

    private void jbtnBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBenhNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBenhNhanActionPerformed

    @SuppressWarnings("deprecation")
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
                    // TODO add your handling code here:
           
           DangNhapController dn= new DangNhapController(jtfCMND_CCCD, jtfMatKhau);
           try {
                   
                           if (jtfCMND_CCCD.getText().length() == 0
                            || jtfMatKhau.getText().length() == 0) {
                        JFrame frame = new JFrame();
                            frame.setBounds(0,0,100,50);
                            JOptionPane.showMessageDialog(frame,
                            "Vui lòng nhập dữ liệu bắt buộc!");
                    }
                    else {
                        if(jbtnBenhNhan.isSelected()==true){
                            int i = dn.login("TAIKHOANBENHNHAN");
                            
                            if (i == 0) {
                            
                                JFrame frame = new JFrame();
                                frame.setBounds(0,0,100,50);
                                JOptionPane.showMessageDialog(frame,
                                "Tên đăng nhập và mật khẩu không đúng!");
                             } else {
                            
                                this.dispose();
                                    JFrame frame = new BenhNhan_main(dn.getTen(),dn.getMABN());
                                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                                    frame.setVisible(true);
                                     
                         }
                        }     
                        if(jbtnCanBoYTe.isSelected()==true){
                            int i2 = dn.login("TAIKHOANCANBOYTE");
                            if (i2 == 0) {
                            
                            JFrame frame = new JFrame();
                            frame.setBounds(0,0,100,50);
                            JOptionPane.showMessageDialog(frame,
                            "Tên đăng nhập và mật khẩu không đúng!");
                             } else {
                            
                                this.dispose();
                                
                                 
                                    JFrame frame = new MainFrame(dn.getTen(),dn.getMANV());
                                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                                    frame.setVisible(true);
                                 
                            }
                          }
                       
                      }
                   
                }catch(ClassNotFoundException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }catch (SQLException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            JFrame frame = new JFrame();
                            frame.setBounds(0,0,100,50);
                            JOptionPane.showMessageDialog(frame,
                            "Đăng nhập thất bại! Có lỗi xảy ra");
                    ex.printStackTrace();
                    }
 
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DangKyFrame dk = new  DangKyFrame();
        dk.setVisible(true);
        dk.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfCMND_CCCDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCMND_CCCDFocusGained
//            if(jtfCMND_CCCD.getText().equals("Nhập số CMND/CCCD"))
//                jtfCMND_CCCD.setText("");
    }//GEN-LAST:event_jtfCMND_CCCDFocusGained

    private void jtfMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfMatKhauFocusGained
        jtfMatKhau.setText("");
    }//GEN-LAST:event_jtfMatKhauFocusGained

    private void jbtnCanBoYTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCanBoYTeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCanBoYTeActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        QuenMK qmk = new QuenMK();
        qmk.setVisible(true);
        qmk.setLocationRelativeTo(null);
        qmk.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(0, 40, 102));
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(0, 40, 102));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setForeground(new Color(20, 20, 20));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jtfCMND_CCCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCMND_CCCDMousePressed
        // TODO add your handling code here:
        if(jtfCMND_CCCD.getText().equals("Nhập số CMND/CCCD"))
                jtfCMND_CCCD.setText("");
    }//GEN-LAST:event_jtfCMND_CCCDMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.ButtonGroup btnG_role;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jbtnBenhNhan;
    private javax.swing.JRadioButton jbtnCanBoYTe;
    private javax.swing.JTextField jtfCMND_CCCD;
    private javax.swing.JPasswordField jtfMatKhau;
    // End of variables declaration//GEN-END:variables
}
