package com.guaiwolo.modules.video.service.impl;

import com.guaiwolo.modules.video.domain.User;
import com.guaiwolo.modules.video.mapper.UserMapper;
import com.guaiwolo.modules.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private  static Map<String,User> sessionMap =new HashMap<>();

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String userName, String pwd) {
        User user= userMapper.login(userName,pwd);
        if(user == null){
            return null;
        }else{
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }

    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
