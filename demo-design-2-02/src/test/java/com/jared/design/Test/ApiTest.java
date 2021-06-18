package com.jared.design.Test;

import com.jared.design.CacheService;
import com.jared.design.factory.JDKProxy;
import com.jared.design.factory.impl.EGMCacheAdapter;
import com.jared.design.factory.impl.IIRCacheAdapter;
import com.jared.design.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author chenjialing
 * @time 2021/6/18 17:05
 */
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM=JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}
