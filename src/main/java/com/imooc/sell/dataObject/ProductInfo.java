package com.imooc.sell.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data //lombok插件帮忙自动生成getter&setter
public class ProductInfo {

    @Id
    private String productId;

    /** 名字 **/
    private String productName;

    /** 单价 **/
    private BigDecimal productPrice;

    /** 库存 **/
    private int productStock;

    /** 描述 **/
    private String productDescription;

    /** 小图 **/
    private String productIcon;

    /** 状态 0正常1下架 **/
    private int productStatus;

    /** 类目编号 **/
    private int productType;

}
