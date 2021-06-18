package com.jared.design.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenjialing
 * @time 2021/6/18 15:24
 */
@Data
@AllArgsConstructor
public class CouponResult {
    private String code; // 编码
    private String info; // 描述
}
