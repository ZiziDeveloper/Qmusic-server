package com.zizi.qmusic.server.mapper;

import com.zizi.qmusic.server.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<UserDO> getUserInfo();
}
