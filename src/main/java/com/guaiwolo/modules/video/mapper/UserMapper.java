package com.guaiwolo.modules.video.mapper;

import com.guaiwolo.modules.video.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {
    private  static Map<Integer, User> userMap= new HashMap();

    static{
        userMap.put(1,new User(1,"jim","123456"));
        userMap.put(2,new User(2,"tom","123456"));
        userMap.put(3,new User(3,"kite","123456"));
    }
}
