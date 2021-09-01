package com.jared.design.cuisine.impl;

import com.jared.design.cook.ICook;
import com.jared.design.cuisine.ICuisine;

/**
 * @author cjl
 * @time 2021/9/1 11:33
 */
public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }
}
