package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/user")
    public String pageUser(){
        return "/security/userPage";
    }

    @GetMapping("/admin")
    public String pageAdmin(){
        return "/security/adminPage";
    }

    @GetMapping("/admin/trang2")
    public String pageAdmin2(){
        return "/security/adminPage2";
    }

    @GetMapping("/home")
    public String home(){
        return "/security/home";
    }


}