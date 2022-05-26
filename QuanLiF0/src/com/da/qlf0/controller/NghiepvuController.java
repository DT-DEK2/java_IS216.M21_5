/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Minh Cuong
 */
public class NghiepvuController {
    private JPanel View;

    public NghiepvuController(JPanel View) {
        this.View = View;
    }
    public void setImage(){
        JPanel panel= new JPanel();
        
        
       JScrollPane scrollp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//    JScrollPane scrollp = new JScrollPane(panel);
    
    
    scrollp.setPreferredSize(new Dimension(1100,700));
        JLabel label1 = new JLabel();
        ImageIcon image1 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\1.jpg");  
        
        label1.setIcon(image1);
        JPanel panel1= new JPanel();
        panel1.add(label1);
        panel1.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel1);
//            Image im1 = image1.getImage();
//            JPanel panel1 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im1, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//             panel.add(panel1);
        
        JLabel label2 = new JLabel();
        ImageIcon image2 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\2.jpg"); 
        
          label2.setIcon(image2);
       JPanel panel2= new JPanel();
        panel2.add(label2);
         panel2.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel2);
        
//          Image im2 = image2.getImage();
//            JPanel panel2 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im2, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel2);
        
        JLabel label3 = new JLabel();
        ImageIcon image3 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\3.jpg"); 
          label3.setIcon(image3);
      JPanel panel3= new JPanel();
        panel3.add(label3);
         panel3.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel3);
//         Image im3 = image3.getImage();
//            JPanel panel3 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im3, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel3);
        
        JLabel label4 = new JLabel();
        ImageIcon image4 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\4.jpg"); 
          label4.setIcon(image4);
       JPanel panel4= new JPanel();
        panel4.add(label4);
         panel4.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel4);
//        
//        Image im4 = image4.getImage();
//            JPanel panel4 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im4, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel4);
        
        JLabel label5 = new JLabel();
        ImageIcon image5 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\5.jpg"); 
          label5.setIcon(image5);
        JPanel panel5= new JPanel();
        panel5.add(label5);
         panel5.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel5);
        
//         Image im5 = image5.getImage();
//            JPanel panel5 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im5, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel5);
        
        JLabel label6 = new JLabel();
        ImageIcon image6 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\6.jpg");
          label6.setIcon(image6);
        JPanel panel6= new JPanel();
        panel6.add(label6);
         panel6.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel6);
        
//            
//         Image im6 = image6.getImage();
//            JPanel panel6 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im6, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel6);
        
        
        JLabel label7 = new JLabel();
        ImageIcon image7 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\7.jpg"); 
          label7.setIcon(image7);
       JPanel panel7= new JPanel();
        panel7.add(label7);
         panel7.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel7);
//         Image im7 = image7.getImage();
//            JPanel panel7 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im7, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel7);
            
        JLabel label8 = new JLabel();
        ImageIcon image8 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\8.jpg");
          label8.setIcon(image8);
        JPanel panel8= new JPanel();
        panel8.add(label8);
         panel8.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel8);
        
//             Image im8 = image8.getImage();
//            JPanel panel8 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im8, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel8);
//        
        JLabel label9 = new JLabel();
        ImageIcon image9 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\9.jpg"); 
          label9.setIcon(image9);
       JPanel panel9= new JPanel();
        panel9.add(label9);
         panel9.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel9);
        
//             Image im9 = image9.getImage();
//            JPanel panel9 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im9, 0, 0, getWidth(), getHeight(),this);
//                    
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel9);
            
        JLabel label10 = new JLabel();
        ImageIcon image10 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\10.jpg"); 
          label10.setIcon(image10);
        JPanel panel10= new JPanel();
        panel10.add(label10);
         panel10.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel10);
//        .
//               Image im10 = image10.getImage();
//            JPanel panel10 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im10, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//            panel.add(panel10);
        
        JLabel label11 = new JLabel();
        ImageIcon image11 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\11.jpg"); 
          label11.setIcon(image11);
       JPanel panel11= new JPanel();
        panel11.add(label11);
         panel11.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel11);
        
//                Image im11 = image11.getImage();
//            JPanel panel11 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im11, 0, 0, getWidth(), getHeight(),this);
//                }
//                @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//             panel.add(panel11);

        JLabel label12 = new JLabel();
        ImageIcon image12 = new ImageIcon("C:\\Users\\Minh Cuong\\source\\java\\java_IS216.M21_5\\QuanLiF0\\src\\com\\da\\qlf0\\images\\12.jpg"); 
         label12.setIcon(image12);
      JPanel panel12= new JPanel();
        panel12.add(label12);
         panel12.setPreferredSize(new Dimension(1100, 1200));
        panel.add(panel12);
//        
//              Image im12 = image12.getImage();
//            JPanel panel12 = new nv() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    super.paintComponent(g);
//                    g.drawImage(im12, 0, 0, getWidth(), getHeight(),this);
//                }
//                 @Override
//                 public Dimension getPreferredSize() {
//                    return new Dimension(1000, 650);
//                   }
//            };
//             panel.add(panel12);
             
             
             
        panel.setLayout(new GridLayout(12,1));
        
//       panel.setPreferredSize(new Dimension(View.getWidth(), View.getHeight()));
        View.removeAll();
        View.setLayout(new BorderLayout());
        
        View.add(scrollp);
//        jpnView.setSize(1061, 680);

        View.validate();
        View.repaint();
    }
}
