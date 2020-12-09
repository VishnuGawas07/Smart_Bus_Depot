
package busdepoproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;


public class driversection implements ActionListener{

    
    JLabel lb1;
    JButton bt1,bt2,bt3,bt4,bt5;
    JTextField t1;


    public driversection() {
        
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Driver  Details");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        bt1=new JButton("View  Details");
        bt1.setFont(new Font("cambria",Font.BOLD,20));
        bt1.setForeground(new java.awt.Color(128,0,0));
        bt2=new JButton("Add  Details");
        bt2.setFont(new Font("cambria",Font.BOLD,20));
        bt2.setForeground(new java.awt.Color(128,0,0));
        bt3=new JButton("Update  Details");
        bt3.setFont(new Font("cambria",Font.BOLD,20));
        bt3.setForeground(new java.awt.Color(128,0,0));
        bt4=new JButton("Delete  Details");
        bt4.setFont(new Font("cambria",Font.BOLD,20));
        bt4.setForeground(new java.awt.Color(128,0,0));
        bt5=new JButton("Back");
        bt5.setBounds(1400,800,200,40);
        bt1.setBackground(new java.awt.Color(255, 243, 230));
        bt2.setBackground(new java.awt.Color(255, 243, 230));
        bt3.setBackground(new java.awt.Color(255, 243, 230));
        bt4.setBackground(new java.awt.Color(255, 243, 230));
        bt5.setBackground(new java.awt.Color(255, 102, 102));
        bt5.setForeground(new java.awt.Color(0,0,0));
        lb1.setBounds(700,50,700,200);
        bt1.setBounds(800,300,200,60);
        bt2.setBounds(800,400,200,60);
        bt3.setBounds(800,500,200,60);
        bt4.setBounds(800,600,200,60);
        Border bored = BorderFactory.createLineBorder(Color.RED);
       bt1.setBorder(bored);
       bt2.setBorder(bored);
       bt3.setBorder(bored);
       bt4.setBorder(bored);
       bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewdriverdetail.main(new String[]{});
            }
        }
       );
       
       bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adddriverdetail.main(new String[]{});
                f.dispose();
            }
        }
       );
                    bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateddetails.main(new String[]{});
                f.dispose();
            }
        }
       );

              bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletedriverdetail.main(new String[]{});
                f.dispose();
            }
        }
       );

       bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Staffdetail.main(new String[]{});
                f.dispose();
                
            }
        }
       );
        t1=new JTextField(10);
        
        f.add(lb1);
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
        driversection Driversection=new driversection();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
