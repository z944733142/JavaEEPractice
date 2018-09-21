package project.dao;

import project.pojo.User;

public interface LoginDao {
    User checkLoginDao(String uname, String pwd);
}
