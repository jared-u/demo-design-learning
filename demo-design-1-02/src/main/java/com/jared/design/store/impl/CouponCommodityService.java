package com.jared.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.jared.design.coupon.CouponResult;
import com.jared.design.coupon.CouponService;
import com.jared.design.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/18 16:06
 */
@Slf4j
public class CouponCommodityService implements ICommodity {
    private CouponService couponService=new CouponService();
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}
