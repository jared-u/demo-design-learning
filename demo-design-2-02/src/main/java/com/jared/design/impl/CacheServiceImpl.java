package com.jared.design.impl;

import com.jared.design.CacheService;
import com.jared.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjialing
 * @time 2021/6/18 16:58
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
