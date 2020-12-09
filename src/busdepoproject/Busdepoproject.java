
package busdepoproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class Busdepoproject implements ActionListener {
    
    JLabel lb1,lb2,lb3,lb4,lb5;
    JButton bt1,bt2;
    JTextField t1,t3;
    JPasswordField p1;
    
    public Busdepoproject(){
        
       JFrame f=new JFrame();
       Icon icon = new ImageIcon("C:\\Users\\Cybersquad\\Downloads\\Documents\\bus.png");
       bt2 = new JButton(icon);
       bt2.setBounds(670,50,350,280);
       Border emptyBorder = BorderFactory.createEmptyBorder();
       bt2.setBorder(emptyBorder);
       f.add(bt2);
       f.getContentPane().setBackground(new java.awt.Color(255, 209, 179));
       f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
       lb1=new JLabel("Smart Bus Depot");
       lb1.setForeground(new java.awt.Color(204, 0, 0));
       lb1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,100));
       lb1.setBounds(500,200,1000,400);
       lb2=new JLabel("Username");
       lb2.setFont(new Font("cambria",Font.PLAIN,30));
       lb2.setForeground(Color.BLACK);
       lb2.setBounds(600,550,400,30);
       t1=new JTextField(10);
       t1.setBounds(800,550,200,40);
       lb3=new JLabel("Password");
       lb3.setFont(new Font("cambria",Font.PLAIN,30));
       lb3.setForeground(Color.BLACK);
       lb3.setBounds(600,650,400,30);
       p1=new JPasswordField(10);
       p1.setBounds(800,650,200,40);
       bt1=new JButton("Login");
       bt1.setBounds(750,800,250,50);
       javax.swing.border.Border bored = BorderFactory.createLineBorder(Color.RED);
       bt1.setBackground(new java.awt.Color(255, 209, 179));
       bt2.setBackground(new java.awt.Color(255, 209, 179));
       t1.setBackground(new java.awt.Color(255, 209, 179));
       p1.setBackground(new java.awt.Color(255, 209, 179));
       bt1.setBorder(bored);
       bt1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String value1=t1.getText();
               String value2=p1.getText();
               if(value1.equals("Admin")&&value2.equals("admin123"))
               {
                   menusection.main(new String[]{});
                   f.dispose();
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"unsuccessful login");
               }
           }
       }
       );
       

       
       t3=new JTextField();
       f.add(lb1);
       f.add(lb2);
       f.add(t1);
       f.add(lb3);
       f.add(p1);
       f.add(bt1);
       f.add(t3);
 
       
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

        
    }

    public static void main(String[] args) {
        
        Busdepoproject busdepoproject=new Busdepoproject();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
