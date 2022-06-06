/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.ultility.ChuyenHoTroTbMoDel;
import com.da.qlf0.ultility.NVTableModel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
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
public class ChuyenHotroTable {
    
    private JPanel jpnView;
    
    private JTextField jtfSearch;

    private ChuyenHoTroTbMoDel classTableModel = null;

    private final String[] COLUMNS = {"Mã CBYT","Họ tên","Số yêu cầu hỗ trợ đang tiếp nhận"};

  

    private TableRowSorter<TableModel> rowSorter = null;

    public ChuyenHotroTable(JPanel jpnView,  JTextField jtfSearch) {
        this.jpnView = jpnView;
        
        this.jtfSearch = jtfSearch;

        this.classTableModel = new ChuyenHoTroTbMoDel();

       
    }

    public void setDataToTable(JTable table ) throws ClassNotFoundException, SQLException {
       
        DefaultTableModel model = classTableModel.setTableHoTro(COLUMNS);
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
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 250));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }
}
