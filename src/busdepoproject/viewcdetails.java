package busdepoproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;


class viewcdetails extends JFrame{
    private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewcdetails frame = new viewcdetails();
                                        frame.getContentPane().setBackground(new java.awt.Color(255, 243, 230));
                                        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.RED));
                                        frame.setVisible(true);
                                        frame.setSize(1800,1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public viewcdetails() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=datalog.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from conductor_details",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		contentPane.add(sp, BorderLayout.CENTER);
        }
    
}

