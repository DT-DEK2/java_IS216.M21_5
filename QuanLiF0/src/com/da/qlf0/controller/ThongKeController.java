/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;
import com.da.qlf0.dao.OracleConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import oracle.jdbc.OracleTypes;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.IntervalXYDataset;
/**
 *
 * @author Minh Cuong
 */
public class ThongKeController {
    private JPanel panel;
    public ThongKeController() {
        
    }

    public ThongKeController(JPanel panel) {
        this.panel = panel;
    }
    
     public Integer Get_TongSoCaDangDieuTri()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDangDieuTri}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
     public Integer Get_TongSoCaDaTiepNhan()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
     public Integer Get_TongSoCaDaTiepNhan_TrongTuan()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan_TrongTuan}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaKTDieuTri()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaKTDieuTri}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaDieuTri_TheoTuoi_018()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDieuTri_TheoTuoi(?,?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setInt(2, 0);
        cStmt.setInt(3, 18);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaDieuTri_TheoTuoi_1945()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDieuTri_TheoTuoi(?,?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setInt(2, 19);
        cStmt.setInt(3, 45);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaDieuTri_TheoTuoi_4660()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDieuTri_TheoTuoi(?,?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setInt(2, 46);
        cStmt.setInt(3, 60);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaDieuTri_TheoTuoi_61100()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDieuTri_TheoTuoi(?,?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setInt(2, 61);
        cStmt.setInt(3, 100);
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Float Get_TiLeChuyenNang_DangDT()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TiLeChuyenNang_DangDT}");
        cStmt.registerOutParameter(1, OracleTypes.FLOAT);
      
         cStmt.execute();
         float x =cStmt.getFloat(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Float Get_TiLeChuyenVien_DaTN()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TiLeChuyenVien_DaTN}");
        cStmt.registerOutParameter(1, OracleTypes.FLOAT);
      
         cStmt.execute();
         float x =cStmt.getFloat(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Float Get_TiLeTuVong_DaTN()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TiLeTuVong_DaTN}");
        cStmt.registerOutParameter(1, OracleTypes.FLOAT);
      
         cStmt.execute();
         float x =cStmt.getFloat(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Float Get_TiLeHTCL_DaTN()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TiLeHTCL_DaTN}");
        cStmt.registerOutParameter(1, OracleTypes.FLOAT);
      
         cStmt.execute();
         float x =cStmt.getFloat(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Integer Get_TongSoCaDaTiepNhan_Thang_3()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan_Thang(?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setString(2, "March");
       
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
          public Integer Get_TongSoCaDaTiepNhan_Thang_4()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan_Thang(?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setString(2, "April");
       
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public Integer Get_TongSoCaDaTiepNhan_Thang_5()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan_Thang(?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setString(2, "May");
       
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
        public Integer Get_TongSoCaDaTiepNhan_Thang_6()throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
        
         cStmt = conn.prepareCall("{?=call TongSoCaDaTiepNhan_Thang(?)}");
        cStmt.registerOutParameter(1, OracleTypes.NUMBER);
        cStmt.setString(2, "June");
       
      
         cStmt.execute();
         int x =cStmt.getInt(1);
//        this.jtfMABN.setText(x);
        cStmt.close();
        conn.close();
        return x;
    }
       public void showPieChart(JPanel panel){
        JPanel panel1 = new JPanel();
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      
      
        try {  
            barDataset.setValue( "Hoàn thành cách ly" , this.Get_TiLeHTCL_DaTN());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {   
            barDataset.setValue( "Tử vong" , this.Get_TiLeTuVong_DaTN());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {    
            barDataset.setValue( "Chuyển viện" , this.Get_TiLeChuyenVien_DaTN());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Tình trạng kết thúc điều trị",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("Hoàn thành cách ly", new Color(255,255,102));
        piePlot.setSectionPaint("Tử vong", new Color(102,255,102));
       
        piePlot.setSectionPaint("Chuyển viện", new Color(0,204,204));
//      piePlot.setSimpleLabels(true);
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
//        this.panel.removeAll();
//        panel1.add(barChartPanel, BorderLayout.CENTER);
//        panel1.setPreferredSize(new Dimension(600, 400));
//        panel1.validate();
//        this.panel.add(panel1);
              panel.add(barChartPanel);
       panel.setPreferredSize(new Dimension(600, 400));
        panel.validate();
        
    }
       public void showBarChart(JPanel panel){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            dataset.setValue(this.Get_TongSoCaDieuTri_TheoTuoi_018(), "Số ca", "0-18");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDieuTri_TheoTuoi_1945(), "Số ca", "19-45");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDieuTri_TheoTuoi_4660(), "Số ca", "46-60");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDieuTri_TheoTuoi_61100(), "Số ca", ">60");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        JFreeChart chart = ChartFactory.createBarChart("Số ca đã tiếp nhận theo độ tuổi","Độ tuổi","Số ca", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(0,153,115);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
//       this.panel.removeAll();
//        this.panel.add(barpChartPanel, BorderLayout.CENTER);
//        this.panel.validate();
        panel.removeAll();
       panel.add(barpChartPanel, BorderLayout.CENTER);
        panel.validate();
        
        
    }
        public void showLineChart(JPanel panel){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            dataset.setValue(this.Get_TongSoCaDaTiepNhan_Thang_3(), "Số ca", "Tháng 3");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDaTiepNhan_Thang_4(), "Số ca", "Tháng 4");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDaTiepNhan_Thang_5(), "Số ca", "Tháng 5");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataset.setValue(this.Get_TongSoCaDaTiepNhan_Thang_6(), "Số ca", "Tháng 6");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Số ca tiếp nhận","Tháng","Số ca", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panel.removeAll();
        panel.add(lineChartPanel, BorderLayout.CENTER);
        panel.validate();
    }
}
