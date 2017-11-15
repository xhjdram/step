package webs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Customer;
import domain.LinkMan;
import service.LinkManService;

public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan> {
    LinkManService linkManService;

    LinkMan linkMan = new LinkMan() ;

    public String save(){
        Long cust_id = linkMan.getCust_id();
        Customer customer =new Customer();
        customer.setCust_id(cust_id);
        linkMan.setCustomer(customer);
        linkManService.save(linkMan);
        return "list";
    }
    @Override
    public LinkMan getModel() {
        return linkMan;
    }
    public void setLinkManService(LinkManService linkManService) {
        this.linkManService = linkManService;
    }
}
