package com.zk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Song)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:28:01
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song implements Serializable {
    private static final long serialVersionUID = 203052031706920595L;
    @JsonProperty("songid")
    private String songid;
    @JsonProperty("songname")
    private String songname;
    @JsonProperty("singerid")
    private String singerid;
    @JsonProperty("singername")
    private Singer singername;
    @JsonProperty("singer")
    private Singer singer;

    @JsonProperty("styleid")
    private String styleid;
    @JsonProperty("style")
    private Style style;
    @JsonProperty("albumid")
    private String albumid;
    @JsonProperty("album")
    private Album album;

}

