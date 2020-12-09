
package busdepoproject;
import java.sql.Connection;
import java.sql.DriverManager;


class datalog {
    public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
		}catch(Exception e){System.out.println(e);}
		return con;
                
	}
    
}


