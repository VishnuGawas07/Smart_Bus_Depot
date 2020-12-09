
package busdepoproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class addTiming implements ActionListener {

    JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    JButton bt1,bt2,bt3;
    JTextField t1,t2,t3,t4,t5,t6;

    public addTiming() {
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Add Bus  Timetable");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,10,700,200);
        lb2=new JLabel("Bus  No  :");
        lb2.setFont(new Font("cambria",Font.PLAIN,30));
        lb2.setBounds(680,250,300,50);
        lb3=new JLabel("Source  :");
        lb3.setFont(new Font("cambria",Font.PLAIN,30));
        lb3.setBounds(680,320,300,50);
        lb4=new JLabel("Destination  :");
        lb4.setFont(new Font("cambria",Font.PLAIN,30));
        lb4.setBounds(680,390,300,50);
        lb5=new JLabel("Departure  Time  :");
        lb5.setFont(new Font("cambria",Font.PLAIN,30));
        lb5.setBounds(680,460,300,50);
        lb6=new JLabel("Arrival  Time  :");
        lb6.setFont(new Font("cambria",Font.PLAIN,30));
        lb6.setBounds(680,530,300,50);
        t2=new JTextField(30);
        t2.setBackground(new java.awt.Color(255, 243, 230));
        t2.setBounds(980,250,200,40);
        t3=new JTextField(30);
        t3.setBackground(new java.awt.Color(255, 243, 230));
        t3.setBounds(980,320,200,40);
        t4=new JTextField(30);
        t4.setBackground(new java.awt.Color(255, 243, 230));
        t4.setBounds(980,390,200,40);
        t5=new JTextField(30);
        t5.setBackground(new java.awt.Color(255, 243, 230));
        t5.setBounds(980,460,200,40);
        t6=new JTextField(30);
        t6.setBackground(new java.awt.Color(255, 243, 230));
        t6.setBounds(980,530,200,40);
        Border bored = BorderFactory.createLineBorder(Color.RED);
        t2.setBorder(bored);
        t3.setBorder(bored);
        t4.setBorder(bored);
        t5.setBorder(bored);
        t6.setBorder(bored);
        bt1=new JButton("Submit");
        bt1.setBounds(750,670,200,40);
        bt1.setBorder(bored);
        bt2=new JButton("Clear");
        bt2.setBounds(1000,670,200,40);
        bt2.setBorder(bored);        
        bt3=new JButton("Back");
        bt3.setBounds(1500,850,200,40);
        bt1.setBackground(new java.awt.Color(255, 102, 102));
        bt1.setForeground(new java.awt.Color(0,0,0));
        bt2.setBackground(new java.awt.Color(255, 102, 102));
        bt2.setForeground(new java.awt.Color(0,0,0));
        bt3.setBackground(new java.awt.Color(255, 102, 102));
        bt3.setForeground(new java.awt.Color(0,0,0));
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String busno=t2.getText();
                String source=t3.getText();
                String destination=t4.getText();
                String departure_time=t5.getText();
                String arrival_time=t6.getText();
                
                int i=dbbustime.save(busno,source,destination,departure_time,arrival_time);
                if(i>0){
                JOptionPane.showMessageDialog(null,"Details Added Successfully");
                timetable.main(new String[]{});
                f.dispose();
            }else{
                    JOptionPane.showMessageDialog(null,"Sorry unable to save!");
                }
            }
        }
       );
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
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
        t1=new JTextField(10);
        
        f.add(lb1);
        f.add(lb2);
        f.add(t2);
        f.add(lb3);
        f.add(t3);
        f.add(lb4);
        f.add(t4);
        f.add(lb5);
        f.add(lb6);
        f.add(t5);
        f.add(t6);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);


    }
    public static void main(String[] string) {
        addTiming AddTiming=new addTiming();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
