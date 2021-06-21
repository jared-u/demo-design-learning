package com.jared.design.impl;

import com.jared.design.OrderAdapterService;
import com.jared.design.service.POPOrderService;

/**
 * @author chenjialing
 * @time 2021/6/21 12:01
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
