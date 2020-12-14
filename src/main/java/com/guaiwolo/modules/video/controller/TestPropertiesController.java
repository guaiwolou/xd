package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.config.WXConfig;
import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/v2/test")
public class TestPropertiesController {
    @Autowired
    private WXConfig wxConfig;

    @GetMapping("get_config")
    public JsonData test(){
        HashMap<String, String> map = new HashMap<>();
        map.put("payAppid",wxConfig.getPayAppid());
        map.put("paySercert",wxConfig.getPaySercert());
        return JsonData.buildSuccess(map);
    }

}
