package com.guaiwolo.modules.video.service;

import com.guaiwolo.modules.video.domain.User;

import java.util.List;

public interface UserService {
    String login(String userName, String pwd);
    List<User> listUser();
}
