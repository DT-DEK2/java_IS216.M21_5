/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.dao.OracleConnection;
import java.util.ArrayList;
import javax.swing.JComboBox;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import javax.swing.JTextField;
import java.sql.Timestamp;
import javax.swing.JTextArea;
/**
 *
 * @author Minh Cuong
 */
public class GuiHoTroController {
    private ArrayList<String> TenCBYT= new ArrayList<>();
    private ArrayList<String> MANVYT=new ArrayList<>();
    private JComboBox<String> ChonNV;
    private String MABN;
    private JTextArea jtfYeucau;
   

    public GuiHoTroController(JComboBox ChonNV, String MABN, JTextArea Yeucau) {
        this.ChonNV = ChonNV;
        this.MABN = MABN;
        this.jtfYeucau = Yeucau;
        
    }
    

    public ArrayList<String> getTenCBYT() {
        return TenCBYT;
    }

    public ArrayList<String> getMANVYT() {
        return MANVYT;
    }
    
    @SuppressWarnings("unchecked")
    public void getData() throws ClassNotFoundException, SQLException{
        Connection cons = null;
        cons = OracleConnection.getOracleConnection();
        Statement stmt =null;
        String sql = "SELECT * FROM CANBOYTE";
        
        stmt=cons.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
         while (rs.next()) {
            
                this.TenCBYT.add(rs.getString("HoTen"));
                this.MANVYT.add(rs.getString("MaNV"));
         }
        rs.close();
         stmt.close();
         cons.close();
         for ( String data : TenCBYT){
             ChonNV.addItem(data);
         }
//         for ( int i = 0; i < TenCBYT.size();i++){
//             ChonNV.addItem(TenCBYT.get(i));
//         }
    }
       public int GuiHT() throws ClassNotFoundException, SQLException{
            Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        
        CallableStatement cStmt=null;
       

        cStmt = conn.prepareCall("{call INSERT_DUOCHOTRO(?,?,?,?)}");
            cStmt.setString(1, this.MABN);
             cStmt.setString(2, MANVYT.get(ChonNV.getSelectedIndex()));
              cStmt.setString(3,jtfYeucau.getText());
              long time = System.currentTimeMillis();
            Timestamp timestamp = new Timestamp(time);
                cStmt.setTimestamp(4,timestamp );
                
            int i=cStmt.executeUpdate();
            
             
        cStmt.close();
        conn.close();
            return i;
       }
    
}
