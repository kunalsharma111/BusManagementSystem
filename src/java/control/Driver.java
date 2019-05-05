package control;

import com.hibernate.time.Ddao;
import com.hibernate.time.Dr;
import com.hibernate.time.Tm;
import com.hibernate.time.Userdaoo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Driver", urlPatterns = {"/Driver"})
public class Driver extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(Integer.parseInt(request.getParameter("bu")));
            int bu=Integer.parseInt(request.getParameter("bu"));
            String nm=request.getParameter("nm");
            int cn=Integer.parseInt(request.getParameter("cn"));
            Dr dd=new Dr();
            dd.setBu(bu);
            dd.setNm(nm);
            dd.setCn(cn);
            Ddao uddd=new Ddao();
            System.out.println(uddd.checkk(dd));
            RequestDispatcher rs=request.getRequestDispatcher("Disp.jsp");
            rs.include(request,response);  
    }


}
