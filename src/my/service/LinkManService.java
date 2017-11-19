package my.service;
import my.dao.LinkManDao;
import my.domain.LinkMan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("linkManService")
@Transactional(isolation = Isolation.DEFAULT,readOnly = false,propagation = Propagation.REQUIRED)
public class LinkManService  {
    @Resource(name="linkManDao")
    LinkManDao linkManDao;
    public void save(LinkMan linkMan) {
        linkManDao.save(linkMan);
    }

    public void setLinkManDao(LinkManDao linkManDao) {
        this.linkManDao = linkManDao;
    }
}
