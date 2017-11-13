package webs.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Customer;
import domain.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import service.CustomerService;

import java.io.File;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    Customer customer = new Customer();
//    private File photo;
//    private String photoFileName;
//    private String photoContentType;

    private Integer count;

    private Integer currentPage;

    private CustomerService customerService;
    public String list() throws Exception {
        PageBean pageBean;
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
        if (customer.getCust_name() == null) {
            pageBean = customerService.listCustomer(detachedCriteria, count, currentPage);
        } else {
            detachedCriteria.add(Restrictions.like("cust_name", "%" + customer.getCust_name() + "%"));
            pageBean = customerService.listCustomer(detachedCriteria, count, currentPage);
        }

        ActionContext context = ActionContext.getContext();
        context.put("pageBean", pageBean);
        return "list";
    }

    public String add(){
        customerService.addOrUpdate(customer);
//        photo.renameTo(new File("D:/my.jpg"));
//        System.out.println(photoFileName);
//        System.out.println(photoContentType);
        return "toAction";
    }
    public String edit(){
        Customer customer1 =customerService.getCustomer(customer.getCust_id());
        ActionContext context = ActionContext.getContext();
        System.out.println(customer1.toString());
        context.put("customer",customer1);
        return "add";
    }


    @Override
    public Customer getModel() {
        return customer;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
//
//    public void setPhoto(File photo) {
//        this.photo = photo;
//    }
//
//    public void setPhotoFileName(String photoFileName) {
//        this.photoFileName = photoFileName;
//    }
//
//    public void setPhotoContentType(String photoContentType) {
//        this.photoContentType = photoContentType;
//    }
}
