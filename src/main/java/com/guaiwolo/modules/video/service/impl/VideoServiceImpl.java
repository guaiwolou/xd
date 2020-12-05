package com.guaiwolo.modules.video.service.impl;

import com.guaiwolo.modules.video.domain.Video;
import com.guaiwolo.modules.video.mapper.ViewMapper;
import com.guaiwolo.modules.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private ViewMapper viewMapper;
    @Override
    public List<Video> listVideo() {
        return viewMapper.listVideo();
    }
}
