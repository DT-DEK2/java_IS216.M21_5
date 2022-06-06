/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import com.da.qlf0.view.KQDieuTri;
import java.sql.Connection;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Minh Cuong
 */
public class PrintBenhAnController {
    private String MABN;

    public PrintBenhAnController(String MABN) {
        this.MABN = MABN;
    }
    public void InBenhAn(){
         try{
           Hashtable map= new Hashtable();
           Connection conn = null;
    
            conn = OracleConnection.getOracleConnection();
           
               
            JasperReport report= JasperCompileManager.compileReport("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\view\\benhan.jrxml");
          
             map.put("MABENHNHAN", this.MABN);
             JasperPrint p =JasperFillManager.fillReport(report, map,conn);
             
             
             JasperViewer.viewReport(p);
//             JasperExportManager.exportReportToPdfFile(p,"C:\\Users\\Minh Cuong\\PDF-file");
             
              JFrame frame2 = new JFrame();
                        frame2.setBounds(0,0,100,50);
                        JOptionPane.showMessageDialog(frame2,
                        "In file thành công");
           
       }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
