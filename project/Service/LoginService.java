package project.Service;

import project.pojo.User;

public interface LoginService {
    User checkLoginService(String uname, String pwd);
}
