package my.dao;

import my.domain.Sale_visit;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
@Repository("sale_visitDao")
public class Sale_visitDao extends HibernateDaoSupport {
    @Resource(name="sessionFactory")
    public void setSf(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public void add(Sale_visit sale_visit) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        Serializable save = hibernateTemplate.save(sale_visit);
        System.out.println(save);
    }
}
