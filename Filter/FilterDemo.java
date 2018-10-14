package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "aFilter", urlPatterns = "/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            servletRequest.setCharacterEncoding("utf-8");
            servletResponse.setContentType("text/html;charset=utf-8");
            servletResponse.getWriter().write("Filter运行1");
            filterChain.doFilter(servletRequest, servletResponse);
            servletResponse.getWriter().write("Filter运行2");
    }

    @Override
    public void destroy() {
        System.out.println("Filter摧毁");
    }
}
