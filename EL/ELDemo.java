package EL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "Eldemo1", urlPatterns = "/el")
public class ELDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");

        User u = new User("张硕", 20, new Address("陕西", "西安"));
        User u2 = new User("张硕2", 21, new Address("陕西1", "西安1"));
        User u3 = new User("张硕3", 22, new Address("陕西2", "西安2"));

        List list = new ArrayList();
        list.add(u);
        list.add(u2);
        list.add(u3);

        Map map = new HashMap();
        map.put("1", u);
        map.put("2", u2);
        map.put("3", u3);

        req.setAttribute("map", map);
        req.setAttribute("list", list);
        req.setAttribute("User", u);
        req.setAttribute("str", "what f");
        req.getRequestDispatcher("/Jsp/EL.jsp").forward(req, resp);
    }
}
