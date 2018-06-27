package com.imooc.sell.VO;

import com.imooc.sell.VO.ProductVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.sell.dataObject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 */

@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoList;
}
