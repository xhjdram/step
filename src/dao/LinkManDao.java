package dao;

import domain.LinkMan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class LinkManDao extends HibernateDaoSupport {
    public void save(LinkMan linkMan) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        hibernateTemplate.saveOrUpdate(linkMan);
    }
}
