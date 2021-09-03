package com.bj.controller;

import com.bj.exception.AgeException;
import com.bj.exception.MyUserException;
import com.bj.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,Integer age) throws MyUserException {
        ModelAndView mv = new ModelAndView();

        if ("zs".equals(name)){
            throw new NameException("name error");
        }

        if (age==null||age>80){
            throw new AgeException("age error");
        }

        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }




}
