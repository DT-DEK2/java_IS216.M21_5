/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.da.qlf0.view;

import com.da.qlf0.controller.QuanLiTaiKhoanBnControlller;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh Cuong
 */
public class CapNhatMKBN extends javax.swing.JFrame {

    /**
     * Creates new form QuenMK
     */
    private String MABN;
    public CapNhatMKBN(String MABN) {
        initComponents();
        setTitle("Cập nhật thông tin tài khoản");
        this.MABN=MABN;
        Myinnit2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCMND = new javax.swing.JTextField();
        jtfXnMk = new javax.swing.JPasswordField();
        jtfmkMoi = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfMatKhau = new javax.swing.JPasswordField();
        jtgXem = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 40, 102));
        jLabel1.setText("Thông tin tài khoản");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 20, 20));
        jLabel2.setText("Số CMND/CCCD");

        jtfCMND.setBackground(new java.awt.Color(255, 255, 255));
        jtfCMND.setForeground(new java.awt.Color(20, 20, 20));
        jtfCMND.setEnabled(false);

        jtfXnMk.setBackground(new java.awt.Color(255, 255, 255));
        jtfXnMk.setForeground(new java.awt.Color(20, 20, 20));

        jtfmkMoi.setBackground(new java.awt.Color(255, 255, 255));
        jtfmkMoi.setForeground(new java.awt.Color(20, 20, 20));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/da/qlf0/images/floppy-disk.png"))); // NOI18N
        jButton1.setText("Cập nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Mật khẩu:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 20, 20));
        jLabel4.setText("Xác nhận lại mật khẩu:");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 20, 20));
        jLabel5.setText("Mật khẩu mới:");

        jtfMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        jtfMatKhau.setForeground(new java.awt.Color(20, 20, 20));
        jtfMatKhau.setText("jPasswordField2");
        jtfMatKhau.setEnabled(false);

        jtgXem.setBackground(new java.awt.Color(102, 102, 102));
        jtgXem.setText("Xem");
        jtgXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfCMND)
                    .addComponent(jtfXnMk, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jtfmkMoi)
                    .addComponent(jtfMatKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtgXem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtgXem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfmkMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfXnMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtgXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgXemActionPerformed
        // TODO add your handling code here:
        Myinnit();
    }//GEN-LAST:event_jtgXemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = "Có";
        options[1] = "Không";
        int dialogButton = JOptionPane.YES_NO_OPTION;
        var dialogResult = JOptionPane.showOptionDialog(frame.getContentPane(), "Bạn xác nhận đổi mật khẩu", "Đổi mật khẩu", 0, JOptionPane.INFORMATION_MESSAGE, null, options, dialogButton);
        if(dialogResult == 0) {
        
         QuanLiTaiKhoanBnControlller bn = new QuanLiTaiKhoanBnControlller(MABN, jtfCMND, jtfmkMoi, jtfMatKhau);
         if(jtfmkMoi.getText().length()==0
            || jtfXnMk.getText().length()==0
            

               ){
              JFrame frame2 = new JFrame();
                    frame2.setBounds(0,0,100,50);
                    JOptionPane.showMessageDialog(frame,
                    "Vui lòng nhập dữ liệu bắt buộc!");
                   
                }
         else if(jtfmkMoi.getText().equals(jtfXnMk.getText())==false){
             
              JFrame frame3 = new JFrame();
                    frame3.setBounds(0,0,100,50);
                    JOptionPane.showMessageDialog(frame,
                    "Xác nhận mật khẩu không trùng khớp! Vui lòng nhập lại");
         }else{
             try {
                 bn.update_mk();
				
		JFrame frame4 = new JFrame();
                    frame4.setBounds(0,0,100,50);
                    JOptionPane.showMessageDialog(frame,
                    "Cập nhật mật khẩu thành công!");
		
                   
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(DangKyFrame.class.getName()).log(Level.SEVERE, null, ex);
                 JFrame frame5 = new JFrame();
                        frame5.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Cập nhật thất bại\n" +
                         ex.getMessage());
                	
             } catch (SQLException ex) {
                 Logger.getLogger(DangKyFrame.class.getName()).log(Level.SEVERE, null, ex);
                 
                  JFrame frame6 = new JFrame();
                        frame6.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame,
                        "Cập nhật thất bại\n" +
                         ex.getSQLState()+"\n"+
                         ex.getMessage());
             }
         }
        
        
        
        }
        
        
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
            java.util.logging.Logger.getLogger(CapNhatMKBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatMKBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatMKBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatMKBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CapNhatMKBN().setVisible(true);
            }
        });
    }
    public void  Myinnit(){
                if(jtgXem.isSelected()){
                 jtfMatKhau.setEchoChar((char)0); //By this line of code. We will actually see the actual characters
                 jtgXem.setText("Ẩn");
             }else{
                 jtfMatKhau.setEchoChar('*');
                 jtgXem.setText("Xem");
             }
    }
    public void Myinnit2(){
        QuanLiTaiKhoanBnControlller bn = new QuanLiTaiKhoanBnControlller(MABN, jtfCMND, jtfmkMoi, jtfMatKhau);
        try {
            bn.setData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CapNhatMKBN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CapNhatMKBN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCMND;
    private javax.swing.JPasswordField jtfMatKhau;
    private javax.swing.JPasswordField jtfXnMk;
    private javax.swing.JPasswordField jtfmkMoi;
    private javax.swing.JToggleButton jtgXem;
    // End of variables declaration//GEN-END:variables
}
