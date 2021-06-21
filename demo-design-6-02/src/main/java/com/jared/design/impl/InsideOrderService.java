package com.jared.design.impl;

import com.jared.design.OrderAdapterService;
import com.jared.design.service.OrderService;
/**
 * @author chenjialing
 * @time 2021/6/21 12:01
 */
public class InsideOrderService implements OrderAdapterService {
    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
