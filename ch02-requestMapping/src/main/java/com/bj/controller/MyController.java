package com.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "user")
public class MyController {

    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = {"/other.do","/other1.do"},method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.addObject("fun","method");
        mv.setViewName("other");
        return mv;
    }

    @RequestMapping(value = "/third.do")
    public ModelAndView do1(HttpServletRequest request,
                            HttpServletResponse response,
                            HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",request.getParameter("name"));
        mv.addObject("fun","method");
        mv.setViewName("show");
        return mv;
    }
}
