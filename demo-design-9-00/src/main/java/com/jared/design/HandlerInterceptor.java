package com.jared.design;

/**
 * @author chenjialing
 * @time 2021/6/23 16:47
 */
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
