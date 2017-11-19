package my.dao;

import my.domain.Base_dict;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("base_dictDao")
public class Base_dictDao extends HibernateDaoSupport {
    @Resource(name="sessionFactory")
    public void setsf(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }
    public List<Base_dict> selectBase(String dict_type_code) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Base_dict.class);
        detachedCriteria.add(Restrictions.eq("dict_type_code", dict_type_code));
        List<Base_dict> list = (List<Base_dict>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;

    }
}
