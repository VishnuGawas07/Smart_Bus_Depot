
package busdepoproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class stpasssec implements ActionListener{

    
    JLabel lb1;
    JButton bt1,bt2,bt3;
    JTextField t1;

    public stpasssec() {
        
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("ST  Passes");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,50,600,200);
        bt1=new JButton("Student  pass");
        bt1.setFont(new Font("cambria",Font.BOLD,40));
        bt1.setForeground(new java.awt.Color(128,0,0));
        bt1.setBounds(350,300,400,400);
        bt2=new JButton("Tourist  pass");
        bt2.setBounds(900,300,400,400);
        bt2.setFont(new Font("cambria",Font.BOLD,40));
        bt2.setForeground(new java.awt.Color(128,0,0));
        bt3=new JButton("Back");
        bt3.setBounds(1400,800,200,40);
        bt1.setBackground(new java.awt.Color(255, 243, 230));
        bt2.setBackground(new java.awt.Color(255, 243, 230));
        bt1.setForeground(new java.awt.Color(128,0,0));
        bt2.setForeground(new java.awt.Color(128,0,0));
        bt3.setBackground(new java.awt.Color(255, 102, 102));
        bt3.setForeground(new java.awt.Color(0,0,0));
        Border bored = BorderFactory.createLineBorder(Color.RED);
       bt1.setBorder(bored);
       bt2.setBorder(bored);
       bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentpasssec.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                touristpasssec.main(new String[]{});
                f.dispose();
            }
        }
       );
       bt3.addActionListener(new ActionListener() {
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
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

       

        
    }
     public static void main(String[] string) {
        stpasssec Stpasssec=new stpasssec();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
