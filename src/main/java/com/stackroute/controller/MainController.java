package com.stackroute.controller;

import com.stackroute.module.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String message(ModelMap modelMap){
        User user=new User();
        user.setName("hey");
        modelMap.addAttribute("message",user.getName());
        return "welcome";
    }
}
