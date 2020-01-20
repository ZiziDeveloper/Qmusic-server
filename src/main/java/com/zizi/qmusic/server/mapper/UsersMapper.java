package com.zizi.qmusic.server.mapper;

import com.zizi.qmusic.server.domain.UsersDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {

    List<UsersDO> getUserInfo();

    UsersDO getDetail(@Param("username") String username);
}
