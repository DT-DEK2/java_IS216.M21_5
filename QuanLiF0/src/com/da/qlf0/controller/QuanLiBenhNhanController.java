/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;
import java.sql.CallableStatement;
import com.da.qlf0.dao.BenhNhanDAOImpl;
import com.da.qlf0.dao.OracleConnection;
import com.da.qlf0.model.BenhNhan;
import com.da.qlf0.service.BenhNhanService;
import com.da.qlf0.service.BenhNhanServiceImpl;
import com.da.qlf0.ultility.NVTableModel;
import com.da.qlf0.view.HoTro_Form;
import com.da.qlf0.view.ThongTinBN_Form;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.lang.ProcessBuilder.Redirect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import oracle.jdbc.OracleTypes;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Minh Cuong
 */
public class QuanLiBenhNhanController {
     private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    private String ID;
//    private BNTableModel classTableModel = null;
//
//    private final String[] COLUMNS = {"Mã bệnh nhân", "Họ và tên", "Ngày Sinh", "Giới tính",
//        "Số CMND/CCCD", "Nơi ở hiện tại", "Tỉnh/Thành Phố", "Quận/Huyện","Phường/Xã","Nghề nghiệp","Nơi Làm việc","Số điện thoại","Ngày tiếp nhận","Ngày XHTC đầu tiên","Từng là F0","Số ngày là F0","Test nhanh","Ngày test nhanh","KQXN","Test RT_PCR","Ngày test RT_PCR","KQXN_RT_PCR"};
//
//    private BenhNhanService benhNhanService = null;
//
//    private TableRowSorter<TableModel> rowSorter = null;

//    public QuanLiBenhNhanController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
//        this.jpnView = jpnView;
//        this.btnAdd = btnAdd;
//        this.jtfSearch = jtfSearch;
//
//        this.classTableModel = new BNTableModel();
//
//        this.benhNhanService = new BenhNhanServiceImpl();
//    }
    public QuanLiBenhNhanController(JPanel jpnView){
        this.jpnView= jpnView;
    }
    public QuanLiBenhNhanController(JPanel jpnView,String ID){
        this.jpnView= jpnView;
        this.ID= ID;
    }

    public String getID() {
        return ID;
    }
    
    public void setDataToPanel(){
        JPanel panel= new JPanel();
        int dem=0;
//        panel.setLayout(new GridLayout(100,1));
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollp.setBounds(0, 0, jpnView.getWidth(), jpnView.getHeight());
//        scrollp.setPreferredSize(new Dimension(1078, 191));
//        panel.setBounds(0, 0, jpnView.getWidth(), jpnView.getWidth());
//        panel.setSize(1078,jpnView.getHeight());
         Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
        String sql = "SELECT * FROM BENHNHAN order by MaBenhNhan";
        
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        panel.setLayout(new GridLayout(dem,1));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        
        jpnView.add(scrollp);
//        jpnView.setSize(1061, 680);

        jpnView.validate();
        jpnView.repaint();
//        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
////            @Override
////            public void insertUpdate(DocumentEvent e) {
////                String text = jtfSearch.getText();
////                if (text.trim().length() == 0) {
////                    rowSorter.setRowFilter(null);
////                } else {
////                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
////                }
////            }
////
////            @Override
////            public void removeUpdate(DocumentEvent e) {
////                String text = jtfSearch.getText();
////                if (text.trim().length() == 0) {
////                    rowSorter.setRowFilter(null);
////                } else {
////                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
////                }
////            }
////
////            @Override
////            public void changedUpdate(DocumentEvent e) {
////            }
////        });
    }
    public String getTenBN(String MABN) throws SQLException{
         Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
        String sql = "SELECT * FROM BENHNHAN where MaBenhNhan like ? ";
         String ma = null;
         PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
        try {
            
            ps.setString(1, MABN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    
                    ma=rs.getString("HoTen");
           
                }
        }catch (Exception e) {
            e.printStackTrace();
        }
             ps.close();
            cons.close();
        return ma;
    }
    public String getCMND(String MABN) throws SQLException{
         Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
        String sql = "SELECT * FROM BENHNHAN where MaBenhNhan like ? ";
         String cmnd = null;
          PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
        try {
            
            ps.setString(1, MABN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    
                    cmnd=rs.getString("CMND_CCCD");
            
                }
        }catch (Exception e) {
            e.printStackTrace();
        }
        ps.close();
            cons.close();
        
        return cmnd;
    }
    public void setDataHotro(){
        
        JPanel panel= new JPanel();
        int dem=0;
//        panel.setLayout(new GridLayout(100,1));
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollp.setBounds(0, 0, jpnView.getWidth(), jpnView.getHeight());
//        scrollp.setPreferredSize(new Dimension(1078, 191));
//        panel.setBounds(0, 0, jpnView.getWidth(), jpnView.getWidth());
//        panel.setSize(1078,jpnView.getHeight());
         Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
               cons.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
            catch (SQLException ex) {
                         Logger.getLogger(QuanLiBenhNhanController.class.getName()).log(Level.SEVERE, null, ex);
                     }
           
        String sql = "SELECT * FROM DuocHoTro where MaNV = ? ";
        
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, this.getID());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
               CallableStatement cs= cons.prepareCall("{?= call NguyCoChuyenBienNang (?) }");
                
