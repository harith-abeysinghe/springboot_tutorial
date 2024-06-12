package com.harith.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    

    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        
        HttpSession session = request.getSession(); // create a session
        
        String name = request.getParameter("name");

        System.out.println("Hello " + name);
        session.setAttribute("name", name); //passing the name to the session
        return "home";
    }
}
