package com.guaiwolo.modules.video.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/vedio")
public class VedeoController {

    @RequestMapping("/list")
    public Object list(){
        Map<String,String> map= new HashMap<>();
        map.put("1","面试专题课程");
        map.put("2","java专题课程");
        return map;

    }
}
