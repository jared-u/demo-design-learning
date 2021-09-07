package com.jared.design.mediator;

import java.util.List;

/**
 * @author cjl
 * @time 2021/9/7 11:35
 */
public interface SqlSession {
    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
