package com.jared.design;

import com.alibaba.fastjson.JSON;
import com.jared.design.mq.POPOrderDelivered;

/**
 * @author chenjialing
 * @time 2021/6/21 11:58
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getUId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
