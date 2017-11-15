package service;

import com.sun.org.apache.regexp.internal.RE;
import dao.UserDao;
import domain.User;

public class UserService {
    UserDao userDao;

    public User login(User user) {
        return userDao.login(user
        ) ;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
