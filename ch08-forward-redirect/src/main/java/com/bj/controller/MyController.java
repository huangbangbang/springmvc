package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/doForward.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        //mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("forward:/hello.jsp");
        return mv;
    }


    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView doSome1(String name,Integer age){
        ModelAndView mv = new ModelAndView();

        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("redirect:/hello.jsp");
        //mv.setViewName("redirect:/WEB-INF/view/show.jsp");
        return mv;
    }


}
