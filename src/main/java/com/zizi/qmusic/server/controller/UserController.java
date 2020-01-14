package com.zizi.qmusic.server.controller;

import com.zizi.qmusic.server.domain.UserDO;
import com.zizi.qmusic.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String userInfo(){
        UserDO userDO = userService.getInfo();
        return userDO.toString();
    }

}
