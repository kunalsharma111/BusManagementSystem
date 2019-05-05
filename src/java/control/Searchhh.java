
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Searchhh", urlPatterns = {"/Searchhh"})
public class Searchhh extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            String frr=request.getParameter("frr");
            String ttoo=request.getParameter("ttoo");
            request.setAttribute("frr",frr);
            request.setAttribute("ttoo",ttoo);
            RequestDispatcher rd=request.getRequestDispatcher("/Displaydaoss.jsp");
            rd.forward(request, response);
    }

}
