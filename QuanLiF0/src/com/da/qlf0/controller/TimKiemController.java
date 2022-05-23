/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.BenhNhanDAOImpl;
import com.da.qlf0.dao.OracleConnection;
import com.da.qlf0.ultility.ThongTinBN_Form;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Minh Cuong
 */
public class TimKiemController {
     private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSoCMND_CCCD;
    private JTextField jtfHovaTen;

    public TimKiemController(JPanel jpnView, JTextField jtfSoCMND_CCCD, JTextField jtfHovaTen) {
        this.jpnView = jpnView;
        this.jtfSoCMND_CCCD = jtfSoCMND_CCCD;
        this.jtfHovaTen = jtfHovaTen;
    }
    
    
   
    public int setDataToPanel() throws ClassNotFoundException, SQLException{
        JPanel panel= new JPanel();
        int dem=0;
        int i=0;
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
         Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
           
        String sql = "SELECT * FROM BENHNHAN WHERE (CMND_CCCD LIKE ? AND HOTEN LIKE ?) OR HOTEN LIKE ? OR CMND_CCCD LIKE ?  ";
        
       
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, jtfSoCMND_CCCD.getText());
            ps.setString(2, jtfHovaTen.getText());
            ps.setString(3, jtfHovaTen.getText());
            ps.setString(4, jtfSoCMND_CCCD.getText());
            
            i=ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dem++;
                String Hovaten, Mabenhnhan;
                Mabenhnhan=rs.getString("MaBenhNhan");
                Hovaten=rs.getString("HoTen");
                JPanel tt= new ThongTinBN_Form(Hovaten,Mabenhnhan);
                tt.setSize(1078, 191);
                panel.add(tt);
            }
            ps.close();
            cons.close();
     
        panel.setLayout(new GridLayout(dem,1));
        
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        
        jpnView.add(scrollp);
//        jpnView.setSize(1061, 680);

        jpnView.validate();
        jpnView.repaint();
        return i;
    }
}