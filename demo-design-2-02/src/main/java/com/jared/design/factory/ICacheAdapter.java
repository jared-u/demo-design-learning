package com.jared.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjialing
 * @time 2021/6/18 16:53
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
