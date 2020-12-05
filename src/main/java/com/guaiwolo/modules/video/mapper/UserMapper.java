package com.guaiwolo.modules.video.mapper;

import com.guaiwolo.modules.video.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap();

    static {
        userMap.put("jim", new User(1, "jim", "123456"));
        userMap.put("tom", new User(2, "tom", "123456"));
        userMap.put("kite", new User(3, "kite", "123456"));
    }

    public User login(String userName, String pwd) {
        User user = userMap.get(userName);
        if (user == null) {
            return null;
        }
        if (user.getPwd().equals(pwd)) {
            return user;
        }
        return null;
    }
}
