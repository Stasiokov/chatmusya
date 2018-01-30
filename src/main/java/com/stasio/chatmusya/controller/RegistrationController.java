package com.stasio.chatmusya.controller;

import com.stasio.chatmusya.entity.User;
import com.stasio.chatmusya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping
public class RegistrationController {

    @Autowired
    public UserService userService;

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }

    @PostMapping(value = "/registerProcess")
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
                                @ModelAttribute("user") User user) {
        userService.register(user);
        return new ModelAndView("welcome", "firstname", user.getFirstname());
    }

}
