package com.guaiwolo.modules.video.controller;

import com.guaiwolo.modules.video.domain.Video;
import com.guaiwolo.modules.video.service.VideoService;
import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public JsonData list(){
       List<Video> list = videoService.listVideo();
        return JsonData.buildSuccess(list);
    }
    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess("");

    }
}
