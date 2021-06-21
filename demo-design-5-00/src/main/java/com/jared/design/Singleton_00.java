package com.jared.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenjialing
 * @time 2021/6/21 10:40
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
