package com.zizi.qmusic.server.controller;

import com.github.pagehelper.Page;
import com.zizi.qmusic.server.common.vo.PageResponseVO;
import com.zizi.qmusic.server.domain.UserDO;
import com.zizi.qmusic.server.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    @ResponseBody
    public PageResponseVO<Page<UserDO>> userInfo(@RequestParam("order") String order){
        Page<UserDO> page = userService.getInfo(order);

        return PageResponseVO.setPage(page);
    }

}
