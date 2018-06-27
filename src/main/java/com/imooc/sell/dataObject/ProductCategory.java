package com.imooc.sell.dataObject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* 类目表 */
@Entity
@DynamicUpdate//dynamicUpdate会自动将Dtate类型的变量进行更新（数据库自动更新比赋值的属性拥有更高的权限）
@Data//lombok插件提供的免除写getter，setter和toString的注释
public class ProductCategory {
    /* 类目id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /*类目名字*/
    private String categoryName;

    /*类目编号*/
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
