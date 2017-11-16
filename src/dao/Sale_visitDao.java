package dao;

import domain.Sale_visit;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;

public class Sale_visitDao extends HibernateDaoSupport {
    public void add(Sale_visit sale_visit) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        Serializable save = hibernateTemplate.save(sale_visit);
        System.out.println(save);
    }
}
