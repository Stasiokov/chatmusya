package com.stasio.chatmusya.controller;

import com.stasio.chatmusya.entity.Message;
import com.stasio.chatmusya.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public MessageService messageService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/chatmusya")
    public String hello(Model model){
        model.addAttribute("messages",messageService.findAll());
        return "chatmusya";
    }

    @PostMapping("/sendMsg")
    public String sendMsg (@ModelAttribute("message")Message message){
        messageService.save(message);
        return "redirect:/chatmusya";
    }
}
