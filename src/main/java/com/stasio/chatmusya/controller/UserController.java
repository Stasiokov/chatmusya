package com.stasio.chatmusya.controller;

import com.stasio.chatmusya.entity.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/chatmusya")
    public String hello(){
        return "chatmusya";
    }

    @PostMapping("/sendMsg")
    public String sendMsg (@ModelAttribute("message")Message message){

        return "redirect:/chatmusya";
    }
}
