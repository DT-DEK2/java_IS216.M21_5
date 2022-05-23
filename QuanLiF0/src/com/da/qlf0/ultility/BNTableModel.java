/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.ultility;
import com.da.qlf0.model.BenhNhan;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author Minh Cuong
 */
public class BNTableModel {
    public DefaultTableModel setTableBenhNhan(ArrayList<BenhNhan> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        BenhNhan benhNhan = null;
        for (int i = 0; i < num; i++) {
            benhNhan = listItem.get(i);
            obj = new Object[columns];
            obj[0] = benhNhan.getMaBenhNhan();
            obj[1] = benhNhan.getHoten();
            obj[2] = benhNhan.getNgaySinh();
            obj[3] = benhNhan.getGioiTinh();
            obj[4] = benhNhan.getCMND_CCCD();
            obj[5] = benhNhan.getNoiOHienTai();
            obj[6] = benhNhan.getTinh_ThanhPho();
            obj[7] = benhNhan.getQuan_Huyen();
            obj[8] = benhNhan.getPhuong_Xa();
            obj[9] = benhNhan.getNgheNghiep();
            obj[10] = benhNhan.getNoiLamViec();
            obj[11] = benhNhan.getSoDienThoai();
            obj[12] = benhNhan.getNgayTiepNhan();
            obj[13] = benhNhan.getNgayXHTCDauTien();
            obj[14] = benhNhan.getTunglaF0(); //== 1 ? "Đã từng" : "Chưa";
            obj[15] = benhNhan.getSoNgayLaF0();
            obj[16] = benhNhan.getTestNhanh();//==1?"Đã Test":"Chưa";
            obj[17] = benhNhan.getNgayTestNhanh();
            obj[18] = benhNhan.getKQXN_TestNhanh();
            obj[19] = benhNhan.getTestRT_PCR();//==1?"Đã Test":"Chưa";
            obj[20] = benhNhan.getNgayTestRT_PCR();
            obj[21] = benhNhan.getKQXN_RT_PCR();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
