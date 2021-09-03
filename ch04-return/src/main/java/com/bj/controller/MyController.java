package com.bj.controller;

import com.bj.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping(value = "user")
public class MyController {

    @RequestMapping(value = "returnString-view.do")
    public String doReturnString(HttpServletRequest request, String name, Integer age){
        System.out.println(name+age);
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);

        return "show";
    }

    @RequestMapping(value = "returnString-view2.do")
    public String doReturnString2(HttpServletRequest request, String name, Integer age){
        System.out.println(name+age);
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);

        return "/WEB-INF/view/show.jsp";
    }
    @RequestMapping(value = "returnVoid-ajax.do")
    public void doReturnVoidAjax(HttpServletResponse response, String name, Integer age) throws IOException {
        System.out.println(name+age);
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        String json = null;
        if (student!=null){
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);

            System.out.println(json);
        }

        response.setContentType("application/json;charset=utf-8");

        PrintWriter out = response.getWriter();
        out.println(json);
        out.flush();
        out.close();
    }
    @RequestMapping(value = "returnStudentJson.do")
    @ResponseBody
    public Student doStudentJsonObject(String name, Integer age) {
        Student student = new Student();
        student.setName("jack");
        student.setAge(20);
        return student;
    }

    @RequestMapping(value = "returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doStudentJsonObject1(String name, Integer age) {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("jack");
        student.setAge(20);
        list.add(student);

        student = new Student();
        student.setName("jack1");
        student.setAge(202);
        list.add(student);

        return list;
    }

    @RequestMapping(value = "/returnStringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name,Integer age){
        return "hello  当他听到";
    }

}
