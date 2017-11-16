package service;

import dao.Sale_visitDao;
import domain.Sale_visit;

public class Sale_visitService {
    Sale_visitDao sale_visitDao;

    public void add(Sale_visit sale_visit) {
        sale_visitDao.add(sale_visit);
    }

    public void setSale_visitDao(Sale_visitDao sale_visitDao) {
        this.sale_visitDao = sale_visitDao;
    }
}
