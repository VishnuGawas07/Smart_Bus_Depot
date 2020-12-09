
package busdepoproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class timetable implements ActionListener {

    
    JLabel lb1;
    JButton bt1,bt2,bt3,bt4,bt5;
    JTextField t1;


    public timetable() {
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Bus  Timetable");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        bt1=new JButton("Add  Timing");
        bt1.setFont(new Font("cambria",Font.BOLD,20));
        bt1.setForeground(new java.awt.Color(128,0,0));
        bt2=new JButton("View  Timing");
        bt2.setFont(new Font("cambria",Font.BOLD,20));
        bt2.setForeground(new java.awt.Color(128,0,0));
        bt3=new JButton("Delete  Timing");
        bt3.setFont(new Font("cambria",Font.BOLD,20));
        bt3.setForeground(new java.awt.Color(128,0,0));
        bt4=new JButton("Back");
        bt4.setBounds(1400,800,200,40);
        bt1.setBackground(new java.awt.Color(255, 243, 230));
        bt2.setBackground(new java.awt.Color(255, 243, 230));
        bt3.setBackground(new java.awt.Color(255, 243, 230));
        bt4.setBackground(new java.awt.Color(255, 102, 102));
        bt4.setForeground(new java.awt.Color(0,0,0));
        lb1.setBounds(750,50,700,200);
        bt1.setBounds(800,300,200,60);
        bt2.setBounds(800,400,200,60);
        bt3.setBounds(800,500,200,60);
        Border bored = BorderFactory.createLineBorder(Color.RED);
       bt1.setBorder(bored);
       bt2.setBorder(bored);
       bt3.setBorder(bored);
       bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTiming.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTiming.main(new String[]{});
                 f.dispose();
            }
        }
       );
              bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtime.main(new String[]{});
            }
        }
       );

       bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menusection.main(new String[]{});
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
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

    }
    public static void main(String[] string) {
        timetable Timetable=new timetable();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
