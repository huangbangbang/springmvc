package com.bj.handler;


import com.bj.exception.AgeException;
import com.bj.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","name is not zs");
        mv.addObject("ex",exception);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","age is more than 80");
        mv.addObject("ex",exception);
        mv.setViewName("ageError");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","default error");
        mv.addObject("ex",exception);
        mv.setViewName("defaultError");
        return mv;
    }
}
