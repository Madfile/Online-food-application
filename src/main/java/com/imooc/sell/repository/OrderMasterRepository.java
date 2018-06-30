package com.imooc.sell.repository;


import com.imooc.sell.dataObject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>{

    //要传Pageable对象，否则会把某人的所有订单都查出来
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);


}