                String Hovaten, Mabenhnhan,CMND, NoiDung;
                Timestamp time;
                Mabenhnhan=rs.getString("MaBenhNhan");
                NoiDung=rs.getString("YeuCau");
                time=rs.getTimestamp("ThoiDiemYeuCau");
                Hovaten=this.getTenBN(Mabenhnhan);
                CMND=this.getCMND(Mabenhnhan);
                 cs.setString(2, Mabenhnhan);
                 cs.registerOutParameter(1, OracleTypes.INTEGER);
                 int rs2 = cs.executeUpdate();
                  int result = cs.getInt(1);
                 if(result==1 || result==2){
                     dem++;
                     String cn = "Có";
                     JPanel tt= new HoTro_Form(Hovaten,Mabenhnhan,CMND,NoiDung,cn,time); 
                     tt.setSize(1078, 191);
                     panel.add(tt);
                 }else{
                     dem++;
                     String cn = "Không";
                     JPanel tt= new HoTro_Form(Hovaten,Mabenhnhan,CMND,NoiDung,cn,time); 
                     tt.setSize(1078, 191);
                     panel.add(tt);
                 }
            }
//            TimeUnit.SECONDS.sleep(5);
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        panel.setLayout(new GridLayout(dem,1));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        
        jpnView.add(scrollp);
//        jpnView.setSize(1061, 680);

        jpnView.validate();
        jpnView.repaint();

    }
    public void setDataChuyenNang() throws SQLException{
        
        JPanel panel= new JPanel();
        int dem=0;
//        panel.setLayout(new GridLayout(100,1));
        JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollp.setBounds(0, 0, jpnView.getWidth(), jpnView.getHeight());
//        scrollp.setPreferredSize(new Dimension(1078, 191));
//        panel.setBounds(0, 0, jpnView.getWidth(), jpnView.getWidth());
//        panel.setSize(1078,jpnView.getHeight());
         Connection cons = null;
           try {
               cons = OracleConnection.getOracleConnection();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(BenhNhanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
           }
           
         
        String sql = "SELECT * FROM BENHNHAN order by MaBenhNhan";
         PreparedStatement ps = cons.prepareStatement(sql);
         CallableStatement cs= cons.prepareCall("{?= call NguyCoChuyenBienNang (?) }");
        try {
           
            
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                
                
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        ps.close();
        cs.close();
            cons.close();
        panel.setLayout(new GridLayout(dem,1));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        
        jpnView.add(scrollp);
//        jpnView.setSize(1061, 680);

        jpnView.validate();
        jpnView.repaint();

    }
//    public void setDataToTable() {
//        ArrayList<BenhNhan> listItem = benhNhanService.getList();
//        DefaultTableModel model = classTableModel.setTableBenhNhan(listItem, COLUMNS);
//        JTable table = new JTable();
//        table.setModel(model);
//
//        rowSorter = new TableRowSorter<>(table.getModel());
//        table.setRowSorter(rowSorter);
//
//        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                String text = jtfSearch.getText();
//                if (text.trim().length() == 0) {
//                    rowSorter.setRowFilter(null);
//                } else {
//                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
//                }
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//                String text = jtfSearch.getText();
//                if (text.trim().length() == 0) {
//                    rowSorter.setRowFilter(null);
//                } else {
//                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
//                }
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//            }
//        });
//
//        // design
//        
//        
//
//        
//        
//        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
////        table.getTableHeader().setPreferredSize(new Dimension(500, 50));
//        table.setPreferredScrollableViewportSize(new Dimension(500,70));
//        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        
//        table.setFillsViewportHeight(true);
//        table.setRowHeight(50);
//        table.setLayout( new BorderLayout());
//        table.validate();
//        table.repaint();
//        
//        JScrollPane scroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scroll.getViewport().add(table);
//        scroll.setPreferredSize(new Dimension(1300, 400));
//           jpnView.removeAll();
//        jpnView.setLayout(new BorderLayout());
//        
//        jpnView.add(scroll);
//        jpnView.setSize(table.getWidth(),table.getHeight());
//
//        jpnView.validate();
//        jpnView.repaint();
        
   }


