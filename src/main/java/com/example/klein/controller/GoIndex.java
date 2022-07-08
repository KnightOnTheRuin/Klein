package com.example.klein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoIndex {
    /**
     * 进入首页index
     * @return
     */
    @GetMapping("/")
    public String login() {
        System.out.println("-----------==============");
        return "index";
    }
}