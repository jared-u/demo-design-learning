package com.jared.design.mq;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author chenjialing
 * @time 2021/6/21 11:51
 */
@Data
public class POPOrderDelivered {
    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额
}
