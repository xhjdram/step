package dao;

import domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDao extends HibernateDaoSupport {
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
}
