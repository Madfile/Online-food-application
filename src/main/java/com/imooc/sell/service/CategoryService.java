package com.imooc.sell.service;

import com.imooc.sell.dataObject.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<ProductCategory> findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
