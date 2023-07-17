package com.lakjay.MyWebApp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
        public String home(HttpServletRequest req){
        String name =req.getParameter("name");
System.out.println("Hi "+name);

return "home";
    }

}
