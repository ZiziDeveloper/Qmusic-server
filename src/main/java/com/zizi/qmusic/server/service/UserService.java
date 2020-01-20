package com.zizi.qmusic.server.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zizi.qmusic.server.domain.UsersDO;
import com.zizi.qmusic.server.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.orderbyhelper.OrderByHelper;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public Page<UsersDO> getInfo(String orderBy){

        OrderByHelper.orderBy(orderBy);
        Page<UsersDO> page = PageHelper.startPage(1, 10).doSelectPage(()-> usersMapper.getUserInfo());
        return page;
    }

    public UsersDO getDetail(String username){
        return usersMapper.getDetail(username);
    }

}
