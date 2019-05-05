package control;

import com.hibernate.time.Tm;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet(name = "Faca", urlPatterns = {"/Faca"})
public class Faca extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Configuration cf=new Configuration();
        cf.configure("hibernate1.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        Query query=session.createQuery("from  Tm");
        List<Tm> records=query.list();
        request.setAttribute("List1",records);
        RequestDispatcher rd=request.getRequestDispatcher("Dis.jsp");
        rd.forward(request,response);
        
    }


}
