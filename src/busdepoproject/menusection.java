
package busdepoproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class menusection implements ActionListener{

    
    
    JButton bt1,bt2,bt3,bt4,bt5;
    JTextField t1;
   

    public menusection() {
        
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        bt1=new JButton("Staff  Details");
        bt1.setFont(new Font("cambria",Font.BOLD,40));
        bt1.setForeground(new java.awt.Color(128,0,0));
        bt1.setBounds(450,120,300,300);
        bt2=new JButton("Log  Sheet");
        bt2.setBounds(900,120,300,300);
        bt3=new JButton("Bus Timetable");
        bt3.setBounds(450,520,300,300);
        bt4=new JButton("ST  Pass");
        bt4.setBounds(900,520,300,300);
        bt5=new JButton("Back");
        bt5.setBounds(1500,880,200,40);
        bt2.setFont(new Font("cambria",Font.BOLD,40));
        bt3.setFont(new Font("cambria",Font.BOLD,40));
        bt4.setFont(new Font("cambria",Font.BOLD,40));
        bt1.setBackground(new java.awt.Color(255, 243, 230));
        bt2.setBackground(new java.awt.Color(255, 243, 230));
        bt3.setBackground(new java.awt.Color(255, 243, 230));
        bt4.setBackground(new java.awt.Color(255, 243, 230));
        bt2.setForeground(new java.awt.Color(128,0,0));
        bt3.setForeground(new java.awt.Color(128,0,0));
        bt4.setForeground(new java.awt.Color(128,0,0));
        bt5.setBackground(new java.awt.Color(255, 102, 102));
        bt5.setForeground(new java.awt.Color(0,0,0));
        Border bored = BorderFactory.createLineBorder(Color.RED);
       bt1.setBorder(bored);
       bt2.setBorder(bored);
       bt3.setBorder(bored);
       bt4.setBorder(bored);
       
       bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Staffdetail.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timetable.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logsheetsec.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stpasssec.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Busdepoproject.main(new String[]{});
                f.dispose();
            }
        }
       );
        t1=new JTextField(10);
        
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);
        f.add(bt5);
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

        
    }
    public static void main(String[] string) {
    menusection Menusection=new menusection(); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
