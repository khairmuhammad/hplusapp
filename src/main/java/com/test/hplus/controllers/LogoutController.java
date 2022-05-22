package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        System.out.println("Ending user session.");
        httpSession.invalidate();
        //System.out.println(httpSession.getAttribute("login"));
        return "login";
    }
}
