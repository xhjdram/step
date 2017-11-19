package my.webs.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import my.domain.User;
import my.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
public class UserAction implements ModelDriven<User> {
    User user = new User();
@Resource(name="userService")
    UserService userService ;

    public String login(){
        User user1 = userService.login(user);
        if(user1!=null){
            ActionContext.getContext().getSession().put("user",user1);
            return "toList";
        }else {
            return "toRegist";
        }
    }
    @Override
    public User getModel() {
        return user;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
