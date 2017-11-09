package dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public interface BaseDAo<T>  {
    public void save(T t);
    public void delet(T t);
    public void delet(Serializable id);
    public void update(T t);
    public T getById(Serializable id  );
    public Integer getTotalCount(DetachedCriteria detachedCriteria);
    public List<T> getPageList(DetachedCriteria detachedCriteria,Integer start,Integer count);
}
