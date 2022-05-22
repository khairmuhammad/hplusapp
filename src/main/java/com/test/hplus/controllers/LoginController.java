package com.test.hplus.controllers;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import com.test.hplus.exception.ApplicationException;
import com.test.hplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.net.www.ApplicationLaunchException;

@Controller
@SessionAttributes("login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login")Login login){
        User user = userRepository.findByUsername(login.getUsername());
        if (user == null){
            throw new ApplicationException("User not found.");
        }
        return "forward:/userprofile";
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("In expcetion handler of LoginController.");
        return "error";
    }
}
