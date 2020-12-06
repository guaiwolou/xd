package com.guaiwolo.modules.video.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Video implements Serializable {

    private int id;
    private String title;
    private int price;
    private String coverImg;
    private Date createTime;
    private List<Chapter> chapterList;

    public Video() {
    }
    public Video(int id, String title) {
        this.id =id;
        this.title=title;
    }


}
