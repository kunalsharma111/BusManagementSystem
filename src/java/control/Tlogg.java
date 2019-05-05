
package control;

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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author kunal
 */
@WebServlet(name = "Tlogg", urlPatterns = {"/Tlogg"})
public class Tlogg extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
            System.out.println(Integer.parseInt(request.getParameter("bn")));
            int bn=Integer.parseInt(request.getParameter("bn"));
            String rom=request.getParameter("rom");
            String too=request.getParameter("too");
            int tim=Integer.parseInt(request.getParameter("tim"));
            Configuration cf=new Configuration();
        cf.configure("hibernate1.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        
            Tm ttt=new Tm();
            ttt.setBn(bn);
            ttt.setRom(rom);
            ttt.setToo(too);
            ttt.setTim(tim);
            session.save(ttt);
            tf.commit();
            session.close();
            sf.close();
            RequestDispatcher rs=request.getRequestDispatcher("Fac");
            rs.include(request,response);  
    }
}
