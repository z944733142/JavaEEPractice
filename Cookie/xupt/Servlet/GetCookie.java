package Cookie.xupt.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "GetCookie", urlPatterns = {"/GetCookie"})
public class GetCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");
        Cookie[] cks = req.getCookies();
        if(cks != null)
            for (Cookie c: cks
                  ) {
                System.out.println(c.getName()+ ":" + c.getValue());
            }
    }
}
