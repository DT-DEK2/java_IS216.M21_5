/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.bean.DanhMucBean;
import com.da.qlf0.view.HoTroPanel;
import com.da.qlf0.view.NghiepVuPanel;
import com.da.qlf0.view.QuanLiBnPanel;
import com.da.qlf0.view.ThongKePanel;
import com.da.qlf0.view.TrangChuPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author Minh Cuong
 */
public class ChuyenManHinhController {
        
        private String kindSelected = "";
        private JPanel jpnRoot;
        private ArrayList<DanhMucBean> listItem = null;
        private String ID;
    public ChuyenManHinhController(JPanel jpnRoot, String ID) {
        this.jpnRoot = jpnRoot;
        this.ID=ID;
    }
        
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
       jpnItem.setBackground(new Color(0, 134, 179));
       jlbItem.setBackground(new Color(0, 134, 179));
       JPanel node = new TrangChuPanel(ID);
       jpnRoot.removeAll();
       jpnRoot.setLayout(new BorderLayout());
       jpnRoot.add(new TrangChuPanel(ID));
       jpnRoot.validate();
       jpnRoot.repaint();
    }
    public void setEvent(ArrayList<DanhMucBean> listItem) {
     this.listItem = listItem;
     for (DanhMucBean item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
     }
}

class LabelEvent implements MouseListener {

      private JPanel node;
      private String kind;

      private JPanel jpnItem;
      private JLabel jlbItem;

      public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kind = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuPanel(ID);
                    break;
                case "QuanLiBN":
                    node = new QuanLiBnPanel(ID);
                    break;
                case "ThongKe":
                    node = new ThongKePanel();
                    break;
                case "HoTro":
                    node=new HoTroPanel(ID);
                    break;
                case "NghiepVu":
                    node=new NghiepVuPanel();
                    break;
                default:
                    break;
           }
           jpnRoot.removeAll();
           jpnRoot.setLayout(new BorderLayout());
           node.setSize(jpnRoot.getWidth(),jpnRoot.getHeight());
           jpnRoot.add(node,BorderLayout.CENTER);
           
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
    private void setChangeBackground( String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJlb().setBackground(new Color(0, 134, 179));
                item.getJpn().setBackground(new Color(0, 134, 179));
                        
            }else{
                item.getJlb().setBackground(new Color(0, 180, 153));
                item.getJpn().setBackground(new Color(0, 180, 153));
            }
        }
    }
}
