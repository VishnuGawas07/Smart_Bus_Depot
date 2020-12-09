
package busdepoproject;
import java.sql.*;

class dbbustime {
Connection con=null;
    static int save(String busno, String source, String destination, String departure_time, String arrival_time) {
        int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("insert into bustiming(busno,source,destination,departure_time,arrival_time)values(?,?,?,?,?)");
            ps.setString(1,busno);
            ps.setString(2,source);
            ps.setString(3,destination);
            ps.setString(4,departure_time);
            ps.setString(5,arrival_time);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
    public static int delete(int id){
        int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("delete from bustiming where busno=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
    
    
}
