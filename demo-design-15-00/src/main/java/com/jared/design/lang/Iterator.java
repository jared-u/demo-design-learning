package com.jared.design.lang;

/**
 * @author cjl
 * @time 2021/9/3 10:59
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
