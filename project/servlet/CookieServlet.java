package project.servlet;

import project.Service.LoginService;
import project.Service.impl.LoginServiceImpl;
import project.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookies", urlPatterns = "/ck")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");

        Cookie[] cks = req.getCookies();
        System.out.println(cks);
        if(cks != null)
        {
            String uid = "";
            for (Cookie c: cks
                 ) {
                if (c.getName().equals("uid"))
                {
                    uid = c.getValue();
                    break;
                }
            }
            System.out.println(2);
            if (uid.equals(""))
            {
                System.out.println(1);
                req.getRequestDispatcher("/login").forward(req,resp);
                return ;
            }
            LoginService LS = new LoginServiceImpl();
            User u = LS.checkUid(uid);
            resp.sendRedirect("/main");
        }
        else {
            System.out.println(3);
            req.getRequestDispatcher("/login").forward(req,resp);
        }

    }
}
