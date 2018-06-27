package com.imooc.sell.enums;

import lombok.Getter;

/** 商品状态 **/
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(0,"下架")
    ;

    private Integer code;

    //message可以不加
    private String message;

    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }


}
