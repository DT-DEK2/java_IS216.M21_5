/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;
import java.sql.CallableStatement;
import com.da.qlf0.dao.BenhNhanDAOImpl;
import com.da.qlf0.dao.OracleConnection;
import com.da.qlf0.view.ThongTinBN_Form;
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
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Minh Cuong
 */
public class TimKiemController {
     private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSoCMND_CCCD;
    private JTextField jtfHovaTen;
    private JTextField jtfMABN;
    private String ID;
    public TimKiemController(JPanel jpnView, JTextField jtfSoCMND_CCCD, JTextField jtfHovaTen, JTextField jtfMABN,String ID) {
        this.jpnView = jpnView;
        this.jtfSoCMND_CCCD = jtfSoCMND_CCCD;
        this.jtfHovaTen = jtfHovaTen;
        this.jtfMABN=jtfMABN;
        this.ID=ID;
    }
    
    
   
    public int setDataToPanel() throws ClassNotFoundException, SQLException{
        JPanel panel= new JPanel();
        int dem=0;
        int i=0;
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
         Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
           
//        String sql = "SELECT * FROM BENHNHAN WHERE (CMND_CCCD LIKE ? AND HOTEN LIKE ?) OR HOTEN LIKE ? OR CMND_CCCD LIKE ?  ";
        
       
            PreparedStatement ps = cons.prepareStatement("SELECT * FROM BENHNHAN WHERE (CMND_CCCD LIKE ? AND HOTEN LIKE ? AND MaBenhNhan LIKE ?) OR HOTEN LIKE ? OR CMND_CCCD LIKE ? OR MaBenhNhan LIKE ? ");
//            ps.setString(1, "%"+jtfSoCMND_CCCD.getText()+"%");
//            ps.setString(2, "%"+jtfHovaTen.getText()+"%");
//            ps.setString(3, "%"+jtfHovaTen.getText()+"%");
//            ps.setString(4, "%"+jtfSoCMND_CCCD.getText()+"%");
              ps.setString(1, jtfSoCMND_CCCD.getText());
            ps.setString(2, jtfHovaTen.getText());
            ps.setString(3, jtfMABN.getText());
            ps.setString(4, jtfHovaTen.getText());
            ps.setString(5, jtfSoCMND_CCCD.getText());
            ps.setString(6, jtfMABN.getText());            
            i=ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dem++;
                String Hovaten, Mabenhnhan, CMND, SDT , DiaChi;
                Mabenhnhan=rs.getString("MaBenhNhan");
                Hovaten=rs.getString("HoTen");
                CMND=rs.getString("CMND_CCCD");
                SDT=rs.getString("SoDienThoai");
                DiaChi=rs.getString("NoiOHienTai");
                JPanel tt= new ThongTinBN_Form(Hovaten,Mabenhnhan,CMND,SDT,DiaChi,this.ID);
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
    public int setDataToPanel_ChuyenNang() throws ClassNotFoundException, SQLException{
        JPanel panel= new JPanel();
        int dem=0;
        int i=0;
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
         Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
           
//        String sql = "SELECT * FROM BENHNHAN WHERE (CMND_CCCD LIKE ? AND HOTEN LIKE ?) OR HOTEN LIKE ? OR CMND_CCCD LIKE ?  ";
        
       
            PreparedStatement ps = cons.prepareStatement("SELECT * FROM BENHNHAN WHERE (CMND_CCCD LIKE ? AND HOTEN LIKE ? AND MaBenhNhan LIKE ?) OR HOTEN LIKE ? OR CMND_CCCD LIKE ? OR MaBenhNhan LIKE ? ");
//            ps.setString(1, "%"+jtfSoCMND_CCCD.getText()+"%");
//            ps.setString(2, "%"+jtfHovaTen.getText()+"%");
//            ps.setString(3, "%"+jtfHovaTen.getText()+"%");
//            ps.setString(4, "%"+jtfSoCMND_CCCD.getText()+"%");
              ps.setString(1, jtfSoCMND_CCCD.getText());
            ps.setString(2, jtfHovaTen.getText());
            ps.setString(3, jtfMABN.getText());
            ps.setString(4, jtfHovaTen.getText());
            ps.setString(5, jtfSoCMND_CCCD.getText());
            ps.setString(6, jtfMABN.getText());            
            i=ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                CallableStatement cs= cons.prepareCall("{?= call NguyCoChuyenBienNang (?) }");
                
                String Hovaten, Mabenhnhan, CMND, SDT , DiaChi;
                Mabenhnhan=rs.getString("MaBenhNhan");
                Hovaten=rs.getString("HoTen");
                CMND=rs.getString("CMND_CCCD");
                SDT=rs.getString("SoDienThoai");
                DiaChi=rs.getString("NoiOHienTai");
                cs.setString(2, Mabenhnhan);
                 cs.registerOutParameter(1, OracleTypes.NUMBER);
                 
                 cs.execute();
                  int result = cs.getInt(1);
                 if(result==1 || result==2){
                     dem++;
                     JPanel tt= new ThongTinBN_Form(Hovaten,Mabenhnhan,CMND,SDT,DiaChi,this.ID);
                     tt.setSize(1078, 191);
                     panel.add(tt);
                 }
                
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