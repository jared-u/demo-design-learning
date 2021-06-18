package com.jared.design;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenjialing
 * @time 2021/6/18 18:07
 */
public interface Matter {
    String scene();      // 场景；地板、地砖、涂料、吊顶

    String brand();      // 品牌

    String model();      // 型号

    BigDecimal price();  // 价格

    String desc();       // 描述
}
