package com.mooc.wxsell.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

//@JsonFormat
@Data
public class ResultVO<T> {
    private Integer code;
    private String message;
    private T data;

}
