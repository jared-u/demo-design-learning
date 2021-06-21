package com.jared.design.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author chenjialing
 * @time 2021/6/21 11:50
 */
@Data
public class OrderMq {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间
}
