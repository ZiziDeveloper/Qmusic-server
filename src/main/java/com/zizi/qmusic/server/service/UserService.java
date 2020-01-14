package com.zizi.qmusic.server.service;

import com.zizi.qmusic.server.domain.UserDO;
import com.zizi.qmusic.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserDO getInfo(){
        UserDO userDO = userMapper.getUserInfo();
        return userDO;
    }

}
