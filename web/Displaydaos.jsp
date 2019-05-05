<%-- 
    Document   : Displadao
    Created on : 26 Mar, 2019, 9:28:05 AM
    Author     : kunal
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hibernate.time.Tm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                margin: 0px;
                background-image: url(img/he.jpg);
	background-size: cover;
	background-position: absolute;
	background-repeat: no-repeat;
	box-sizing: border-box;
	justify-content: center;
	    }
            .logo{
                margin-left: 20px;
                margin-top:20px;
        font-size: 50px;
	margin-top: 10px;
	color: #d4af7a;
	font-family: sans-serif;
            }
            .li{
                width:100%;
                height:3px;
                background-color:#d4af7a; 
            }
table{
	width: 80%;
	height: auto;
	border: 1px solid white;
	border-collapse: separate;
	margin-top: 160px auto;        
        z-index:1;
}
th{
	color: #d4af7a;
	background-color: white;
	text-align: left;
	font-family: sans-serif;
	font-size:20px;
        font-weight:400;
        padding:10px;
}
td{
	padding: 5px;
}
tr{
	color: white;
}
tr:nth-child(even){
	background-color:rgba(212,175,122,0.8); 
}
tr:hover{
	color: #d4af7a;
	background-color: white;
} 
.pa{
    width:80%;
    height:410px;
    background-color: rgba(212,175,122,0.2);
    padding-top: 30px;
    z-index: 0;
    border-radius: 40px;
}
.s{
        float:right;
	font-size: 20px;
	color: white;
	cursor: pointer;
	font-weight: bolder;
	font-family:sans-serif;
        margin-top: -40px;
}
.aa:hover{
	color: red;
}
.bb:hover{
	color: #d4af7a;
}

.wq{
    color: #d4af7a;
    font-size: 30px;
	cursor: pointer;
	font-weight: bolder;
	font-family:sans-serif;
      
}
.as{
    text-decoration:none;
    color: white;
}
.as:hover{
    color:red;
}
.qwee{
    text-decoration: none;
    color:white;
}
.qwee:hover{
    color:#d4af7a;
}
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="logins.html" class="qwee" >   <div class="logo">You Bus</div></a>
        <div class="s">
            <font class="bb"><a href="logins.html" class="qwee" >HOME</a></font>&nbsp; &nbsp;
            <a href="logins.html" class="qwee" >	<font class="bb">EDIT-TABLE</font></a>&nbsp; &nbsp;
                        <font class="aa"><a href="Logout"  class="as" >LOG OUT</a></font>&nbsp; &nbsp;
        </div>
        <div class="li"></div>
        <br>
        <center><font class="wq">Todays Bus Route</font></center>
        <br>
        <center> <div class="pa"> 
    <center>
        <table>
            <thead>
            <tr>
                <th>Bus No.</th>
                <th>From</th>
                <th>To</th>
                <th>Time</th>
            </tr>
                    <%
                        String fr = (String)request.getAttribute("fr");
                        String tooo = (String)request.getAttribute("too");
             String jdbcurl="jdbc:mysql://localhost:3306/pro?useSSL=false";
        String user="root";
        String pass="kunal123@";
            Connection conn=null;
            Statement st=null;
            ResultSet rs=null;
            try{
                 System.out.println("connecting to datbase"+jdbcurl);
            Connection myConn=DriverManager.getConnection(jdbcurl,user,pass);
            System.out.println("Cnnection Established");
            st=myConn.createStatement();
            String qry=("select * from Tm where rom='"+fr+"' and too='"+tooo+"'");
            rs=st.executeQuery(qry);
            while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(3)%></td>
                </tr>
                <%
            }
            }catch(Exception e){
            
            }
            %>
            </thead>
        </table>
    </center>
        </div>   </center>
    </body>
</html>
