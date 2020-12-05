package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.domain.User;
import com.guaiwolo.modules.video.service.UserService;
import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        String token =userService.login(user.getUserName(),user.getPwd());
        return  token != null ? JsonData.buildSuccess(token):JsonData.buildError("账号密码错误");
    }
}
