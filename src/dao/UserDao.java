package dao;

import domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {
    public User login(final User user) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        User execute = hibernateTemplate.execute(new HibernateCallback<User>() {
            @Override
            public User doInHibernate(Session session) throws HibernateException {
                String user_code = user.getUser_code();
                String hql = "  from User where user_code=?";
                Query query = session.createQuery(hql);
                query.setParameter(0,user_code);
                User o = (User) query.uniqueResult();
                return o;
            }
        });
        return execute;
    }
}
