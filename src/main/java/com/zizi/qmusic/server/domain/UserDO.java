package com.zizi.qmusic.server.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDO {

    private Long id;

    private String name;

    private String ip;

    private String email;

    @Override
    public String toString() {
        return name+ip+email;
    }
}
