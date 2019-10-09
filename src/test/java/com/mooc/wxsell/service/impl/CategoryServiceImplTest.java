package com.mooc.wxsell.service.impl;

import com.mooc.wxsell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl csi;
    @Test
    public void findOne() {
        ProductCategory pc = csi.findOne(1);
        System.out.println(pc);
    }

    @Test
    public void findAll() {
        List<ProductCategory> lpc =csi.findAll();
        for(ProductCategory p:lpc){
            System.out.println(p);
        }
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> re = csi.findByCategoryTypeIn(list);
        for(ProductCategory p:re){
            System.out.println(p);
        }
    }

    @Test
    public void save() {
        ProductCategory pc =new ProductCategory();
        pc.setCategoryName("憨憨");
        pc.setCategoryType(10);
        System.out.println(csi.save(pc));

    }
}