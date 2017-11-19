package my.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

public interface BaseDAo<T> {
    void save(T t);

    void delet(T t);

    void delet(Serializable id);

    void update(T t);

    T getById(Serializable id);

    Integer getTotalCount(DetachedCriteria detachedCriteria);

    List<T> getPageList(DetachedCriteria detachedCriteria, Integer start, Integer count);
}
