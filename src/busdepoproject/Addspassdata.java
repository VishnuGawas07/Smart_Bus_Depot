 
package busdepoproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


class Addspassdata {

    static int save(String idno, String passno, String name, String price, String issuedate, String validupto, String dob, String age, String source, String destination, String address, String institute) {
         int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("insert into studentpass(idno,passno,name,price,issuedate,validupto,dob,age,source,destination,address,institute)values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,idno);
            ps.setString(2,passno);
            ps.setString(3,name);
            ps.setString(4,price);
            ps.setString(5,issuedate);
            ps.setString(6,validupto);
            ps.setString(7,dob);
            ps.setString(8,age);
            ps.setString(9,source);
            ps.setString(10,destination);
            ps.setString(11,address);
            ps.setString(12,institute);
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
            PreparedStatement ps=con.prepareStatement("delete from studentpass where passno=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
     }
}
    