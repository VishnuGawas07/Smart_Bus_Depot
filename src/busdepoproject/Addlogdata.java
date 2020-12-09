
package busdepoproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


class Addlogdata {

    static int save(String logid, String busno, String did, String cid, String source, String destination, String arrival) {
        int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("insert into logdetails(logid,busno,did,cid,source,destination,arrival)values(?,?,?,?,?,?,?)");
            ps.setString(1,logid);
            ps.setString(2,busno);
            ps.setString(3,did);
            ps.setString(4,cid);
            ps.setString(5,source);
            ps.setString(6,destination);
            ps.setString(7,arrival);
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
            PreparedStatement ps=con.prepareStatement("delete from logdetails where logid=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
        
    }
    
}
