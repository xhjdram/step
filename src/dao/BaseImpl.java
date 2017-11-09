package dao;

import org.hibernate.criterion.DetachedCriteria;

import org.hibernate.criterion.Projections;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import java.util.List;

public class BaseImpl<T> extends HibernateDaoSupport implements BaseDAo<T> {
    Class clazz;

    public BaseImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class) genericSuperclass.getActualTypeArguments()[0];
    }

    @Override
    public void save(T t) {
        this.getHibernateTemplate().save(t);
    }

    @Override
    public void delet(T t) {
        this.getHibernateTemplate().delete(t);

    }

    @Override
    public void delet(Serializable id) {
        T byId = this.getById(id);
        this.getHibernateTemplate().delete(byId);
    }

    @Override
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    @Override
    public T getById(Serializable id) {
        T o = this.getHibernateTemplate().get((Class<T>) clazz, id);
        return o;
    }

    @Override
    public Integer getTotalCount(DetachedCriteria detachedCriteria) {
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> byCriteria = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        detachedCriteria.setProjection(null);
        if (byCriteria != null && byCriteria.size() > 0) {
            return byCriteria.get(0).intValue();
        } else {
            return null;
        }
    }

    @Override
    public List<T> getPageList(DetachedCriteria detachedCriteria, Integer start, Integer count) {
        List<T> byCriteria = (List<T>) this.getHibernateTemplate().findByCriteria(detachedCriteria, start, count);
        return byCriteria;
    }
}
