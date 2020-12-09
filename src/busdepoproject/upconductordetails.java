
package busdepoproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class upconductordetails  implements ActionListener {

    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9;
    JButton bt1,bt2,bt3,bt4;
    JTextArea area;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
   

    public upconductordetails() {
     JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        
        lb1=new JLabel("Conductor  Details");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,10,700,200);
        
        lb2=new JLabel("Name  :");
        lb2.setFont(new Font("cambria",Font.PLAIN,30));
        lb2.setBounds(650,270,300,50);
        t2=new JTextField(30);
        t2.setBackground(new java.awt.Color(255, 243, 230));
        t2.setBounds(950,270,200,40);
        
        lb3=new JLabel("ID  :");
        lb3.setFont(new Font("cambria",Font.PLAIN,30));
        lb3.setBounds(650,200,300,50);
        t3=new JTextField(30);
        t3.setBackground(new java.awt.Color(255, 243, 230));
        t3.setBounds(950,200,200,40);
        
        lb4=new JLabel("Aadhar Number  :");
        lb4.setFont(new Font("cambria",Font.PLAIN,30));
        lb4.setBounds(650,340,300,50);
        t4=new JTextField(30);
        t4.setBackground(new java.awt.Color(255, 243, 230));
        t4.setBounds(950,340,200,40);
        
        lb5=new JLabel("Mobile Number  :");
        lb5.setFont(new Font("cambria",Font.PLAIN,30));
        lb5.setBounds(650,410,300,50);
        t5=new JTextField(10);
        t5.setBackground(new java.awt.Color(255, 243, 230));
        t5.setBounds(950,410,200,40);
        
        lb6=new JLabel("Address  :");
        lb6.setFont(new Font("cambria",Font.PLAIN,30));
        lb6.setBounds(650,480,300,50);
        area=new JTextArea();  
        area.setBounds(950,480,250,100); 
        area.setBackground(new java.awt.Color(255, 243, 230));
        
        lb7=new JLabel("Blood  Group :");
        lb7.setFont(new Font("cambria",Font.PLAIN,30));
        lb7.setBounds(650,620,300,50);
        t6=new JTextField(30);
        t6.setBackground(new java.awt.Color(255, 243, 230));
        t6.setBounds(950,620,200,40);
        
        
        lb8=new JLabel("Age  :");
        lb8.setFont(new Font("cambria",Font.PLAIN,30));
        lb8.setBounds(650,690,300,50);
        t7=new JTextField(30);
        t7.setBackground(new java.awt.Color(255, 243, 230));
        t7.setBounds(950,690,100,40);
        
        lb9=new JLabel("Joining Date  :");
        lb9.setFont(new Font("cambria",Font.PLAIN,30));
        lb9.setBounds(650,760,300,50);         
        t8=new JTextField(30);
        t8.setBackground(new java.awt.Color(255, 243, 230));
        t8.setBounds(950,760,200,40);
                
        
        Border bored = BorderFactory.createLineBorder(Color.RED);
        t2.setBorder(bored);
        t3.setBorder(bored);
        t4.setBorder(bored);
        t5.setBorder(bored);
        t6.setBorder(bored);
        t7.setBorder(bored);
        t8.setBorder(bored);
        area.setBorder(bored);
        
        bt1=new JButton("Submit");
        bt1.setBounds(750,850,200,40);
        bt1.setBorder(bored);
        bt2=new JButton("Clear");
        bt2.setBounds(1000,850,200,40);
        bt2.setBorder(bored);        
        bt3=new JButton("Back");
        bt3.setBounds(1500,850,200,40);
        bt4=new JButton("Fetch  Record");
        bt4.setBounds(500,850,200,40);
        
        
        bt1.setBackground(new java.awt.Color(255, 102, 102));
        bt1.setForeground(new java.awt.Color(0,0,0));
        bt2.setBackground(new java.awt.Color(255, 102, 102));
        bt2.setForeground(new java.awt.Color(0,0,0));
        bt3.setBackground(new java.awt.Color(255, 102, 102));
        bt3.setForeground(new java.awt.Color(0,0,0));
        bt4.setBackground(new java.awt.Color(255, 102, 102));
        bt4.setForeground(new java.awt.Color(0,0,0));
       
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                String bid=t3.getText();
                if(bid==null||bid.trim().equals("")){
                JOptionPane.showMessageDialog(null,"ID can't be blank");   
                }
                else{
                     try {
                        String str =t3.getText();
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
                       PreparedStatement st = con.prepareStatement("select * from conductor_details where id=?");
                       st.setString(1, str);
                       ResultSet rs = st.executeQuery();

            while (rs.next()) {

                String Name=rs.getString(1);
                t2.setText(Name);
                String Id=rs.getString(2);
                t3.setText(Id);
                String Aadhar=rs.getString(3);
                t4.setText(Aadhar);
                String Mob=rs.getString(4);
                t5.setText(Mob);
                String Address=rs.getString(5);
                area.setText(Address);
                String Bloodgrp=rs.getString(6);
                t6.setText(Bloodgrp);
                String Age=rs.getString(7);
                t7.setText(Age);
                String Join=rs.getString(8);
                t8.setText(Join);
                }
                    }catch (Exception ex) {

            System.out.println(ex);

        }      
            }
        }}
       ); 
        
       
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                String bid=t3.getText();
                String name=t2.getText();
                      String id=t3.getText();
                      String aadhar=t4.getText();
                     String mob=t5.getText();
                     String address=area.getText();
                     String bloodgrp=t6.getText();
                     String age=t7.getText();
                     String join=t8.getText();
                     
                if(bid==null||bid.trim().equals("")){
                JOptionPane.showMessageDialog(null,"ID can't be blank");   
                }
                else{
                     try {
                      String str =t3.getText();
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
                      Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                      String sql ="UPDATE conductor_details  SET name='"+name+"',aadhar="+aadhar+",mob="+mob+",address='"+address+"',age="+age+",join='"+join+"' WHERE id="+bid+"";
                      statement.executeUpdate(sql);
                      statement.close();
                      con.close();
                      JOptionPane.showMessageDialog(null,"Details Added Successfully");
                      conductorsection.main(new String[]{});
                    f.dispose();

                    }catch (Exception ex) {

            System.out.println(ex);

        }      
            }
        }}
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
                area.setText("");
            }
        }
       );
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conductorsection.main(new String[]{});
                f.dispose();
            }
        }
       );
        t1=new JTextField(10);
        
        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);
        f.add(lb5);
        f.add(lb6);
        f.add(area);
        f.add(lb7);
        f.add(lb8);
        f.add(lb9);
         f.add(bt1);
         f.add(bt2);
         f.add(bt3);
         f.add(t2);
         f.add(t3);
         f.add(t4);
         f.add(t5);
         f.add(t6);
         f.add(t7);
         f.add(t8);
         f.add(bt4);
         f.add(t1);
        
         
       f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);

 }
    public static void main(String[] string) {
     upconductordetails Upconductordetails=new upconductordetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
