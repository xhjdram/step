package my.domain;

import java.util.HashSet;
import java.util.Set;

public class User {
    //      `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
//            `user_code` varchar(32) NOT NULL COMMENT '用户账号',

    //            `user_name` varchar(64) NOT NULL COMMENT '用户名称',
    //            `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
    //            `user_password` varchar(32) NOT NULL COMMENT '用户密码',
    private Integer u_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private Character user_state;
    private Set<Sale_visit> set = new HashSet<Sale_visit>();
    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Character getUser_state() {
        return user_state;
    }

    public void setUser_state(Character user_state) {
        this.user_state = user_state;
    }

    public Set<Sale_visit> getSet() {
        return set;
    }

    public void setSet(Set<Sale_visit> set) {
        this.set = set;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}
