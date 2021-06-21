package com.jared.design;

/**
 * 懒汉模式(线程安全)
 * @author chenjialing
 * @time 2021/6/21 10:46
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if (null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
