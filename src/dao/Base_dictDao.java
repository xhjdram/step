package dao;

import domain.Base_dict;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class Base_dictDao extends HibernateDaoSupport {
    public List<Base_dict> selectBase(String dict_type_code) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Base_dict.class);
        detachedCriteria.add(Restrictions.eq("dict_type_code", dict_type_code));
        List<Base_dict> list = (List<Base_dict>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;

    }
}
