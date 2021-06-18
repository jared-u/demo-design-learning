package com.jared.design.factory.impl;

import com.jared.design.factory.ICacheAdapter;
import com.jared.design.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjialing
 * @time 2021/6/18 16:55
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
