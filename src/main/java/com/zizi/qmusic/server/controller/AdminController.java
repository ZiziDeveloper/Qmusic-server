package com.zizi.qmusic.server.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    @ResponseBody
    public String userInfo(){
        return "admin";
    }
}
