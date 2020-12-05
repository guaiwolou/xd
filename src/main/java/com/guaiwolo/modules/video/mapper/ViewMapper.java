package com.guaiwolo.modules.video.mapper;

import com.guaiwolo.modules.video.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ViewMapper {
    private static Map<Integer,Video> videoMap = new HashMap<>();

    static{
        videoMap.put(1,new Video(1,"Java"));
        videoMap.put(2,new Video(2,"Python"));
        videoMap.put(3,new Video(3,"docker"));
        videoMap.put(4,new Video(4,"k8s"));
        videoMap.put(5,new Video(5,"Linux"));
        videoMap.put(6,new Video(6,"Vue"));
        videoMap.put(7,new Video(7,"Mysql"));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }


}
