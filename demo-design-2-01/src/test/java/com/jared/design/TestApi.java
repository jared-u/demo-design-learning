package com.jared.design;

import com.jared.design.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author chenjialing
 * @time 2021/6/18 16:47
 */
public class TestApi {
    @Test
    public void test_CacheService() {
        CacheService cacheService=new CacheServiceImpl();
        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01",1);
        System.out.println(val01);
    }
}
