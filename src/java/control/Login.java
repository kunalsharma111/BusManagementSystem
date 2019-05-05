package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
       String username=request.getParameter("username");
       String pwd=request.getParameter("pwd");
       String dropdown=request.getParameter("dropdown");
       if(username.equals("admin") && pwd.equals("admin")){
           System.out.println("Admin account");
           RequestDispatcher rs=request.getRequestDispatcher("logina.html");
           rs.forward(request,response);
       }
       else if(Validate.checkUser(username,pwd)){
           if(Validate.checkaq(username,dropdown)){
            System.out.println("student's username or password correct");
           RequestDispatcher rs=request.getRequestDispatcher("logins.html");
           rs.forward(request,response);
           }
           else{
           System.out.println("Faculty's username or password correct");
           RequestDispatcher rs=request.getRequestDispatcher("loginf.html");
           rs.forward(request,response);
           }
            
       }
       else{
           System.out.println("username or password incorrect");
           RequestDispatcher rs=request.getRequestDispatcher("inde.html");
           rs.include(request,response);    
       }
    }

}
