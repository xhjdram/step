package my.dao;

import my.domain.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("customerDao")
public class CustomerDao extends HibernateDaoSupport {
    @Resource(name="sessionFactory")
    public void setSf(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public Integer getTotalCount(final DetachedCriteria detachedCriteria) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();

        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> list = (List<Long>) hibernateTemplate.findByCriteria(detachedCriteria);
        detachedCriteria.setProjection(null);
        return list.get(0).intValue();


    }


    public List<Customer> list(DetachedCriteria detachedCriteria, Integer start, Integer count) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<Customer> byCriteria = (List<Customer>) hibernateTemplate.findByCriteria(detachedCriteria, start, count);
        return byCriteria;
    }

    public void addOrUpdate(Customer customer) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        hibernateTemplate.saveOrUpdate(customer);
    }

    public Customer getCustomerDao(Long cust_id) {
       return this.getHibernateTemplate().get(Customer.class,cust_id);
    }
}
