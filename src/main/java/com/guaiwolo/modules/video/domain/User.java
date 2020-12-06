package com.guaiwolo.modules.video.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    @JsonIgnore
    private String pwd;

    public User() {
    }

    public User(int id, String userName, String pwd) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
    }



}
