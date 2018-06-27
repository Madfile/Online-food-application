package com.imooc.sell.repository;

import com.imooc.sell.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    //自定义query语句查询满足多个categoryType的ProductCategory
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
