package control;

import com.hibernate.time.Del;
import com.hibernate.time.Tm;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet(name = "Deleterow", urlPatterns = {"/Deleterow"})
public class Deleterow extends HttpServlet {

    protected void  doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int del=Integer.parseInt(request.getParameter("del"));
        System.out.print(del);
        Configuration cf=new Configuration();
        cf.configure("hibernate1.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        Tm t=new Tm();
        t.setBn(del);
        session.delete(t);
        tf.commit();
        session.close();
        sf.close();
        RequestDispatcher rs=request.getRequestDispatcher("Fac");
        rs.include(request,response);
    }

}
