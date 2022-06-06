/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.ultility;

import com.da.qlf0.dao.OracleConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minh Cuong
 */
public class ChuyenHoTroTbMoDel {
     public DefaultTableModel setTableHoTro(String[] listColumn)throws ClassNotFoundException, SQLException {
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
         String sql="Select cb.MaNV, HoTen, Count(cb.MaNV) as so_ychotro from CANBOYTE cb, DuocHoTro ht WHERE cb.MaNV=ht.MaNV GROUP BY (cb.MaNV,HoTen)";
         
         Statement stmt=null;
         stmt = cons.createStatement();
         ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
           
            obj = new Object[columns];
            obj[0] = rs.getString("MaNV");
            obj[1] = rs.getString("HoTen");
            obj[2] = rs.getString("so_ychotro");
            
            dtm.addRow(obj);
        }
        return dtm;
    }
}
