package com.zizi.qmusic.server.controller;

import com.github.pagehelper.Page;
import com.zizi.qmusic.server.common.vo.PageResponseVO;
import com.zizi.qmusic.server.domain.UserDO;
import com.zizi.qmusic.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    @ResponseBody
    public PageResponseVO<Page<UserDO>> userInfo(@RequestParam("orderBy") String orderBy){
        logger.info("查询用户列表接口入参orderBy={}", orderBy);
        Page<UserDO> page = userService.getInfo(orderBy);

        return PageResponseVO.setPage(page);
    }

}
