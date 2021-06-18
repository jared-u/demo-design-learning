package com.jared.design;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjialing
 * @time 2021/6/18 16:44
 */
public interface CacheService {
    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
