package com.imooc.sell.service;


import com.imooc.sell.dataObject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<ProductInfo> findOne(String productId);

    /** 查询所有在架商品列表 **/
    List<ProductInfo> findUpAll();

    /**
     * 产品分页查询  注意导包要倒入第二个 -- data.domain里面的
     * 用pageable传的话返回的是一个Page的对象不是一个List
     **/
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
