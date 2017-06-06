package pers.lyks.spring.boot.controller.area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.lyks.spring.boot.controller.BaseController;
import pers.lyks.spring.boot.model.area.AdministrativeModel;
import pers.lyks.spring.boot.service.AdministrativeService;

import java.util.List;

/**
 * @author lawyerance
 * @version 1.0 2017-06-05
 */
@Controller
@RequestMapping(value = "/area")
public class AdministrativeController extends BaseController {
    @Autowired
    private AdministrativeService administrativeService;

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    @ResponseBody
    public Object get(@PathVariable String code) {
        List<AdministrativeModel> administrativeModels = administrativeService.getChildren(code);
        return success("OK", administrativeModels);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Object all() {
        List<AdministrativeModel> administrativeModels = administrativeService.getAll();
        return success("OK", administrativeModels);
    }
}
