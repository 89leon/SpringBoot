package com.leon.springboot.web.springbootwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * LoginController
 */
@Controller

public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String loginMessage() {
        return "Hello World";
    }
    
}