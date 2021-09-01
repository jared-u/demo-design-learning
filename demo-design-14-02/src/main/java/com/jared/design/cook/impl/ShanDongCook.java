package com.jared.design.cook.impl;

import com.jared.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cjl
 * @time 2021/9/1 11:32
 */
public class ShanDongCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    public void doCooking() {
        logger.info("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
