package my.dao;

import my.domain.LinkMan;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("linkManDao")
public class LinkManDao extends HibernateDaoSupport {
    @Resource(name="sessionFactory")
    public void setSf(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);

    }
    public void save(LinkMan linkMan) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        hibernateTemplate.saveOrUpdate(linkMan);
    }
}
