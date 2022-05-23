/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.bean.DanhMucCapNhatBN;
import com.da.qlf0.view.CapNhat.BenhNen_CapNhat;
import com.da.qlf0.view.CapNhat.QTDieuTri_CapNhat;
import com.da.qlf0.view.CapNhat.TTCoBan_CapNhat;
import com.da.qlf0.view.CapNhat.TiemVX_CapNhat;
import com.da.qlf0.view.CapNhat.TinhTrangTT_CapNhat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NDAT_UIT
 */
public class ChuyenMH_CapNhat {

    private String kindSelected = "";
    private JPanel jpnRoot;
    private ArrayList<DanhMucCapNhatBN> listItem = null;

    public ChuyenMH_CapNhat(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "ThongTinCoBan";
        jpnItem.setBackground(new Color(0, 134, 179));
        jlbItem.setBackground(new Color(0, 134, 179));
        JPanel node = new TTCoBan_CapNhat();
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(node);
        jpnRoot.validate();
        jpnRoot.repaint();
    }

    public void setEvent(ArrayList<DanhMucCapNhatBN> listItem) {
        this.listItem = listItem;
        for (DanhMucCapNhatBN item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private final String kind;

        private final JPanel jpnItem;
        private final JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "ThongTinCoBan":
                    node = new TTCoBan_CapNhat();
                    break;
                case "TiemVX":
                    node = new TiemVX_CapNhat();
                    break;
                case "BenhNen":
                    node = new BenhNen_CapNhat();
                    break;
                case "TinhTrang":
                    node = new TinhTrangTT_CapNhat();
                    break;
                case "QuaTrinhDieuTri":
                    node = new QTDieuTri_CapNhat();
                    break;
                default:
                    break;
            }
            jpnRoot.removeAll();
            jpnRoot.setLayout(new BorderLayout());
            node.setSize(jpnRoot.getWidth(), jpnRoot.getHeight());
            jpnRoot.add(node);

            jpnRoot.validate();
            jpnRoot.repaint();
            setChangeBackground(kind);

        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(0, 134, 179));
            jlbItem.setBackground(new Color(0, 134, 179));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(0, 134, 179));
            jlbItem.setBackground(new Color(0, 134, 179));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(0, 180, 153));
                jlbItem.setBackground(new Color(0, 180, 153));
            }
        }

    }

    private void setChangeBackground(String kind) {
        for (DanhMucCapNhatBN item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJlb().setBackground(new Color(0, 134, 179));
                item.getJpn().setBackground(new Color(0, 134, 179));

            } else {
                item.getJlb().setBackground(new Color(0, 180, 153));
                item.getJpn().setBackground(new Color(0, 180, 153));
            }
        }
    }
}
