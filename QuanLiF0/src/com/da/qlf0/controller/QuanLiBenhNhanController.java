/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.model.BenhNhan;
import com.da.qlf0.service.BenhNhanService;
import com.da.qlf0.service.BenhNhanServiceImpl;
import com.da.qlf0.ultility.BNTableModel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
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

/**
 *
 * @author Minh Cuong
 */
public class QuanLiBenhNhanController {
     private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private BNTableModel classTableModel = null;

    private final String[] COLUMNS = {"Mã bệnh nhân", "Họ và tên", "Ngày Sinh", "Giới tính",
        "Số CMND/CCCD", "Nơi ở hiện tại", "Tỉnh/Thành Phố", "Quận/Huyện","Phường/Xã","Nghề nghiệp","Nơi Làm việc","Số điện thoại","Ngày tiếp nhận","Ngày XHTC đầu tiên","Từng là F0","Số ngày là F0","Test nhanh","Ngày test nhanh","KQXN","Test RT_PCR","Ngày test RT_PCR","KQXN_RT_PCR"};

    private BenhNhanService benhNhanService = null;

    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLiBenhNhanController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;

        this.classTableModel = new BNTableModel();

        this.benhNhanService = new BenhNhanServiceImpl();
    }

    public void setDataToTable() {
        ArrayList<BenhNhan> listItem = benhNhanService.getList();
        DefaultTableModel model = classTableModel.setTableBenhNhan(listItem, COLUMNS);
        JTable table = new JTable();
        table.setModel(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        // design
        
        

        
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
//        table.getTableHeader().setPreferredSize(new Dimension(500, 50));
        table.setPreferredScrollableViewportSize(new Dimension(500,70));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        table.setFillsViewportHeight(true);
        table.setRowHeight(50);
        table.setLayout( new BorderLayout());
        table.validate();
        table.repaint();
        
        JScrollPane scroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1300, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        
        jpnView.add(scroll);
        jpnView.setSize(table.getWidth(),table.getHeight());

        jpnView.validate();
        jpnView.repaint();
        
    }

}
