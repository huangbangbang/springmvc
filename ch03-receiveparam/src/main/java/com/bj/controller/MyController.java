package com.bj.controller;

import com.bj.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value = "user")
public class MyController {

    @RequestMapping(value = "/receive.do")
    public ModelAndView do1( String name, Integer age){
        System.out.println(name+age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/receive1.do")
    public ModelAndView do2(@RequestParam(value = "rname",required = false) String name,
                            @RequestParam(value = "rage",required = false) Integer age){
        System.out.println(name+age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/receive2.do")
    public ModelAndView do3(Student student){
        System.out.println(student.getName()    +student.getAge()     +student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",student.getName());
        mv.addObject("myage",student.getAge());
        mv.addObject("student",student);
        mv.setViewName("show");
        return mv;
    }
}
