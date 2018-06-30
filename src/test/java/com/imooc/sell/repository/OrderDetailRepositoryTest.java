package com.imooc.sell.repository;

import com.imooc.sell.dataObject.OrderDetail;
import org.hibernate.criterion.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("002");
        orderDetail.setOrderId("0000002");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("111113");
        orderDetail.setProductName("茶叶蛋");
        orderDetail.setProductPrice(new BigDecimal(1.4));
        orderDetail.setProductQuantity(30);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("0000001");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}