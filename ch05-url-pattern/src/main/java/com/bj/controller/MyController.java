package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value = "user")
public class MyController {

    @RequestMapping(value = "some")
    public ModelAndView doSome(String name, Integer age){
        System.out.println(name+age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }


}
