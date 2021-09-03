package com.bj.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class MyInterceptor implements HandlerInterceptor {
    private long btime=0;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor   1");


        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView mv) throws Exception {

        System.out.println("MyInterceptor    2");
        /*if (mv!=null){
            mv.addObject("myDate",new Date());
            mv.setViewName("other");
        }*/
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor      3");

    }
}
