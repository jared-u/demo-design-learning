package com.jared.design;

import com.jared.design.store.ICommodity;
import com.jared.design.store.impl.CardCommodityService;
import com.jared.design.store.impl.CouponCommodityService;
import com.jared.design.store.impl.GoodsCommodityService;

/**
 * @author chenjialing
 * @time 2021/6/18 16:05
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
