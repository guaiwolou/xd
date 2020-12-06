package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.domain.User;
import com.guaiwolo.modules.video.service.UserService;
import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登陆接口
     * @param user
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        String token =userService.login(user.getUserName(),user.getPwd());
        return  token != null ? JsonData.buildSuccess(token):JsonData.buildError("账号密码错误");
    }

    /**
     * 列出全部用户
     * @return
     */
    @GetMapping("list_user")
    public JsonData listUser(){
        return JsonData.buildSuccess(userService.listUser());
    }

}
