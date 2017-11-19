package my.domain;

import java.util.Date;

public class Sale_visit {
    //      `visit_id` varchar(32) NOT NULL,
    private String visit_id;
    //            `visit_nexttime` date DEFAULT NULL COMMENT '下次拜访时间',

    //            `visit_detail` varchar(256) DEFAULT NULL COMMENT '拜访详情',
    private String visit_interviewee;
    //            `visit_addr` varchar(128) DEFAULT NULL COMMENT '拜访地点',
    private String visit_addr;
    //            `visit_interviewee` varchar(32) DEFAULT NULL COMMENT '被拜访人',
    private String visit_detail;
    //            `visit_time` date DEFAULT NULL COMMENT '拜访时间',
    private Date visit_time;
    //            `visit_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
    private Date visit_nexttime;
    //  `visit_cust_id` bigint(32) DEFAULT NULL COMMENT '客户id',
    private User user;
    private Customer customer;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }



    public String getVisit_interviewee() {
        return visit_interviewee;
    }

    public void setVisit_interviewee(String visit_interviewee) {
        this.visit_interviewee = visit_interviewee;
    }

    public String getVisit_addr() {
        return visit_addr;
    }

    public void setVisit_addr(String visit_addr) {
        this.visit_addr = visit_addr;
    }

    public String getVisit_detail() {
        return visit_detail;
    }

    public void setVisit_detail(String visit_detail) {
        this.visit_detail = visit_detail;
    }

    public Date getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(Date visit_time) {
        this.visit_time = visit_time;
    }

    public Date getVisit_nexttime() {
        return visit_nexttime;
    }

    public void setVisit_nexttime(Date visit_nexttime) {
        this.visit_nexttime = visit_nexttime;
    }
}
