package com.imooc.sell.service.Impl;

import com.imooc.sell.dataObject.ProductInfo;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findOne() {
        Optional<ProductInfo> productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.get().getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfo = productService.findUpAll();
        Assert.assertNotEquals(0,productInfo.size());

    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234567");
        productInfo.setProductName("宫保鸡丁");
        productInfo.setProductPrice(new BigDecimal(18));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("Sweet and delicious");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setProductType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotEquals(null,result);
    }
}