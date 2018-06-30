package com.imooc.sell.dataObject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate //让updateTime自动更新
public class OrderMaster {

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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认为等待支付 **/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

//    //数据库对应的时候可以忽略掉下面这个属性，但是这里使用dto来解决这个问题，否则会使调用变得混乱
//    @Transient
//    private List<OrderDetail> orderDetailList;
}
