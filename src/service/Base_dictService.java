package service;

import dao.Base_dictDao;
import domain.Base_dict;

import java.util.List;

public class Base_dictService {
    public void setBase_dictDao(Base_dictDao base_dictDao) {
        this.base_dictDao = base_dictDao;
    }

    private Base_dictDao base_dictDao;

    public List<Base_dict> selectBase(String dict_type_code) {
        List<Base_dict> list = base_dictDao.selectBase(dict_type_code);
        return list;
    }
}
