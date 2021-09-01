package com.jared.design.cook.impl;

import com.jared.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cjl
 * @time 2021/9/1 11:32
 */
public class SiChuanCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    public void doCooking() {
        logger.info("四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
    }
}
