
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Searchh", urlPatterns = {"/Searchh"})
public class Searchh extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            String fr=request.getParameter("fr");
            String too=request.getParameter("too");
            request.setAttribute("fr",fr);
            request.setAttribute("too",too);
            RequestDispatcher rd=request.getRequestDispatcher("/Displaydaos.jsp");
            rd.forward(request, response);
    }

}
