package com.mooc.wxsell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductVO<T> {
    @JsonProperty("name")
    private String categoryName;
    private  Integer type;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
