package pers.lyks.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import pers.lyks.spring.boot.service.AdministrativeService;

/**
 * @author lawyerance
 * @version 1.0 2017-05-10
 */
@RestController
@EnableAutoConfiguration
public class SampleController extends BaseController {

    @Autowired
    private AdministrativeService administrativeService;

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "Welcome to use spring boot.";
    }


    @RequestMapping(value="/hello",method = RequestMethod.POST)
    @ResponseBody
    String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "hello " + name;
    }


    @RequestMapping("/hello/{name}")
    @ResponseBody
    String helloVariable(@PathVariable String name) {
        return "hello " + name;
    }

    @RequestMapping("/admin")
    @ResponseBody
    Object admin() {
        return success("OK", this.administrativeService.getAll());
    }
}
