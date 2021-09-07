package com.jared.design.mediator;

/**
 * @author cjl
 * @time 2021/9/7 11:35
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
