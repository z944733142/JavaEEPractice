package xupt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Servlet", urlPatterns = "/my")
public class ReqDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 请求头
        System.out.println(req.getCookies());
        System.out.println(req.getMethod());
        System.out.println(req.getRequestURL() + "    " + req.getRequestURI());
        System.out.println(req.getScheme());

        // 请求行

        System.out.println(req.getHeader("Host"));
        System.out.println(req.getHeader("abcde"));
        Enumeration e = req.getHeaderNames();
        while (e.hasMoreElements()) {
            String temp = (String) e.nextElement();
            System.out.println(temp + ":" + req.getHeader(temp));
        }

        // 请求正文 用户数据
        System.out.println(req.getParameter("uname"));
        System.out.println(req.getParameter("pwd"));
        String[] favs = req.getParameterValues("fav");  // 同键不同值

        if (favs != null)
            for (String a :
                    favs
            ) {
                System.out.println(a);
            }

            Enumeration e1 = req.getParameterNames();   // 所有值的名字枚举
    }
}
