package project.servlet;

import project.Service.LoginService;
import project.Service.impl.LoginServiceImpl;
import project.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "Resp", urlPatterns = "/RespDemo")
public class RespDemo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        // 获取请求信息
        String method = req.getMethod();
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        // 处理请求信息
        // 获取业务层对象
        LoginService ls = new LoginServiceImpl();
        User u = ls.checkLoginService(uname, pwd);
        System.out.println(u);
        if(u != null)
        {
            resp.getWriter().write("登陆成功");
            resp.getWriter().write(  u.getUid() +  u.getUname()+  u.getPwd());
        }
        else {
            req.getRequestDispatcher("login").forward(req, resp);

        }
    }
}
