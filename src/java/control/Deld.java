
package control;

import com.hibernate.time.Deldd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Deld", urlPatterns = {"/Deld"})
public class Deld extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
int p=Integer.parseInt(request.getParameter("p"));
        System.out.print(p);
        Deldd.delroww(p);
        RequestDispatcher rs=request.getRequestDispatcher("Disp.jsp");
            rs.include(request,response);
    }

}
