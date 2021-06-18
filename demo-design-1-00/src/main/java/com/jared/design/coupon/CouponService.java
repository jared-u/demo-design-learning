package com.jared.design.coupon;

/**
 * 模拟优惠券服务
 * @author chenjialing
 * @time 2021/6/18 15:28
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
