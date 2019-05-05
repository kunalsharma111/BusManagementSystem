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

@WebServlet(name = "Tloggg", urlPatterns = {"/Tloggg"})
public class Tloggg extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int bn=Integer.parseInt(request.getParameter("bn"));
            String rom=request.getParameter("rom");
            String too=request.getParameter("too");
            int tim=Integer.parseInt(request.getParameter("tim"));
            Tm ttt=new Tm();
            ttt.setBn(bn);
            ttt.setRom(rom);
            ttt.setToo(too);
            ttt.setTim(tim);
            Userdaoo uddd=new Userdaoo();
            System.out.println(uddd.checkk(ttt));
            RequestDispatcher rs=request.getRequestDispatcher("Faca");
            rs.include(request,response); 
    }

}
