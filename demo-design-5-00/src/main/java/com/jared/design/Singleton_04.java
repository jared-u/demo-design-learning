package com.jared.design;

/**
 *  使用类的内部类(线程安全)
 * @author chenjialing
 * @time 2021/6/21 10:48
 */
public class Singleton_04 {
    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }

}
