package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.domain.Video;
import com.guaiwolo.modules.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

//    @RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public Object list(){
       List<Video> list = videoService.listVideo();
        return list;
    }
}
