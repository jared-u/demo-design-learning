package com.jared.design;

/**
 *  饿汉模式(线程安全)
 * @author chenjialing
 * @time 2021/6/21 10:47
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }
}
