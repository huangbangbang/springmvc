package com.bj.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String loginName = "";
        Object attr  = request.getSession().getAttribute("name");

        if (attr!=null){
            loginName=(String)attr;
        }

        if (!"jack".equals(loginName)){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }
        return true;
    }


}
