package my.service;

import my.dao.Sale_visitDao;
import my.domain.Sale_visit;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("sale_visitService")
@Transactional(isolation = Isolation.DEFAULT,readOnly = false,propagation = Propagation.REQUIRED)
public class Sale_visitService {
    @Resource(name="sale_visitDao")
    Sale_visitDao sale_visitDao;

    public void add(Sale_visit sale_visit) {
        sale_visitDao.add(sale_visit);
    }

    public void setSale_visitDao(Sale_visitDao sale_visitDao) {
        this.sale_visitDao = sale_visitDao;
    }
}
