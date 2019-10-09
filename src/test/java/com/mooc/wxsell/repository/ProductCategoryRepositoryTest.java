package com.mooc.wxsell.repository;

import com.mooc.wxsell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void pp(){
        System.out.println(productCategoryRepository.findById(1));
//        ProductCategory pc= productCategoryRepository.findById(1).get();

    }
    @Test
    public void kk(){
        List<Integer> l = Arrays.asList(1,2);
        List<ProductCategory> ll = productCategoryRepository.findByCategoryTypeIn(l);
//        System.out.println(ll.size());
        Assert.assertEquals(0,ll.size());
    }
}