package service;
import dao.LinkManDao;
import domain.LinkMan;

public class LinkManService  {
    LinkManDao linkManDao;
    public void save(LinkMan linkMan) {
        linkManDao.save(linkMan);
    }

    public void setLinkManDao(LinkManDao linkManDao) {
        this.linkManDao = linkManDao;
    }
}
