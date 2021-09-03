package com.jared.design.lang;

/**
 * @author cjl
 * @time 2021/9/3 10:59
 */
public interface Collection<E,L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();

}
