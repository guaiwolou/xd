package com.guaiwolo.modules.video.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Video implements Serializable {

    private int id;
    private String title;
    private int price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String coverImg;
    @JsonProperty("create_time")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createTime;

    private List<Chapter> chapterList;

    public Video() {
    }
    public Video(int id, String title) {
        this.id =id;
        this.title=title;
        this.createTime= new Date();
    }


}
