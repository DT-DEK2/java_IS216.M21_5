/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.da.qlf0.view;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.OFF_SCREEN;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author Minh Cuong
 */
public class TrangChuPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuPanel
     */
    private String MANV;
    public TrangChuPanel(String MANV) {
        initComponents();
        this.MANV=MANV;
//        Engine engine = Engine.newInstance(
//        EngineOptions.newBuilder(OFF_SCREEN)
//                .licenseKey("1BNDHFSC1G2RCPD2ZQ4965WAVKIVGHARPEK9A66RH4RE5PMXKNREX1N5U2YNXVRJR6KSC2")
//                .build());
//         Browser browser = engine.newBrowser();
//        SwingUtilities.invokeLater(()->{
//            BrowserView view = BrowserView.newInstance(browser);
//            
//            this.add(view,BorderLayout.CENTER);
//            this.setVisible(true);
//           
//            browser.navigation().loadUrl("https://zingnews.vn/");
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jButton1)
                .addContainerGap(583, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton1)
                .addContainerGap(500, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Engine engine = Engine.newInstance(
        EngineOptions.newBuilder(OFF_SCREEN)
                .licenseKey("1BNDHFSC1G2RCPD2ZQ4965WAVKIVGHARPEK9A66RH4RE5PMXKNREX1N5U2YNXVRJR6KSC2")
                .build());
         Browser browser = engine.newBrowser();
        SwingUtilities.invokeLater(()->{
            BrowserView view = BrowserView.newInstance(browser);
            JFrame frame = new JFrame("Java swing web browser");
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.add(view,BorderLayout.CENTER);
            frame.setSize(1280,900);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            browser.navigation().loadUrl("https://zingnews.vn/");
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
