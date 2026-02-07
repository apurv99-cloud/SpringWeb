package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
        // to display the .jsp we have add dependency TOMCAT JASPER, as SpringBoot
        // personally don't supports .jsp file

    }

    @RequestMapping("add")
    // DespatcherServlet will automatically map without doing manually.
    // public String add(int num1, int num2, HttpSession session) {
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
        // int num1 = Integer.parseInt(req.getParameter("num1"));
        // int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        // session.setAttribute("result", result); // Adding data in session object
        // model.addAttribute("result", result);
        mv.addObject("result", result);
        mv.setViewName("result");
        System.out.println(result);
        return mv;
    }

}
