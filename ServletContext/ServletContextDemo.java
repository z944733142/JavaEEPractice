package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletContextDemo", urlPatterns = "/Context")
public class ServletContextDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");

        ServletContext SC = this.getServletContext();
        ServletContext SC2 = this.getServletConfig().getServletContext();
        ServletContext SC3 = req.getSession().getServletContext();

        System.out.println(SC == SC2);
        System.out.println(SC2 == SC3);

        SC.setAttribute("name", "zhangshuo");
        SC2.setAttribute("id", "10086");

        resp.getWriter().write(SC.getRealPath("/doc/test.txt"));

        resp.getWriter().write(SC.getResourceAsStream("/doc/test.txt").toString());
    }
}
