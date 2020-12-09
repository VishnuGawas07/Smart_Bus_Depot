
package busdepoproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Addotherdata {
static int save(String name,String occupation, String id, String aadhar, String mob, String address, String bloodgrp, String age, String join) {
          int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("insert into otherstaff(name,occupation,id,aadhar,mob,address,bloodgrp,age,join)values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,occupation);
            ps.setString(3,id);
            ps.setString(4,aadhar);
            ps.setString(5,mob);
            ps.setString(6,address);
            ps.setString(7,bloodgrp);
            ps.setString(8,age);
            ps.setString(9,join);
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
            PreparedStatement ps=con.prepareStatement("delete from otherstaff where id=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    } 

   

}