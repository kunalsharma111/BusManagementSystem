package control;
import com.hibernate.bean.User;
import com.hibernate.bean.Userdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Logg", urlPatterns = {"/Logg"})
public class Logg extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html:charset=UTf-8");
            PrintWriter out=response.getWriter();
            System.out.println(request.getParameter("urn"));
            String urn=request.getParameter("urn");
            String psw=request.getParameter("psw");
            String dropdown=request.getParameter("dropdown");
            User u=new User();
            u.setUrn(urn);
            u.setPsw(psw);
            u.setLl(dropdown);
            Userdao ud=new Userdao();
            System.out.println(ud.check(u));
            response.sendRedirect("inde.html");
    }
}
