
package busdepoproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class addlog implements ActionListener{

    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
    JButton bt1,bt2,bt3;
    JRadioButton r1,r2;
    JTextArea area;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;


    public addlog() {
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Log  Sheet");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,10,700,200);
        lb2=new JLabel("Log  ID  :");
        lb2.setFont(new Font("cambria",Font.PLAIN,30));
        lb2.setBounds(650,200,300,50);
        lb3=new JLabel("Bus  Number  :");
        lb3.setFont(new Font("cambria",Font.PLAIN,30));
        lb3.setBounds(650,270,300,50);
        lb4=new JLabel("Driver ID  :");
        lb4.setFont(new Font("cambria",Font.PLAIN,30));
        lb4.setBounds(650,340,300,50);
        lb5=new JLabel("Conductor  ID  :");
        lb5.setFont(new Font("cambria",Font.PLAIN,30));
        lb5.setBounds(650,410,300,50);
        lb6=new JLabel("Source  :");
        lb6.setFont(new Font("cambria",Font.PLAIN,30));
        lb6.setBounds(650,480,300,50);
        lb7=new JLabel("Destination  :");
        lb7.setFont(new Font("cambria",Font.PLAIN,30));
        lb7.setBounds(650,550,300,50);
        lb8=new JLabel("Arrivial  Time  :");
        lb8.setFont(new Font("cambria",Font.PLAIN,30));
        lb8.setBounds(650,620,300,50);
        t2=new JTextField(30);
        t2.setBackground(new java.awt.Color(255, 243, 230));
        t2.setBounds(950,200,200,40);
        t3=new JTextField(30);
        t3.setBackground(new java.awt.Color(255, 243, 230));
        t3.setBounds(950,270,200,40);
        t4=new JTextField(30);
        t4.setBackground(new java.awt.Color(255, 243, 230));
        t4.setBounds(950,340,200,40);
        t5=new JTextField(30);
        t5.setBackground(new java.awt.Color(255, 243, 230));
        t5.setBounds(950,410,200,40);
        t6=new JTextField(10);
        t6.setBackground(new java.awt.Color(255, 243, 230));
        t6.setBounds(950,480,200,40);
        t7=new JTextField(30);
        t7.setBackground(new java.awt.Color(255, 243, 230));
        t7.setBounds(950,550,200,40);
        t8=new JTextField(30);
        t8.setBackground(new java.awt.Color(255, 243, 230));
        t8.setBounds(950,620,200,40);
        Border bored = BorderFactory.createLineBorder(Color.RED);
        t2.setBorder(bored);
        t3.setBorder(bored);
        t4.setBorder(bored);
        t5.setBorder(bored);
        t6.setBorder(bored);
        t7.setBorder(bored);
        t8.setBorder(bored);
        bt1=new JButton("Submit");
        bt1.setBounds(750,850,200,40);
        bt1.setBorder(bored);
        bt2=new JButton("Clear");
        bt2.setBounds(1000,850,200,40);
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
                 String logid=t2.getText();
                String busno=t3.getText();
                String did=t4.getText();
                String cid=t5.getText();
                String source=t6.getText();
                String destination=t7.getText();
                String arrival=t8.getText();
                int i=Addlogdata.save(logid,busno,did,cid,source,destination,arrival);
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Record Added Successfully");
            }else{
                   JOptionPane.showMessageDialog(null,"Sorry, unable to save!"); 
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
                t7.setText("");
                t8.setText("");
            }
        }
       );
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new logsheetsec();
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
        f.add(t5);
        f.add(lb6);
        f.add(lb7);
        f.add(lb8);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

        
    }
    public static void main(String[] string) {
        addlog Addlog=new addlog();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");    }
    
}
