package com.zizi.qmusic.server.domain;


import java.io.Serializable;

public class UserDO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String ip;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
