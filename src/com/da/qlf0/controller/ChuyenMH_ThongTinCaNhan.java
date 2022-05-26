/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.bean.DanhMucCapNhatBN;
import com.da.qlf0.bean.DanhMucTTCaNhan;
import com.da.qlf0.view.BenhNhan_Frame.TTCaNhan_BenhNen;
import com.da.qlf0.view.BenhNhan_Frame.TTCaNhan_Vaccine;
import com.da.qlf0.view.BenhNhan_Frame.TTCaNhan_ttcb;
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
public class ChuyenMH_ThongTinCaNhan {

    private String kindSelected = "";
    private JPanel jpnRoot;

    private ArrayList<DanhMucTTCaNhan> listItem = null;

    public ChuyenMH_ThongTinCaNhan() {
    }

    public ChuyenMH_ThongTinCaNhan(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "ThongTinCoBan";
        jpnItem.setBackground(new Color(0, 134, 179));
        jlbItem.setBackground(new Color(0, 134, 179));
        JPanel node = new TTCaNhan_ttcb();
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(node);
        jpnRoot.validate();
        jpnRoot.repaint();
    }

    public void setEvent(ArrayList<DanhMucTTCaNhan> listItem) {
        this.listItem = listItem;
        for (DanhMucTTCaNhan item : listItem) {
            item.getJlb().addMouseListener(new ChuyenMH_ThongTinCaNhan.LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
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
                    node = new TTCaNhan_ttcb();
                    break;
                case "TiemVaccine":
                    node = new TTCaNhan_Vaccine();
                    break;
                case "BenhNen":
                    node = new TTCaNhan_BenhNen();
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
        for (DanhMucTTCaNhan item : listItem) {
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
