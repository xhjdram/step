package webs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Sale_visit;
import service.Sale_visitService;

public class Sale_visitAction extends ActionSupport implements ModelDriven<Sale_visit> {
    Sale_visit sale_visit =new Sale_visit();
    Sale_visitService sale_visitService;
    public String add(){
        sale_visitService.add(sale_visit);
        return "toList";
    }

    @Override

    public Sale_visit getModel() {
        return sale_visit;
    }

    public void setSale_visitService(Sale_visitService sale_visitService) {
        this.sale_visitService = sale_visitService;
    }
}
