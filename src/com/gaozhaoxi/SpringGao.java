package com.gaozhaoxi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Leon
 */
@Controller
public class SpringGao {
    @RequestMapping(value = "/lichunxiang", method = RequestMethod.GET)
    public String printHello(ModelMap model){
//        model.addAttribute("msg", "Spring MVC Hello World");
//        model.addAttribute("name", "yuntao");
        return "gaozhaoxi";
    }
}
