package my.service;

import my.dao.CustomerDao;
import my.domain.Customer;
import my.domain.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
import javax.annotation.Resource;
import java.util.List;
@Service("custService")

public class CustomerService {
    @Resource(name="customerDao")
    private CustomerDao customerDao;
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false)
    public PageBean listCustomer(DetachedCriteria detachedCriteria, Integer count, Integer currentPage) {
        Integer totalCount = customerDao.getTotalCount(detachedCriteria);
        PageBean pageBean = new PageBean(totalCount, currentPage, count);
        Integer count1 = pageBean.getPageCount();
        Integer start = pageBean.getStart();
        List<Customer> list = customerDao.list(detachedCriteria, start, count1);
        pageBean.setList(list);
        return pageBean;
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false)
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false)
    public void addOrUpdate(Customer customer) {
        customerDao.addOrUpdate(customer);
    }
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false)
    public Customer getCustomer(Long cust_id) {
        customerDao.getCustomerDao(cust_id);
        return customerDao.getCustomerDao(cust_id);
    }
}
