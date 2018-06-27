package com.imooc.sell.service.Impl;

import com.imooc.sell.dataObject.ProductCategory;
import com.imooc.sell.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired//要链接数据库就要用@Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        Optional<ProductCategory> productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.get().getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专享",2);
        ProductCategory result = categoryService.save(productCategory);
    }
}