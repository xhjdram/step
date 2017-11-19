package my.service;

import my.dao.Base_dictDao;
import my.domain.Base_dict;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("base_dictService")
public class Base_dictService {
    @Resource(name="base_dictDao")
    public void setBase_dictDao(Base_dictDao base_dictDao) {
        this.base_dictDao = base_dictDao;
    }

    private Base_dictDao base_dictDao;

    public List<Base_dict> selectBase(String dict_type_code) {
        List<Base_dict> list = base_dictDao.selectBase(dict_type_code);
        return list;
    }
}
