package project.Service.impl;

import project.Service.LoginService;
import project.dao.impl.LoginDaoImpl;
import project.pojo.User;

public class LoginServiceImpl implements LoginService {
    @Override
    public User checkLoginService(String uname, String pwd) {
        LoginDaoImpl LD = new LoginDaoImpl();
        return  LD.checkLoginDao(uname,pwd);
    }
}
