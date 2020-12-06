package com.guaiwolo.modules.video.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public JsonData list() throws JsonProcessingException {
       List<Video> list = videoService.listVideo();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(list);
        System.out.println(jsonStr);

        List<Object> list1 = objectMapper.readValue(jsonStr, List.class);
        System.out.println(list1);

        return JsonData.buildSuccess(list);
    }
    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){
        System.out.println(video.toString());
        return JsonData.buildSuccess("");

    }
}
