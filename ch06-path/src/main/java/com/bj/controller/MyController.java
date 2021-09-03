package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "user/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        mv.setViewName("/index.jsp");
        return mv;
    }


}
