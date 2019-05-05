package control;

import com.hibernate.time.Dell;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Deleteroww", urlPatterns = {"/Deleteroww"})
public class Deleteroww extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
             int del=Integer.parseInt(request.getParameter("del"));
        System.out.print(del);
        Dell.delrow(del);
        RequestDispatcher rs=request.getRequestDispatcher("Faca");
            rs.include(request,response);
   
    }

}
