package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/test")
@PropertySource({"classpath:pay.properties"})
public class TestController {
    @Value("${wxpay.id}")
    private String payAppid;
    @Value("${wxpay.sercert}")
    private String paySercert;

    @GetMapping("get_config")
    public JsonData test(){
        HashMap<String, String> map = new HashMap<>();
        map.put("appid", payAppid);
        map.put("sercert", paySercert);

        return JsonData.buildSuccess(map);
    }


    @GetMapping("list")
    public JsonData testExt(){
        int i = 1/0;
        return JsonData.buildSuccess("");
    }


}
