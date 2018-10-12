package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletContextDemo02", urlPatterns = "/Context2")
public class ServletContextDemo02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");

        ServletContext SC = this.getServletContext();
        resp.getWriter().write("name:" + SC.getAttribute("name"));
        resp.getWriter().write("id:" + SC.getAttribute("id"));

    }
}
