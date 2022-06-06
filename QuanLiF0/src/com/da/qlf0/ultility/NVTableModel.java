/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.ultility;
import com.da.qlf0.dao.OracleConnection;
import com.da.qlf0.model.BenhNhan;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Minh Cuong
 */
public class NVTableModel {
    public DefaultTableModel setTableNhanVien(String[] listColumn)throws ClassNotFoundException, SQLException {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj; 
        Connection cons = null;
    
         cons = OracleConnection.getOracleConnection();
         String sql="Select * from CANBOYTE";
         Statement stmt=null;
         stmt = cons.createStatement();
         ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
           
            obj = new Object[columns];
            obj[0] = rs.getString("MaNV");
            obj[1] = rs.getString("HoTen");
            obj[2] = rs.getString("GioiTinh");
            obj[3] = rs.getString("CMND_CCCD");
            obj[4] = rs.getDate("NgaySinh");
            obj[5] = rs.getString("SDT");
            obj[6] = rs.getString("Email");
            obj[7] = rs.getString("DonViCongTac");
            obj[8] = rs.getString("Tinh_ThanhPho");
            obj[9] = rs.getString("Quan_Huyen");
            obj[10] = rs.getString("Phuong_Xa");
            dtm.addRow(obj);
        }
        return dtm;
    }
}
