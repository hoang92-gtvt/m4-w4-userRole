package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String pageAdmin(){
        return "/security/adminPage";
    }

    @GetMapping("trang2")
    public String pageAdmin2(){
        return "/security/adminPage2";
    }
}
