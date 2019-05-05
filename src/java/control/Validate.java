package control;

import static java.lang.Compiler.command;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Validate {
    public static boolean checkUser(String username,String pwd){
        boolean st=false;
        try{ 
            
        String jdbcurl="jdbc:mysql://localhost:3306/pro?useSSL=false";
        String user="root";
        String pass="kunal123@";
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("connection establishing");
        Connection con=DriverManager.getConnection(jdbcurl,user,pass);
        PreparedStatement ps=con.prepareStatement("select * from User where urn=? and psw=? ");
        ps.setString(1,username);
        ps.setString(2,pwd);
        ResultSet rs=ps.executeQuery();
        st=rs.next();
    }catch(Exception e){
        e.printStackTrace();
    }
        return st;
    }
    public static boolean checkaq(String username,String dropdown){
        boolean stt=false;
        try{    
        String jdbcurl="jdbc:mysql://localhost:3306/pro?useSSL=false";
        String user="root";
        String pass="kunal123@";
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("connection establishing");
        Connection con=DriverManager.getConnection(jdbcurl,user,pass);
        Statement stmt=con.createStatement();
        String sql = "SELECT ll FROM user WHERE urn='"+username+"'";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String s=rs.getString("ll");
            System.out.print(s);
            int q=s.length();
                if(q==7){
                    System.out.print("dfs");
                    stt=true;
        }
        }

        }catch(Exception e){
        e.printStackTrace();
    }
        return stt;
    }
}
