package com.lakjay.MyWebApp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(@RequestParam("name") String myName, HttpSession session){


        System.out.println("Hi "+myName);
        session.setAttribute("name",myName);
        return "home";
    }

}
