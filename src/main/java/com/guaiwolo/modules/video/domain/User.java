package com.guaiwolo.modules.video.domain;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String pwd;

    public User() {
    }

    public User(int id, String userName, String pwd) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
    }



}
