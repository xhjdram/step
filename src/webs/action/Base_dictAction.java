package webs.action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Base_dict;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import service.Base_dictService;

import java.util.List;

public class Base_dictAction extends ActionSupport {
    private String dict_type_code;

    private Base_dictService base_dictService;

    @Override
    public String execute() throws Exception {
        List<Base_dict> list = base_dictService.selectBase(dict_type_code);
        String s = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("application/json;utf-8");
        ServletActionContext.getResponse().getWriter().write(s);
        return null;
    }

    public void setDict_type_code(String dict_type_code) {
        this.dict_type_code = dict_type_code;
    }

    public void setBase_dictService(Base_dictService base_dictService) {
        this.base_dictService = base_dictService;
    }
}
