package com.imooc.sell.VO;

//VO -- Visual Object 视图对象
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)//不返回值为null的键值对，在配置文件里可以用jackson来统一配置
public class ResultVO<T> {

    /** error code **/
    private Integer code;

    /** information **/
    private String msg;

    /** content **/
    private T data;
}
