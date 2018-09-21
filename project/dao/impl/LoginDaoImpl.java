package project.dao.impl;

import project.dao.LoginDao;
import project.pojo.User;
import java.sql.*;

public class LoginDaoImpl implements LoginDao {
    @Override
    public User checkLoginDao(String uname, String pwd) {
        //声明JDBC对象
        Connection con = null;
        PreparedStatement ps = null;
        //声明数据存储对象
        ResultSet rs = null;
        User u = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC&characterEncoding=utf-8&allowPublicKeyRetrieval=true","root","159630235z");
            //创建sql命令
            String sql = "select * from login where uname = ? and pwd = ?";
            //创建sql命令对象
            ps = con.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,uname);
            ps.setString(2,pwd);
            //执行
            rs = ps.executeQuery();
            while (rs.next())
            {
                u = new User();
                u.setUid(rs.getInt("id"));
                u.setUname(rs.getString("uname"));
                u.setPwd(rs.getString("pwd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return u;
    }
}
