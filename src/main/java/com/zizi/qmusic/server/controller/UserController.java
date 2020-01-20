package com.zizi.qmusic.server.controller;

import com.github.pagehelper.Page;
import com.zizi.qmusic.server.common.vo.PageResponseVO;
import com.zizi.qmusic.server.domain.UsersDO;
import com.zizi.qmusic.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    @ResponseBody
    public PageResponseVO<Page<UsersDO>> userInfo(@RequestParam("orderBy") String orderBy){
        logger.info("查询用户列表接口入参orderBy={}", orderBy);
        Page<UsersDO> page = userService.getInfo(orderBy);

        return PageResponseVO.setPage(page);
    }

    @GetMapping("/detail")
    @ResponseBody
    public UsersDO userDetail(@RequestParam("username") String username){
        logger.info("查询用户列表接口入参orderBy={}", username);
        UsersDO usersDO= userService.getDetail(username);

        return usersDO;
    }

}
