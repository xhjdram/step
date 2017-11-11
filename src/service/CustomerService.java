package service;

import dao.CustomerDao;
import domain.Customer;
import domain.PageBean;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public class CustomerService {
    private CustomerDao customerDao;

    public PageBean listCustomer(DetachedCriteria detachedCriteria, Integer count, Integer currentPage) {
        Integer totalCount = customerDao.getTotalCount(detachedCriteria);
        PageBean pageBean = new PageBean(totalCount, currentPage, count);
        Integer count1 = pageBean.getPageCount();
        Integer start = pageBean.getStart();
        List<Customer> list = customerDao.list(detachedCriteria, start, count1);
        pageBean.setList(list);
        return pageBean;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add(Customer customer) {
        customerDao.add(customer);
    }
}
