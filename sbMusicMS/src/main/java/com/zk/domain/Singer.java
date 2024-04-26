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
 * (Singer)实体类
 *
 * @author makejava
 * @since 2023-06-15 21:25:31
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Singer implements Serializable {
    private static final long serialVersionUID = -38370996998381724L;
    @JsonProperty("singerid")
    private String singerid;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("singername")
    private String singername;
    @JsonProperty("repsong")
    private String repsong;
    @JsonProperty("repalbum")
    private String repalbum;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("style")
    private Style style;
    @JsonProperty("styleid")
    private String styleid;
}

