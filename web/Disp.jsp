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
        overflow: hidden;
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
        margin-left: 1000px;
        margin-top: -40px;
        position: fixed;
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
.zxc{
    height: 40px;
    width: 220px;
    margin-top: 20px;
    font-size: 20px;
    background-color:#d4af7a;
    color: white;
}
.zxc:hover{
    color:#d4af7a;
    background-color: white;
}
.qwe{
    height:40px;
    width:220px;
    margin-top: 20px;
    font-size: 20px;
    background-color:#d4af7a;
    color: white;
}
.qwe:hover{
    color:#d4af7a;
    background-color: white;
}
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="logina.html" class="qwee" >   <div class="logo">You Bus</div></a>
        <font style="color:white; margin-left:50px;">Admin Account</font>
        <div class="s">
            <font class="bb"><a href="logina.html" class="qwee" >HOME</a></font>&nbsp; &nbsp;
            <a href="logina.html" class="qwee" onclick="" ><font class="bb">EDIT-TABLE</font></a>&nbsp; &nbsp;
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
                <th>Driver' Name</th>
                <th>Driver's Number</th>
            </tr>
                    <%
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
            String qry="select * from Dr";
            rs=st.executeQuery(qry);
            while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(2)%></td>
                </tr>
                <%
            }
            }catch(Exception e){
            
            }
            %>
            </thead>
        </table>
    </center>
            <button class="zxc" onclick="scrollSmoothToBottom()">Add New Driver</button>
            <button class="zxc" onclick="scrollSmoothToBottom()">Delete Driver Records</button>
        </div>   </center>
            
            <br><br><br><br><br><br><br><br><br><br>
            <center>
            <form action="Driver" method="post" name="aq" onsubmit="return myvaluuu()">
			<table>
			<thead>
				<tr>
					<th>BUS NO.</th>
					<th>DRIVER'S NAME</th>
					<th>DRIVER'S CONTACT NO.</th>
				</tr>
				<tr contenteditable >
                                    <td><input style=" color:black; width:100%; background-color: transparent; border:none;" type="text" name="bu" placeholder="Enter Bus No." class="btm" required ></td>
					<td><input style="color:black; width:100%; background-color: transparent; border:none;" type="text" name="nm" placeholder="Enter Name" class="btm" required></td>
					<td><input style="color:black; width:100%; background-color: transparent; border:none;" type="text" name="cn" placeholder="Enter Contact No." class="btm" required></td>
				</tr>
			</thead>
		</table>
                            <button type="submit" class="qwe">Enter New Row</button>   
                        </form>
            </center>
            <br>
            <br><br>
            <form action="Deld" method="post" name="aqq" onsubmit="return myv()">
                <center><font style="color:white; font-size: 20px;">Enter Bus No. of Driver You want To delete</font></center><br>
                <center><input type="text" name="p" style="border: none; color:white; border-bottom: 3px solid white; background-color:transparent; ">
                </center>
                <center><button type="submit" class="qwe">Delete Row</button> </center>
            </form>
            <br>
            <br><br><br>
            <center>    <button style=" height:20px; width: 70px; background-color:#d4af7a; color:white;" onclick="scrollToTop()">TOP</button>
            </center>   <br><br><br>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script type="text/javascript">
	scrollingElement = (document.scrollingElement || document.body)
function scrollToTop (id) {
   scrollingElement.scrollTop =0;
}
function scrollSmoothToBottom (id) {
   $(scrollingElement).animate({
      scrollTop: document.body.scrollHeight
   }, 1500);
}

</script>
    </body>
</html>
