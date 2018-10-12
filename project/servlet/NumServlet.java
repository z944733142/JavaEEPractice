package project.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.*;

public class NumServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        BufferedReader bw = null;
        FileReader fw = null;
        ServletContext hs = this.getServletContext();
        String path = hs.getRealPath("/doc/num.txt");
        try {
            System.out.println(path);
            fw = new FileReader(path);
            bw = new BufferedReader(fw);
            String nums = bw.readLine();
            System.out.println(nums);
            Integer num = null;
            if(nums != null)
            {
                num = new Integer(nums);
            }else {
                num = new Integer(0);
            }

            hs.setAttribute("num", num);
            System.out.println("set" + hs.getAttribute("num"));
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void destroy() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        ServletContext hs = this.getServletContext();
        String num = ((Integer) hs.getAttribute("num")).toString();
        String path = hs.getRealPath("/doc/num.txt");
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            if(num != null)
            {
                bw.write(num);
            }
            bw.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
