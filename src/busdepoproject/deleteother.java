
package busdepoproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class deleteother implements ActionListener{

    JLabel lb1,lb2;
    JTextField t1,t2;
    JButton bt1,bt2;

    public deleteother() {
        JFrame f=new JFrame();
        f.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
        lb1=new JLabel("Staff  Details");
        lb1.setForeground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new Font("cambria",Font.BOLD,60));
        lb1.setBounds(700,50,700,200);
        lb2=new JLabel("Enter  ID  :");
        lb2.setFont(new Font("cambria",Font.PLAIN,30));
        lb2.setBounds(650,400,300,50);
        t2=new JTextField(30);
        t2.setBackground(new java.awt.Color(255, 243, 230));
        t2.setBounds(900,400,200,40);
        bt1=new JButton("Delete");
        bt1.setBounds(670,550,200,40);        
        bt2=new JButton("Back");
        bt2.setBounds(920,550,200,40);
        t1=new JTextField(30);
        bt1.setBackground(new java.awt.Color(255, 102, 102));
        bt1.setForeground(new java.awt.Color(0,0,0));
        bt2.setBackground(new java.awt.Color(255, 102, 102));
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oid=t2.getText();
                if(oid==null||oid.trim().equals("")){
                JOptionPane.showMessageDialog(null,"ID can't be blank");   
                }
                else{
                    int id=Integer.parseInt(oid);
                    int i=Addotherdata.delete(id);
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"Record deleted Successfully");
                        othersection.main(new String[]{});
                        f.dispose();
                    }else{
                JOptionPane.showMessageDialog(null,"unable to delete given id!");
            }
                }
            }
        }
       );
         
                bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                othersection.main(new String[]{});
                f.dispose();
            }
        }
       );
        Border bored = BorderFactory.createLineBorder(Color.RED);
        t2.setBorder(bored);
        bt1.setBorder(bored);
        bt2.setBorder(bored);
       
        f.add(lb1);
        f.add(lb2);
        f.add(t2);
        f.add(bt1);
        f.add(bt2);
        f.add(t1);
        
        f.setVisible(true);
       f.setSize(1800,1000);
       f.setLayout(null);
    }
     public static void main(String[] string) {
        deleteother Deleteother=new deleteother();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
