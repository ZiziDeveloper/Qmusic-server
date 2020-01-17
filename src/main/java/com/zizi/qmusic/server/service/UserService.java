package com.zizi.qmusic.server.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zizi.qmusic.server.domain.UserDO;
import com.zizi.qmusic.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.orderbyhelper.OrderByHelper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Page<UserDO> getInfo(String orderBy){

        OrderByHelper.orderBy(orderBy);
        Page<UserDO> page = PageHelper.startPage(1, 10).doSelectPage(()-> userMapper.getUserInfo());
        return page;
    }

}
