package com.jared.design.test;

import com.jared.design.XiaoEr;
import com.jared.design.cook.impl.GuangDongCook;
import com.jared.design.cook.impl.JiangSuCook;
import com.jared.design.cook.impl.ShanDongCook;
import com.jared.design.cook.impl.SiChuanCook;
import com.jared.design.cuisine.ICuisine;
import com.jared.design.cuisine.impl.GuangDoneCuisine;
import com.jared.design.cuisine.impl.JiangSuCuisine;
import com.jared.design.cuisine.impl.ShanDongCuisine;
import com.jared.design.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

/**
 * @author cjl
 * @time 2021/9/1 11:45
 */
public class ApiTest {
    @Test
    public void test(){

        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        // 下单
        xiaoEr.placeOrder();
    }
}
