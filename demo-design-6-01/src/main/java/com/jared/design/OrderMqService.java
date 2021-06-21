package com.jared.design;

import com.alibaba.fastjson.JSON;
import com.jared.design.mq.OrderMq;

/**
 * @author chenjialing
 * @time 2021/6/21 11:58
 */
public class OrderMqService {
    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
