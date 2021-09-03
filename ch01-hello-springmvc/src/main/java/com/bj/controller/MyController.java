package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = {"/other.do","/other1.do"})
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        mv.setViewName("other");
        return mv;
    }
}
