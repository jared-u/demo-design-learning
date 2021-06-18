package com.jared.design.factory.impl;

import com.jared.design.factory.ICacheAdapter;
import com.jared.design.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjialing
 * @time 2021/6/18 16:54
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
