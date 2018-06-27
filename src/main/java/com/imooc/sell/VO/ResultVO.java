package com.imooc.sell.VO;

//VO -- Visual Object 视图对象
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
public class ResultVO<T> {

    /** error code **/
    private Integer code;

    /** information **/
    private String msg;

    /** content **/
    private T data;
}
