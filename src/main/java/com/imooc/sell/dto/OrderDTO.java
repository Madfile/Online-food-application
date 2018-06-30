package com.imooc.sell.dto;


import com.imooc.sell.dataObject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

//Data Transfer Object 数据传输状态对象，用于在各个层里面传输对象
@Data
public class OrderDTO {
    /** 订单ID **/
    @Id
    private String orderId;

    /** 买家名字 **/
    private String buyerName;

    /** 买家手机号 **/
    private String buyerPhone;

    /** 买家地址 **/
    private String buyerAddress;

    /** 买家微信OpenId **/
    private String buyerOpenid;

    /** 订单总金额 **/
    private BigDecimal orderAmount;

    /** 订单状态,默认为新下单 **/
    private Integer orderStatus;

    /** 支付状态，默认为等待支付 **/
    private Integer payStatus;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
