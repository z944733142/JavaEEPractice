package Cookie.xupt.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie", urlPatterns = {"/cookie"})
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset = utf-8");
        resp.setCharacterEncoding("utf-8");

        Cookie ck = new Cookie("id", "04171056");
        Cookie ck2 = new Cookie("what", "zs");
                // （默认）ck 临时存储 关闭浏览器失效。
        ck2.setMaxAge(24*3600);  // 单位为秒  存储在硬盘中 定时存储
        // 设置有效路径

        ck2.setPath("/cookie/abc");  // 请求abc会带
        
        resp.addCookie(ck);
        resp.addCookie(ck2);
        resp.getWriter().write("1");
    }
}
