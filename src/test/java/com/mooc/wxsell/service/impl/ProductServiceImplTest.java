package com.mooc.wxsell.service.impl;
import com.mooc.wxsell.dataobject.ProductInfo;
import com.mooc.wxsell.enums.ProductStatusEnums;
import com.mooc.wxsell.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() {
        System.out.println(productService.findOne("1"));
    }
    @Test
    public void findUpAll() {
        System.out.println(productService.findUpAll());
    }
    @Test
    public void findAll() {
        PageRequest request =new PageRequest(0,2);
        Page<ProductInfo> p = productService.findAll(request);
    }
    @Test
    public void save() {
        ProductInfo p =new ProductInfo();
        p.setProductDescription("好吃");
        p.setProductId("12345");
        p.setProductName("屎");
        p.setProductPrice(new BigDecimal(100.2));
        p.setProductStatus(ProductStatusEnums.DOWN.getCode());
        p.setProductStock(10);
        p.setCategoryType(2);
        p.setProductIcon("http://xxxx.jpg");
        System.out.println(productService.save(p));
    }
}