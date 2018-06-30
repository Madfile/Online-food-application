package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        //super()调用父类构造方法
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
