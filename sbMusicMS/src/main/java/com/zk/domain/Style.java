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
public class Style implements Serializable {
    private static final long serialVersionUID = 744144017026404952L;
    @JsonProperty("styleid")
    private String styleid;
    @JsonProperty("stylename")
    private String stylename;
}

