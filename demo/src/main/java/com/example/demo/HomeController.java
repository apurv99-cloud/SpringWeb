package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp"; 
        // to display the .jsp we have add dependency TOMCAT JASPER, as SpringBoot personally don't supports .jsp file

    }

    @RequestMapping("add")
    // DespatcherServlet will automatically mapp without doing manually.
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        session.setAttribute("result", result); // Adding data in session object
        System.out.println(result);
        return "result.jsp";
    }

}
