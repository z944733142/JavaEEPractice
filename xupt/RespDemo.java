package xupt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "respDemo", urlPatterns = "/resp")
public class RespDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("key", "value");
        resp.setHeader("key", "value2");    // 不存在新建， 存在覆盖
        resp.addHeader("mouse","lg");
        resp.addHeader("mouse","ls");       // 新建， 两个都存在

        // 设置响应状态码
        // resp.sendError(404,"what fuck");
        // 状态码不设置可自动附加（200,404,500...）
        resp.setHeader("content-type", "text/html;charset=utf-8");// 设置编码，支持中文 （html格式）
        // resp.setHeader("content-type", "text/plain;charset=utf-8"); // 设置文本格式
        // resp.setHeader("content-type", "text/xml;charset=utf-8"); // 设置xml格式


        resp.getWriter().write("今天天气真好");

        resp.getWriter().write("this is response study");
    }
}
