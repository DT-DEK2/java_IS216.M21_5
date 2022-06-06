/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

/**
 *
 * @author Minh Cuong
 */
import java.sql.CallableStatement;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import com.da.qlf0.dao.OracleConnection;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

public class XuatFileController {

    public void XuatFile() throws ClassNotFoundException, SQLException {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bệnh nhân");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH BỆNH NHÂN");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã bệnh nhân");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ và tên");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số CMND/CCCD");
		   cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Nơi ở hiện tại");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Tỉnh/Thành phố");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Quận/Huyện");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Phường/Xã");	
		   cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Nghề nghiệp");
            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue("Nơi làm việc");
            cell = row.createCell(11, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell = row.createCell(12, CellType.STRING);
            cell.setCellValue("Ngày tiếp nhận");
	        cell = row.createCell(13, CellType.STRING);
            cell.setCellValue("Ngày xuất hiện triệu chứng đầu tiên");
            cell = row.createCell(14, CellType.STRING);
            cell.setCellValue("Từng là F0");
            cell = row.createCell(15, CellType.STRING);
            cell.setCellValue("Số ngày là F0");
            cell = row.createCell(16, CellType.STRING);
            cell.setCellValue("Test nhanh");
            cell = row.createCell(17, CellType.STRING);
            cell.setCellValue("Ngày test nhanh");
            cell = row.createCell(18, CellType.STRING);
            cell.setCellValue("Kết quả test nhanh");
	        cell = row.createCell(19, CellType.STRING);
            cell.setCellValue("Test RT_PCR");
            cell = row.createCell(20, CellType.STRING);
            cell.setCellValue("Ngày test RT_PCT"); 
            cell = row.createCell(21, CellType.STRING);
            cell.setCellValue("Kết quả test RT_PCR");
            

         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM BENHNHAN ";
        ps=conn.prepareStatement(sql);
        
         
 
            ResultSet rs = ps.executeQuery();
			int i=0;
            while(rs.next()){
          
                
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(rs.getString("MaBenhNhan"));
			  row.createCell(1).setCellValue(rs.getString("HoTen"));
			  row.createCell(2).setCellValue(rs.getDate("NgaySinh").toString());
                            row.createCell(3).setCellValue(rs.getString("GioiTinh"));
			  row.createCell(4).setCellValue(rs.getString("CMND_CCCD"));
			  row.createCell(5).setCellValue(rs.getString("NoiOHienTai"));
			  row.createCell(6).setCellValue(rs.getString("Tinh_ThanhPho"));
			  row.createCell(7).setCellValue(rs.getString("Quan_Huyen"));
			  row.createCell(8).setCellValue(rs.getString("Phuong_Xa"));
			  row.createCell(9).setCellValue(rs.getString("NgheNghiep"));
			  row.createCell(10).setCellValue(rs.getString("NoiLamViec"));
			  row.createCell(11).setCellValue(rs.getString("SoDienThoai"));
			  row.createCell(12).setCellValue(rs.getDate("NgayTiepNhan").toString());
		          row.createCell(13).setCellValue(rs.getDate("NgayXuatHienTrieuChungDauTien").toString());
			  row.createCell(14).setCellValue(Integer.toString(rs.getInt("TungLaF0")));
                          if(rs.getInt("TungLaF0")==1){
                              row.createCell(15).setCellValue(rs.getString("SoNgayLaF0"));
                          }else{
                              row.createCell(15).setCellValue("null");
                          }
			  
			  row.createCell(16).setCellValue(Integer.toString(rs.getInt("TestNhanh")));
                          if(rs.getInt("TestNhanh")==1){
                               row.createCell(17).setCellValue(rs.getDate("NgayTestNhanh").toString());
                                row.createCell(18).setCellValue(rs.getString("KetQuaXetNghiem1"));
                          }else{
                               row.createCell(17).setCellValue("null");
                                row.createCell(18).setCellValue("null");
                          }
			 
 			  row.createCell(19).setCellValue(Integer.toString(rs.getInt("TestRT_PCR")));
                          if(rs.getInt("TestRT_PCR")==1){
                              row.createCell(20).setCellValue(rs.getDate("NgayTestRT_PCR").toString());
                               row.createCell(21).setCellValue(rs.getString("KetQuaXetNghiem2"));
                          }else{
                               row.createCell(20).setCellValue("null");
                                row.createCell(21).setCellValue("null");
                          }
			

			i++;
           }

            FileOutputStream out = new FileOutputStream(new File("D:/bn.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void XuatFile_chuyennang() throws ClassNotFoundException, SQLException {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bệnh nhân");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH BỆNH NHÂN CÓ NGUY CƠ CHUYỂN NẶNG");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã bệnh nhân");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ và tên");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số CMND/CCCD");
		   cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Nơi ở hiện tại");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Tỉnh/Thành phố");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Quận/Huyện");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Phường/Xã");	
		   cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Nghề nghiệp");
            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue("Nơi làm việc");
            cell = row.createCell(11, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell = row.createCell(12, CellType.STRING);
            cell.setCellValue("Ngày tiếp nhận");
	        cell = row.createCell(13, CellType.STRING);
            cell.setCellValue("Ngày xuất hiện triệu chứng đầu tiên");
            cell = row.createCell(14, CellType.STRING);
            cell.setCellValue("Từng là F0");
            cell = row.createCell(15, CellType.STRING);
            cell.setCellValue("Số ngày là F0");
            cell = row.createCell(16, CellType.STRING);
            cell.setCellValue("Test nhanh");
            cell = row.createCell(17, CellType.STRING);
            cell.setCellValue("Ngày test nhanh");
            cell = row.createCell(18, CellType.STRING);
            cell.setCellValue("Kết quả test nhanh");
	        cell = row.createCell(19, CellType.STRING);
            cell.setCellValue("Test RT_PCR");
            cell = row.createCell(20, CellType.STRING);
            cell.setCellValue("Ngày test RT_PCT"); 
            cell = row.createCell(21, CellType.STRING);
            cell.setCellValue("Kết quả test RT_PCR");
            

         Connection conn = null;
    
        conn = OracleConnection.getOracleConnection();
        PreparedStatement ps=null;
        String sql ="SELECT * FROM BENHNHAN ";
        ps=conn.prepareStatement(sql);
        
         
 
            ResultSet rs = ps.executeQuery();
			int i=0;
            while(rs.next()){
                    
                 CallableStatement cs= conn.prepareCall("{?= call NguyCoChuyenBienNang (?) }");
                  String Mabenhnhan=rs.getString("MaBenhNhan");
                  cs.registerOutParameter(1, OracleTypes.INTEGER);
                 cs.setString(2, Mabenhnhan);
                 cs.execute();
                  int result = cs.getInt(1);
                 if(result==1 || result==2){
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(rs.getString("MaBenhNhan"));
			  row.createCell(1).setCellValue(rs.getString("HoTen"));
			  row.createCell(2).setCellValue(rs.getDate("NgaySinh").toString());
                            row.createCell(3).setCellValue(rs.getString("GioiTinh"));
			  row.createCell(4).setCellValue(rs.getString("CMND_CCCD"));
			  row.createCell(5).setCellValue(rs.getString("NoiOHienTai"));
			  row.createCell(6).setCellValue(rs.getString("Tinh_ThanhPho"));
			  row.createCell(7).setCellValue(rs.getString("Quan_Huyen"));
			  row.createCell(8).setCellValue(rs.getString("Phuong_Xa"));
			  row.createCell(9).setCellValue(rs.getString("NgheNghiep"));
			  row.createCell(10).setCellValue(rs.getString("NoiLamViec"));
			  row.createCell(11).setCellValue(rs.getString("SoDienThoai"));
			  row.createCell(12).setCellValue(rs.getDate("NgayTiepNhan").toString());
		          row.createCell(13).setCellValue(rs.getDate("NgayXuatHienTrieuChungDauTien").toString());
			  row.createCell(14).setCellValue(Integer.toString(rs.getInt("TungLaF0")));
                          if(rs.getInt("TungLaF0")==1){
                              row.createCell(15).setCellValue(rs.getString("SoNgayLaF0"));
                          }else{
                              row.createCell(15).setCellValue("null");
                          }
			  
			  row.createCell(16).setCellValue(Integer.toString(rs.getInt("TestNhanh")));
                          if(rs.getInt("TestNhanh")==1){
                               row.createCell(17).setCellValue(rs.getDate("NgayTestNhanh").toString());
                                row.createCell(18).setCellValue(rs.getString("KetQuaXetNghiem1"));
                          }else{
                               row.createCell(17).setCellValue("null");
                                row.createCell(18).setCellValue("null");
                          }
			 
 			  row.createCell(19).setCellValue(Integer.toString(rs.getInt("TestRT_PCR")));
                          if(rs.getInt("TestRT_PCR")==1){
                              row.createCell(20).setCellValue(rs.getDate("NgayTestRT_PCR").toString());
                               row.createCell(21).setCellValue(rs.getString("KetQuaXetNghiem2"));
                          }else{
                               row.createCell(20).setCellValue("null");
                                row.createCell(21).setCellValue("null");
                          }
			

			i++;
           }
       }

            FileOutputStream out = new FileOutputStream(new File("D:/bn_cn.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
