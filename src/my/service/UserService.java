package my.service;

import my.dao.UserDao;
import my.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional(readOnly = false,isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public class UserService {
    @Resource(name="userDao")
    UserDao userDao;
@Transactional(readOnly = false,isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED)
    public User login(User user) {
        return userDao.login(user
        ) ;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
