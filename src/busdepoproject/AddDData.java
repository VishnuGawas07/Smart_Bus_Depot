
package busdepoproject;
import java.sql.*;

class AddDData {

     static int save(String name, String id, String aadhar, String mob, String address, String bloodgrp, String age, String join) {
          int status=0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement ps=con.prepareStatement("insert into driver_details(name,id,aadhar,mob,address,bloodgrp,age,join)values(?,?,?,?,?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,id);
            ps.setString(3,aadhar);
            ps.setString(4,mob);
            ps.setString(5,address);
            ps.setString(6,bloodgrp);
            ps.setString(7,age);
            ps.setString(8,join);
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
            PreparedStatement ps=con.prepareStatement("delete from driver_details where id=?");
            ps.setInt(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    } 
    }

        
    

   
