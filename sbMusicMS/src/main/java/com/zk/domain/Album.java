package com.zk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album implements Serializable {
    private static final long serialVersionUID = 981420058120836218L;
    @JsonProperty("albumid")
    private String albumid;
    @JsonProperty("albumname")
    private String albumname;
    @JsonProperty("singer")
    private Singer singer;
    @JsonProperty("singerid")
    private  String singerid;
}

