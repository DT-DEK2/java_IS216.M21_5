/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.bean.DanhMucBean;
import com.da.qlf0.bean.DanhMucBeanBNhan;
import com.da.qlf0.view.BenhNhan_Frame.KhaiBao;
import com.da.qlf0.view.BenhNhan_Frame.TTCaNhan;
import com.da.qlf0.view.BenhNhan_Frame.TrangChu_BN;
import com.da.qlf0.view.BenhNhan_Frame.YCHoTro;
import com.da.qlf0.view.HoTroPanel;
import com.da.qlf0.view.QuanLiBnPanel;
import com.da.qlf0.view.ThongKePanel;
import com.da.qlf0.view.TrangChuPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
/**
 *
 * @author Minh Cuong
 */
public class ChuyenManHinhBNController {
        
        private String kindSelected = "";
        private JPanel jpnRoot;
        private ArrayList<DanhMucBeanBNhan> listItem = null;
        private String MABN;
    public ChuyenManHinhBNController(JPanel jpnRoot,String MABN) {
        this.jpnRoot = jpnRoot;
        this.MABN=MABN;
    }
        
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TTCaNhan";
       jpnItem.setBackground(new Color(0, 134, 179));
       jlbItem.setBackground(new Color(0, 134, 179));
       JPanel node = new TrangChu_BN(MABN);
       jpnRoot.removeAll();
       jpnRoot.setLayout(new BorderLayout());
       jpnRoot.add(node);
       jpnRoot.validate();
       jpnRoot.repaint();
    }
    public void setEvent(ArrayList<DanhMucBeanBNhan> listItem) {
     this.listItem = listItem;
     for (DanhMucBeanBNhan item : listItem) {
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
                    node = new TrangChu_BN(MABN);
                    break;
                case "TTCaNhan":
                    node = new TTCaNhan(MABN);
                    break;
//                case "KhaiBao":
//                    node = new KhaiBao(MABN);
//                    
//                    break;
                case "YCHoTro":
                    node = new YCHoTro(MABN);
                    
                    break;
                default:
                    break;
           }
            if(kind.equals("KhaiBao")){
                 node = new KhaiBao(MABN);
                 jpnRoot.removeAll();
                   jpnRoot.setLayout(new BorderLayout());
                  JScrollPane scrollp = new JScrollPane(node, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    scrollp.setPreferredSize(new Dimension(1060, 500));
                    jpnRoot.add(scrollp,BorderLayout.CENTER);
                     jpnRoot.validate();
             jpnRoot.repaint();
            setChangeBackground(kind);
           
            }
           jpnRoot.removeAll();
           jpnRoot.setLayout(new BorderLayout());
           
           node.setPreferredSize(new Dimension(jpnRoot.getWidth(),jpnRoot.getHeight()));
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
        for(DanhMucBeanBNhan item : listItem){
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
