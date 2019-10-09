package com.mooc.wxsell.service;

import com.mooc.wxsell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo pi);

    //加库存
    //减库存
}
