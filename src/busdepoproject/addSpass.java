
package busdepoproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class addSpass implements ActionListener{


    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13;
    JButton bt1,bt2,bt3;
    JTextArea area,area2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;


    public addSpass() {
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Student  Pass  Details");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,10,700,100);
        lb2=new JLabel("ID number  :");
        lb2.setFont(new Font("cambria",Font.PLAIN,30));
        lb2.setBounds(400,200,300,50);
        lb3=new JLabel("Pass number  :");
        lb3.setFont(new Font("cambria",Font.PLAIN,30));
        lb3.setBounds(950,200,300,50);
        lb4=new JLabel("Name  :");
        lb4.setFont(new Font("cambria",Font.PLAIN,30));
        lb4.setBounds(400,270,300,50);
        lb11=new JLabel("Pass  Price  :");
        lb11.setFont(new Font("cambria",Font.PLAIN,30));
        lb11.setBounds(950,270,300,50);        
        lb5=new JLabel("issue  date  :");
        lb5.setFont(new Font("cambria",Font.PLAIN,30));
        lb5.setBounds(400,340,300,50);
        lb6=new JLabel("valid  upto  :");
        lb6.setFont(new Font("cambria",Font.PLAIN,30));
        lb6.setBounds(950,340,300,50);
        lb7=new JLabel("Date of Birth  :");
        lb7.setFont(new Font("cambria",Font.PLAIN,30));
        lb7.setBounds(400,410,300,50);
        lb8=new JLabel("Age  :");
        lb8.setFont(new Font("cambria",Font.PLAIN,30));
        lb8.setBounds(950,410,300,50);
        lb9=new JLabel("Source  :");
        lb9.setFont(new Font("cambria",Font.PLAIN,30));
        lb9.setBounds(400,480,300,50);
        lb10=new JLabel("Destination  :");
        lb10.setFont(new Font("cambria",Font.PLAIN,30));
        lb10.setBounds(950,480,300,50);        
        lb12=new JLabel("Address  :");
        lb12.setFont(new Font("cambria",Font.PLAIN,30));
        lb12.setBounds(400,550,300,50);        
        lb13=new JLabel("Institute Name :");
        lb13.setFont(new Font("cambria",Font.PLAIN,30));
        lb13.setBounds(950,550,300,50);                
        t2=new JTextField(30);
        t2.setBackground(new java.awt.Color(255, 243, 230));
        t2.setBounds(600,200,200,40);
        t3=new JTextField(30);
        t3.setBackground(new java.awt.Color(255, 243, 230));
        t3.setBounds(1180,200,200,40);
        t4=new JTextField(30);
        t4.setBackground(new java.awt.Color(255, 243, 230));
        t4.setBounds(600,270,200,40);
        t5=new JTextField(30);
        t5.setBackground(new java.awt.Color(255, 243, 230));
        t5.setBounds(1180,270,200,40);
        t6=new JTextField(10);
        t6.setBackground(new java.awt.Color(255, 243, 230));
        t6.setBounds(600,340,200,40);
        t7=new JTextField(30);
        t7.setBackground(new java.awt.Color(255, 243, 230));
        t7.setBounds(1180,340,200,40);
        t8=new JTextField(30);
        t8.setBackground(new java.awt.Color(255, 243, 230));
        t8.setBounds(600,410,200,40);
        t9=new JTextField(30);
        t9.setBackground(new java.awt.Color(255, 243, 230));
        t9.setBounds(1180,410,200,40);
        t10=new JTextField(30);
        t10.setBackground(new java.awt.Color(255, 243, 230));
        t10.setBounds(600,480,200,40);
        t11=new JTextField(30);
        t11.setBackground(new java.awt.Color(255, 243, 230));
        t11.setBounds(1180,480,200,40);
        area=new JTextArea();  
        area.setBounds(600,550,250,100); 
        area.setBackground(new java.awt.Color(255, 243, 230));
        area2=new JTextArea();  
        area2.setBounds(1180,550,250,100); 
        area2.setBackground(new java.awt.Color(255, 243, 230));
        Border bored = BorderFactory.createLineBorder(Color.RED);
        t2.setBorder(bored);
        t3.setBorder(bored);
        t4.setBorder(bored);
        t5.setBorder(bored);
        t6.setBorder(bored);
        t7.setBorder(bored);
        t8.setBorder(bored);
        t9.setBorder(bored);
        t10.setBorder(bored);
        t11.setBorder(bored);
        area.setBorder(bored);
        area2.setBorder(bored);
        bt1=new JButton("Submit");
        bt1.setBounds(750,780,200,40);
        bt1.setBorder(bored);
        bt2=new JButton("Clear");
        bt2.setBounds(1000,780,200,40);
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
                String idno=t2.getText();
                String passno=t3.getText();
                String name=t4.getText();
                String price=t5.getText();
                String issuedate=t6.getText();
                String validupto=t7.getText();
                String dob=t8.getText();
                String age=t9.getText();
                String source=t10.getText();
                String destination=t11.getText();
                String address=area.getText();
                String institute=area2.getText();
                int i=Addspassdata.save(idno,passno,name,price,issuedate,validupto,dob,age,source,destination,address,institute);
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Student Pass Details Added Successfully");
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
                t9.setText("");
                t10.setText("");
                t11.setText("");
                area.setText("");
                area2.setText("");
            }
        }
       );
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentpasssec.main(new String[]{});
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
        f.add(t5);
        f.add(lb6);
        f.add(area);
        f.add(t9);
        f.add(t10);
        f.add(t11);
        f.add(lb7);
        f.add(lb8);
        f.add(lb9);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(lb10);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(lb11);
        f.add(lb12);
        f.add(lb13);
        f.add(area2);
        f.add(t1);
        
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);


    }
    public static void main(String[] string) {
        addSpass AddSpass=new addSpass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
