/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import  java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Minh Cuong
 */
public class OracleConnection {
    public static Connection getOracleConnection() throws ClassNotFoundException{
        String hostName="localhost";
        String sid = "orcl";
        String userName="quanlybenhnhan";
        String passWord="12345678";
        String URL="jdbc:oracle:thin:@"+hostName+":1521:"+sid;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try{
             
                return DriverManager.getConnection(URL,userName,passWord);
        }catch (SQLException e){
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE,null,e);
            }
        }catch(ClassNotFoundException e){
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }   
    public static void main(String agrs[]) throws ClassNotFoundException{
        Connection conn = OracleConnection.getOracleConnection();
         if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        
    }
}
