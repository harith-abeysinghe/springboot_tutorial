package com.harith.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    

    @RequestMapping("/home")
    // public String home(HttpServletRequest request) {
        
    //     HttpSession session = request.getSession(); // create a session
        
    //     String name = request.getParameter("name");

    //     System.out.println("Hello " + name);
    //     session.setAttribute("name", name); //passing the name to the session
    //     return "home";
    // }
    // public String home(@RequestParam("name") String myName, HttpSession session) { //instead of HttpServletRequest request

    //     System.out.println("Hello " + myName);
    //     session.setAttribute("name", myName); //passing the name to the session
    //     return "home";
    // }

    //data - name
    //view - home

    //using ModelAndView to accpet a string and pass it to the view
    // public ModelAndView home(@RequestParam("name") String myName) { //instead of HttpServletRequest request and session
    //     ModelAndView mv = new ModelAndView();
    //     mv.addObject("name", myName);
    //     mv.setViewName("home");
    //     return mv;
    // }

    //using ModelAndView to accpet an object of Lion class and pass it to the view
    public ModelAndView home(Lion lion) { //instead of HttpServletRequest request and session
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", lion);
        mv.setViewName("home");
        return mv;
    }
}
